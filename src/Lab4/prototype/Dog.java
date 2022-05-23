package Lab4.prototype;

public class Dog implements Cloneable {
    private String name;
    private int age;

    public Dog(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public Dog clone() throws CloneNotSupportedException
    {
        return (Dog)super.clone();
    }

}
