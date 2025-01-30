// 백업 파일 프로그래밍

import java.io.*;

public class TextCopyEx {
	public static void main(String[] args){
		
		File src = new File("c:\\windows\\system.ini"); // 원본 파일 경로명
		File dest = new File("C:\\Users\\User\\Desktop\\CH8_1113\\system.txt"); // 복사 파일 경로명
		int c; 
		
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest); 
			
			while((c = fr.read()) != -1) { // 문자 하나 읽고
				fw.write((char)c); // 문자 하나 쓰고
			}
			System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");
			
			fr.close(); 
			fw.close();
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}

// 츨력
// c:\windows\system.ini를 C:\Users\User\Desktop\CH8_1113\system.txt로 복사하였습니다.