class LinearSearch{
        static int search(int arr[],int n,int x){
               for(int i=0;i<=n;i++){
                       if(arr[i]==x)
                               return i;
               }
               return -1;
        }
        public static void main (String [] args )
        {
               int[] arr={1,4,3,6,8};
               int n= arr.length;
               int x=8;
               int index = search(arr,n,x);
               if(index==-1)
                       System.out.println("element is not found in the array");
               else
                       System.out.println("element found at position : " +index);
         }
 }        
                               
