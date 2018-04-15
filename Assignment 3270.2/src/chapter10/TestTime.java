package chapter10;

public class TestTime {

	public static void main(String[] args) {
		Time t1= new Time();
		Time t2= new Time(555550000);
		
		System.out.println("Time 1 hour:"+ t1.getH() +"\nTime 1 min:"+ t1.getM()+"\nTime 1 sec:"+ t1.getS());
		System.out.println("Time 2 hour:"+ t2.getH() +"\nTime 2 min:"+ t2.getM()+"\nTime 2 sec:"+ t2.getS());
	}

}
