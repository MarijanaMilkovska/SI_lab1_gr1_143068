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
