package Course_Details;
public class Instructor {
	private String name;
	private long phone_number;
	
	public Instructor() {
		name = null;
		phone_number = -1;
	}
	
	public Instructor(String name) {
		this();
		this.name = name;
	}
	
	public Instructor(String name, long phone_number) {
		this(name);
		this.phone_number = phone_number;
	}
	
	public Instructor setName(String name) {
		this.name = name;
		return this;
	}
	
	public Instructor setPhoneNumber(long phone_number) {
		this.phone_number = phone_number;
		return this;
	}
	
	public String getName() {
		return name;
	}
	
	public long getPhoneNumber() {
		return phone_number;
	}
}
