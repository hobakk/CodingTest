import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int[] attack : attacks) {
			map.put(attack[0], attack[1]);
		}

        int hp = health;
		int count = 0;
		for (int i=1; i <= attacks[attacks.length -1][0]; i++) {
			int damage = map.getOrDefault(i, 0);
			if (damage != 0) {
				count = 0;
				hp -= damage;
				if (hp <= 0) return -1;
			} else {
				count ++;
				hp = Math.min(hp + bandage[1], health);
				if (count == bandage[0]) {
                    hp = Math.min(hp + bandage[2], health);
                    count = 0;
                } 
			}
		}

		return hp;
	}
}