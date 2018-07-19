package online.judge.problem;

public class OverloadingTestMain {

	public static void main(String[] args) {
		
		OverloadingTestClass overloadingTestClass = new OverloadingTestClass();
		overloadingTestClass.overloadingTestMethod();
		overloadingTestClass.overloadingTestMethod(1);
		overloadingTestClass.overloadingTestMethod(1, 2);
		overloadingTestClass.overloadingTestMethod("ONE");
		overloadingTestClass.overloadingTestMethod("ONE", "TWO");		
	}
}
