package com.bnk;

import java.util.List;

public class Test {

	public static void main(String[] args) throws Exception {
		NoticeMgrImpl mgr = new NoticeMgrImpl();
		mgr.add(new Notice(12312,"김팡틱","우리 저녁","언제 먹나요?",null));
		List<Notice> ns = mgr.search();
		for(Notice n : ns) {
			System.out.println(n);
		}
		System.out.println("=============================================================================");
		System.out.println(mgr.search(3));
		System.out.println("=============================================================================");
		List<Notice> test = mgr.search("TE");
		for(Notice n : test) {
			System.out.println(n);
		}
		System.out.println("=============================================================================");
		mgr.delete(26);
		List<Notice> ns1 = mgr.search();
		for(Notice n : ns1) {
			System.out.println(n);
		}

	}

}
