/**
 * Author ： chen
 * Date ： 16/7/22
 * Time : 下午10:11
 */

import java.util.List;
import com.chen.login.model.LoginUser;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Assert;
import org.junit.Test;

public class ModelTest {



    @Test
    public void testGetSession() {
        Session session = HibernateUtil.getSession();

        Assert.assertNotNull(session);

        HibernateUtil.closeSession();
    }

    @Test
    public void testExport() {
        new SchemaExport(new Configuration().configure()).create(true, true);
    }


    @Test
    public void testQuery() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        @SuppressWarnings("unchecked")
        List<LoginUser> personList = session.createQuery("select p from LoginUser  p ").list();


        for(LoginUser eachPerson : personList) {
            System.out.println(eachPerson);
        }

        session.getTransaction().commit();
        HibernateUtil.closeSession();
    }
}
