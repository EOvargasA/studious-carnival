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
public class MyList <T>{
    Node first = null;
    Node last = null;
    Node pointer = null;
    
    MyList(T d){
        Node node = new Node(d);
        first = node;
        last = node;
        node.next = null;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public void insertFirst(T d){
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
    public void insertLast(T d){
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
    public boolean deleteNode(T n){
        Node p = fetchBack(n);
        if (p != null){
            if (p.data == n){
                deleteFirst();
                return true;
            }else{
                p.next = p.next.next;
                return true;
            }
        }else{
            return false;
        }
    }
    public int width (){
        int r = 0;
        if(isEmpty()){
            return 0;
        }
        while(pointer.next != last){
            pointer = pointer.next;
            r++;
        }
        return r + 1;
    }
    public Node fetchBack(T n){
        if (!isEmpty()){
            if (first == last){
                if (first.data == n){
                    return first;
                }
                return null;
            }
            if (first.data == n){
                return first;
            }
            pointer = first;
            while(pointer.next != null){
                if (pointer.next.data == n){
                    return pointer;
                }
                pointer = pointer.next;
            }
        }
        return null;
    }
    public Node fetch (T n){
        if (!isEmpty()){
            if (first == last){
                if (first.data == n){
                    return first;
                }
            }else{
                pointer = first;
                while (pointer != null){
                    if (pointer.data == n){
                        return pointer;
                    }
                    pointer = pointer.next;
                }
            }
        }
        return null;
    }
}
