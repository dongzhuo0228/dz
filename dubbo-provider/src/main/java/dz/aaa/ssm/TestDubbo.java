package dz.aaa.ssm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dz.aaa.ssm.service.UserService;

public class TestDubbo {
	
   public static void main(String[] args) {
	    /*//spring 注入
       ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("file:D:/workspace/GZDTL_TRUNK/zdd-web-consumer/spring/applicationContext.xml");
       goodsService = (GoodsService) applicationContext.getBean("getGoodService");
       System.out.println(goodsService.findAllGoodsByParams());*/
       ApplicationContext  dubbo_provider = new ClassPathXmlApplicationContext("file:E:/quyiquanworkspace/dubbo-provider/src/main/resources/spring/beans.xml");
       ApplicationContext  dubbo_cusumer = new ClassPathXmlApplicationContext("file:E:/quyiquanworkspace/dubbo-cosumer/src/main/resources/spring/dubbo-consumer.xml");
       UserService userService = (UserService)dubbo_cusumer.getBean("userService");
       System.out.println(userService.selectAll());
//       System.in.read();
}
}
