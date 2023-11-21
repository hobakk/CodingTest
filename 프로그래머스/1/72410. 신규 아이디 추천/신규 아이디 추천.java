class Solution {
    public String solution(String new_id) {
		StringBuilder sb = new StringBuilder();
		String nickname = new_id.toLowerCase();

		for (char c : nickname.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 97 && c <= 122) || c == 45 || c == 95 || c == 46) sb.append(c);
		}

		nickname = sb.toString().replaceAll("[.]+", ".");
		if (nickname.charAt(0) == '.') nickname = nickname.substring(1);

		nickname = compare(nickname);
		if (nickname.isEmpty()) nickname = "a";
		if (nickname.length() >= 16) nickname = nickname.substring(0, 15);

        nickname = compare(nickname);
		if (nickname.length() <= 2) {
			while (nickname.length() < 3) {
				nickname += Character.toString(nickname.charAt(nickname.length() -1));
			}
		}

		return nickname;
	}

	private String compare(String nickname) {
		if (nickname.length() > 0 && nickname.charAt(nickname.length() -1) == '.') {
            nickname = nickname.substring(0, nickname.length() -1);
        }
		return nickname;
	}
}