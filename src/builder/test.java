package builder;

public class test {
	public static void main(String[] args) {
		Person person = new Person.Builder("ncl","男").address("上海").age(25).build();
		System.out.println("person:"+person);
		System.out.println("name:"+person.getName());
	}
}
