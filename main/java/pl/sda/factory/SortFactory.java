package pl.sda.factory;

import pl.sda.sort.impl.BubbleSort;
import pl.sda.sort.impl.CountSort;
import pl.sda.sort.impl.InsertSort;
import pl.sda.sort.impl.Sort;

/**
 * Created by RENT on 2017-02-23.
 */
public class SortFactory {
public static Sort produce(String type) {
    Sort result = null;
    if ("BUBBLE".equals(type)) {
        return new BubbleSort();
    }
     if ("COUNT".equals(type)) {
        return new CountSort();
     }
     if ("INSERT".equals(type)) {
        return new InsertSort();
     }
     return null;
}
}
