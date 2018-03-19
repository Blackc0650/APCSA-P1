package labs.unit12.Lab18b;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Monster implements Comparable<Object> {

    private int myWeight;
    private int myHeight;
    private int myAge;

    //write a default Constructor
    public Monster() {
    	setMyWeight(setMyHeight(setMyAge(0)));
    }
    //write an initialization constructor with an int parameter ht
    public Monster(int myHeight) {
    	this.setMyHeight(myHeight);
    }
    //write an initialization constructor with int parameters ht and wt
    public Monster(int myHeight,int myWeight) {
    	this.setMyWeight(myWeight);
    	this.setMyHeight(myHeight);
    }
    //write an initialization constructor with int parameters ht, wt, and age
    public Monster(int myHeight,int myWeight,int myAge) {
    	this.setMyWeight(myWeight);
    	this.setMyHeight(myHeight);
    	this.setMyAge(myAge);
    }


    //modifiers - write set methods for height, weight, and age



    //accessors - write get methods for height, weight, and age



    //creates a new copy of this Object
    public Object clone() {
        return this;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int compareTo(Object obj) {
        Monster rhs = (Monster) obj;
        int[] monsterP = {myHeight,myWeight,myAge};
        int[] objP = {rhs.myHeight,rhs.myWeight,rhs.myAge};
        for (int i = 0; i < monsterP.length; i++) {
			if(objP[i] != monsterP[i]) {
				return monsterP[i] > objP[i] ? 1 : -1;
			}
		}
        return 0;
    }
    public String toString() {
    	return myHeight + " " + myWeight + " " + myAge;
    }
	public int getMyWeight() {
		return myWeight;
	}
	public void setMyWeight(int myWeight) {
		this.myWeight = myWeight;
	}
	public int getMyHeight() {
		return myHeight;
	}
	public int setMyHeight(int myHeight) {
		this.myHeight = myHeight;
		return myHeight;
	}
	public int getMyAge() {
		return myAge;
	}
	public int setMyAge(int myAge) {
		this.myAge = myAge;
		return myAge;
	}


}