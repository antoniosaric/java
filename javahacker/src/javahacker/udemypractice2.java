package javahacker;

public class udemypractice2 {
	public static void main(String[] args){
	Car.Owners="smith";
	Car car1 = new Car("BMW", 2016, 10000,5);
	System.out.println(car1.GetPrice()); 
	Car car2 = new Car("MERC", 2015, 60000,6);
	System.out.println(car2.GetPrice()); 
	System.out.println(car1.Owners);
	System.out.println(car2.Owners);
}
}