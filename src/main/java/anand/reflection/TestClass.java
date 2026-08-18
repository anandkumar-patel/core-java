package anand.reflection;

public class TestClass {
    private int value;
    private String name;

    public TestClass() {
        this.name = "anand";
        this.value = 1112;
    }

    public TestClass(int value) {
        this.value = value;
        this. name = "ananya";
    }

    public TestClass(String name) {
        this.value = 1122;
        this. name = name;
    }

    public TestClass(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public String showValue() {
        return "TestClass{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
