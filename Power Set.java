class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
          List<String> list = new ArrayList<>();
        solve(s,"", list);
        Collections.sort(list);
        list.remove("");
        return list;
    }
    public void solve(String s , String ans,List<String> list){
        if(s.length()==0){
            list.add(ans);
            return;
        }
           char ch = s.charAt(0);
          String ros = s.substring(1);
          solve(ros,ans+"",list);
          solve(ros,ans+ch,list);
      return;
    }
}
