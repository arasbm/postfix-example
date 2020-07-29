public class TowersOfHanoi
{
     private int totalDisks;
     public static void main(String[] args)
     {
          TowersOfHanoi t = new TowersOfHanoi(5);
          t.solve();
     }    
     /**
      * Sets up the puzzle with the specified number of disks.
      *
      * @param disks the number of disks
      */
     public TowersOfHanoi(int disks)
     {
          totalDisks = disks;
     }
     
     private void moveOneDisk(int start, int end)
     {
          System.out.println("Move one disk from " + start + " to " + end);
     }
     
     /**
      * Performs the initial call to moveTower to solve the puzzle.
      * Moves the disks from tower 1 to tower 3 using tower 2.
      */
     public void solve()
     {
          moveTower(totalDisks, 1, 3, 2);
     }
     
     public void moveTower( int numDisks, int start, int end, int temp)
     {
          if(numDisks== 1)
          {
               moveOneDisk(start, end);
          }
          else
          {
               moveTower(numDisks-1, start, temp, end);
               moveOneDisk(start, end);
               moveTower(numDisks-1, temp, end, start);
               
          }
          
     }
     
}