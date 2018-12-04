package junit_4;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by SQ_BXZ on 2018-12-03.
 */
public class FileReaderTester extends TestCase {
    private FileReader _input;

    public FileReaderTester(String name) {
        super(name);
    }

    protected void setUp(){
        try {
            _input = new FileReader("D:\\1023Codes\\refactoring\\src\\main\\java\\junit\\data.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(" 找不到文件");
        }
    }

    protected void tearDown(){
        try {
            _input.close();
        }  catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(" 关闭文件错误");
        }
    }

    public void  testRead() throws IOException {
        char ch = '&';
        _input.close();
        for (int i = 0; i<4; i++){
            ch = ((char) _input.read());
        }
        assertEquals ('L',ch);
    }

    public static Test suite(){
        TestSuite suite = new TestSuite();
        suite.addTest(new FileReaderTester("testRead"));
        return suite;
    }

    public static void main(String[] args) {
        TestRunner.run(suite());
    }

}
