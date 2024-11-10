/** 
 *@author Yuqi Max Zhang 
 *@class_name CISC 190 
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        for(int i = 0; i < list.size() - 1;i++){
            for(int j = i+1; j < list.size();  j++){
                if(list.get(j).compareTo(list.get(i)) < 0){
                    E temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
        }
    }
    
    public static void main(String[] args){
        System.out.print("Enter 10 integers: ");
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int j = 0; j < 10; j ++){
            Integer num = s.nextInt();
            list.add(num);
        }
        sort(list);
        for(Integer i : list){
            System.out.print(i + "");
        }
    }
}
