import java.util.Arrays;

class Person implements Comparable
<Person> {
	private String name;
	private float height, weight;

	public Person(String name, float height, float weight) {
	super();
	this.name = name;
	this.height = height;
	this.weight = weight;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void speak() {
	System.out.println("I am " + name + ",my height " + height + ",my weight " + weight);

	}

	public int compareTo(Person o) {
        int flag;
                float a = (float)(this.getHeight()*0.5+this.getWeight()+0.5);
                float b=(float) (o.getHeight()*0.5+o.getWeight());
                flag=(int)(a-b);
                if (flag>0)
                    return 1;
                if (flag<0)
                    return -1;
                return 0;

	}

	public String toString() {
	return "Person [name="+name+",height="+height+",weight="+weight+"]";

	}
}

public class TestCompare {
	public static void main(String[] args) {
		int i;
		Person ps[] = new Person[6];
		ps[0] = new Person("zhangsan", 170, 110);
		ps[1] = new Person("lisi", 168, 120);
		ps[2] = new Person("wangwu", 165, 115);
		ps[3] = new Person("zhaoliu", 172, 121);
		ps[4] = new Person("zhouqi", 160, 100);
		ps[5] = new Person("zhengba", 166, 119);
		System.out.println("array sort before:");
		for (i = 0; i < ps.length; i++) {
			ps[i].speak();
		}
		Arrays.sort(ps);
  // call sort method
		System.out.println("\narray sort after:");
		for (i = 0; i < ps.length; i++) {
			System.out.println(ps[i]);
		}
	}
}


