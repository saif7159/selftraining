class Solution {
    public boolean canJump(int[] nums) {
        boolean result = false;
        int n = nums.length;
        Set<Integer> visited = new HashSet<Integer>();
        int  i = 0;
        if (nums[i] == 0 && n>1)
            return false;
        else if(n<=1)
            return true;
        else
            return canJumpRecursion(nums, i, n, visited);
    }
    
    public boolean canJumpRecursion(int[] nums, int i, int n, Set<Integer> visited){
            System.out.println(visited+ " "+ (i+nums[i]));
            if (i+nums[i]>=n-1)
                return true;
            else if(nums[i] != 0 && visited.add(i))
                return canJumpRecursion(nums, i+nums[i], n, visited);
            else if(visited.add(i))
                return canJumpRecursion(nums, --i, n, visited);
            else
                return false;
    }
    
    
}

class Exc0 extends Exception { } 
class Exc1 extends Exc0 { } /* Line 2 */
public class Test 
{  
    public static void main(String args[]) 
    { 
        try 
        {  
            throw new Exc1(); /* Line 9 */
        } 
        catch (Exc0 e0) /* Line 11 */
        {
            System.out.println("Ex0 caught"); 
        } 
        catch (Exception e) 
        {
            System.out.println("exception caught");  
        } 
    } 
}
