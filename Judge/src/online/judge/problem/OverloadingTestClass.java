package online.judge.problem;

/**
 * 오버로딩(Overloading)
 * */
public class OverloadingTestClass {

	void overloadingTestMethod() {
		System.out.println("매개변수가 없는 메소드입니다.");
	}
	
	void overloadingTestMethod(String param01) {
		System.out.println("매개변수가  한 개이고 타입이 String인 (변수 값:" + param01 + ") 메소드입니다.");
	}

	void overloadingTestMethod(String param01, String param02) {
		System.out.println("매개변수가  두 개이고 타입이 String인 (변수 값:" + param01 + "와 변수 값:" + param02 + ") 인 메소드입니다.");
	}

	void overloadingTestMethod(int param01) {
		System.out.println("매개변수가  한 개이고 타입이 int인 (변수 값:" + param01 + ") 메소드입니다.");
	}

	void overloadingTestMethod(int param01, int param02) {
		System.out.println("매개변수가  두 개이고 타입이 int인 (변수 값:" + param01 + "와 변수 값:" + param02 + ") 인 메소드입니다.");
	}
}
