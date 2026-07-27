import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

       List<String> list = new ArrayList<>();

list.add("사과");
list.add("바나나");

System.out.println(list.get(1));
Set<String> set = new HashSet<>();

set.add("A");
set.add("B");
set.add("A");

System.out.println(set.size());

Map<String, Integer> map = new HashMap<>();

map.put("사과", 1000);
map.put("바나나", 2000);

System.out.println(map.get("사과"));
    }
}