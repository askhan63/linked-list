package linkedlist;


public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
         System.out.println(l.size());
        l.add(4);
        l.add(6);
        l.add(0, 67);
                l.add(1, 90);
                System.out.println(l.toString());
                l.add(4, 56);

        System.out.println(l.toString());
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains(4));
     //   l.clear();
        System.out.println(l.size());
        l.remove(1);
         System.out.println(l.toString());
         System.out.println(l.remove(0));
           System.out.println(l.toString());
     //  l.toString();
    }
}
