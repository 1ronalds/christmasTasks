package org.example;

import java.util.Arrays;

public class ArrayList {
    private Integer[] list = new Integer[0];

    public void add(Integer addable) {
        Integer[] history = Arrays.copyOf(list, list.length);
        list = new Integer[list.length+1];
        list = Arrays.copyOf(history, list.length);
        list[list.length-1] = addable;
    }

    public void delete(Integer index) {
        Integer[] history = Arrays.copyOf(list, list.length);
        list = new Integer[list.length-1];
        int x = -1;
        for (int i = 0; i < history.length; i++) {
            if(i!=index){
                x += 1;
                list[x] = history[i];
            }
        }
    }
    public Integer getAtIndex(Integer index) {
        return list[index];
    }

    public void addAtIndex(Integer index, Integer addable){
        Integer[] history = Arrays.copyOf(list, list.length);
        list = new Integer[list.length+1];
        for(int i = 0; i < list.length; i++){
            if(i != index){
                list[i] = history[i];
            } else {
                list[i] = addable;
                for (int x = i + 1; x < list.length; x++) {
                    list[x] = history[x-1];
                }
                break;
            }
        }
    }

}