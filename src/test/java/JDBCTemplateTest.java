import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：JDBC框架之queryForList方法
 * Package(包名): PACKAGE_NAME
 * Class(测试类名): JDBCTemplateTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/23
 * Time(创建时间)： 15:26
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

class JDBCTemplateTest
{

    @Test
    void update()
    {

    }

    @Test
    void queryForObject()
    {
        String sql = "select * from information where no=?";
        Object[] objects = {1};
        Student student = JDBCTemplate.queryForObject(sql, new BeanHandler<>(Student.class), objects);
        System.out.println(student);
    }

    @Test
    void queryForList()
    {
        String sql = "select * from information";
        List<Student> list = JDBCTemplate.queryForList(sql, new BeanListHandler<>(Student.class));
        System.out.println(list);
    }
}