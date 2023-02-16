class Combination{
	public static void main (String arr[]){
		for (int i = 0; i<3 ; i++){
			for (int j = 0; j<3 ; j++){
				for (int k = 0; k<3 ; k++){
					if(arr[i]!=arr[j] && arr[j]!=arr[k] && arr[k]!=arr[i]){	
					System.out.println(arr[i]+""+arr[j]+""+arr[k]);}}	}	}
}
}
	