class Solution {
    public String solution(String phone_number) {
        String fix = phone_number.substring(0, phone_number.length()-4)
            .replaceAll("[0-9]","*");
		String save = phone_number.substring(phone_number.length()-4);
        
        return fix + save;
    }
}