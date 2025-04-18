public class BubbleSort
{

	public static void main(String[] args)
  {
    //int[] myNums = {12, 15, 0, 44, 13, 1, 2};
	int[] myNums = {42, 35, 697, 17, 15, 16, 3};
		int passes = myNums.length-1;
		int comparisons = myNums.length-1;
		int tempNum; 

		
		//Loop once for each pass, where passes is one less than the number of items.
		while(passes!=0)
		{
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			for(int i=0; i<comparisons; i++)
			{
				//If they are out of order, swap the values
				if(myNums[i]>myNums[i+1])
				{
					tempNum=myNums[i];
					myNums[i]=myNums[i+1];
					myNums[i+1]=tempNum;
					
				}

				//Tracking Bubble movement
				/* 
				for(int x=0; x<myNums.length; x++)
					System.out.print(myNums[x] + " ");
				System.out.print("\n");
				*/

			//End Loop for comparisons
			}

			//Tracking after 1 pass
			/* 
			for(int x=0; x<myNums.length; x++)
				System.out.print(myNums[x] + " ");
			System.out.print("\n");
			*/
			
			//The next pass will use one less comparison
			comparisons--;
		//End Loop for passes
		passes--;
		}
		//End Result
		/* 	
		for(int x=0; x<myNums.length; x++)
			System.out.print(myNums[i] + " "); 
		*/

  }
}
