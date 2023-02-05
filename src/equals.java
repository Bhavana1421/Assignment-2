public class equals {
    public static void main(String[] args) {
                String s1 = "Bhavana";
                String s2 = "Bhavana";
                String s3 = "bhavana";
                System.out.println(s1.equals(s2));
                if (s1.equals(s3)) {
                    System.out.println("both strings are equal");
                }else System.out.println("both strings are unequal");
    }
}
