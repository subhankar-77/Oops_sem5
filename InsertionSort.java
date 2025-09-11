class InsertionSort {
	public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }
		int arr[] = new int[args.length];
		for (int i=0; i<args.length; i++){
			arr[i] = Integer.parseInt(args[i]);
		}
		for (int i=0; i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
			while (j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		System.out.println("Sorted array: ");
		for (int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}