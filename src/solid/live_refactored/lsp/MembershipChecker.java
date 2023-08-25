package solid.live_refactored.lsp;

import java.util.ArrayList;
import java.util.List;

public class  MembershipChecker {

    public static boolean check(List elements, Set uniqueElements) {
        for (Object element : elements) {
            if (!uniqueElements.isMember(element))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> elements = new ArrayList<String>() {{
            add("a");
            add("b");
            add("c");
        }};

        List<String> anotherElements = new ArrayList<String>() {{
            add("a");
            add("c");
            add("d");
        }};

        Set<String> uniqueElements = new PersistentSet<>();
        uniqueElements.add("c");
        uniqueElements.add("b");
        uniqueElements.add("a");

        System.out.println("Check1: " + MembershipChecker.check(elements, uniqueElements));
        System.out.println("Check2: " + MembershipChecker.check(anotherElements, uniqueElements));
    }
}
