import java.util.Scanner;

class CaesarCipher {


    public static void main(String[] args) {

        //Instantiating the relevant object classes;
        Scanner scanner = new Scanner(System.in);
        Cipher cipher = new Cipher();
        Encoding encode = new Encoding();
        Decoding decode = new Decoding();

        //Getting the Input String from the user
        System.out.println("ENTER WHAT YOU WANT ENCODED:");
        cipher.setInputString(scanner.nextLine());

        //Getting the cipher Key from the User
        System.out.println("Enter The Cipher key or Shift  Key that should be between 0 and 26");
        cipher.setCipherKey(Integer.parseInt(scanner.nextLine()));


        //getting variable data through getter methods;
        String inputString = cipher.getInputString();
        int cipherKey = cipher.getCipherKey();


        //Checking if the User Inputs the correct data
        if (inputString == "") {

            System.out.println("Enter the Correct details");

        } else {

            if (cipherKey > 0 && cipherKey < 26) {

                String encodedCipher = encode.encode(inputString, cipherKey);
                String decodedCipher = decode.decode(encodedCipher, cipherKey);


                //Printing the encoded and decoded cipher
                System.out.println("THE INPUTSTRING:"+ inputString);
                System.out.println("The ENCODEDCIPHER:"+ encodedCipher);
                System.out.println("THE DECODED CIPHER:" + decodedCipher);


            } else {
                System.out.println("ENTER THE RIGHT DETAILS!!!!");
            }

        }


    }
}