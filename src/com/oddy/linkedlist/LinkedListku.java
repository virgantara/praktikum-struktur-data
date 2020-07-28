package com.oddy.linkedlist;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oddy
 */
public class LinkedListku {
    Node head = null;
    Node tail = null;
    
    public void add(String value){
        Node n = new Node();
        n.setLabel(value);
       
        if(head == null){
            head = n;
            tail = n;
        }
        
        else{
            tail.setNextNode(n);
            tail = n;
        }
    }
    
    public boolean remove(String value){
        if(this.head == null){
            return false;
        }
        
        Node n = this.head;
        
        if (n.getLabel().equals(value)){
            if (this.head.equals(this.tail)){
                this.head = null;
                this.tail = null;
            }
            
            else{
                this.head = this.head.getNextNode();
            }
            
            return true;
        }
        
        while (n.getNextNode() != null && !n.getNextNode().getLabel().equals(value)){
            n = n.getNextNode();
        }
        
        if (n.getNextNode() != null){
            if (n.getNextNode().equals(this.tail)){
                this.tail = n;
            }
            
            n.setNextNode(n.getNextNode().getNextNode());
            
            return true;
        }
        
        return false;
    }
    
    public boolean contains(String value){
        Node n = this.head;
        while (n != null && !n.getLabel().equals(value)){
            n = n.getNextNode();
        }
        
        if (n == null){
            return false;
        }
        
        return true;
    }
    
    public List<String> traverse(){
        Node n = this.head;
        List<String> listNode = new ArrayList<String>();
        while (n != null){
            listNode.add(n.getLabel());
            n = n.getNextNode();
        }
        
        return listNode;
    }
}
