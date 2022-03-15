package hr.atos.praksa.ivanhusnjak.zadatak16;

import java.util.Random;

public class Zadatak16 {
	
	private static class Node {
		int val;
		Node next;
	}
	
	public static void main(String[] args) {
		
		int brojStanovnika = 12;
		Random rand = new Random();
		int randomInt = rand.nextInt(brojStanovnika / 2 ) + 1;
		
		System.out.println("random: " + randomInt);
		
		
		Node head =  new Node();
		head.val = 1;
		head.next = head;
		Node tail = head;
		
		for (int i = 2; i <= brojStanovnika; i++) {
			Node x =  new Node();
			x.val = i;
			x.next  = head;
			tail.next = x;
			tail = x;	
		}
		
		Node x = tail;
		while (x != x.next) {
			for (int i = 1; i < randomInt; i++) {
				x = x.next;
			}
			System.out.println(x.next.val + " ");
			x.next = x.next.next;
		}
		System.out.println("Result :" + x.val);
			
	}

}
