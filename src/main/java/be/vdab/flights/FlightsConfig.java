package be.vdab.flights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Configuration
public class FlightsConfig {
   @Bean
    public DataSource dataSource() {
       DriverManagerDataSource ds = new DriverManagerDataSource();
       ds.setUrl("jdbc:mysql://localhost:3306/flights");
       ds.setUsername("root");
       ds.setPassword("");
       ds.setDriverClassName("com.mysql.jdbc.Driver");
       return ds;

   }

   @Bean
   LocalContainerEntityManagerFactoryBean entityManager(DataSource ds, JpaVendorAdapter jpaVendorAdapter) {
      LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
      emf.setDataSource(ds);
      emf.setJpaVendorAdapter(jpaVendorAdapter);
      emf.setPackagesToScan("be.vdab.flights");
      return emf;
   }

   @Bean
   public JpaVendorAdapter jpaVendorAdapter() {
      HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
      adapter.setDatabase(Database.MYSQL);
      adapter.setGenerateDdl(true);
      adapter.setShowSql(true);
      return adapter;
   }

   @Bean
   public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
     return new JpaTransactionManager(emf);
   }

}
