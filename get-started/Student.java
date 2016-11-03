public class Student {
	public String name;
	public int age;
	public double[] grades;
	
	public Student(String name, int age, double[] grades) {
		this.name = name;
		this.age = age;
		this.grades = grades;
	}
	
	public void printAllInfo() {
		System.out.println("STUDENT NAME: " + this.name);
		System.out.println("STUDENT AGE: " + this.age);
		System.out.println("STUDENT GRADES:");
		for(int i = 0 ; i < this.grades.length ; i = i + 1) {
			System.out.print(this.grades[i] + " ");
		}	
		System.out.print("\n");
		System.out.println("STUDENT AVERAGE: " + this.getAverage());
	}
	
	public double getAverage() {
		double sum = 0.0;
		for(int i = 0 ; i < this.grades.length ; i = i + 1) {
			sum = sum + this.grades[i];
		}
		
		return sum / this.grades.length;
	}
	
	
}
