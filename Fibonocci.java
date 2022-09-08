package week1.day2;

public class Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnum=0 , secnum=1, sum=0;
		System.out.println(firstnum);
		System.out.println(secnum);
		for(int i =0; i<9;i++)
			{
			sum=firstnum + secnum;
			firstnum=secnum;
			secnum=sum;
			System.out.println(sum);
			
			}
	}

}
