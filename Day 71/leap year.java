public class Main
{
  static int ISLP(int y)
  {
    if((y % 400 == 0) ||
       (y % 100 != 0) && 
       (y % 4 == 0))
    {
      return 1;
    }
    else
    {
      return 0;
    }
  }
