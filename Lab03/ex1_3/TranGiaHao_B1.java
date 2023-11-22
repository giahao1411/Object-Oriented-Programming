import java.util.*;

public class TranGiaHao_B1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int[] arr = {2, 2, 5, 5, 5};

		System.out.print("Nhap vao 1 so bat ki:");
		int x = sc.nextInt();

		System.out.println("Cau 1: ket qua la: " + removeEle(arr, x));
	
		System.out.print("Moi nhap 1 so muon truyen vao mang:");
		int n = sc.nextInt();
		System.out.print("Moi nhap 1 vi tri muon truyen vao mang:");
		int pos = sc.nextInt();

		System.out.print("Cau 2: ");
		insertEle(arr, n, pos);

		System.out.printf("\nCau 3: ");
		findDupicate(arr);
	}

	public static boolean removeEle(int[] arr, int x)
	{
		int pos = -1;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == x)
				pos = i;
			break;
		}
		if(pos == -1)
			return false; 
		else
		{
			for(int i = pos; i < arr.length - 1; i++)
			{
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = 0;
		}
		return true;
	}

	public static void insertEle(int[] arr, int n, int pos)
	{	
		int temp;
		int[] newArr = arr;
		if(pos > newArr.length)
			System.out.println("Vi tri khong phu hop");
		else
		{
			temp = newArr[newArr.length - 2]; 
			for(int i = pos; i < newArr.length - 1; i++)
			{
				newArr[i + 1] = newArr[i];
			}
			newArr[pos] = n;
			newArr[newArr.length - 1] = temp;
			for(int i = 0; i < newArr.length; i++)
			{
				System.out.print(newArr[i] + " ");
			}
		}
	}

	public static void findDupicate(int[] arr)
	{
		int[] newArr;
		int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
					System.out.print(arr[i] + " ");
			} 
		}
	}
}