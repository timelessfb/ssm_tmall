//import edu.uestc.ssmdemo.dao.UserMapper;
//import edu.uestc.ssmdemo.entity.User;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
///**
// * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//// 告诉junit spring配置文件
//@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
//public class test {
//    @Autowired
//    private UserMapper userMapper;
//    @Test
//    public void test1() {
//        User user = userMapper.selectByPrimaryKey(30);
//        System.out.println(user.getUsername());
//    }
//}
