package org.example;

import java.util.Arrays;

public class BubbleSort {

    public static Integer[] sort(Integer[] sortable){
        Boolean doSort = true;
        while(doSort) {
            doSort = false;
            Integer[] newArray = new Integer[sortable.length];
            for (int i = 0; i < sortable.length - 1; i++) {

                if (sortable[i] > sortable[i + 1]) {
                    doSort = true;
                    newArray[i] = sortable[i + 1];
                    newArray[i + 1] = sortable[i];
                    sortable[i] = newArray[i];
                    sortable[i+1] = newArray[i+1];
                } else {
                    newArray[i] = sortable[i];
                    newArray[i+1] = sortable[i+1];
                }

            }
            sortable = Arrays.copyOf(newArray, sortable.length);
        }
        System.out.println(Arrays.toString(sortable));
        return sortable;

    }

}
