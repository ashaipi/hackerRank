package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

class ResultBit {

    /*
     * Complete the 'getNumber' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_SINGLY_LINKED_LIST binary as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static long getNumber(SinglyLinkedListNode binary) {
        // Write your code here
        List<Integer> bit = new ArrayList<>();
        while(binary!=null){
            bit.add(binary.data);
            binary = binary.next;
        }
        long sum=0;
        System.out.println(bit);
        for (int j = 0; j < bit.size(); j++) {
            sum+=bit.get(bit.size()-j-1)*Math.pow(2,j);
        }
        return sum;
    }

}


public class BinaryNumberInLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList binary = new SinglyLinkedList();
        int binaryCount = 7;

        //int[] b = {0,1,0,1,0};
        int[] b = {0,0,1,1,0,1,0};

        for (int i = 0; i < b.length; i++) {
            int binaryItem = b[i];
            binary.insertNode(binaryItem);
        }
        System.out.println(ResultBit.getNumber(binary.head));


    }
}
