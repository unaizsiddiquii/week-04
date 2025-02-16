package com.setsinterface.settosortedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SetConverter {

    public List<Integer> convert(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
