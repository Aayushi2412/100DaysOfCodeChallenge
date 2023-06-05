/*
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY
plane.
Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true
*/
//code
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        //approach- to find slope
        int x0=coordinates[0][0];
        int x1=coordinates[1][0];
        int y0=coordinates[0][1];
        int y1=coordinates[1][1];
        for(int i=2;i<coordinates.length;i++)
        {
            int x=coordinates[i][0];
            int y=coordinates[i][1];
            if((x-x0)*(y1-y0)!=(y-y0)*(x1-x0)) return false;
        }
        return true;

        
    }
}
