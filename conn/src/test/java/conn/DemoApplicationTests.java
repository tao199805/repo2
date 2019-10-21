package conn;

import ch.qos.logback.core.net.SyslogOutputStream;
import conn.dao.DeptDao;
import conn.dao.UserDao;
import conn.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import conn.entity.Dept;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private UserDao userDao;
	@Autowired
	private DeptDao deptDao;
	@Test
	void findUser() {
		List<User> list=userDao.selectAllUser();
		for(User user:list){
			System.out.println(user);
		}
	}
	@Test
	void findDept(){
		List<Dept> list=deptDao.selectAllDept();
		for(Dept dept:list){
			System.out.println(dept);
		}
	}

}
