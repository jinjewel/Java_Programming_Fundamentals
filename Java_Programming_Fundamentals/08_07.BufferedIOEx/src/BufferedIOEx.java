// 버퍼 스트림
// 버퍼를 가진 스트림
// 입출력 데이터를 일시적으로 저장하는 버퍼를 이용하여 입출력 효율 개선

// 버퍼 입출력의 목적
// 입출력 시 운영체제의 API 호출 횟수를 줄여 입출력 성능 개선
// 출력시 여러 번 출력 되는 데이터를 버퍼에 모아두고 한번에 장치로 출력
// 입력 장치 ---> 입력버퍼(버퍼 입력 스트림) ---> 프로그램 ---> 출력버퍼(버퍼출력스트림) ---> 출력장치

// 바이트 버퍼 스트림
// 바이트 단위의 바이너리 데이터를 처리하는 버퍼 스트림
// BufferedInputStream와 BufferedOutputStream

// 문자 버퍼 스트림
// 유니코드의 문자 데이터만 처리하는 버퍼 스트림
// BufferedReader와 BufferedWriter

import java.io.*;
import java.util.Scanner; 

public class BufferedIOEx {
	public static void main(String[] args) {
		
		try {
			FileReader fin = new FileReader("C:\\Users\\User\\Desktop\\CH8_1113\\test2.txt");
			// 5바이트 크기의 버퍼 설정. System.out 표준 스트림에 추력
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			int c; 
			
			// 출력스트림의 버퍼 크기가 5이므로 파일을 읽어 8개를 출력하려 했지만 5개만 출력이되고 3개는 버퍼에 남아있어 보이지 않음
			while ((c = fin.read()) != -1) { 
				out.write(c); // 버퍼가 꽉 찰 때 문자가 화면에 출력
			}
			
			// Enter키를 받으면 flush()를 실행하여 버퍼에 남아있던 3개 문자를 강제로 출력
			new Scanner(System.in).nextLine(); 
			out.flush(); // 버퍼에 남아 있던 문자 모두 출력
			
			fin.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

// 출력
// 12345
// (enter입력시)
// 678
