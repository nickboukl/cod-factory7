package gr.aueb.cf.ch4test;

public class Emoji {
    public static void main(String[] args) {
        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int counter = 0;
        int emoji;


        emoji = emojiStart;
        while (emoji < emojiEnd) {
            System.out.println(Character.toChars(emoji));
            System.out.println(" ");
            emoji++;
            counter++;
            if (counter % 16 == 0) {
                System.out.println();
            }
        }
    }
}
