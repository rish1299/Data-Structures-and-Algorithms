import java.util.ArrayList;

public class araaylistBasics {

    public static void main(String[] args) {
        // wrapper classes object creation
        // Integer i = Integer.valueOf(6);
        // System.out.println(i);
        // Float f = Float.valueOf(4.5f);
        // System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>();
        // ArrayList<Boolean> l2 = new ArrayList<>();
        // ArrayList<Float> l3 = new ArrayList<>();
        // ArrayList<Long> l4 = new ArrayList<>();


        // Add new elements in Arraylist (In the end addition)

        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);

        // get an element at index i
        //System.out.println(l1.get(1));

        // print with forLoop
        // for (int i = 0; i < l1.size(); i++) {
        //     System.out.println(l1.get(i));
        // }

        //printing the arraylist directly
        System.out.println(l1);


        // adding element at some index i 
        l1.add(1,100); // [5,100,6,7,8,9]
        System.out.println(l1);







    }

}