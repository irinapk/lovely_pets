package demoproject.lovely_pets.back.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "pets")
@NoArgsConstructor
@AllArgsConstructor
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
