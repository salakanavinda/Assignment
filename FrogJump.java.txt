import java.util.Scanner;

//Frog Class
public class Frog {
	
	//Instance Variables Of frog Class
	private String name;
	private int hoops;
	private int time;
	
	//Getters and Setter of intance variables
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}

	public int getHoops() {
		return hoops;
	}

	public void setHoops(int hoops) {
		this.hoops = hoops;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Frog Name :"+getName()+"\n"+" No Of Jumps : "+getHoops()+"\n"+ "Time taken : "+getTime();
	}
	

}

public class FrogJump {
	
	public static String getHoopsAndTime(int distance,String name) {
		
		Frog frog = new Frog();//crate new object from frog class
		frog.setName(name);//set frog name into new object
		int hoops=0;
		int time=0;
		
		//Loop for calculating Hoops and time
		while(distance>0) {
			if(distance<5) {
				hoops++;
				distance=0;
			}else {
				if(distance>=5) {
					if(distance==5) {
						hoops++;
						distance=distance-5;
					}else {
						hoops++;
						time=time+2;
						distance=distance-5;
					}
					if(distance>=3) {
						if(distance==3) {
							hoops++;
							distance=distance-3;
						}else {
							hoops++;
							time=time+3;
							distance=distance-3;
						}
						if(distance>=2) {
							if(distance==2) {
							   hoops++;
							   distance=distance-2;
							}else {
								hoops++;
								time=time+5;
								distance=distance-2;
							}
						}
					}
				}
			}
		}
		frog.setHoops(hoops);
		frog.setTime(time);
		
		return frog.toString();
	}

	public static void main(String[] args) {
		//Take User input from Keyboard
		Scanner userIn = new Scanner(System.in);
		System.out.println("Enter Forg Name And Distance");
		int distance = userIn.nextInt();
		String name= userIn.next();
		System.out.println(getHoopsAndTime(distance,name));
		

	}

}