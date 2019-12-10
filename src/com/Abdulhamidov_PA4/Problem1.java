package com.Abdulhamidov_PA4;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

    
    Scanner scan = new Scanner(System.in);

		System.out.println("Enter Digit 1: ");
    int digit1 = scan.nextInt();
		System.out.println("Enter Digit 2: ");
    int digit2 = scan.nextInt();
		System.out.println("Enter Digit 3: ");
    int digit3 = scan.nextInt();
		System.out.println("Enter Digit 4: ");
    int digit4 = scan.nextInt();

    // Array to list out digits

    int[] beforeEncryption = new int[4];
    beforeEncryption[0]= digit1;
    beforeEncryption[1]= digit2;
    beforeEncryption[2]= digit3;
    beforeEncryption[3]= digit4;

		System.out.println("The numbers you want encrypted: " + Arrays.toString(beforeEncryption));

    int edigit1 =(digit1+7)%10;
    int edigit2 =(digit2+7)%10;
    int edigit3 =(digit3+7)%10;
    int edigit4 =(digit4+7)%10;
    // New array to list out new values

    int[] afterEncryption = new int[4];
    afterEncryption[0] = edigit1;
    afterEncryption[1] = edigit2;
    afterEncryption[2] = edigit3;
    afterEncryption[3] = edigit4;

		System.out.println("Encrypted Numbers before reverse: " + Arrays.toString(afterEncryption));

    // reverse part

    int reverse;
    reverse = afterEncryption[0];
    afterEncryption[0]=afterEncryption[2];
    afterEncryption[2]=reverse;

    reverse = afterEncryption[1];
    afterEncryption[1]=afterEncryption[3];
    afterEncryption[3]=reverse;

		System.out.println("Encrypted Message: " + Arrays.toString(afterEncryption));

    // Decrypting

    //undo reverse
    afterEncryption[3]=reverse;
    afterEncryption[3]=afterEncryption[1];
    afterEncryption[1] = reverse;

    reverse = afterEncryption[2];
    afterEncryption[2] = afterEncryption[0];
    afterEncryption[0]=reverse;

		System.out.println("Encrypted Numbers with reverse undo"+Arrays.toString(afterEncryption));


    int decryptednum1 = (edigit1-7)%10;
    int decryptednum2 = (edigit2-7)%10;
    int decryptednum3 = (edigit3-7)%10;
    int decryptednum4 = (edigit4-7)%10;

    int[] decryption = new int[4];


    decryption[0]=decryptednum1;
    decryption[1]=decryptednum2;
    decryption[2]=decryptednum3;
    decryption[3]=decryptednum4;


    // DECRYPTED MESSAGE
		System.out.println("Final Decrypted Message: "+ Arrays.toString(decryption));




}

	}


