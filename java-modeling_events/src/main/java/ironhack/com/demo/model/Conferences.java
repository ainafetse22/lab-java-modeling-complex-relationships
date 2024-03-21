package ironhack.com.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@NoArgsConstructor
@Getter
@Setter
@Entity(name="conferences")
public class Conferences extends Event{
    @OneToMany(mappedBy = "conferences")
    private List<Speaker> speakers;
    @ManyToMany
    @JoinTable(
            name="conference_guest",
            joinColumns = @JoinColumn(name="conference_id"),
            inverseJoinColumns = @JoinColumn(name="guest_id")
    )
    private List<Guest> guests;
}
