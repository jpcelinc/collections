package lv.ctco.collections;

import java.util.*;

public class Main {


    public static void main(String[] args) {
   // arrayList();
       // set();
        maps();
    }

    private static void maps() {
     //   Map<String,String> map = new HashMap<>();
     //   Map<String,String> map = new TreeMap<>();
        Map<String,String> map = new LinkedHashMap<>();
        map.put("one","viens");
        map.put("two","divi");
        map.put("three","tris");
        map.put("four","cetri");
        System.out.println(map.get("four"));
        System.out.println(map.getOrDefault("three","unknown"));

        String n = map.computeIfAbsent("five",k -> k + "0000");
        String m = map.computeIfPresent("five",(k,v) -> v + "-1");

       // System.out.println(n);
        System.out.println(map.get("five"));
        System.out.println(map);
        for (String k : map.keySet()){
            System.out.println(k);

        }
        for (String v : map.values()){
            System.out.println(v);

        }

    }

    static void set() {
     //   Set <String> s1 = new HashSet();
      //    Set <String> s1 = new TreeSet<>(Comparator.reverseOrder());
           Set <String> s1 = new LinkedHashSet<>();

        s1.add("1Lena");
        s1.addAll(Arrays.asList("3aaa","2bbb","3aaa"));
           System.out.println(s1);
           Set <String> s2 = new HashSet();
           s2.add("1Lena");
           s2.addAll(Arrays.asList("aaa","bbb","aaa"));
         //  s1.removeAll(s2);
          // s1.remove("2bbb");
          // s1.retainAll(s2);
           s1.addAll(s2);
           System.out.println(s1);
for (String s : s1) {
 s.
}


       }
        static void arrayList() {
            ArrayList<String> list = new ArrayList<String>();
            list.add("aaa");
            list.add("bbbb");
            list.ensureCapacity(100);
            list.trimToSize();
            list.add(2,"eeee");
           // list.remove(2);
        //    Collections.swap(list,1,3);
            System.out.println(list.toString());
            list.clear();

        }


}
