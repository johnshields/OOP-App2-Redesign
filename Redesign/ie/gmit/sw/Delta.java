package ie.gmit.sw;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Class Delta - Singleton
 * @author John Shields - G00348436
 * @version 1.1
 */
public class Delta {

    private static Delta firstInstance = null;
    String[] greekLetters = {"Eta", "Theta", "Iota", "Kappa", "Lambda", "Sigma", "Omega"};
    private final LinkedList<String> letterList = new LinkedList<>(Arrays.asList(greekLetters));
    static boolean firstThread = true;

    public static Delta getInstance(){

        if(firstInstance == null){
            if(firstThread) {
                firstThread = false;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            firstInstance = new Delta();

            Collections.shuffle(firstInstance.letterList);
        }
        return firstInstance;
    }

    public LinkedList<String> getLetterList(){
        return  firstInstance.letterList;
    }

    public LinkedList<String> getLetters(int numOfLetters){
        LinkedList<String> lettersToSend = new LinkedList<>();

        for(int i = 0; i <= numOfLetters; i++){
            lettersToSend.add(firstInstance.letterList.remove(0));
        }
        return lettersToSend;
    }
}
