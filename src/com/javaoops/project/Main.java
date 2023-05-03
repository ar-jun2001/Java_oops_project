package com.javaoops.project;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pizza base = new Pizza(true);
base.addExtraChesse();
base.takeAway();
base.getBill();
//if(base instanceof Pizza) {
//	System.out.println("***You Selected Regular Pizza"+"\n*****");
//}
Delux del = new Delux(true);
del.takeAway();
del.getBill();

//if(del instanceof Delux) {
//	System.out.println("***You selected Delux pizza*****");
//}
//		
		
		
		
	

	}
	}


