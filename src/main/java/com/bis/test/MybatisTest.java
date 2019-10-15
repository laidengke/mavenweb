package com.bis.test;

import com.bis.entity.Member;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/*
 * 测试类
 * */
public class MybatisTest {
    /*
     * 根据客户编号查询客户信息
     * */

    @Test
    public void findMemberByIdTest() throws Exception{
        //1.读取配置文件
        String resource  = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //2.根据配置文件构建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.通过 SqlSessionFactory 创建 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.SqlSession 执行映射文件中定义的 SQL ，并返回映射结果
        Member member = sqlSession.selectOne("findMemberById",1);
        //打印输出结果
        System.out.println(member.toString());
        //5.关闭 SqlSession
        sqlSession.close();
    }
}
