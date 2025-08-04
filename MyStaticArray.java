package My_DSA_Library;
public class MyStaticArray{
    private int[] arr;
    private int size;
    private int capacity;

    public MyStaticArray(int capacity){
        this.capacity = capacity;
        // creating a new array of given capacity
        this.arr = new int[capacity];
        this.size = 0; // initially no element are added 
    }

    // function for inserting the elements
    public void insert(int value){
        if(size >= capacity){
            System.out.println("Array is full. Cannot add elements into it");
            return;
        }
        // otherwise
        arr[size] = value;
        size++;
    }

    //function to delete the elements from the array
    public void deleteAt(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        //shifting the elements to left from the index
        for(int i = index ; i < size ; i++){
            arr[i] = arr[i + 1];
        }
        //since there is empty cell at last of array after deleting
        size--;
    }

    //function the update the element with new element
    public void updateAt(int index , int newValue){
        if(index < 0 || index >= size){
            System.out.println("Error: Invalid index");
            return;
        }
        arr[index] = newValue;
    }

    //function for retriving the elements from the given index
    public int get(int index){
        if(index < 0 || index >= size){
            System.out.println("Error: Invalid index.");
            return 1;
        }
        return arr[index];
    }

    //function to retrive the index of the passes value
    public int indexOf(int value){
        for(int i = 0 ; i < size ; i++){
            if(arr[i] == value){
                return i;
            }
        }
        // if value doesn't exists in the array
        return -1;
    }

    //function to check that given value exists in the array or not
    public boolean contains(int value){
        // checking if the value exist by indexof method 
        return indexOf(value) != -1;
    }

    //function to clear the entire array
    public void clear(){
        size = 0;
        System.out.println("Array Cleared. ");
    }

    //function returns the length of the array
    public int size(){
        return size;
    }

    //function check if the array is empty or not
    public boolean isEmpty(){
        return size == 0;
    }

    //function convert the integer array to comma - separated string "10,20,30"
    public String toString(){
        if(size == 0){
            return " ";
        }
        // Using string Builder for efficient string concatination
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < size ; i++){
            sb.append(arr[i]);
            // if this is not last element than after appending put " , "
            if(i != size - 1){
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    //function to return the array in the reverse order
    public void reverse(){
        int start = 0;
        int end = size() - 1;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    // function to call bubble sort from sorting file
    public void bubbleSort(){
        int[] temp = new int[size];
        for(int i =0 ; i < size ; i++){
            temp[i] = arr[i];
        }
        Sorting.bubbleSort(temp);
        for(int i = 0 ; i < size ; i++){
            arr[i] = temp[i];
        }
    }

    // function to call selection sort from the sorting file
    public void selectionSort(){
        int[] temp = new int[size];
        for(int i = 0 ; i < size ; i++){
            temp[i] = arr[i];
        }
        Sorting.selectionSort(temp);        
        for(int i = 0 ; i < size ; i++){
            arr[i] = temp[i];
        }
    }

    public void print(){
        System.out.print("[ ");
        for(int i = 0 ; i < size ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
}