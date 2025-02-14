package Lec22;

public class Right_Shift2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while right shifting we will discard one bit at one shift
		int n = 20;
		System.out.println(n >> 3);
		int n1 = -62;
		System.out.println(n1 >> 3);
	}

}

// for getting binary of a negative number just get the binary of the postive
// one if number is -78 then get binary of 78 and then invert all bits 1 become
// 0 and 0 become 1 and then add 1 to the bits and will get binary of negative
// number and if >> operation is getting used then we will again do the same
// operation
