public class DiamondShape {
    public static void main (String [] args) {

    int i = 1;
        while (i<26) {
          System.out.print(" ");
            switch (i) {// line 1 print 1 * , line 2 print 3 *....
                case 3: case 7 : case 9: case 11 : case 17: case 15: case 18: case 19:
                   System.out.print("*");
                   break;
                   default:
                       System.out.print(" ");
            }

            if(i%5==0){
                System.out.println(" ");

            }
            i++;
            }
        }


    }


