package coforge;

import com.coforge.model.Employee;
import com.coforge.util.MySessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersistenceTest {
  private SessionFactory factory = null;
  private Session session;

  @BeforeEach
  public void setup() {
    SessionFactory factory= MySessionFactory.getSessionFactory();
    session=factory.openSession();

    Transaction transaction = session.getTransaction();

    Employee employee=new Employee();
    //employee.setId(10002);
    employee.setName("harsh chauhan");
    employee.setSalary(90000);
    employee.setDob(LocalDate.of(2001, 10, 30));

    transaction.begin();
    session.save(employee);
    transaction.commit();

  }


  @Test
  public void readEmployee() {

    Query query = session.createQuery("from Employee");
    List<Employee> list = query.getResultList();

    assertEquals(list.size(), 1);

  }
}
