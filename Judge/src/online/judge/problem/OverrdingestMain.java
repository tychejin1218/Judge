package online.judge.problem;

/**
 * 오버라이딩(Overriding)
 * */
public class OverrdingestMain {

	public static void main(String[] args) {
		
		OverrdingAnimalClass aOverrdingAnimalClass = new OverrdingAnimalClass();
		OverrdingDogClass aOverrdingDogClass = new OverrdingDogClass();
		OverrdingCatClass aOverrdingCatClass = new OverrdingCatClass();
		
		System.out.println(aOverrdingAnimalClass.getMethodInfo());
		System.out.println(aOverrdingDogClass.getMethodInfo());
		System.out.println(aOverrdingCatClass.getMethodInfo());
	}
}
