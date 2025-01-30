// 바이너리 코드로 저장한 파일의 내용을 읽어오는 코드이다.
import java.io.*;

public class FileInputStreamEx {
	public static void main(String[] args) {
		byte b[] = new byte [6]; // 비어 있는 byte 배열
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\User\\Desktop\\CH8_1113\\test.out");
			
			// 파일읽기
			int n=0, c;
			while((c = fin.read())!= -1) {
				b[n] = (byte)c; 
				n++; 
			}
			
			// 파일출력
			System.out.println("C:\\Users\\User\\Desktop\\CH8_1113\\test.out에서 읽은 배열을 출력합니다.");
			for(int i=0; i<b.length; i++) 
				System.out.print(b[i] + " ");
			System.out.println();
			
			fin.close();
		} catch(IOException e) {
			System.out.println( "C:\\Users\\User\\Desktop\\CH8_1113\\test.out에서 읽지 못했습니다. 경로명을 체크해보세요");
		}
	}
}

// 출력
// C:\Users\user\Desktop\1113자바수업\test.out에서 읽은 배열을 출력합니다.
// 7 51 3 4 -1 24 
