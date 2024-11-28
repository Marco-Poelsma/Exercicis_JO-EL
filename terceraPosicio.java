import java.util.*;

public class terceraPosicio {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int casos = scan.nextInt();
    HashMap<Integer, Integer> puntuacions = new HashMap<>();
    for (int i = 0; i < casos; i++) {
        int n = scan.nextInt();
        if (!puntuacions.containsKey(n)) puntuacions.put(n,1);
        else puntuacions.put(n, puntuacions.get(n)+1);
    }
    TreeMap<Integer, Integer> ordenat2 = new TreeMap<>(puntuacions);
    NavigableMap<Integer, Integer> ordenat = ordenat2.descendingMap();
    Integer tercer = ordenat.entrySet().stream().skip(2).map(map -> map.getValue()).findFirst().get();
    List<Integer> keyList = new ArrayList<>(ordenat.keySet());
    System.out.println(keyList.get(2) + " " + tercer);

    scan.close();
    }
}
