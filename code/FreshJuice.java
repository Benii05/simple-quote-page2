class FreshJuice {
	enum FreshJuiceSize{SMALL, MEDIUM, LARGE}
	FreshJuiceSize;
}


public class FreshJuiceTest {


	public static void main(string args[]) {
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println("Size: " + juice.size);
	}
}