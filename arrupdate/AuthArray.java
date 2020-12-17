package arrupdate;

import java.util.*;
   
  interface Inter
  {
  Scanner objscan=new Scanner(System.in);
  public static final int size=objscan.nextInt();
  public static final int i=0;
  public static final int j=(size-1);
  public static final int a[]=new int[size];
  void createArray();
  void revArray();
  void getRevArray();
};

   public class AuthArray implements Inter
	{
		public static int p=i;
		public static int t=j;
		public void createArray()
		{
			System.out.println("Enter array elements:");
			for(int x=0;x<a.length;x++){
				a[x]=objscan.nextInt();
			};
		};
		//reverse;
		
		   public void revArray() 
		   {
			   while(p<t)
			   {
				   int temp=a[p];
				   a[p]=a[t];
				   a[t]=temp;
				   p++;
				   t--;
			   };   
            };
        //show reverse array;
		
            public void getRevArray()
			{
               for(int x=0;x<a.length;x++)
			   {
                   System.out.println("reversed array:"+a[x]);
			   };
	        };			   
	};