package array;

public class foreachArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {12,23,52,62,2,1,92};
		int SearchValue = 8;
		boolean f=false;
		for(int i =0;i<nums.length;i++)
		{
			if (SearchValue == nums[i]) {
				System.out.println(nums[i]);
				f = true;
				break;
			}
	
		}
		if (f)
			System.out.println("F");
		else
			System.out.println("NF");
			
		
	}

}
