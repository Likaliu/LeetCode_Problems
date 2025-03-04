package desafiovetor;

class RemovendoDuplicados{
    private int k;
    private int [] nums;

    public RemovendoDuplicados(int nums[]) {
        this.k = 0;
        this.nums = nums;


    }

    public int removeDuplicates() {

        for(int i=0; i<nums.length; i++){
            if(i == 0 || nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;  
    }

    public void printElements(){
        for (int i = 0; i<k; i++){
            System.out.println(nums[i]);

        }
    }
}