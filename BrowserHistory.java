import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        String navigation = scan.nextLine();
        String currentURL = "";

        while (!navigation.equals("Home")) {
            if (navigation.equals("back")){
                if (!stack.isEmpty()) {
                    currentURL = stack.pop();
                } else {
                    System.out.println("no previous URLs");
                    navigation =scan.nextLine();
                    continue;
                }
            } else {
                if (!currentURL.isEmpty()){
                    stack.push(currentURL);
                }
                currentURL = navigation;

            }
            System.out.println(currentURL);

            navigation = scan.nextLine();
        }
    }
}
