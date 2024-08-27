package section11;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericCompare {

    public static <T> boolean areListsEqual(List<T> list1, List<T> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        List<String> keyList = List.of("A", "C");
        List<String> keyList2 = List.of("A", "C", "D");

        Boolean result = areListsEqual(keyList2, keyList);

        System.out.println(result);
    }

}
