package Garage;

import java.util.ArrayList;

public class Garage {
	
	
	ArrayList<Vehicle> garageList = new ArrayList<>();		
	
     //RAGE!!!!!!!
     
	
	
	
		
	
	public void add(Vehicle v){
		garageList.add(v);
	}
	public void remove(int registration){
		garageList.remove(registration);
	}
	
	public void emptyGarage() {
		garageList.clear();
	}
	public void cost(){
		for (int i=0; i<garageList.size(); i++){
			if(garageList.get(i) instanceof Car){
				if(garageList.get(i).isBroken){
					int cost=garageList.get(i).value /10 + 50 ;
					System.out.println("The cost of " + garageList.get(i).registration + " is " + cost);}
				else {
					int cost=50;
					System.out.println("The cost of " + garageList.get(i).registration + " is " + cost);}}
			else if(garageList.get(i) instanceof Bike){
				if(garageList.get(i).isBroken){
					int cost=garageList.get(i).value /10 + 30 ;
					System.out.println("The cost of " + garageList.get(i).registration + " is " + cost);}
				else {
					int cost=30;
					System.out.println("The cost of " + garageList.get(i).registration + " is " + cost);}}
			else {
				if(garageList.get(i).isBroken){
					int cost=garageList.get(i).value /10 + 70 ;
					System.out.println("The cost of " + garageList.get(i).registration + " is " + cost);}
				else {
					int cost=70;
					System.out.println("The cost of " + garageList.get(i).registration + " is " + cost);}}
		
		}			
					
				}
				
			
		}
		
	

