package BT;

public class C6 {
	static void SNT2 (int n) {
		int tmp = 0;
		int count = 0;
		while(count < n) {
			if (C5.ktSNT(tmp)) {
				System.out.print(tmp + " ");
				count += 1;
			}
			tmp += 1;
		}
	}
}
