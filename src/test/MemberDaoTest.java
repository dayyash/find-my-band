//import com.fasterxml.classmate.AnnotationConfiguration;
//import com.findmyband.data.MemberDao;
//import org.hibernate.cfg.*;
//import com.findmyband.data.MemberDaoImpl;
//import com.findmyband.model.Member;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//public class MemberDaoTest {
//    private MemberDao memberDao;
//    private SessionFactory sessionFactory;
//    private Session session;
//
//    @Before
//    public void init() {
//        memberDao = new MemberDaoImpl();
////        // setup the session factory
////        AnnotationConfiguration configuration = new AnnotationConfiguration();
////        configuration.addAnnotatedClass(Member.class);
////        configuration.setProperty("hibernate.dialect",
////                "org.hibernate.dialect.PostgreSQL9Dialect");
////        configuration.setProperty("hibernate.connection.driver_class",
////                "org.postgresql.Driver");
////        configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/FindMyBand");
////        sessionFactory = configuration.buildSessionFactory();
////        session = sessionFactory.openSession();
//    }
//
//    @Test
//    public void shouldPassWhen() {
//        session.beginTransaction();
//        Member member = new Member("fname1", "lname1", "uname1", "pword1",
//                "San Jose", "CA", "drums", "", "", "female", "ballad", 25);
//        Integer id = (Integer) session.save(member);
//        session.getTransaction().commit();;
//        session.close();
//        Assert.assertFalse(id == 0);
//    }
//}
