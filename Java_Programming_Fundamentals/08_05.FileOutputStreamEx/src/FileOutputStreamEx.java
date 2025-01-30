// 바이크 스트림 
// 바이트 단위의 바이너리 값을 읽고 쓰는 스트림

// 바이트 스트림 클래스
// InputStearm/OutputStearm
// 추상 클래스, 바이트 스트림을 다루는 모든 클래스의 클래스

// FileInputStream/FileOutputStream
// 파일로부터 바이트 단위로 읽거나 저장하는 클래스
// 바이너리 파일의 입출력 용도
// 그냥 문자로 저장하는 것보단 바이트로 저장하는 것이 공간을 효율적으로 쓸수 있기 때문에
// 숙달되었다면 되도록 바이트 단위로 저장하는 것이 효율적이다.
// 각 숫자는 1바이트에 저장되므로 8비트, 즉 4비트 2개(헥사 2개)로 저장되기에 16진수 2자리로 표현된다.
// 단, 바이크로 저장했다면 따로 코딩을 통해 보는 방법이 아니면 내용을 알기 힘들다.
// 파일열기, 미리보기 등등 불가

// DataInputStream/DataOutputStream
// 기본 데이터 타입의 값을 바이너리 값 그대로 입출력
// 문자열도 바이너리 형태로 입출력

// FileOutputStream므로 바이너리 파일 쓰기
import java.io.*;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\User\\Desktop\\CH8_1113\\test.out");
			for(int i=0; i<b.length; i++)
				fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록, 기록 된 것을 읽기 워해서는 따로 코드를 짜야한다.
			fout.close();
		} 
		catch(IOException e) {
			System.out.println( "C:\\Users\\User\\Desktop\\CH8_1113\\test.out에 저장할 수 없었습니다. 경로명을 확인해 주세요"); 
			return; 
		}
		System.out.println("C:\\Users\\User\\Desktop\\CH8_1113\\test.out을 저장하였습니다.");
	}	
}

// 출력
// C:\Users\User\Desktop\CH8_1113\test.out을 저장하였습니다.
