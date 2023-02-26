public class AlgoPractice{
	// 1,2,-1,3,4,2,1,-1
	public static int karadesAlgo(int[] arr){
		int length = arr.length;
		int maxsum = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0 ; i < length ; i++){
			
			if(arr[i]<0){
				sum = 0;
			}
			else
				sum += arr[i];
			maxsum = sum > maxsum ? sum : maxsum;

		}
		return maxsum;
	}
	public static void main (String ... args){
		System.out.println(karadesAlgo(new int[]{1,2,-1,3,4,2,1,-1}));
	}
}
