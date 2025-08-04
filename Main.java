package My_DSA_Library;
public class Main {
    public static void main(String[] args) {
        MyStaticArray arr = new MyStaticArray(5);
        arr.insert(10);
        arr.insert(1);
        arr.insert(0);
        arr.selectionSort();
        arr.print();
    }
}
