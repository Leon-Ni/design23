package builder;


public class Person {
	private String name;
	private String sex;
	private int age;
	private String addres;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static class Builder{
		private final String name;
		private final String sex;
		private int age;
		private String addres;

		public Builder(String name, String sex) {
			this.name = name;
			this.sex = sex;
		}

		public Builder age(int age){
			this.age = age;
			return this;
		}

		public Builder address(String addres){
			this.addres = addres;
			return this;
		}

		public Person build(){
			return new Person(this);
		}

	}

	public Person(Builder builder){
		name = builder.name;
		sex = builder.sex;
		age = builder.age;
		addres = builder.addres;
	}
}
