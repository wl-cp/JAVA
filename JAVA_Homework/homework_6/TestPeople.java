class People {
	protected double height;
	protected double weight;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void speakHello() {
		System.out.println("hello!");
	}

	public void averageHeight() {
		System.out.println("avarge heigh:" + height);
	}

	public void averageWeight() {
		System.out.println("average weight:" + weight);
	}
}
class AmericanPeople extends People {
public void speakHello() {
        System.out.println("hello,I am American!");
    }

    public void averageHeight() {
        System.out.println("avarge heigh of American:175.0");
    }

    public void averageWeight() {
        System.out.println("average weight of American:150.0");
    }

    public void amercianBoxing() {
        System.out.println("I can boxing.");
    }

}
class ChinaPeople extends People {
public void speakHello() {
        System.out.println("hello,I am ChinaPeople.");
    }

    public void averageHeight() {
        System.out.println("avarge heigh of ChinaPeople:" + "180.0");
    }

    public void averageWeight() {
        System.out.println("average weight of ChinaPeople:" + "130.0");
    }

    public void chinaGongfu() {
        System.out.println("I can gongfu.");
    }

}
public class TestPeople {
	public static void main(String[] args) {
		ChinaPeople chp = new ChinaPeople();
		chp.height = 180;
		chp.weight = 130;
		chp.speakHello();
		chp.averageHeight();
		chp.averageWeight();
		chp.chinaGongfu();
		AmericanPeople amp = new AmericanPeople();
		amp.setHeight(175);
		amp.setWeight(150);
		amp.speakHello();
		amp.averageHeight();
		amp.averageWeight();
		amp.amercianBoxing();
	}
}

