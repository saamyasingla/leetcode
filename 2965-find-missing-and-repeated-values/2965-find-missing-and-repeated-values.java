class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashSet<Integer> set = new HashSet<>();
        int repeated = 0;
        int actualsum = 0;
        for(int i =0; i<n ; i++){
            for(int j = 0; j<n ; j++){
                actualsum +=grid[i][j];

                if (set.contains(grid[i][j])){
                    repeated = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        int total = n*n;
        int expectedsum = total * (total+1)/2;

        int missing = expectedsum + repeated- actualsum;

        return new int[]{repeated,missing};
    }
}