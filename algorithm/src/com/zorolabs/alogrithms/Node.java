package com.zorolabs.alogrithms;

public class Node {
	
	protected Node next;
	protected String data;
	
	public Node (String data){
		this.data = data;
		
	}
	
	public String data(){
		return data;
	}
	
	public void setData(String data){
		
		this.data =data;
		
	}
	
	public Node next(){
		return next;
	}
	
	public void SetNext(){
		this.next =next;
		
	}
	
	 public String toString(){
         return this.data;
     }

}
