import java.util.Iterator;

public class Java {
   public static void main(String...args) {

        MyArray myArray = new MyArray(); // We instantiate our array-object...

        myArray.iterable.forEach(e -> System.out.print((char) e.intValue())); //... and print the corresponding chars.

    }
}

class MyArray {
    int[] a = {
            72,
            101,
            108,
            108,
            111,
            32,
            87,
            111,
            114,
            108,
            100,
            33
    };

    Iterable<Integer> iterable = () -> new Iterator<>() {
        private int pos = 0;

        public boolean hasNext() {
            return a.length > pos;
        }

        public Integer next() {
            return a[pos++];
        }
    };
}