// FileWriter 사용 예
// 문자 단위로 파일쓰기
// FileWriter fout = new FileWriter("링크");
// fout.write('A');
// fout.close();

// 블록 단위 쓰기
// char [] buf = new char [1024];
// fout.write(buf, o, buf.length); // 값을 입력을 하든 안하는 buf.length는 1023으로 출력

import java.io.*;
import java.util.*;

public class FileWriterEx {
	public static void main(String[] args) {
		
		try {
			System.out.println("저장할 값을 입력해 주세요.");
			Scanner scanner = new Scanner(System.in);
			FileWriter fout = new FileWriter("C:\\Users\\User\\Desktop\\CH8_1113\\test.txt");
			
			while(true) {
				String line = scanner.nextLine(); // 라인의 문자를 읽어서 저장한다.
				if(line.length() == 0) // 입력된 값이 없다면, 즉 엔터를 친다면
					break; // 반복 중단
				
				fout.write(line, 0, line.length()); // 읽은 문장을 test파일에 입력
				fout.write("\r\n", 0, 2); // 입력이 끝나면 줄바꿈을 실행한다.
			}
			fout.close(); // 파일 입력 종료
			scanner.close(); // 사용자 입력 종료
			
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}

// 출력
// 저장할 값을 입력해 주세요.
// I love Java.
// 나는 자바를 배우고 있습니다.
//