class MaxMin {
	public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }
		int arr[] = new int[args.length];
		for (int i=0; i<args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		int max = arr[0];
		int min = arr[0];
		for (int i=0; i < arr.length; i++) {
			if (arr[i]>max)
				max = arr[i];
			if (arr[i]<min)
				min = arr[i];
		}
		System.out.println("Maximum is " + max);
		System.out.println("Minimum is " + min);
	}
}