import java.util.*;

class graphicQuality{
    public static void main(String[] args) {
        //Declaring variable
        Scanner sc = new Scanner(System.in);
        int gCard, processor, numCore, mResolution, computersProcessed=0, highestScore=0, lowestScore=100000000;

        //Asking for input
        System.out.print("How many computers are being processed? ");
        computersProcessed = sc.nextInt();

        //Checks that the number that is being enter mathces the number that should be entered.
        while (computersProcessed < 0){
            System.out.println("Sorry you must insert a number higher than 0.\nPLease try again.\n\nHow many computers are being processed? ");
            computersProcessed = sc.nextInt();
        }

        System.out.println("\nComputer Hardware Graphics Quality Recommendation Tool");

        for (int i = 0; i < computersProcessed; ++i){
        
            //Getting input
        System.out.print("\nPlease enter the clock speed (in Megahertz) of your graphics card:");
        gCard = sc.nextInt();

        //Checks that the number that is being enter mathces the number that should be entered.
        while (gCard < 800 || gCard > 2000 ){
            System.out.println("Sorry you must insert a number higher than 0.\nPLease try again.\n\nPlease enter the clock speed (in Megahertz) of your graphics card: ");
            gCard = sc.nextInt();
        }

        //Getting input
        System.out.print("Please enter the clock speed (in Megahertz) of your processor:");
        processor = sc.nextInt();

        //Checks that the number that is being enter mathces the number that should be entered.
        while (processor < 1000 || processor > 5500 ){
            System.out.println("Sorry you must insert a number higher than 0.\nPLease try again.\n\nPlease enter the clock speed (in Megahertz) of your processor: ");
            processor = sc.nextInt();
        }

        //Getting input
        System.out.print("Please enter the number of cores of your processor:");
        numCore = sc.nextInt();

        //Checks that the number that is being enter mathces the number that should be entered.
        while (numCore < 1 || numCore > 16 ){
            System.out.println("Sorry you must insert a number higher than 0.\nPLease try again.\n\nPlease enter the number of cores of your processor: ");
            numCore = sc.nextInt();
        }

        //Getting input
        System.out.print("What is the resolution of your monitor? \n\t1. 1280 x 720 \n\t2. 1920 x 1080 \n\t3. 2560 x 1440 \n\t4. 3840 x 2160\nPlease select from the options above: ");
        mResolution = sc.nextInt();

        //Checks that the number that is being enter mathces the number that should be entered.
        while (mResolution < 1 || mResolution > 4 ){
            System.out.println("Sorry you must insert a number higher than 0.\nPLease try again.\n\n What is the resolution of your monitor? \n\t1. 1280 x 720 \n\t2. 1920 x 1080 \n\t3. 2560 x 1440 \n\t4. 3840 x 2160\nPlease select from the options above: ");
            mResolution = sc.nextInt();
        }//End while

        //Result
        int computerScore = (int)(((5 * gCard) + (numCore * processor)) * ((mResolution < 3  ? (mResolution%2==1 ? 1:.75) : (mResolution%2==1 ? .55:.35))));
        System.out.printf("\n\nGPU Clock Speed: %d MHz\nCPU Clock Speed: %d MHz\nNumber of cores: %s \nMonitor Resolution: %s \nPerformance Score: %s \nRecommended Graphics Quality: %s\n", gCard, processor, numCore, (mResolution < 3  ? (mResolution%2==1 ? "1280 x 720":"1920 x 1080") : (mResolution%2==1 ? "2560 x 1440": "3840 x 21601")), computerScore, (computerScore > 15000 ? (computerScore > 17000 ? "Ultra" : "High"): (computerScore < 11000 ? "Unable to Play" : ((computerScore < 13000) ? "Low": "Medium"))));
        
        //Checks for the lowest and the highest score, for each computer that is being scanned
        highestScore = computerScore>highestScore? computerScore:highestScore;
        lowestScore = computerScore<lowestScore? computerScore:lowestScore;

        }//End for loop

        //Printing the lowest and highest results
        System.out.printf("\n\nHighest Score: %s\nLowest Score: %s",highestScore,lowestScore);

    }//End main method
}//End class


