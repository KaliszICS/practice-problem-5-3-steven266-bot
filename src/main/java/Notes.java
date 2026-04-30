class Notes {
	public static void main(String args[]) {

		//add and delete to array
		
		//adding to an array
/*
		int[] arr = {1, 5, 7, 9, 2};
		//{1, 5, 7, 9, 15, 2}
		int num = 15; //to be added to the array
		int pos = 5; //index we want to add it at.



		int[] arr2 = new int[arr.length + 1];
		int index = 0; //this the index to keep track of the old array

		for (int i = 0; i < arr2.length; i++) {
			if (i != pos){
				arr2[i] = arr[index];
				index++;
			}
			else {
				arr2[i] = num;
			}
		}

		arr = arr2; //replacing the reference of the array.

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
*/

		//Removing an array

		int[] arr = new int[]{1, 5, 8, 2, 3, 4, 7};
		int index = 2; //index of the element we want to remove

		int index2 = 0;
		int[] arr2 = new int[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {
			if (i != index) {
				arr2[index2] = arr[i];
				index2++;
			}
		}

		arr = arr2;

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
