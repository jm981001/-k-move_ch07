package ch07;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메인에서 객체를 만들어야만 사용 가능
	    Student stu = new Student ("홍길동", "123456-1234567",111); //스트링 스트링 인트
	    System.out.println("name :"+stu.name);
	    System.out.println("ssn :"+stu.ssn);
	    System.out.println("studentNo :"+stu.studentNo);
	}

}
