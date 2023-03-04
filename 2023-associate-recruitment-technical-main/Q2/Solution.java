import java.util.*;
public class Solution {
    public static void main(String[] args) {
        List<String> res = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String[] strs = new String[3];
            strs = scanner.nextLine().split(" ");
            if (strs[1] == "false") {
                res.add(strs[2]);
            }
            scanner.nextLine();
        }
        if (res.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        for(String name:res) {
            System.out.println(name);
        }
    }
}
