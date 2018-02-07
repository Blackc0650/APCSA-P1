//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit4;

public class Name {
	private String name;
	public Name(){}
	public Name(String s) {
		name = s;
	}
   public void setName(String s) {
	   name = s;
   }
   public String getFirst() {
		return name.split(" ")[0];
   }

   public String getLast() {
	   return name.split(" ")[1];
   }

   public String toString() {
	   return name;
   }
}