package com.rainhowchan.zjh.mapper;

import com.rainhowchan.zjh.po.Person;
import com.rainhowchan.zjh.po.PersonExample;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by RainhowChan on 2017/9/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-dao.xml")
public class PersonMapperTest {


    private PersonMapper personMapper;
    @Before
    public void setUp() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        personMapper = (PersonMapper) context.getBean("personMapper");
        System.out.println(personMapper);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void deleteByExample() throws Exception {
        PersonExample personExample = new PersonExample();
        personExample.createCriteria().andFirstnameLike("%aa%");
        int i = personMapper.deleteByExample(personExample);
        System.out.println(i);

    }
    @Test
    public void selectByExample() throws Exception {
        Person per = new Person(4, "wassng", "jiaa", "宜都市轵城镇", "全新饭");
        personMapper.insert(per);
    }

    @Test
    public void getSessionFactory(){
        PooledDataSource pooledDataSource = new PooledDataSource();
        pooledDataSource.setDriver("com.mysql.jdbc.Driver");
        pooledDataSource.setUrl("jdbc:mysql://localhost:3306/zjh?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull");
        pooledDataSource.setUsername("root");
        pooledDataSource.setPassword("root");

        JdbcTransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, pooledDataSource);
        Configuration configuration = new Configuration(environment);
        configuration.getTypeAliasRegistry().registerAlias("person", Person.class);
        configuration.addMapper(PersonMapper.class);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(configuration);

    SqlSession sqlSession = factory.openSession();
    PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
    mapper.insert(new Person(3, "ss", "sdfs", "我说的雷锋精神", "lwlsd乐山大佛"));

    sqlSession.commit();


}

}