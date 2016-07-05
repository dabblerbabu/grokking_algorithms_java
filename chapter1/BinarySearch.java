public class BinarySearch {
	public int [] list = null;
	public static void main(String [] args) {
		System.out.println("Hello Binary search!!");
		int [] list = {3,5,6,7,9};
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.binarySearch(list, 10));
	}
	
	public int binarySearch(int [] list, int value){
		this.list = list;
		int lowIndex = 0;
		int highIndex = list.length - 1;
		int middleIndex ;
		while (lowIndex <= highIndex) {
			middleIndex = (lowIndex + highIndex)/2;
			if (list[middleIndex] == value){
				return middleIndex;
			} else if (list[middleIndex] < value){
				lowIndex = middleIndex + 1 ;
			} else if (list[middleIndex] > value) {
				highIndex = middleIndex - 1;
			}
		}
		return -1;
	}
}
