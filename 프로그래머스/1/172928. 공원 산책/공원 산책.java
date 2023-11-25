class Solution {
    public int[] solution(String[] park, String[] routes) {
		int[] answer = new int[2];
		for (int i=0; i < park.length; i++) {
			if (park[i].contains("S")) {
				for (int j=0; j < park.length; j++) {
					if (park[i].charAt(j) == 'S') {
						answer[0] = i;
						answer[1] = j;
						break;
					}
				}
				break;
			}
		}

		for (String str : routes) {
            String[] address = str.split(" ");
            boolean isBlocked = false;

            switch(address[0]) {
                case "N": {
                    if (answer[0] - Integer.parseInt(address[1]) >= 0) {
                        for (int i = answer[0] - 1; i >= answer[0] - Integer.parseInt(address[1]); i--) {
                            if (answer[1] < park[i].length() && park[i].charAt(answer[1]) == 'X') {
                                isBlocked = true;
                                break;
                            }
                        }

                        if (!isBlocked) answer[0] -= Integer.parseInt(address[1]);
                    }
                    break;
                }
                case "S": {
                    if (answer[0] + Integer.parseInt(address[1]) <= park.length - 1) {
                        for (int i = answer[0] + 1; i <= answer[0] + Integer.parseInt(address[1]); i++) {
                            if (answer[1] < park[i].length() && park[i].charAt(answer[1]) == 'X') {
                                isBlocked = true;
                                break;
                            }
                        }

                        if (!isBlocked) answer[0] += Integer.parseInt(address[1]);
                    }
                    break;
                }
                case "W": {
                    if (answer[1] - Integer.parseInt(address[1]) >= 0) {
                        for (int i = answer[1] -1; i >= answer[1] - Integer.parseInt(address[1]); i--) {
                            if (park[answer[0]].length() > i && park[answer[0]].charAt(i) == 'X') {
                                isBlocked = true;
                                break;
                            }
                        }

                        if (!isBlocked) answer[1] -= Integer.parseInt(address[1]);
                    }
                    break;
                }
                case "E": {
                    if (answer[1] + Integer.parseInt(address[1]) <= park[answer[0]].length() - 1) {
                        for (int i = answer[1] + 1; i <= answer[1] + Integer.parseInt(address[1]); i++) {
                            if (park[answer[0]].length() > i && park[answer[0]].charAt(i) == 'X') {
                                isBlocked = true;
                                break;
                            }
                        }

                        if (!isBlocked) answer[1] += Integer.parseInt(address[1]);
                    }
                    break;
                }
            }
        }

		
		return answer;
	}
}