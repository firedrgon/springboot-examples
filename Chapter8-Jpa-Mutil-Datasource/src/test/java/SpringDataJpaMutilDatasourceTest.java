import com.hong.Application;
import com.hong.domain.primary.User;
import com.hong.domain.primary.UserRepository;
import com.hong.domain.secondary.Demo;
import com.hong.domain.secondary.DemoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by hong on 2017/5/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication(scanBasePackageClasses={Application.class})
public class SpringDataJpaMutilDatasourceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DemoRepository demoRepository;

    @Test
    public void test() {
        List<User> userList = userRepository.findAll();
        if(!CollectionUtils.isEmpty(userList)) {
            userList.forEach(user -> logger.info(user.toString()));
        }

        List<Demo> demoList =demoRepository.findAll();
        if(!CollectionUtils.isEmpty(demoList)) {
            demoList.forEach(demo -> logger.info(demo.toString()));
        }
    }
}
