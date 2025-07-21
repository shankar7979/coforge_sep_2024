import com.coforge.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) throws InterruptedException {

//        Configuration configuration=new Configuration();
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg2.xml");
        SessionFactory sessionFactory= configuration.buildSessionFactory();

        Session session= sessionFactory.openSession();
        Transaction transaction = session.getTransaction();

        Employee employee=new Employee();

 //       employee.setId(10001);
        employee.setName("amit kumar");
        employee.setSalary(12000);
        employee.setDob(LocalDate.of(2000,11,27));

        transaction.begin();
        session.save(employee);
        transaction.commit();
        System.out.println("Record added ");

        List<Employee> fromEmployee = session.createQuery("from Employee").list();

        System.out.println("using for loop");
        for (Employee e:fromEmployee)
            System.out.println(e);

        System.out.println("using foreach method");
        fromEmployee.forEach(a-> System.out.println(a));

        Thread.sleep(1000*1000);


    }
}
