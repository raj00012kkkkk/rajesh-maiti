package practical;

class Encaptulation {
	
	private String name;
	private int age,rollno;

	public String getName() {
		return name;
	}
     
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

}

 class tesstencapsulate
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encaptulation t=new Encaptulation();
		t.setName("rajesh");
		t.setAge(15);
		t.setRollno(16);
		System.out.println("name is"+t.getName());
		System.out.println("name is"+t.getAge());
		
		System.out.println("name is"+t.getRollno());
		
	}

}
 
 
 /* In the above program, the class Encapsulate is encapsulated as 
   the variables are declared as private. The get methods like getAge() , getName() ,
    getRoll() are set as public, these methods are used to access these variables.
     The setter methods like setName(), setAge(), setRoll() are also declared as public
      and are used to set the values of the variables. 
      */
  