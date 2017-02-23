package pl.sda.factory;

import pl.sda.sort.impl.Sort;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-23.
 */
public class Main {
    public static void main(String[] args) {
        Sort bubbleSort = SortFactory.produce("BUBBLE");

        int[] array = new int[]{5, 3, 0, -11, 55, -99};
        System.out.println((bubbleSort.sort(array)));
        int[] resoult = bubbleSort.sort(array);
        System.out.println(Arrays.toString(resoult));
    }
}

