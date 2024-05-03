public class Cat {
    private String name;

    public static void main(String [] args)
    {
        for (String arg : args)
        {
            Cat pojo = new Cat(arg);
            System.out.println(pojo);
        }
    }
    public Cat(String name)
    {
        this.name = name;
    }

    public String getName() { return this.name; }

    public String toString() { return this.name; }
}
