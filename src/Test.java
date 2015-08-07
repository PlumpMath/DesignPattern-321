
public class Test {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/test";

        String[] arr = url.split("\\.");
        System.out.println(url);

        for(String s : arr) {
            System.out.println(s);
        }

        String regex = "^jdbc:mysql://\\p{Alnum}+";
        System.out.println(arr[0].matches(regex));
    }
}
