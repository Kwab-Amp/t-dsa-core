import java.util.ArrayList;
import java.util.stream.Collectors;

public class RemoveAllImpl {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("kwabena.ampofo@turntabl.io");
        list1.add("bae.boo@turntabl.io");
        list1.add("linda.davor@turntabl.io");
        list1.add("josh.marbell@turntabl.io");
        list1.add("desmond.techie@turntabl.io");
        list1.add("betty.kudjoe@turntabl.io");

        list2.add("kwesi.arthur@turntabl.io");
        list2.add("smart.arthur@turntabl.io");
        list2.add("philip.arthur@turntabl.io");
        list2.add("fred.arthur@turntabl.io");
        list2.add("linda.davor@turntabl.io");
        list2.add("betty.kudjoe@turntabl.io");

        System.out.println("List 1 ele: " + list1);
        System.out.println();
        System.out.println("List 2 ele: " + list2);

        list1.removeAll(list2);
        System.out.println();
        System.out.println("List 1 after removeAll ops: " + list1);
        System.out.println();
        System.out.println("List 2 ele?: "+ list2);
        list2.stream().map(s -> s.length() * 2).collect(Collectors.toList()).forEach(System.out::println);
    }
}
