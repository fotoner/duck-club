package moe.fotone.duckclub.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Event extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "eventAttendance")
    private List<EventAttendance> events = new ArrayList<>();

    @OneToMany(mappedBy = "comment")
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "eventTags")
    private List<EventTag> eventTags = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User writer;
}
