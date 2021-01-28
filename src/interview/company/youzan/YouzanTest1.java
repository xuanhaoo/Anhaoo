package interview.company.youzan;

import java.util.*;

public class YouzanTest1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        transer(input);

    }

    private static void transer(String input) {
        List<String> list = new ArrayList<>(Arrays.asList(input.split(" ")));

        Iterator<String> iterator = list.iterator();

        List<String> result = new ArrayList<>();

        while (iterator.hasNext()) {
            String tmp = iterator.next();
            if ("".equals(tmp)) {
                // 删除空格
                iterator.remove();
                continue;
            }
            tmp = tmp.toUpperCase().charAt(0) + tmp.substring(1).toLowerCase();
            result.add(tmp);
        }

        System.out.println(String.join(" ", result));
    }

}
