package mypro01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.lang3.StringUtils;

public class ReadFileByBlockIO {
	//ע���쳣���� ���ַ�ʽ������˳����ķ�ʽ
	public static void main(String[] args) throws IOException {
		String readFile = "D:\\test\\test.csv";
	    BufferedReader bufferedReader = null;
	    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(readFile))));
	    String line;
	    int counter = 0;
	    while (!StringUtils.isEmpty(line = bufferedReader.readLine())) {
	      //log.info("this is {} line",counter++);
	    	System.out.println(line);
	    }
	}
}
