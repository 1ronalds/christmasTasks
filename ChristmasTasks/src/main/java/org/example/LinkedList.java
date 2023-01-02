package org.example;

public class LinkedList {
    class LinkedListNode {
        public Integer value;
        public LinkedListNode next;
    }

    LinkedListNode list;

    public LinkedList(){
        list = new LinkedListNode();
        list.value = null;
        list.next = null;
    }

    public void add(Integer addable) {
        LinkedListNode current = list;
        if(current.value == null){
            current.value = addable;
            current.next = null;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = new LinkedListNode();
            current.next.value = addable;
            current.next.next = null;
        }
    }

    public Integer get(Integer index){
        LinkedListNode current = list;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.value;
    }

    public void delete(Integer index){
        LinkedListNode current = list;
        if(index == 0){
            list = list.next;
        }
        for(int i = 0; i < index - 1; i++){
            current = current.next;
        }
        LinkedListNode after = list;
        for(int i = 0; i < index + 1; i++){
            after = after.next;
        }
        current.next = after;
    }

    public void addAtIndex(Integer index, Integer addable){
        LinkedListNode current = list;
        if(index == 0){
            LinkedListNode newList = new LinkedListNode();
            newList.value = addable;
            newList.next = list;
        } else {
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            LinkedListNode after = list;
            for(int i = 0; i < index; i++){
                after = after.next;
            }
            current.next = new LinkedListNode();
            current.next.value = addable;
            current.next.next = after;
        }
    }
}
