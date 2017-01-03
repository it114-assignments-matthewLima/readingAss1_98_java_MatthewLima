/**
 * 
 */
package readingAss1_98_java_MatthewLima;

/**
 * @author Matt
 *
 */
public class Fan {

		public final int SLOW = 1;
		public final int MEDIUM = 2;
		public final int FAST = 3;
		private int speed;
		private double radius;
		private boolean on;
		public String color;
		
		public Fan(){
			speed = SLOW;
			radius = 5.0;
			on = false;
			color = "blue";
		}
		public void setSpeed(int s){
			speed = s;
		}
		public void setRadius(double r){
			radius = r;
		}
		public void setOn(boolean o){
			on = o;
		}
		public void setColor(String c){
			color = c;
		}
		public int getSpeed(){
			return speed;
		}
		public double getRadius(){
			return radius;
		}
		public boolean getOn(){
			return on;
		}
		public String getColor(){
			return color;
		}
		public String toString(){
			if (on == false){
			return "Information on the fan:  " + speed +" "+ color+ " " + radius;
			}
			else{
				return "Information on the fan:  " + color + " " + radius + " " + "fan is off.";
			}
		}
}
