package com.nt.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.nt.repo.promotions",
        entityManagerFactoryRef = "mysqlEMF",
        transactionManagerRef = "mysqlTxMgmr"
)
public class MYSQLDBConfig {

    @Bean
    @ConfigurationProperties(prefix = "mysql.datasource")
    public DataSource createMySQLDs() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "mysqlEMF")
    public LocalContainerEntityManagerFactoryBean createMySQLEntityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean emfBean = new LocalContainerEntityManagerFactoryBean();
        emfBean.setDataSource(createMySQLDs());
        emfBean.setPackagesToScan("com.nt.model.promotions");

        // Setting Hibernate properties
        Map<String, Object> props = new HashMap<>();
        props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        props.put("hibernate.hbm2ddl.auto", "update");
        props.put("hibernate.show_sql", "true");
        emfBean.setJpaPropertyMap(props);

        return emfBean;
    }

    @Bean(name = "mysqlTxMgmr")
    public PlatformTransactionManager createMySQLTxMgmr(@Qualifier("mysqlEMF") EntityManagerFactory factory) {
        return new JpaTransactionManager(factory);
    }
}

