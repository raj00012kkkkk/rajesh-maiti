package assignment;


class Teacher {
	 void teach() {
	  System.out.println("Teaching subject");
	 }
	}
	class Student extends Teacher {
	 void listen() {
	  System.out.println("Listening");
	 }
	}
	class Principal extends Teacher {
	 void evaluate() {
	  System.out.println("Evaluating");
	 }
	}
	class Hierarchicalinherit {
	 public static void main(String argu[]) {
	  Principal p = new Principal();
	  p.evaluate();
	  p.teach();
	  // p.listen(); will produce an error
	 }
	}
