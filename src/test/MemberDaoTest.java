import com.findmyband.HibernateConfigUtil;
import com.findmyband.data.MemberDao;
import com.findmyband.data.MemberDaoImpl;
import com.findmyband.model.Member;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MemberDaoTest {
    private MemberDao memberDao;

    @Before
    public void init() {
        memberDao = new MemberDaoImpl();
    }

    @Test
    public void shouldPassWhen() {
        Session session = HibernateConfigUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Member member = new Member("fname1", "lname1", "uname1", "pword1",
                "San Jose", "CA", "drums", "", "", "female", "ballad", 25);
        session = HibernateConfigUtil.getSessionFactory().openSession();
        Integer id = (Integer) session.save(member);
        session.getTransaction().commit();;
        session.close();
        HibernateConfigUtil.shutdown();
        Assert.assertFalse(id == 0);
    }
}
