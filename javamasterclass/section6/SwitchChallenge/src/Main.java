/*
/// Switch Challenge
In this challenge, we'll be using the NATO alphabet to replace a character or letter, with NATO's standardized word for that letter.
In radio transmissions, the word car - "C", "A", "R" would read "Charlie Able Roger" for clarity.
    NATO PHONETIC ALPHABET
    A = Able, B = Baker, C = Charlie, D = Dog, E = Easy, F= Fox, G = George, H = How, I = Item, J = Jig,
    K = King, L = Love, M = Mike, N = Nan, O = Oboe, P = Peter, Q = Queen, R = Roger, S = Sugar, T = Tare,
    U = Uncle, V = Victor, W = William, X = X-ray, Y = Yoke, Z = Zebra

    To do this:
    1. Create a new char variable.
    2. Use the traditional switch statement (with a colon in case labels) that tests the value in the variable from step 1.
        - Create cases for the characters, A B C D and E.
        - Display a message in each case block with the letter and the nato word then break.
        - Add a default block which displays the letter with a message saying not found.
*/

public class Main {
    public static void main(String[] args) {

        char alphabet = 'G';
        switch (alphabet) {
            case 'A':
                System.out.println("A is Able");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:
                System.out.println("Letter " + alphabet + " was not found in the switch");
                break;
        }


    }
}