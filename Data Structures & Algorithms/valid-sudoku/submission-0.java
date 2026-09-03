class Solution {
    public boolean isValidSudoku(char[][] board) {
         
         // traverse each 9 row 
         for(int r = 0; r < 9; r++) {   
            Map<Character,Integer> mp = new TreeMap<>();
            for(int c = 0; c < 9; c++) {    
                 char curr = board[r][c];
                 if(curr >= '1' && curr <= '9') {
                     int f = mp.getOrDefault(curr, 0); // fixed 'key' to 'curr'
                     if(f > 0) return false;
                     mp.put(curr, 1);
                 }
            }
         }

         // traverse each 9 column
          for(int c = 0; c < 9; c++) {   
            Map<Character,Integer> mp = new TreeMap<>();
            for(int r = 0; r < 9; r++) {    // fixed 'n' to 9
                 char curr = board[r][c];
                 if(curr >= '1' && curr <= '9') {
                     int f = mp.getOrDefault(curr, 0); // fixed 'key' to 'curr'
                     if(f > 0) return false;
                     mp.put(curr, 1);
                 }
            }
         }

         // traverse each 9 blocks (00, 03, 06...)
         for (int rStart = 0; rStart < 9; rStart += 3) {
             for (int cStart = 0; cStart < 9; cStart += 3) {
                 
                 Map<Character,Integer> mp = new TreeMap<>();
                 
                 // traverse the specific 3x3 block
                 for (int r = rStart; r < rStart + 3; r++) {
                     for (int c = cStart; c < cStart + 3; c++) {
                         char curr = board[r][c];
                         if(curr >= '1' && curr <= '9') {
                             int f = mp.getOrDefault(curr, 0);
                             if(f > 0) return false;
                             mp.put(curr, 1);
                         }
                     }
                 }
             }
         }

         // If no duplicates were found in rows, cols, or blocks
         return true;
    }
}