package oopConcept;
 class Encap
 {
	 private String name;
	 private String designation;
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getDesignation() {
		 return designation;
	 }
	 public void setDesignation(String designation) {
		 this.designation = designation;
	 }
	 
 }
public class EncapsulationPgm {

	public static void main(String[] args) {
		Encap ob=new Encap();
		ob.setName("Anu");
		ob.setDesignation("Tester");
		System.out.println(ob.getName());
		System.out.println(ob.getDesignation());
	}

}
