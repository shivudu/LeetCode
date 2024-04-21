class Solution {
    public String intToRoman(int num) {
        int[] rom = new int[]{1000, 500, 100, 50, 10, 5, 1};
        int i = 0;
        String res = "";
        while(num > 0){
            int rem = num % rom[i];
            if( num / rom[i] == 0){
                if(rom[i] - num <= getPre(rom[i])){
                    res += getValue(getPre(rom[i]))+""+getValue(rom[i])+"";
                    num = num - (rom[i] - getPre(rom[i]));
                }
            } else if (num / rom[i] > 0){
                for(int j=1;j<=num / rom[i];j++)
                    res += getValue(rom[i])+"";
                num = rem;
                i--;
            }
            i++;
        }
        return res;
    }
    private int getPre(int n){
        switch(n){
            case 1000: return 100;
            case 500: return 100;
            case 100: return 10;
            case 50: return 10;
            case 10: return 1;
            case 5: return 1;
        }
        return 0;
    }
    private char getValue(int n){
        switch(n){
            case 1: return 'I';
            case 5: return 'V';
            case 10: return 'X';
            case 50: return 'L';
            case 100: return 'C';
            case 500: return 'D';
            case 1000: return 'M';
        }
        return ' ';
    }
}