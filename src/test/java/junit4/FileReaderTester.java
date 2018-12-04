package junit4;

import junit.framework.TestCase;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by SQ_BXZ on 2018-11-20.
 */
public class FileReaderTester extends TestCase{
	FileReader input;

	public FileReaderTester(String name){
		super(name);
	}

	@Override
	protected void setUp() throws Exception {
		input = new FileReader("data.txt");
	}

	@Override
	protected void tearDown() throws Exception {
		input.close();
	}

	public void testRead() throws IOException{
		char ch = '&';
		for (int i=0;i<4;i++){
			
		}

	}

}
