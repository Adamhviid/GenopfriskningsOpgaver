import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Test");

        String s = "Test";

        doesArrayListContainString(list, s);

        System.out.println(Arrays.toString(list.toArray()));

    }

    public static boolean doesArrayListContainString(ArrayList list, String s) {

        if (list.contains(s)) {
            System.out.println("The String has been found");
            return true;
        } else {
            list.add(s);
            System.out.println("'" + s + "' has been added to the list.");
            return false;
        }
    }


}
