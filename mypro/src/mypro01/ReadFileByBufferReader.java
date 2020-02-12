package mypro01;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileByBufferReader {
	
	public void largeFileIO(String inputFile, String outputFile) {
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(inputFile)));
			BufferedReader in = new BufferedReader(new InputStreamReader(bis, "utf-8"), 10 * 1024 * 1024);//10M缓存
			FileWriter fw = new FileWriter(outputFile);
			while (in.ready()) {
				String line = in.readLine();
				fw.append(line + " ");
			}
			in.close();
			fw.flush();
			fw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	//不加缓存参数
    public void read(String filePath) {
	    try {
		    String encoding = "GBK";
		    File file = new File(filePath);
		    if (file.isFile() && file.exists()) {
			    InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
			    BufferedReader bufferedReader = new BufferedReader(read);
			    while (bufferedReader.ready()) {
				    String line = bufferedReader.readLine();
				    System.out.println(line);
			    }
			    bufferedReader.close();
			    read.close();
		    } else {
			    System.out.println("找不到指定的文件");
		    }
	    } catch (Exception e) {
	    }
    }
	
}
