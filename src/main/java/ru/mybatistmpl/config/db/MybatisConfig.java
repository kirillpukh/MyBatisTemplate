package ru.mybatistmpl.config.db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ConfigurationProperties("spring.datasource")
@EnableTransactionManagement(mode = AdviceMode.PROXY)
@MapperScan(basePackages = {"ru.mybatistmpl"})
public class MybatisConfig extends HikariConfig {

    @Bean
    public DataSource dataSource() {
        return new HikariDataSource(this);
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

        sessionFactory.setDataSource(dataSource());

        return sessionFactory;
    }
}
