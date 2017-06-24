package hello;

import javax.validation.constraints.Min;
import java.validation.constraints.NotNull;
import java.validation.constraints.Size;

public class PersonForm {
    @NotNull
    @size(min = 2, max = 30)
    private String name;

    @NotNull
    @Min(18)
    private Integer age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return this.getName() + " (" + this.getAge() + " years old)\n";
    }
}