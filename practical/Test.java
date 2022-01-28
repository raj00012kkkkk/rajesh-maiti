package practical;

 public class Test {
	private String name,address;
	int age;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
class Emp
{
	public static void main(String a[])
	{
		Test t=new Test();
		t.setName("Rajesh");
		t.setAge(150);
		t.setAddress("kolkata");
		System.out.println("name is " +t.getName());
		System.out.println("Age is "+t.getAge());
		
		System.out.println("Address  is"+t. getAddress());
	}
}
