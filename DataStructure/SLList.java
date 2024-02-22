package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * list of integers
 */
public class SLList {

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
    private IntNode first;
    private int size;// ssl  caches the size variable

    public SLList() {// Constructor
        size = 0;
        first = null;
    }
    public SLList(int x) {// Constructor
        size = 1;
        first = new IntNode(x, null);
    }

    public void addFirst(int x) {// 其实是最后一个
        size+=1;
        first = new IntNode(x, first);
    }

    public int getFirst() {// 其实是最后一个
        return first.item;
    }

    public void addLast(int x) {// 其实是第一个
        if (first == null) {
            addFirst(x);
        } else {
            IntNode p = first;
            while (p.next != null) {
                p = p.next;
            }
            p.next = new IntNode(x, null);
            size += 1;
        }
    }

    public int getLast() {// 其实是第一个
        IntNode p = first;
        while (p.next != null) {
            p = p.next;
        }
        return p.item;
    }

    /** Returns the size of the list starting at IntNode p. */
    private static int recursionSize(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1+recursionSize(p.next);
    }

    public int size() {
        // Non-recursion
//        IntNode p = first;
//        int size = 1;
//        while (p.next != null) {
//            p = p.next;
//            size++;
//        }
//        return size;
        // recursion
//        return recursionSize(first);
        return size;
    }
    public static void main(String[] args) {
        SLList L = new SLList();
        L.addLast(3);
        L.addLast(5);
        System.out.println(L.getLast());
        System.out.println(L.size());
    }
}
