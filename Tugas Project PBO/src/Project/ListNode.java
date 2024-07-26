/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author ACER
 */
public class ListNode {

    Object elemen;
    ListNode next;
    ListNode prev;

    public Object getElemen() {
        return elemen;
    }

    public ListNode() {

    }

    public ListNode(Object elemen) {
        this.elemen = elemen;

    }

    public ListNode(Object elemen, ListNode next, ListNode prev) {
        this.elemen = elemen;
        this.next = next;
        this.prev = prev;

    }

}
