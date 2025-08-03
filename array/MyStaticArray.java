package My_DSA_Library.array;
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

    public void print(){
        System.out.print("[ ");
        for(int i = 0 ; i < size ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
}