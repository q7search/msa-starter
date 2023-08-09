import jakarta.persistence.*;

@Entity
class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

}