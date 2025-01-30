import java.io.IOException;
import java.io.*; 

public class Project1113 {
	public static void listDirectory(File dir, FileWriter Project) {
		
		try {
			System.out.println("-----" + dir.getPath() + "의 서브 리스트 입니다.-----"); 
			File[] subFiles = dir.listFiles(); 

			int r;
			for(int i=0; i<subFiles.length; i++) { 
				File f = subFiles[i];
				long t = f.lastModified();
				String text3 = f.getName() + "\t파일 크기: " + f.length() + "\t수정한 시간: %tb %td %ta %tT\n".formatted(t, t, t, t);
				
				Project.write(text3, 0, text3.length());
				System.out.print(f.getName());
				System.out.print("\t파일 크기: " + f.length());
				System.out.printf("\t수정한 시간: %tb %td %ta %tT\n",t, t, t, t);
				
			}	
		}catch (IOException e) {
			System.out.println("복사 오류");
		}
	}
	public static void main(String[] args) { 
		File f1 = new File("c:\\windows\\system.ini");
		try {
			FileWriter Project = new FileWriter("C:\\Users\\User\\Desktop\\CH8_1113\\Project.txt"); // 복사 파일 경로명
			String text1 = f1.getPath() + ", " + f1.getParent() + ", " + f1.getName();
			System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
			Project.write(text1, 0, text1.length());
			
			String res="";
			if(f1.isFile()) 
				res = "파일"; 
			else if(f1.isDirectory()) 
				res = "디렉토리";
			
			String text2 = f1.getPath() + "은 " + res + "입니다.";
			System.out.println(f1.getPath() + "은 " + res + "입니다.");
			Project.write(text2, 0, text2.length());
			
			File f2 = new File("C:\\Users\\user\\Desktop\\1113자바수업\\Project_java_sample"); 
			if(!f2.exists()) { 
				f2.mkdir(); // 존재하지 않으면 디렉토리 생성
			}
			listDirectory(new File("C:\\Users\\User\\Desktop\\CH8_1113\\"), Project); 
			f2.renameTo(new File("C:\\Users\\User\\Desktop\\CH8_1113\\Projectjavasample")); 
			listDirectory(new File("C:\\Users\\User\\Desktop\\CH8_1113\\"), Project);
			
			Project.close();
		}catch (IOException e) {
			System.out.println("복사 오류");
		}
	}
}

// 출력
// c:\windows\system.ini, c:\windows, system.ini
// c:\windows\system.ini은 파일입니다.
// -----C:\Users\User\Desktop\CH8_1113의 서브 리스트 입니다.-----
// .metadata	파일 크기: 4096	수정한 시간: 11월 14 화 18:00:58
// Project_java_sample	파일 크기: 0	수정한 시간: 11월 15 수 00:45:04
// system.txt	파일 크기: 219	수정한 시간: 11월 15 수 00:15:12
// TextCopyEx	파일 크기: 4096	수정한 시간: 11월 14 화 23:36:02
// 코드순서.txt	파일 크기: 227	수정한 시간: 11월 15 수 00:20:41
// -----C:\Users\User\Desktop\CH8_1113의 서브 리스트 입니다.-----
// .metadata	파일 크기: 4096	수정한 시간: 11월 14 화 18:00:58
// Projectjavasample	파일 크기: 0	수정한 시간: 11월 15 수 00:45:04
// system.txt	파일 크기: 219	수정한 시간: 11월 15 수 00:15:12
// TextCopyEx	파일 크기: 4096	수정한 시간: 11월 14 화 23:36:02
// 코드순서.txt	파일 크기: 227	수정한 시간: 11월 15 수 00:20:41











