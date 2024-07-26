/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

;
import java.util.NoSuchElementException;
import java.util.NoSuchElementException;

/**
 *
 * @author ACER
 */


public class LinkedList {

    private ListNode head;
    int size;

    public int size() {
        return size;
    }

    public LinkedList() {
        size = 0;
        head = new ListNode();
        head.next = head;
        head.prev = head;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;

        } else {
            return false;
        }
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public ListNode getHead() {
        return head;
    }

    private void addBefore(Object s, ListNode node) {
        ListNode baru;
        baru = new ListNode(s);
        baru.next = node;
        baru.prev = node.prev;
        node.prev.next = baru;
        node.prev = baru;
        size++;

    }

    public void addFirst(Object elemen) {
        addBefore(elemen, head.next);

    }

    public void addLast(Object elemen) {
        addBefore(elemen, head);
    }

    private Object remove(ListNode node) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
        return node.elemen;

    }

    public Object removeFirst() {

        return remove(head.next);

    }

    public Object removeLast() {

        return remove(head.prev);

    }

    @Override
    public String toString() {
        ListNode node = head.next;
        String kalimat;
        kalimat = "";
        while (node != head) {
            kalimat += node.elemen;
            node = node.next;
            if (node != head) {
                kalimat +="";

            }

        }
        kalimat += "";
        return kalimat;

    }

    public void print() {
        ListNode node = head.next;
        while (node != head) {
            System.out.println(node.next);
            System.out.println("    ");
            node = node.next;

        }

    }

    public ListNode search(Object find) {
        ListNode node;
        node = head.next;
        while (node != head) {
            if (node.elemen == find) {

                return node;
            } else {
                node = node.next;
            }

        }

        return null;
    }

}
