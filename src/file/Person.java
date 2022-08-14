package file;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -6262384180963747429L;
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{id=" + id +", name='" + name + '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
