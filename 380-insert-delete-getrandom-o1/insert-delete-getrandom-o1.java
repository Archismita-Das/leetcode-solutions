import java.util.*;

class RandomizedSet {

    ArrayList<Integer> list;
    HashMap<Integer, Integer> map;
    Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        // if already exists → return false
        if (map.containsKey(val)) return false;

        list.add(val);
        map.put(val, list.size() - 1);

        return true;
    }
    
    public boolean remove(int val) {
        // if not present → return false
        if (!map.containsKey(val)) return false;

        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);

        // swap with last element
        list.set(index, lastElement);
        map.put(lastElement, index);

        // remove last
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }
    
    public int getRandom() {
        int index = rand.nextInt(list.size());
        return list.get(index);
    }
}