
public class Prog_6 {
	public static void main(String[] args) {
		int ival = 120;
		// primitive -> object
		Integer iobj = Integer.valueOf(ival);
		System.out.println("Primitive ->object: " + iobj);
		// obj-> primitive
		int op = iobj.intValue();
		System.out.println("Object ->primitive: " + op);
		String ss = Integer.toString(400);
		System.out.println("Basic-> string: " + ss);
		Integer iobj1 = Integer.valueOf("240");
		System.out.println("String-> numeric obj: " + iobj1);
		String s = iobj.toString();
		System.out.println("object -> string: " + s);
	}
}
