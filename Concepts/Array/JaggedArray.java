package Concepts.Array;

public class JaggedArray {
    public static void main(String[] args) {

        // Declaring A Jagged Array
        int nums[][] = new int[3][];

        // Initializing their Length
        nums[0] = new int[3];
        nums[1] = new int[5];
        nums[2] = new int[3];

        // Adding Data To Every Individual Array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] < 10) {
                    System.out.print("0" + nums[i][j] + " ");
                } else {
                    System.out.print(nums[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("-".repeat(32));

        // Enhanced For Loop
        for (int[] n : nums) {
            for (int m : n) {
                System.out.print(m + " ");

            }
            System.out.println();
        }


        
        System.out.println("-".repeat(32));
        // String Array
        int minlength = 25;
        String artist[][] = new String[3][];
        artist[0] = new String[] { "Shivam", "Puskar", "Binayak", "Akshay" };
        artist[1] = new String[] { "Olivia Rodrigo", "Rashmika", "Kyliee Jenner", "Sapna Chaudhary" };
        artist[2] = new String[] { "Playboy Carti", "Arijit Singh", "Central Cee", "Anuv Jain" };

        for (String[] count : artist) {
            for (String name : count) {

                if (name.length() < minlength) {
                    int spaceToAdd = minlength - name.length();
                    for (int g = 1; g < spaceToAdd; g++) {
                        name += " ";
                    }
                    System.out.print(name);
                }

            }
            System.out.println();

        }
    }

}
