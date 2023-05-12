package quiz15;

public class MyBag implements IBag{

	private String[] arr = new String[100]; 
	private int i = 0;
	@Override
	public void insert(String item) {
		this.arr[i] = item;
		i++;		
	}
	@Override
	public void print() {
		System.out.print("항목 출력 : ");
		if(i>0) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print(arr[j] + " ");
			}
		}else {
			System.out.println("정보를 불러올수 없습니다.");
		}
		System.out.println();
	}
	@Override
	public int search(String item) {
		for(int j = 0 ; j < i ; j++) {
			if(arr[j].equals(item)) {
				System.out.print("항목을 찾았습니다! "+item+"의 인덱스 값 :");
				return j ;
			}			
		}System.out.println(item+" 항목을 찾을 수 없습니다!");
		return -1;
	}
	@Override
	public boolean delete(String item) {
		for(int j = 0 ; j < i ; j++ ) {
			if(arr[j].equals(item)) {
				System.out.println(arr[j] + " 항목을 삭제합니다.");
				for(int k = j ; k < i ; k++) {				
				arr[k] = arr[k+1];
				}
				i--;
				return true;
			}							
		}System.out.println("항목을 찾을수 없습니다.");
			return false;
	}

}
