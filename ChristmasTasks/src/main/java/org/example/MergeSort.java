package org.example;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeSort {
    private Integer[] merge(Integer[] x, Integer[] y){
        Integer[] z = new Integer[x.length + y.length];
        System.arraycopy(x, 0, z, 0, x.length);
        System.arraycopy(y, 0, z, x.length, y.length);
        Arrays.sort(z);
        return z;
    }

    private LinkedList<LinkedList<Integer>> split(LinkedList<LinkedList<Integer>> input){
        Integer count = input.size();
        LinkedList<LinkedList<Integer>> returnList = new LinkedList<>();
        LinkedList<Integer> first;
        LinkedList<Integer> second;
        for(int i = 0; i < count; i++){
            Integer size = input.get(i).size();
            first = (LinkedList<Integer>) input.get(i).subList(0, (size+1)/2);
            second = (LinkedList<Integer>) input.get(i).subList((size+1)/2, size);

            returnList.add(first);
            returnList.add(second);
        }
        return returnList;
    }

    public LinkedList<Integer> sort(LinkedList<Integer> input){
        for(int i = 0; i < input.size(); i++){
            LinkedList<LinkedList<Integer>> formattedInput = new LinkedList<>();
            formattedInput.add(input);
            LinkedList<LinkedList<Integer>> result = split(formattedInput);

            //Incomplete
        }
    }
}