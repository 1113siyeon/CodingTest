class Solution {
    public int[] solution(int start_num, int end_num) {
        int count = 0;
        int a = 0;
        
        for(int i = start_num; i <= end_num; i++)
        {
            count++;
        }
        
         int[] answer = new int[count];
        
             
        for(int i = start_num; i <= end_num; i++)
        {
            answer[a] = i;
            a++;
        }
        
        
        return answer;
    }
}