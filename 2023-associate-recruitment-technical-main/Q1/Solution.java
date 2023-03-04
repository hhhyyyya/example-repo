import java.util.*;
public class Solution {
    public static List<Integer> mapToInt(String[] arr) {
        List<Integer> list = new ArrayList<>();
        for (String str: arr) {
            if (str.charAt(str.length() - 1) == 'S') {
                list.add(-str.length());
            } else if (str.charAt(str.length() - 1) == 'L') {
                list.add(str.length());
            } else {
                list.add(0);
            }
        }
        return list;
    }
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        String[] sizes = new String[N];
        for (int i = 0; i < N; i++) {
            sizes[i] = scanner.next();
        }
        int M = Integer.parseInt(scanner.next());
        String[] requests = new String[M];
        for (int i = 0; i < M; i++) {
            requests[i] = scanner.next();
        }
        scanner.close();

        // main logic
        List<Integer> sizeList = mapToInt(sizes);
        List<Integer> requestList = mapToInt(requests);
        Collections.sort(sizeList);
        Collections.sort(requestList);
        int requestIdx = 0;
        int count = 0;
        for (int i = 0; i < sizeList.size(); i++) {
            if (requestIdx >= requestList.size()) break;
            if (sizeList.get(i) < requestList.get(requestIdx)) continue;
            count++;
            requestIdx++;
        }

        // output
        if (count == requestList.size()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
