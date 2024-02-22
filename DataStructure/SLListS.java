package DataStructure;

import java.util.ArrayList;
import java.util.List;

/**
 * list of integers with sentinel node
 */
public class SLListS {

    private static class IntNode {// nested class of SLList
        /*
            If the nested class has no need to use any of the instance methods or variables of SLList,
            you may declare the nested class static
         */
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
    private IntNode sentinel;
    private int size;// ssl  caches the size variable

    public SLListS() {// Constructor
        size = 0;
        sentinel = new IntNode(63, null);
    }

    public void addEnd(int x) {
        size += 1;
        sentinel.next = new IntNode(x, null);
    }

    public int getEnd() {
        if (size == 0) {
            return -1;
        }
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        return p.item;
    }

    public int get(int index) {
        IntNode p = sentinel.next;
        int value = 0;
        if (index >= size) {
            return -1;
        }
        for (int i=0; i<=index; i++) {
            value = p.item;
            p = p.next;
        }
        return value;
    }

    public int getFirst() {
        return sentinel.item;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SLListS L = new SLListS();
        L.addEnd(10);
        System.out.println(L.getEnd());
        System.out.println(L.size());
        System.out.println(L.get(0));
    }
}
