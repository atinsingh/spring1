package io.pragra.learning;

public class Person {
    private String name;
    private int age;
    private IAdreess adreess;

    public Person(String name, int age, IAdreess adreess) {
        this.name = name;
        this.age = age;
        this.adreess = adreess;
    }

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

    public IAdreess getAdreess() {
        return adreess;
    }

    public void setAdreess(IAdreess adreess) {
        this.adreess = adreess;
    }
}
