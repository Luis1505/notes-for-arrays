
  
   String[] arr1 = new String[3];
   String[] arr2 = {"Sally","Bob","Jimmy"};
  
   arr1[0] = "John";

   System.out.println(arr1[0]);

   for(int index = 1; index < 3 ; index ++){
     arr1[index] = arr2[index];
     //arr1[1] = arr2[1]-both arrays wil now contain sam
     //arr1[2] = arr2[2]-both arrays will now contain john
     System.out.println(arr1[index]);
     }
     
  }
}