package DataStructure;

public class IntList {
    public int currValue;// curr/last element value
    public IntList prev;// address point prev IntList

    public IntList(int currValue, IntList prev) {// Constructor
        this.currValue = currValue;
        this.prev = prev;
    }

    public int size() {// recursion get size
        if (prev == null) {// first element
            return 1;
        }
        return 1 + this.prev.size();
    }

    /**
     * Returns the ith item of list
     * @param index target index of list [0, size)
     * @return target element's value
     */
    public String get(int index) {// index between [0, size)
        String res = "";// return value
        IntList temp = this;// cur IntList
        int size = size();// list size
        int deepth = size - index;// 向前访问几次
        int point = 0;// 访问指针
        if (index < 0 || index >= this.size() ) {
            return "Input index is " + index + "out of index " + size;
        }
        while (point != deepth) {
            res = String.valueOf(temp.currValue);
            temp = temp.prev;
            point += 1;
        }
        return res;
    }

    /**
     * Returns the ith item of list by recursion
     * @param index target index of list [0, size)
     * @return target element's value
     */
    public int getmega(int index) {// index between [0, size)
        if (index == 1) {
            return this.currValue;
        }
        return this.prev.getmega(index - 1);
    }

    public static void main(String[] args) {
        IntList list = new IntList(5, null);
        list = new IntList(10, list);
        list = new IntList(15, list);
        int size = list.size();
        System.out.println(size);
        System.out.println(list.get(2));
        System.out.println(list.getmega(4));
    }
}
