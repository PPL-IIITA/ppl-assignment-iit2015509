public class gift {
	String name;
	int price;
	int value;
	String type;


	gift(String name,int price,int value,String type){
		this.name = name;
		this.price = price;
		this.value = value;
		this.type = type;
	}

	static void sort(gift gft[],int n){
		gift temp;
		int i,j;
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(gft[i].price > gft[j].price){
					temp = gft[i];
					gft[i] = gft[j];
					gft[j]=temp;
				}
			}
		}
	}

}
