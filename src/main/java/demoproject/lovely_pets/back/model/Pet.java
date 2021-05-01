package demoproject.lovely_pets.back.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "pets")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id")
    private Long id;
    private String nickname;
    private Integer age;
    @ManyToMany(mappedBy = "pets", fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<User> users;
}
