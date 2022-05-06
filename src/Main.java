import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Map<String, String> namePhone = new HashMap<>();

        for (int i = 0; i < n; i++) {
            namePhone.put(in.nextLine(), in.nextLine());
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            if (namePhone.containsKey(s)) {
                String namePro = namePhone.get(s);
                System.out.println(s + "=" + namePro);
            } else {
                System.out.println("Not found");
            }

        }
    }
}