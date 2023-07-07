package ch00;

import lombok.Getter;
import lombok.ToString;

// 데이터를 고정적으로 제한할 때 사용한다
enum Gender{
    MALE, FEMALE
}

@Getter
@ToString
class Person{
    private String name;
    private String gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender.name();
    }

}

public class Study11 {
    public static void main(String[] args) {
        Person person = new Person("홍길동", Gender.MALE);

        System.out.println(person);
    }
}
