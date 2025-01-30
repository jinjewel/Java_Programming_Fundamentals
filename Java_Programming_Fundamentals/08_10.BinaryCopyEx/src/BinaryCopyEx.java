// 바이너리 파일 복사 방법을 이용하여 이미지를 복사하는 코드 작성

import java.io.*;

public class BinaryCopyEx {
	public static void main(String[] args) {
		File src = new File("C:\\Users\\User\\Desktop\\CH8_1113\\img1.png");
		File dest = new File("C:\\Users\\User\\Desktop\\CH8_1113\\copyimg.jpg");
		int c; 
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest); 
			
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");
			
			fi.close();
			fo.close();
		} 
		catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}

// 출력
// C:\Users\User\Desktop\CH8_1113\img1.png를 C:\Users\User\Desktop\CH8_1113\copyimg.jpg로 복사하였습니다.
