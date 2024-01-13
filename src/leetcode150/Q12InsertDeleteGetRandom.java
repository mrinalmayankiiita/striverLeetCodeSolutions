package leetcode150;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Q12InsertDeleteGetRandom {


    private Map<Integer, Boolean> map;
    private Random rn;

    public Q12InsertDeleteGetRandom() {
        this.map = new HashMap<>();
        this.rn = new Random();

    }

    public boolean insert(int val) {
        if(map.get(val)== null){
            map.put(val, true);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        Boolean remove = map.remove(val);
        if(remove!=null) return true;
        return false;
    }

    public int getRandom() {
        Integer random = rn.nextInt(map.entrySet().size());
        return new ArrayList<>(map.entrySet()).get(random).getKey();

    }

}
