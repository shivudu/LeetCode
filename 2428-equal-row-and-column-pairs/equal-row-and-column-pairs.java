class Solution {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>,Integer> map = new HashMap<>();
        int res = 0;
        for(int i = 0;i<grid.length;i++){
            List<Integer> al = new ArrayList<>();
            for(int j = 0;j<grid[i].length;j++){
                al.add(grid[i][j]);//rows
            }
            map.put(al, map.getOrDefault(al,0)+1);
        }
        for(int i = 0;i< grid.length;i++){
            List<Integer> al = new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                al.add(grid[j][i]);//colum
            }
            if(map.containsKey(al))
                res +=map.get(al);
        }
        return res;
    }
}