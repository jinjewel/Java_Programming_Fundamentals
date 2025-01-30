
import java.io.*;

public class FileReadHangulSuccess {
	public static void main(String[] args) {
		
		// 파일에 대한 존재가 확실치 않기 때문에 try-catch 구문을 사용해서 안전하게 사용해야 한다. 없으면 구동이 되지 않는다.
		try {
			// 파일을 열겠다는 작업을 하기 위해 선언
			FileInputStream fin = new FileInputStream("C:\\Users\\User\\Desktop\\CH8_1113\\hangul.txt");
			// 일어온 파일에서 객체의 글자를 읽어오는 작업을 하기 위해 선언
			// 텍스트 파일을 UTF-8로 만들어서 오류가 없다.
			InputStreamReader in = new InputStreamReader(fin, "UTF-8"); 
			int c;
			
			System.out.println("인코딩 문자 집합은 " + in.getEncoding()); // 인코딩 문자가 무엇인지 알려주는 함수
			while ((c = in.read()) != -1) {
				// 실제로 2가지 단계를 거쳐야 한다. 따라서 각 단계에 필요한 함수를 알고 있어야 함
				System.out.print((char)c);
			}
			
			in.close(); // 생성 종료
			fin.close(); // 생성 종료
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}

// 출력
// 인코딩 문자 집합은 UTF8
// 가나다라마바사아자차카타파하
