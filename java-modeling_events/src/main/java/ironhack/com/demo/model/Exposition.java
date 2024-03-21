package ironhack.com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name="exposition")
public class Exposition extends Event{
    @ManyToMany
    @JoinTable(
            name="exposition_guest",
            joinColumns = @JoinColumn(name="exposition_id"),
            inverseJoinColumns = @JoinColumn(name="guest_id")
    )
    private List<Guest> guests;
}
