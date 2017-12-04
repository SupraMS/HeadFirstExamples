class Dog{
String dogName;
Dog(String name){
	dogName = name;
	//public String dogName = name;
	//System.out.println("Inside Constructor "+dogName);
	//System.out.println("Inside Constructor "+dogName);
}

public void bark(){
System.out.println(dogName+" raff raff");
}

public void eat(){
System.out.println(dogName+" is eating chicken");
}

public void chaseCat(){
System.out.println(dogName+" is chasing cat");
}

public static void main(String [] args){
Dog dog1 = new Dog("Choco");
dog1.bark();
System.out.println("Inside main "+dog1.dogName);
//dog1.dogName = "Choco";//one way for calling 
//dog1.bark();//ditto
Dog[] myDogs = new Dog[5];//second way
myDogs[0] = new Dog("Tommy");
myDogs[1] = new Dog("Brownie");
myDogs[2] = new Dog("vicky");
myDogs[3] = new Dog("Tiger");
myDogs[4] = new Dog("gimmy");
myDogs[3].eat();


int i = 0;
for(i = 0;i < myDogs.length;i++){
if(i<2){
	myDogs[i].bark();	
}else if(i<4){
	myDogs[i].chaseCat();
}else{
	myDogs[i].eat();
}
}
}
}