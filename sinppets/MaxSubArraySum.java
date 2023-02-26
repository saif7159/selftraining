public class MaxSubArraySum{
	public int maxSum(int[] n){
		int length = n.length;
		int maxsum;
		for(int i = 0; i<length; i++)
		{
			int sum;
			for(int k = i+1; k<length; k++){
				sum = n[i] + n[k];
				maxsum = sum>maxsum?sum:maxsum;
			}
		}
	}
}