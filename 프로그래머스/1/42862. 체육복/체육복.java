import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];

        // 학생들의 초기 체육복 상태 설정
        Arrays.fill(students, 1);

        // 도난당한 학생들의 체육복 수 감소
        for (int lostStudent : lost) {
            students[lostStudent - 1]--;
        }

        // 여벌의 체육복을 가진 학생들의 체육복 수 증가
        for (int reserveStudent : reserve) {
            students[reserveStudent - 1]++;
        }

        // 체육복 빌려주기
        for (int i = 0; i < n; i++) {
            if (students[i] == 0) {
                // 앞 번호 학생에게 빌려주기
                if (i > 0 && students[i - 1] == 2) {
                    students[i]++;
                    students[i - 1]--;
                }
                // 뒷 번호 학생에게 빌려주기
                else if (i < n - 1 && students[i + 1] == 2) {
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }

        // 체육수업을 들을 수 있는 학생 수 계산
        int answer = 0;
        for (int student : students) {
            if (student > 0) {
                answer++;
            }
        }

        return answer;
    }
}
