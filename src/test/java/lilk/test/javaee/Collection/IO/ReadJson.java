package lilk.test.javaee.Collection.IO;

import com.alibaba.fastjson.JSONArray;
import junit.framework.TestCase;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.*;

import java.io.File;

public class ReadJson extends TestCase {
    @Test
    public void readTestDataFromFile(){
        String path = getClass().getClassLoader().getResource("test.json").toString();
        path = path.replace("\\", "/");
        if (path.contains(":")) {
            path = path.replace("file:/", "");// 2
        }
        JSONArray jsonArray = null;
        try {
            String input = FileUtils.readFileToString(new File(path), "UTF-8");
            System.out.println(input);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
