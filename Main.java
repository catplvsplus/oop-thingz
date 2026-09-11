public class Main {
    public static void main(String[] args) {
        Set A = new Set<>();
        Set B = new Set<>();
        Set C = new Set<>();
        Set D = new Set<>(); // Null

        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        B.add(3);
        B.add(6);
        B.add(9);
        B.add(12);
        B.add(D);


        C.add(2);
        C.add(4);
        C.add(6);
        C.add(8);
        C.add(D);

        System.out.println("A (" + A.cardinality() + ") = " + A);
        System.out.println("B (" + B.cardinality() + ") = " + B);
        System.out.println("C (" + C.cardinality() + ") = " + C);
        System.out.println("D (" + D.cardinality() + ") = " + D);
        System.out.println();
        System.out.println("A u B = " + A.union(B));
        System.out.println("A n B = " + A.intersect(B));
        System.out.println("(A n B) u C = " + A.intersect(B).union(C));
    }
}