package BT;

public class BTMang {
	/**
	 * Tính tổng của các phần tử trong mảng
	 * @param mang Mảng cần tính tổng
	 * @return Tổng các phần tử
	 */
	public static float Tong(float[] mang) {
		int n = mang.length;
		for(int i = 0; i<n; i++) {
			s = s + mang[i];
		}
		return s;
	}
}
