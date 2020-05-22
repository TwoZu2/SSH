import cn.itcast.Entity.User;
import cn.itcast.Utils.Impl.UtilImpl;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;

public class Test {

    @org.junit.Test
    public void ttt(){
        User user = new User();
        Util util = new UtilImpl();
        user.setUsername("s");
        user.setPassword("999");

            util.SaveOrUpdate(user);
    }
}
