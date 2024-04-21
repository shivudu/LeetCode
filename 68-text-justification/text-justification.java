class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int cw = 0;
        int cr = 0;
        for(int i=0;i<words.length;i++){
            String word = words[i];
            String tmp="";
            if(!(res.size() > cr)){
                res.add(word);
                cw = word.length();
            } else{
                tmp = res.get(cr);
                res.set(cr,res.get(cr) + " " + word);
                cw = res.get(cr).length();
            }
            if(cw == maxWidth){
                cr++;cw = 0;
            } else if(cw > maxWidth){
                //Remove last added word
                //res.set(cr,t.substring(0,t.length()-1 - word.length()));
                res.set(cr, align(tmp,maxWidth));
                cr++;cw =0;i--;
            } else if(i == words.length-1){
                res.set(cr, alignLast(res.get(cr),maxWidth));
            }
        }
        return res;
    }
    private String alignLast(String s, int maxW){
        int spaceCount = maxW - s.length(), i=1;
        while(i++<=spaceCount){
            s += " ";
        }
        return s;
    }
    private String align(String s, int maxW){
        System.out.println("align:"+s);
        int spaceCount = maxW - s.length(); 
        System.out.println(spaceCount +"maxw:"+maxW+" len:@"+s+"@");
        String[] arr = s.split("\\s+");
        int wC = arr.length;
        int i = 1,indx = 0;
        while(i<=spaceCount){
            arr[indx] = arr[indx]+" ";
            i++;indx++;
            if(indx >= arr.length-1)
                indx = 0;
        }
        String res="";
        for(int j=0;j<arr.length;j++){
            if(j!=arr.length-1)
                res += arr[j] +" ";
            else
                res += arr[j];
        }
         System.out.println("align:"+res);
        return res;
    }
}