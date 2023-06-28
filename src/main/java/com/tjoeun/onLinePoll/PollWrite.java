package com.tjoeun.onLinePoll;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PollWrite {

//	텍스트 파일에 저장할 데이터가 저장된 ArrayList를 넘겨받아 텍스트 파일로 저장하는 메소드 	
	public static void pollWrite(String filepath, ArrayList<String> poll) {
		
//	ArrayList에 저장된 데이터를 텍스트 파일로 출력하기 위해 PrintWrite 클래스 객체를 선언한다. 
		PrintWriter printWriter = null;
		
		try {
		printWriter = new PrintWriter(filepath);
		for (String str : poll) {
			printWriter.write(str + "\r\n");
		}
		
		} catch (FileNotFoundException e) {
			System.out.println("디스크에 파일이 존재하지 않습니다.");
			
		} finally {
			printWriter.close();
		}
		
		
	}
	
}
