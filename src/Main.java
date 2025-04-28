
public class Main {
    public static void main(String[] args) {

        // create an unsorted array
        int array[] = {30, 50, 20, 90, 10, 40, 100, 80, 60};

        // let's call the selection method
        selectionSort(array);

        // display purposes
        System.out.println("================================");
        System.out.println("|       SELECTION SORT         |");
        System.out.println("================================");

        // will use an enhanced for loo to print out the result
        for(int i : array){
            System.out.print(" " + i);
        }

    }

    // let's create a selection sort algorithm
    public static void selectionSort(int array[]){
        int n = array.length;

        for(int i = 0; i < n - 1; i++){
            int min = i;
            for(int x = i + 1; x < n; x++){
                if(array[min] < array[x]){ // Just like bubble sort, for descending will just change into < sign
                    min = x;
                }
            }

            // let's swap the indexes
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }

    }

}