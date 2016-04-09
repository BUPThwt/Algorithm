package com.wg.offerAlgorithm;

public class TwoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //   int[][] arr= new int[3][4];
      int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
//      for(int i=0;i<3;i++){
//    	  for(int j=0;j<4;j++){
//    		  arr[i][j]=i+1;
//    	  }
//      }
      for(int i=0;i<4;i++){
    	  for(int j=0;j<4;j++){
    		  System.out.print(arr[i][j]+" ");
    	  }
    	  System.out.println("");
      }
      System.out.println(find(arr,4,4,5));
	}
	
   public static boolean find(int[][]arr,int rows,int columns,int key){
	   boolean found = false;
	   
	   if(arr!=null && rows>0&&columns>0){
		    int row=0;
		    int column= columns-1;
		   while(row<rows&&column>=0){
			   if(arr[row][column]==key){
				   found =true;
				   break;
			   }
			   else if(arr[row][column]>key){
				   column--;
			   }else{
				   row++;
			   }
		   }
		   
	   }
	   return found;
   }
}
