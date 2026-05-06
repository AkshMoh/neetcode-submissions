class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        List<Integer> sizes=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(String str:strs){
            sizes.add(str.length());
        }
        for(int size:sizes){
            sb.append(size).append(',');
        }
        sb.append('#');
        for(String s:strs){
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.length()==0){
            return new ArrayList<>();

        }
        List<String> result=new ArrayList<>();
        List<Integer> sizes=new ArrayList<>();

        int i=0;
        while(str.charAt(i)!='#'){
            StringBuilder curr=new StringBuilder();
            while(str.charAt(i)!=','){
                curr.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(curr.toString()));
            i++;

        }
        i++;
        for(int sz:sizes){
            result.add(str.substring(i,i+sz));
            i+=sz;
        }
        return result;

    }
}
