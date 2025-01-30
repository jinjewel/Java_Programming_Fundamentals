/*

HashMap<K, V>
키(key)와 값(value)의 쌍으로 구정되는 요소를 다루는 컬렉션
java.util.HashMap 에 존재
키와 값이 한쌍으로 삽입, 값을 검색하기 위해서는 키를 이용해서 구해야 한다.
삽입, 검색, 삭제가 빠르다.

메소드
객체이름.clear() : 해시맵의 모든 요소 삭제
객체이름.get(object key) : 키에 대한 값을 반환하며, 값이 없다면 null을 반환 
객체이름.isEmpty() : 해시맵이 비어 있으면 T리턴
객체이름.put(K key, V value) : key, value 쌍을 해시맵에 저장
객체이름.remove(Object key) : 입력된 키와 값을 찾아 삭제
객체이름.size() : 해시맵에 포함된 요소의 개수 리턴

 */

import java.util.*; // HashMap<K, V>를 사용하기 위해 선언

public class HashMapDicEx {
	public static void main(String[] args) {
		
		// 영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
		HashMap<String, String> dic = new HashMap<String, String>();
		
		// 3 개의 (key, value) 쌍을 dic에 저장
		dic.put("baby", "아기"); // "baby"는 key, "아기"은 value
		dic.put("love", "사랑"); 
		dic.put("apple", "사과");
		
		// 영어 단어를 입력받고 한글 단어 검색. "exit" 입력받으면 종료
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("찾고 싶은 단어는?");
			
			String eng = scanner.next();
			if(eng.equals("exit")) { // 문자열은 무조건 equals로 비교
				System.out.println("종료합니다...");
				break;
			}
			
			String kor = dic.get(eng); //해시맵에서 '키' eng의 '값' kor 검색
			if(kor == null) // key에 대한 값이 없으면 null 리턴
				System.out.println(eng + "는 없는 단어 입니다.");
			else
				System.out.println(kor);
		}
		
		scanner.close();
	}
}

// 출력
// 찾고 싶은 단어는?baby
// 아기
// 찾고 싶은 단어는?love
// 사랑
// 찾고 싶은 단어는?one
// one는 없는 단어 입니다.
// 찾고 싶은 단어는?exit
// 종료합니다...
