package ua.edu.ucu.apps.demo.users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
public class MyUser {
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private LocalDate dob;
    private int age;
}
