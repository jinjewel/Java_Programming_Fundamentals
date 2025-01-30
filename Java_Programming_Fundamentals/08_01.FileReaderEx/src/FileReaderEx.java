// 스트림 입출력
// 버퍼를 가지고 순차적으로 이루어지는 입출력

// 자바의 입출력 스트림
// 입력 스트림 : 입력 장치로부터 자바 프로그램으로 데이터를 전달, 입력장치와 응용 프로그램을 연결하는 객체
// 출력 스크림 : 출력 징치로 데이터 출력, 출력 장치와 응용 프로그램을 연결하는 객체
// 입력장치 ---> 입력 스트림 ---> 자바 응용 프로그램 ---> 출력스트릠 ---> 출력 장치

// 스트림
// 스트림의 양끝에 입출력 장치와 자바 응용프로그램 연결
// 스트림은 단방향으로 선입선출의 구조를 가지고 있다. (큐)
// 바이트 스트림의 경우 : 바이트, 입출력되는 데이터를 단순 바이트로 처리
// 문자 스트림의 경우 : 문자(자바에서는 문자1개가 2바이트), 만자만 입출력하는 스트림

// JDK는 입출력 스트림을 구현한 다양한 클래스 제공
// 바이트 단위 : InputStream, OutputStream(공통적으로 Stream으로 끝남)
// 문자 단위 : Reader, Writer(공통적으로 Reader, Writer로 끝남)

// 표준 입력 스트림 System.in에 InputStreamReader 스트림을 연결한 사례
// 입력 ---> System.in ---> rd(InputStreamReader) ---> 자바응용프로그램 

// 문자 스트림
// 유니 코드(2바이트) 문자를 입출력 하는 스트림

// 문자 스트림을 다루는 클래스
// Reader/Writer
// InputStreamReader/OutputStreamWriter
// FileReader/FileWriter

// filereader로 텍스트 파일 읽기
import java.io.*;

public class FileReaderEx {
	public static void main(String[] args) {
		
		// 파일에 대한 존재가 확실치 않기 때문에 try-catch 구문을 사용해서 안전하게 사용해야 한다. 없으면 구동이 되지 않는다.
		try { 
			FileReader fin = new FileReader("c:\\windows\\system.ini"); 
			int c;
			
			while ((c = fin.read()) != -1) { // 한 문자씩 파일 끝까지 읽기
				System.out.print((char)c);
			}
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}

// 출력
// ; for 16-bit app support
// [386Enh]
// woafont=dosapp.fon
// EGA80WOA.FON=EGA80WOA.FON
// EGA40WOA.FON=EGA40WOA.FON
// CGA80WOA.FON=CGA80WOA.FON
// CGA40WOA.FON=CGA40WOA.FON
//
// [drivers]
// wave=mmdrv.dll
// timer=timer.drv
//
// [mci]


