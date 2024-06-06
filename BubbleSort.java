// Insertion Sort
import java.awt.*;
import java.io.*;

public class BubbleSort {
    static RandomAccessFile f;
    static int list [];
    static int len;
    static long startTime, stopTime;

    public static void main (String [] args) throws IOException {
     String fileName = "c:/code/sort.txt";
     readFile (fileName);
     new RealBubbleSort (list,len);
    }


    public static void readFile (String binFile) throws IOException{
     f = new RandomAccessFile (binFile, "r");
     len = (int) f.length () / 4;
     list = new int [len];
     for (int i = 0 ; i < len ; i++) {
         list [i] = f.readInt ();
     }
     f.close ();
    } //end readFile

    public static void printList () {
     for (int i = 0 ; i < len ; i++) {
          System.out.println(list [i]);
     }
     System.out.println ();
    } //end printList
}


// The "RealBubbleSort" class.

class RealBubbleSort {
    boolean isSorted = false;

    public RealBubbleSort (int list [], int len) {
     do
         pass (list, len);
     while (!isSorted);
    } // end constructor

    private void pass (int list [], int len) {
     isSorted = true;
     for (int i = 1 ; i < len ; i++)
         if (list [i - 1] > list [i])
         {
          swap (list, i - 1, i);
          isSorted = false;
         }
    } // end pass

    private void swap (int list [], int a, int b) {
     int temp = list [a];
     list [a] = list [b];
     list [b] = temp;
    }
} // SBubbleSort class