/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo;

/**
 *
 * @author Osiris
 */
public class MyList {
    Node first = null;
    Node last = null;
    Node pointer = null;
    
    MyList(int d){
        Node node = new Node(d);
        first = node;
        last = node;
        node.next = null;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public void insertFirst(int d){
        Node node = new Node(d);
        if (isEmpty()){
            first = node;
            last = node;
            node.next = null;
        }else{
            node.next = first;
            first = node;
        }
    }
    public void insertLast(int d){
        Node node = new Node(d);
        if (isEmpty()){
            first = node;
            last = node;
            node.next = null;
        }else{
            last.next = node;
            last = node;
        }
    }
    public void deleteFirst(){
        if (!isEmpty()){
            if (first.next == null){
                first = last = null;
            }else{
                first = first.next;
            }
        }
    }
    public void deleteLast(){
        if (!isEmpty()){
            if (first.next == null){
                first = last = null;
            }else{
                pointer = first;
                while(pointer.next != last){
                    pointer = pointer.next;
                }
                last = pointer;
                last.next = pointer = null;
            }
        }
    }
}
