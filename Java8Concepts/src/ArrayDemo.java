class ArrayDemo {
	public static void main(String[] args) {

		// Method1
		int[] a = new int[4];

		// Method2
		int arr[] = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 9;
		// Method3
		String arrEle[] = { "Gita", "Pooja" };

		// arrEle.length = 2;
		for (int i = 0; i < arrEle.length; i++)// 0 to 1
		{
			System.out.println(arrEle[i]);
		}
		System.out.println(multiplication(arr));
	}

	//public Because can be accessed from anywehere
	//static because wanted to call from main() method
	//int because wanted to return product of array elements
	//multiplication is method name
	//int[] arr method parameter
	public static int multiplication(int[] arr) {
		int product = 1;
		for (int i = 0; i < arr.length; i++)// 0 to 1
		{
			product *= arr[i];// product = product * arr[i]
		}
		return product;
	}
}