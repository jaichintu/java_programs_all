package cls;

public class Rankedapplications {
	static class Rankedapps{
		String name;
		int score;
		
		public Rankedapps(String name,int score)
		{
			this.name=name;
			this.score=score;
			
		}
		public String toString()
		
		{
			return name +"(score :"+score+")";
		}
	}
	static class Rankingalgorithms{
		public void rankitems(Rankedapps[] items)
		{
			for(Rankedapps item:items)
			{
				item.score=assignscore(item.name);
			}
			mergesort(items,0,items.length-1);
			
			for(Rankedapps rankedapps: items){
				System.out.println("ranked items"+ rankedapps);
			}
		}

		private void mergesort(Rankedapps[] arr, int left, int right) {
			if(left<right)
			{
				int mid=(left+right)/2;
				mergesort(arr,left,mid);
				mergesort(arr,mid+1,right);
				sort(arr,left,right,mid);
			}
			
			
		}

		private void sort(Rankedapps[] arr, int left, int right, int mid) {
			int n1=mid-left+1;
			int n2=right-mid;
			Rankedapps[]LTA=new Rankedapps[n1];
			Rankedapps[]RTA=new Rankedapps[n2];
			for(int i=0; i<n1; i++)
			{
				LTA[i]=arr[left+i];
			}
			for(int i=0; i<n2; i++)
			{
				RTA[i]=arr[mid+1+i];
			}
			int i=0,j=0;
			int k=left;
			
				if(LTA[i].score<=RTA[j].score){
					arr[k++]=LTA[i++];
					
				}
				else{
					arr[k++]=RTA[j++];
					
				}
				while(i<n1)
				{
					arr[k++]=LTA[i++];
				}
				while(j<n2)
				{
					arr[k++]=LTA[j++];
				}
			
		}

		private int assignscore(String name) {
			
			if(name.equals("facebook"))
			{
				return 80;
			}
			else if(name.equals("instagram"))
			{
				return 90;
			}
			else if(name.equals("whatsapp"))
			{
				return 70;
			}
			else{
				return 50;
			}
		}
	}
	
	public static void main(String[] args) {
		Rankingalgorithms r1=new Rankingalgorithms();
		Rankedapps[]items={new Rankedapps("facebook",0),
				new Rankedapps("instagram",0),
				new Rankedapps("whatsapp",0),new Rankedapps("linkedin",0)};
		
		Rankingalgorithms rankingalgorithms=new Rankingalgorithms();
		rankingalgorithms.rankitems(items);
	}

}
