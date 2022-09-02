

import java.util.HashMap;
import java.util.Map;

/**
 * The HelloYum program simply displays general information to the standard output.
 *
 * @author Joseph Liao
 * @version 1.0
 * @since 2022-08-31
 */
class HelloYum {
    HashMap<String, String> map = new HashMap<String, String>();

    public void addInfo() {
        map.put("Andrew ID: ", "jianxian");
        map.put("First Name: ", "jianxiang");
        map.put("Last Name: ", "Liao");
        map.put("This is: ", "My program");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }

    public static void main(String[] args) {
        HelloYum hy = new HelloYum();
        hy.addInfo();
    }
}
