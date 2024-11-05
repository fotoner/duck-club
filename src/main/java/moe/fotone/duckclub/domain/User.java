package moe.fotone.duckclub.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class User extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String twitterId; // Twitter에서 제공하는 고유 사용자 ID

    @Column(nullable = false, length = 15)
    private String username;

    @Column(nullable = false, length = 50)
    private String displayName;

    @Column(length = 160)
    private String bio;

    private String profileImageUrl;

    private boolean isVerified;

    @OneToMany(mappedBy = "user")
    private List<Event> events = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<EventAttendance> attendances = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Comment> comments = new ArrayList<>();
}
