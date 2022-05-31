package ch07;

public class Student extends People {

	
	public int studentNo;
	
	public Student () {
	}
	public Student (String name, String ssn , int studentNo) {//피플에 9번 작성해야 오류 안뜸
		super(name, ssn);//부모 생성자 호출 //밑에랑 같은 // 슈퍼 키워드 호출
		//this.name =name ;//부모기능
		//this.ssn =ssn;//부모기능
		this.studentNo = studentNo;
	}
}
