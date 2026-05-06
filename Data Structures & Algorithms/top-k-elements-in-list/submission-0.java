class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        for (int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
    //Create buckets where index=freq and put numbers
    // to corresponding frequency
        List<Integer>[] bucket=new List[nums.length+1];

        for(int key:map.keySet()){
            int freq=map.get(key);

            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
        bucket[freq].add(key);
        }

        int[] result=new int[k];
        int index=0;

        for(int i=bucket.length-1;i>=0&&index<k;i--){
            if(bucket[i]!=null){
                for(int num: bucket[i]){
                    result[index++]=num;

                    if(index==k)
                        break;
                }
            }
        }
        return result;
    }
}

/*
Maintain a heap of size k.

The smallest frequency stays at the top (min heap property).

If we add a new element and heap size becomes > k, we remove the smallest frequency.

So the heap always contains the k most frequent elements.*/


