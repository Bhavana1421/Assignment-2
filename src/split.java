public class split {
    public static void main(String[] args) {
                String str = "Parul Universityyyy";
                System.out.println("Returning words:");
                String[] arr = str.split("y", 0);
                for (String w : arr) {
                    System.out.println(w);
                }
                System.out.println("Split array length: "+arr.length);
    }
}
