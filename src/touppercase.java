import java.util.Locale;
public class touppercase {
    public static void main(String[] args) {
                String s = "parul university";
                String turkish = s.toUpperCase(Locale.forLanguageTag("ni"));
                String english = s.toUpperCase(Locale.forLanguageTag("ty"));
                System.out.println(turkish);
                System.out.println(english);
    }
}
