/**
 * Practical7_VehiclePlate :Assume a vehicle plate number
 * consists of three uppercase letters followed by four digits.
 * Write a program to generate a plate number.
 */
import java.util.*;

public class Practical7_VehiclePlate {

    public static void main(String[] args) {
        Random rand = new Random();
        StringBuilder numberPlate = new StringBuilder();
        int charA = 65; // ASCII value of 'A'
        int charZ = 90; // ASCII value of 'Z'
        int charASCII = rand.nextInt((charZ - charA + 1)) + charA;
        numberPlate.append((char)(charASCII));
        charASCII = rand.nextInt((charZ - charA + 1)) + charA;
        numberPlate.append((char)(charASCII));
        charASCII = rand.nextInt((charZ - charA + 1)) + charA;
        numberPlate.append((char)(charASCII));

        int fourdigit = rand.nextInt(9999);
        System.out.println("Number: " + (numberPlate.append(fourdigit)));
    }
}
