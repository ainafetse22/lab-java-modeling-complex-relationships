package ironhack.com.demo.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Status Status;
    private Date renewal;

    public Member() {
    }

    public Member(String name, ironhack.com.demo.model.Status status, Date renewal) {
        this.name = name;
        Status = status;
        this.renewal = renewal;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return id == member.id && Objects.equals(name, member.name) && Status == member.Status && Objects.equals(renewal, member.renewal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, Status, renewal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ironhack.com.demo.model.Status getStatus() {
        return Status;
    }

    public void setStatus(ironhack.com.demo.model.Status status) {
        Status = status;
    }

    public Date getRenewal() {
        return renewal;
    }

    public void setRenewal(Date renewal) {
        this.renewal = renewal;
    }
}
