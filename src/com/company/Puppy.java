package com.company;

public class Puppy extends Dog {
    boolean Puppy = false;

    @Override
    public int getAge() {


        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void printName() {
        super.printName();
    }

    @Override
    public void bark() {
        super.bark();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Puppy puppy = (Puppy) o;

        return Puppy == puppy.Puppy;
    }

    @Override
    public int hashCode() {
        return (Puppy ? 1 : 0);
    }

    @Override
    public String
    toString() {
        return "Puppy{" +
                "Puppy=" + Puppy +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean isPuppy() {
        return Puppy;
    }

    public void setPuppy(boolean puppy) {
        Puppy = puppy;
    }

    public Puppy() {
        if (Puppy != true) {
            System.out.println("isn't Puppy");
        }
    }

    public boolean checkPuppy() {
        if (getAge() > 1) {
            Puppy = false;
        } else if (getAge() <= 1) {
            Puppy = true;
        }
        return Puppy;
    }

    @Override
    public void setAge(int age) {
        if (age < 1) {
            super.setAge(age);
        }
    }
}
