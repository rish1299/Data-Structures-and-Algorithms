package sorting_Algo;
//Lexical Order Sorting

//Griven an array of fruits names, sort it in lexicographical order using selection sort
public class practice_que2 {
    static void sortedFruits(String[] fruits){
        int n = fruits.length;

        for (int i = 0; i < n-1; i++) {
            int minIdx=i;
            for (int j = i+1; j < n; j++) {
                if (fruits[j].compareTo(fruits[minIdx]) < 0) {
                    minIdx = j;
                    
                }
                
            }

            //swap fruit[minIdx] and fruit[i]
            String temp = fruits[i];
            fruits[i] = fruits[minIdx];
            fruits[minIdx] = temp;
            
        }
    }


    public static void main(String[] args) {
        String[] arr = {"papaya", "lime","watermelon","apple","mango","kiwi"};
        sortedFruits(arr);
        for (String string : arr) {
                System.out.print(string + " ");
        }
    }
    
}
