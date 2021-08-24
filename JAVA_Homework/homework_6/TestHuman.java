class Human {
	private String name;
	private int age;
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void speak() {
		System.out.println("I am a human.");
	}

	public void run() {
		System.out.println("I can run.");
	}

	public void getInfo() {
		System.out.println("my name is:" + getName());
		System.out.println("my age is:" + getAge());
		System.out.println("my sex is:" + getSex());
	}
}
class Man extends Human {
	private String name = "Dave";
	    private int age = 28;
	    private String sex = "man";
	
	    public String getName() {
	        return name;
	    }
	
	    public int getAge() {
	        return age;
	    }
	
	    public String getSex() {
	        return sex;
	    }
	
	    public void getInfo() {
	        System.out.println("my name is:" + getName());
	        System.out.println("my age is:" + getAge());
	        System.out.println("my sex is:" + getSex());
	    }
	
	    public void speak() {
	        System.out.println("I am a man.");
	        System.out.println("I am a strong man.");
	    }
	
	    public void run() {
	    
	    }

}
class Woman extends Human {
    private String name = "Jude";
        private int age = 58;
        private String sex = "woman";
    
        public String getName() {
            return name;
        }
    
        public int getAge() {
            return age;
        }
    
        public String getSex() {
            return sex;
        }
    
        public void speak() {
            System.out.println("I am a woman.");
            System.out.println("I am a beautiful woman.");
        }
    
        public void run() {
           
        }

}
public class TestHuman {
	public static void main(String[] agrs) {
		Man m = new Man();
		m.setName("Dave");
		m.setAge(28);
		m.setSex("man");
		m.getInfo();
		m.speak();
		m.run();	

		Human h = new Woman();
		h.setName("Jude");
		h.setAge(58);
		h.setSex("woman");
		h.getInfo();
		h.speak();
		h.run();	
	}
}

