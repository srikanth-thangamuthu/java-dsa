 import java.util.ArrayList;
import java.util.Collections;

class ArrayOperations {

    public static void add_to_ArrayList(ArrayList<Integer> A, int x) {
        A.add(x);
    }

    public static void sort_ArrayList_Asc(ArrayList<Integer> A) {
        Collections.sort(A);
    }
        
    public static void reverse_ArrayList(ArrayList<Integer> A) {
        Collections.reverse(A);
    }
        
    public static int size_Of_ArrayList(ArrayList<Integer> A) {
        return A.size();
    }

    public static void sort_ArrayList_Desc(ArrayList<Integer> A) {
        Collections.sort(A);
        Collections.reverse(A);
    }

    public static void print_ArrayList(ArrayList<Integer> A) {
        for(int Val : A) {
            System.out.print(Val + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // 1. Add elements
        add_to_ArrayList(list, 40);
        add_to_ArrayList(list, 10);
        add_to_ArrayList(list, 30);
        add_to_ArrayList(list, 20);
        
        System.out.print("Initial list: ");
        print_ArrayList(list);
        System.out.println("\nSize: " + size_Of_ArrayList(list));

        // 2. Sort Ascending
        sort_ArrayList_Asc(list);
        System.out.print("Sorted Asc:   ");
        print_ArrayList(list);
        System.out.println();

        // 3. Reverse
        reverse_ArrayList(list);
        System.out.print("Reversed:     ");
        print_ArrayList(list);
        System.out.println();

        // 4. Sort Descending
        sort_ArrayList_Desc(list);
        System.out.print("Sorted Desc:  ");
        print_ArrayList(list);
        System.out.println();
    }

}
    

