class Student {
	String index;
	String firstName;
	String lastName;
		List<Integer>labPoints;


public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}

public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getlabPoints() {
		return labPoints;
	}

	public void setGrades(List<Integer> labPoints) {
		this.labPoints = labPoints;
	}


	public double getAverage() {
		int sumPoints=0;
		int amountLabs=0;
		for (int n:labPoints) {
			sumPoints+=n;
			amountLabs++;
		}
		return (double)(sumPoints/amountLabs);
	}

	public boolean hasSignature() {
		int signature = false;
		for(Integer labpoints:points){
			if(points=>8){
				return true;
			}
		}
		return false;
	}
	}
}
 
 class Course{
	 List<Student> students;
	 	public Course(List<Student> students) {
		this.students = students;
	}
	public void addStudent(Student newStudent) {
		this.students.add(newStudent)
	}
	public void removeStudent (Student removeStudent) {
		for(int i=0; i<students.size(); i++){
			if(students.get(i).getIndex == removeStudent.getIndex()){
				students.remove(i);
			}
		}
	}
	public float averageStudents(){
		float sumAverage = 0;
		for(Student student:students){
			sumAverage += student.getAverage();
		}
		return sumAverage/students.size();
	}
	public float averageCredits(){
		float sumECTS = 0;
		for (Student student:students){
			sumECTS += student.ECTSCredits();
		}
		return sumECTS/students.size();
	}
 }