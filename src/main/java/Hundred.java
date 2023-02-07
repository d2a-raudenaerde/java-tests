/**
* Program to print command line argument 100 times
* Words are never split up. Assuming that the console is 80 characters wide.
*
**/
class Hundred {
    private static final int LINE_WIDTH = 80;

    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Argument missing");
        } else {
            String name = args[0];

            int wordsOnOneLine = LINE_WIDTH / (name.length() + 1);
            int i = 0;
            while(i < 100) {
                for(int j = 0; j < wordsOnOneLine && i < 100; j++) {
                    i++;
                    System.out.print(name);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
