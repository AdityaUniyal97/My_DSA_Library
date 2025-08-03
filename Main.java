package My_DSA_Library;

import My_DSA_Library.array.MyStaticArray;

public class Main {
    public static void main(String[] args) {
        MyStaticArray arr = new MyStaticArray(5);
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);

        arr.print();
    }
}
