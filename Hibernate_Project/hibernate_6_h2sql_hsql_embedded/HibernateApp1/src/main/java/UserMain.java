import com.coforge.model.Employee;
import com.coforge.model.User1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserMain {
    public static void main(String[] args) throws InterruptedException {

//        Configuration configuration=new Configuration();
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg2.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();

        User1 employee = new User1();

        //       employee.setId(10001);
        employee.setName("amit kumar");
        employee.setSalary(12000);
        employee.setDob(LocalDate.of(2000, 11, 27));

        String hb[] = new String[]{"ludo", "music", "movie", "chess"};

        employee.setHobbies(Arrays.asList(hb).stream().collect(Collectors.toSet()));

        transaction.begin();
        session.save(employee);
        transaction.commit();
        System.out.println("Record added ");

        List<User1> fromEmployee = session.createQuery("from User1").list();

        System.out.println("using for loop");
        for (User1 e : fromEmployee)
            System.out.println(e);

        System.out.println("using foreach method");
        fromEmployee.forEach(a -> System.out.println(a));
    }
}
