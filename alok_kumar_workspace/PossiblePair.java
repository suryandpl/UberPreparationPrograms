import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PossiblePair {

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 2, 3, 3, 4, 4, 5 };
		findSumPair(a);
	}

	private static void findSumPair(int[] a) {
		Map<Integer, Set<Integer[]>> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] != a[j]) {
					int sum = a[i] + a[j];
					Integer[] pair = { a[i], a[j] };

					if (!map.containsKey(sum)) {
						Set<Integer[]> list = new HashSet<>();
						list.add(pair);
						map.put(sum, list);
					} else {
						Set<Integer[]> existing = map.get(sum);
						boolean flag = false;
						for (Integer[] e : existing) {
							if (e[0] != a[i] && e[1] != a[j]) {
								flag = true;
							} else {
								flag = false;
								break;
							}
						}
						if (flag) {
							existing.add(pair);
							map.put(sum, existing);
						}
					}
				}
			}
		}

		Collection<Set<Integer[]>> values = map.values();
		for (Set<Integer[]> value : values) {
			if (value.size() > 1) {
				System.out.print("[");
				for (Integer[] i : value) {
					System.out.print(Arrays.toString(i));
				}
				System.out.println("]");

			}
		}

		/*
		 * for (Entry<Integer, Set<Integer[]>> entry : map.entrySet()) { Set<Integer[]>
		 * values = entry.getValue(); if (values.size() > 1) { System.out.print("[");
		 * for (Integer[] value : values) { System.out.print(Arrays.toString(value)); }
		 * System.out.println("]"); } }
		 */
	}

}
