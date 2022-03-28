public class Student {
    private  String name;
    private  int age;

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

    public  void  asd(String name){
        System.out.println(getName());

    }
    public void asd(int age){
        System.out.println(getAge());

    }
    public void asd(String name,int age){
        System.out.println( getName() + getAge());
    }
}
