package lilk.test.javaee.Collection.List;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;
import org.junit.jupiter.api.*;

import java.util.*;

public class ArrayListTest extends TestCase {
    @Test
    public void testMethod() {
        Collection intList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            intList.add(i);
        }

        System.out.println(JSON.toJSONString(intList));
    }
}
