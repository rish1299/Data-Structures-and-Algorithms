import java.util.ArrayList;
import java.util.Collections;

// //Prob 1 - Write a program to reverse the given ArrayList
// public class Problems {

//     static void reverseList(ArrayList<Integer> list) {
//         int i = 0, j = list.size() - 1;

//         while (i < j) {
//             /*
//              * int temp = a;
//              * a = b;
//              * b = temp
//              */
//             Integer temp = Integer.valueOf(list.get(i));
//             list.set(i, list.get(j));
//             list.set(j, temp);

//             i++;
//             j--;
//         }
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(0);
//         list.add(10);
//         list.add(3);
//         list.add(5);
//         list.add(22);
//         list.add(10);
//         System.out.println("Original list " + list);
//         // reverseList(list);
//         Collections.reverse(list);
//         System.out.println("Reversed list " + list);

//     }
// }

/////////////////////////////////////////////////////////////

//Prob 2- Write a program to sort an ArrayList of strings in desecding order
public class Problems {

    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>();
        // list.add(0);
        // list.add(10);
        // list.add(3);
        // list.add(5);
        // list.add(22);
        // list.add(10);
        // System.out.println("Original list " + list);
        // Collections.reverse(list);
        // System.out.println("Reversed list " + list);
        // Collections.sort(list);
        // System.out.println("Ascending order " + list);
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println("Decending order " + list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hi");
        list1.add("Rishabh");
        list1.add("Rao");
        list1.add("To");
        list1.add("Coding");
        System.out.println("Original list " +list1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("Sorted list " +list1);


    }

}
