public class Person
{
    String name;
    Integer age;

    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Person)
        {
            Person p=(Person) o;
            return this.name.equals(p.name) && this.age.equals(p.age);
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        return age;
    }
}

