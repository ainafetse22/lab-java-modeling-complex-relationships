package exercise2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="chapter")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;


    private String name;
    private String district;
    @OneToOne
    private Member president;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Member> memberList;

    public String getName() {
        return name;
    }

    public Chapter() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public Chapter(String name, String district, Member president, List<Member> memberList) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.memberList = memberList;
    }
}
