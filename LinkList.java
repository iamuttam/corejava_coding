import java.util.Scanner;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        /* Create and fill Linked List of Integers */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }
        
        /* Perfrom queries on Linked List */
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = sc.next();
            if (action.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else { // "Delete"
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        sc.close();
        
        /* Print our updated Linked List */
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
