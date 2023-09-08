import java.util.HashMap;

public class mapCollection {
    static void hashMapExamples(){
    System.out.println("---------HashMapExamples--------");
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1, "Yasin");
        hm.put(3, "Kodom");
        hm.put(2, "Arafat");
        hm.put(5, "kali");
        hm.put(6, "Ubuntu");
        //১ এর মধ্যে আগে যা ছিল তাকে change কররে নতুন value set করবে ।
        hm.put(1, "CYasin");
        //যদি absent থাকে তাইলে add করবে না হলে করবে না । 
        hm.putIfAbsent(4,"ifabsent");
        System.out.println(hm);
        System.out.println("get at 1 :"+hm.get(1)); // Yasin.
        System.out.println("all keyset: "+hm.keySet());
        System.out.println("all values: "+hm.values());
        System.out.println("contains key: "+hm.containsKey(3));
        System.out.println("contains value: "+hm.containsValue("kodom"));
        //iterate keyset or value set.
        System.out.println("--Iterate Key Set: --");
        for(int i : hm.keySet()){
            System.out.println(i);
        }
        System.out.println("--Iterate value  Set: --");
        for(var i : hm.values()){
            System.out.println(i);
        }
        
        System.out.println("--Iterate Key and value  Set: --");
        for(var i : hm.entrySet()){
            System.out.println(i);
        }

    }
    public static void main(String arga[]){
        System.out.println();
        hashMapExamples();
    }
}
