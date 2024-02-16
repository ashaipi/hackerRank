package hackerrank;

import java.io.*;

public class JumpToTheFlag {
       public static void main(String[] args) throws IOException {
           //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
           //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("jump_output")));


            int flagHeight = 4;
            int bigJump = 1;



            int result = Result.jumps(flagHeight, bigJump);

           System.out.println("Flag height: "+flagHeight+", big jump: "+bigJump+", result: "+result);

            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();

            //bufferedReader.close();
            //bufferedWriter.close();
       }
}

class Result {

    /*
     * Complete the 'jumps' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER flagHeight
     *  2. INTEGER bigJump
     */

    public static int jumps(int flagHeight, int bigJump) {
        // Write your code here
        if(bigJump==0) return 0;
        return (flagHeight/bigJump)+(flagHeight%bigJump);

    }
}
