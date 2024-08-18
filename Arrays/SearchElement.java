
class SearchElement
{
	public static void main (String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		int A=s.nextInt();
		int Value=s.nextInt();
		
		boolean found = false;
		for(int i=0;i<A;i++){
		    int element=s.nextInt();
		    if(element== Value){
		       found=true;
		    break; 
		    }
		}
		
		if(found){
		    System.out.println("yes");
		}
		else{
		    System.out.println("No");
		}
	}
}
