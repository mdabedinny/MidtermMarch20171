package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int i, key, j;
        for (i=1; i<array.length; i++){
            key = array[i];
            j=i-1;
            while(j>=0 && array[j]>key){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=key;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = new int[array.length];
        //implement here
        int temp = 0;
        for(int i=0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
            list=array;
        }


            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
             this.executionTime = executionTime;
            return list;

    }
    

    public int [] mergeSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        
        

        return list;
    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    public static int[] printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        return array;
    }
    
    public int [] shellSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int N = array.length;
        int h = N / 3;
        int pass = 1;

        while (h > 0) {
            for (int i = h; i < N; i++) {
                int temp = array[i], j;

                for (j = i; j >= h && array[j - h] > temp; j -= h) {
                    array[j] = array[j - h];
                }

                array[j] = temp;
            }

            System.out.print("After pass " + pass + "  : ");
            printArray(array);
            pass++;
            h /= 2;

            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;
        }
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
