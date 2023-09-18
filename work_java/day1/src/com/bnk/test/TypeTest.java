package com.bnk.test;
/*
 * 2023.08.28
 */
public class TypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30; // 32비트
		long b = a; // 64비트로 변환
		float f = b; // 32비트로 변환하고, 나머지는 버림.
		
		char ap = 'a'; // 이런식으로 바뀌는 것을 자동형변환이라 함.
		int aa= ap; // 논리형은 형변환 x.
		
		float abb = 3.14f; // 실수형이 기본형이 double이므로 뒤에 f붙여줘야 함.
		// byte < short/char < int < long < float < double
		// 오른쪽으로 가면 자동형변환, 왼쪽으로 가면 명시적 형변환.
		
		int bbbb = (int)abb; // 명시적형변환.
		
		int asdf = 1000;
		System.out.println(Integer.parseInt("1234"));
		
	}

}
/** 2023.08.28
 * 
 * 프로그램은 데이터와 처리의 집합..
 * 정수형 : 3,4...
 * 문자형 : 'A'
 * 실수형 : 3.4
 * 논리형 : true, false
 * 
 * 유니코드 : 16비트로 이루어짐.
 * 'a' = char
 * "A" = String
 * 
 * 실수형을 저장하기 위해서는 정규화를 거쳐야 한다.
 * float는 32비트, double은 64비트임.
 * 1. 정수형으로 변환
 * 2. GPU 구입
 * 
 * 기본형 vs 참조형
 * - 기본형 : 계산을 하기 위한 타입, 실제 값을 저장하는 공간. 스택 메모리.
 * - 참조형 : 8가지 자료형을 제외한 나머지, 주소 값을 저장하는 공간. 힙 메모리.
 */
