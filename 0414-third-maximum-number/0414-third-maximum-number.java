class Solution {
    public int thirdMax(int[] nums) {
        Long firstm=null,secondm=null,thirdm=null;
        for(int n=0;n<nums.length;n++){
            if((firstm!=null && nums[n]==firstm)||
            (secondm!=null && nums[n]==secondm) ||
            (thirdm!=null && nums[n]==thirdm)){
                continue;
            }

            if(firstm==null || nums[n]>firstm){
                thirdm=secondm;
                secondm=firstm;
                firstm=(long)nums[n];
        }

            else if(secondm==null || nums[n]>secondm){
                thirdm=secondm;
                secondm=(long)nums[n];
            }
            else if(thirdm==null || nums[n]>thirdm){
                thirdm=(long)nums[n];
            }
            
        }
        return thirdm==null?firstm.intValue():thirdm.intValue();
    }
}