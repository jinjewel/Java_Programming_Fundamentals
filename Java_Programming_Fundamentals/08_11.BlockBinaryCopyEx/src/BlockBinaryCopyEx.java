
// 위에 파일을 10KB 단위로 읽고 쓰도록 수정하여 고속으로 파일을 복사하라

import java.io.*;

public class BlockBinaryCopyEx {
	public static void main(String[] args) {
		File src = new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File dest = new File("C:\\Users\\User\\Desktop\\CH8_1113\\desert.jpg"); 
		try {
			FileInputStream fi = new FileInputStream(src); 
			FileOutputStream fo = new FileOutputStream(dest);
			
			byte [] buf = new byte [1024*10]; // 10KB 버퍼
			
			while(true) {
				int n = fi.read(buf); // 버퍼 크기만큼 읽기. n은 실제 읽은 바이트
				fo.write(buf, 0, n); // buf[0]부터 n 바이트 쓰기
				
				if(n <buf.length)
					break;
			}
			fi.close();
			fo.close();
			
			System.out.println( src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		} 
		catch (IOException e) { 
			System.out.println("파일 복사 오류"); 
		}
	}
}

// 출력
// c:\Windows\Web\Wallpaper\Theme1\img1.jpg를 C:\Users\User\Desktop\CH8_1113\desert.jpg로 복사하였습니다.