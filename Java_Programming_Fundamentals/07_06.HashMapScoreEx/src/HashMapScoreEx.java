
import java.util.*; // // HashMap<K, V>, iterator를 사용하기 위해 선언

public class HashMapScoreEx {
	public static void main(String[] args) {
		
		// 사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		// 5 개의 점수 저장
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 :" + javaScore.size());
		
		// key 문자열을 가진 집합 Set 컬렉션 리턴
		Set<String> keys = javaScore.keySet(); // .keySet() : 해시맵의 모든 키를 담은 Set(K) 컬렉션 리턴
		Iterator<String> it = keys.iterator(); // key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
		
		// javaScore에 들어 있는 모든 (key, value) 쌍 출력
		while(it.hasNext()) { // it에 다음 요소가 있다면 반복
			String name = it.next(); // it에 다음 요소를 반환
			int score = javaScore.get(name); // name이라는 key값을 가지는 값을 리턴
			System.out.println(name + " : " + score);
		}
	}
}

// 출력
// HashMap의 요소 개수 :5
// 이재문 : 70
// 한원선 : 99
// 김남윤 : 98
// 김성동 : 97
// 황기태 : 88