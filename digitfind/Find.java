package digitfind;
import java.util.*;

            public class Find{
	         Scanner objs=new Scanner(System.in);
	         int size=objs.nextInt();
             int num[]=new int[size];
	         int count[]=new int[size];
			 int search;
             int s=0;
			 int mod=0;
			    public void search(){
			        System.out.printf("Enter number in array\n:");
                         for(int i=0;i<size;i++){
		                   num[i]=objs.nextInt();
		         	}; System.out.printf("Enter search digit:");
			              search=objs.nextInt();
			   
			             for(int i=0;i<size;i++){
				         while(num[i]>0){
					    mod=(num[i]%10);
					     if(mod==search){
				        for(int j=i;j<=i;j++){
						     count[j]++;
							};
						}; num[i]=(num[i]/10);
				    };
				};     
				        for(int j=0;j<size;j++){
					       System.out.printf("1 in %d-index is:%d\n",s++,count[j]);
					    };
		    }; 
    };