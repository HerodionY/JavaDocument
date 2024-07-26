/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;



/**
 *
 * @author ACER
 */
public class Stack {

    LinkedList tumpukan;
    Object[] elemen;

    public Stack() {
        tumpukan = new LinkedList();

    }

    public int size() {
        return tumpukan.size();
    }

    public boolean isEmpty() {
        if (tumpukan.size() == 0) {
            return true;

        } else {
            return false;
        }
    }

    public void push(Object elemen) {
        tumpukan.addFirst(elemen);
    }

    public boolean pop() {
        if (!isEmpty()) {

            tumpukan.size();
            return true;

        } else {
            System.out.println("kosong");
        }
        return false;

    }

    public Object Pop() {

        return tumpukan.removeFirst();

    }

    @Override
    public String toString() {

        return tumpukan.toString();

    }

}
