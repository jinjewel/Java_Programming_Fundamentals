// file 클래스
// 파일의 경로명을 다루는 클래스
// java.io.File
// 파일과 기렉터리 경로명의 추상적 표현

// 파일 관리 기능
// 파일 이름 삭제, 변경, 디렉터리 생성, 크기 등 파일 관리
// File 객체는 파일 읽꼬 쓰기 기능 없음 -> 따로 구현 필요

import java.io.File; 

public class FileEx {
	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "의 서브 리스트 입니다.-----"); 
		File[] subFiles = dir.listFiles(); // 파일 및 서브디렉터리 리스트 얻기

		for(int i=0; i<subFiles.length; i++) { 
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.print(f.getName()); // 파일 이름
			System.out.print("\t파일 크기: " + f.length()); // 경로 전체
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n",t, t, t, t); // 폴더 경로만
		}
	}
	public static void main(String[] args) { 
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
		String res="";
		
		if(f1.isFile())  // 파일인 경우
			res = "파일"; 
		else if(f1.isDirectory()) // 디렉터리인 경우
			res = "디렉토리";

		System.out.println(f1.getPath() + "은 " + res + "입니다.");

		File f2 = new File("C:\\Users\\User\\Desktop\\CH8_1113\\java_sample"); 

		if(!f2.exists()) { 
			f2.mkdir(); // 존재하지 않으면 디렉토리 생성
		}

		listDirectory(new File("C:\\Users\\User\\Desktop\\CH8_1113\\")); 
		f2.renameTo(new File("C:\\Users\\User\\Desktop\\CH8_1113\\javasample")); 
		listDirectory(new File("C:\\Users\\\\User\\Desktop\\CH8_1113\\"));
	}
}

// 출력
// c:\windows\system.ini, c:\windows, system.ini
// c:\windows\system.ini은 파일입니다.
// -----C:\Users\User\Desktop\CH8_1113의 서브 리스트 입니다.-----
// .metadata	파일 크기: 4096	수정한 시간: 11월 14 화 18:00:58
// ~~생략~~
// hangul.txt	파일 크기: 42	수정한 시간: 11월 13 월 18:55:16
// java_sample	파일 크기: 0	수정한 시간: 11월 15 수 00:08:00
// test.out	파일 크기: 6	수정한 시간: 11월 14 화 23:23:06
// test.txt	파일 크기: 57	수정한 시간: 11월 14 화 23:05:12
// test2.txt	파일 크기: 8	수정한 시간: 11월 13 월 19:46:42
// TextCopyEx	파일 크기: 4096	수정한 시간: 11월 14 화 23:36:02
// -----C:\Users\User\Desktop\CH8_1113의 서브 리스트 입니다.-----
// .metadata	파일 크기: 4096	수정한 시간: 11월 14 화 18:00:58
// ~~생략~~
// FileWriterEx	파일 크기: 4096	수정한 시간: 11월 14 화 22:49:43
// hangul.txt	파일 크기: 42	수정한 시간: 11월 13 월 18:55:16
// javasample	파일 크기: 0	수정한 시간: 11월 15 수 00:08:00
// test.out	파일 크기: 6	수정한 시간: 11월 14 화 23:23:06
// test.txt	파일 크기: 57	수정한 시간: 11월 14 화 23:05:12
// test2.txt	파일 크기: 8	수정한 시간: 11월 13 월 19:46:42
// TextCopyEx	파일 크기: 4096	수정한 시간: 11월 14 화 23:36:02



