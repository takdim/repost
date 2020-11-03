import java.util.Scanner;
class no7
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    // String name[] = new String[n];
    // int score[] = new int[n];
    int rank1 = 0;
    int rank2 = 0;
    int rank3 = 0;
    String name1 = null;
    String name2 = null;
    String name3 = null;
    for(int i = 0 ; i < n ; i++)
    {
      String name = read.next();
      int score = read.nextInt();
      if(score > rank3)
      {
        rank3 = score;
        name3 = name;
        if(score > rank2)
        {
          rank3 = rank2;
          name3 = name2;
          rank2 = score;
          name2 = name;
          if(score > rank1)
          {
            rank2 = rank1;
            name2 = name1;
            rank1 = score;
            name1 = name;
          }
        }
      }
    }
    
      System.out.println();
      System.out.println(rank1 + rank2 + rank3);
      System.out.println(name1 + " " + rank1);
      System.out.println(name2 + " " + rank2);
      System.out.println(name3 + " " + rank3);

  }
}