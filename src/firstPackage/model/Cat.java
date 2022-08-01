package firstPackage.model;

import java.util.Objects;

public class Cat {
    private  String name;
    private  String age;
    private  Integer color;

    public Cat(){}

    public Cat(String name, String age, Integer color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Integer getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && Objects.equals(age, cat.age) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", color=" + color +
                '}';
    }
}
