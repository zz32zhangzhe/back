package com.edu.test;

import com.edu.pojo.User;
import com.edu.service.Iuserservice;
import com.edu.util.DET;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MyTest {
    @Resource
    Iuserservice iuserservice;
    @Test
    public void method(){
        User user=new User();
        user.setName("张哲");
        user.setPassword(DET.encode("zz321996"));
        user.setLoginId("晴转暴雨");
        user.setPhone("13001378705");
        user.setSex(1);
        user.setCreateDate(new Date());
        user.setEmail("1277147712@qq.com");
        System.out.println(iuserservice.add(user));
    }
}
