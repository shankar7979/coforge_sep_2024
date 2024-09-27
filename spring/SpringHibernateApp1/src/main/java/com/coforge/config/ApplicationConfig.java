package com.coforge.config;

import com.coforge.dao.PersonDao;
import com.coforge.dao.PersonDaoImpl;
import com.coforge.model.Person;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.config.*;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.util.Properties;

@Configuration
public class ApplicationConfig {

    @Bean
    public LocalSessionFactoryBean getLocalSessionFactoryBean() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setAnnotatedClasses(Person.class);
        factoryBean.setHibernateProperties(getProperties());
        return factoryBean;
    }

    @Bean
    public PersonDao getPersonDao(SessionFactory sessionFactory) {
        PersonDao dao = new PersonDaoImpl(sessionFactory);
        return dao;
    }

    @Bean
    public Properties getProperties() {
        Properties properties = new Properties();
//        properties.setProperty(AvailableSettings.URL, "jdbc:hsqldb:mem:.");
//        properties.setProperty(AvailableSettings.USER, "sa");
//        properties.setProperty(AvailableSettings.PASS, "");
//        properties.setProperty(AvailableSettings.DRIVER, "org.hsqldb.jdbc.JDBCDriver");
//        properties.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.HSQLDialect");

//
//    properties.setProperty(AvailableSettings.URL, "jdbc:h2:mem:sampledb");
//        properties.setProperty(AvailableSettings.USER, "sa");
//        properties.setProperty(AvailableSettings.PASS, "");
//        properties.setProperty(AvailableSettings.DRIVER, "org.h2.Driver");
//        properties.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.H2Dialect");

        properties.setProperty(AvailableSettings.URL, "jdbc:mysql://localhost:3306/coforge");
        properties.setProperty(AvailableSettings.USER, "root");
        properties.setProperty(AvailableSettings.PASS, "mysql");
        properties.setProperty(AvailableSettings.DRIVER, "com.mysql.cj.jdbc.Driver");
        properties.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL5Dialect");


        properties.setProperty(AvailableSettings.SHOW_SQL, "true");
        properties.setProperty(AvailableSettings.HBM2DDL_AUTO, "update");
        return properties;
    }
}
