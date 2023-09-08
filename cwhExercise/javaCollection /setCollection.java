import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setCollection {
    static void treesetExamples(){
        /*
         * sorted sub interface কে implements করে TreeSet class
         * তাই element গুলো sorted order এ পাবো । 
         */
        System.out.println("---------TreeSet--------");
        TreeSet<Integer> lh = new TreeSet<>();
        lh.add(12);
        lh.add(45);
        lh.add(78);
        lh.add(6);
        System.out.println("Print all Element: "+lh);
        System.out.println("remove: "+lh.remove(656));
        System.out.println("Print all Element: "+lh);
    }
    static void linkHashSet(){
        System.out.println("---------LinkHashSet--------");
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        lh.add(12);
        lh.add(45);
        lh.add(78);
        lh.add(6);
        System.out.println("Print all Element: "+lh);
        System.out.println("remove: "+lh.remove(656));
        System.out.println("Print all Element: "+lh);
    }
    static void hashSetExamples(){
        /*
         * Unorder and unique element থাকবে শুধু । 
         * Use hashing internally.
         */
        System.out.println("---------HashSet--------");
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(45);
        hs.add(78);
        hs.add(6);
        System.out.println("Print all Element: "+hs);
        System.out.println("remove: "+hs.remove(6));
        System.out.println("Print all Element: "+hs);
    }
    public static void main(String[] args) {
        hashSetExamples();
        System.out.println();
        linkHashSet();
        System.out.println();
        treesetExamples();
        System.out.println();
    }
}