package ironhack.com.demo;


import ironhack.com.demo.model.Chapter;
import ironhack.com.demo.model.Member;
import ironhack.com.demo.model.Status;
import ironhack.com.demo.repository.ChapterRepository;
import ironhack.com.demo.repository.MemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootTest
class NursesTest{

    private Date renewalDate1 = new Date(124, 2, 24);
    private Member test_nurse1 = new Member("nurse1", Status.ACTIVE,renewalDate1 );
    private Member test_nurse2 = new Member("nurse2", Status.ACTIVE,renewalDate1 );
    private Member test_nurse3 = new Member("nurse3", Status.ACTIVE,renewalDate1 );
    private List<Member> membersList = new ArrayList<Member>();
    private Member test_president = new Member("president", Status.ACTIVE,renewalDate1 );
    public Chapter test_chapter;

    @Autowired
    ChapterRepository chapterRepository;
    @Autowired
    MemberRepository memberRepository;
    @BeforeEach
    public void setUp(){
        memberRepository.save(test_nurse1);
        memberRepository.save(test_nurse2);
        memberRepository.save(test_nurse3);
        memberRepository.save(test_president);

        membersList.add(memberRepository.findByName("nurse1"));
        membersList.add(memberRepository.findByName("nurse2"));
        membersList.add(memberRepository.findByName("nurse3"));

        Member db_test_president = memberRepository.findByName("president");
        test_chapter = new Chapter("chapter1","district1",db_test_president,membersList);
        chapterRepository.save(test_chapter);
        membersList.size();
    }
    @AfterEach
    void tearDown() {
        chapterRepository.deleteAll();
        memberRepository.deleteAll();
    }

    @Test
    public void TestRelationshipNurses(){
        Chapter db_chapter =chapterRepository.findByName("chapter1");
        System.out.println("hello");
    }
}