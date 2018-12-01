public class FirstProgram {

	public static void main(String args[]) {
		System.out.println("This is my first program");
		System.out.println("len : " + args.length);
		for (int i=0;i<args.length;i++) {
		System.out.println(i + " : " + args[i]);
		}
	}
}