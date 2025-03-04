package desafios;

public class MesclarString{
    
    String result = "";
    String word1;
    String word2;

    MesclarString(String word1, String word2){
        this.word1 = word1;
        this.word2 = word2;
    }

    public String mergeAlternately() {
        int temp1 = 0;
        int temp2 = 0;
            int pointer1 = word1.length();
            int pointer2 = word2.length();
    
            while(temp1<pointer1 || temp2<pointer2){
                if(temp1<pointer1){
                    result = result + word1.charAt(temp1);
                    temp1++;
                }
                if(temp2<pointer2){
                    result = result + word2.charAt(temp2);
                    temp2++;
                }
            }
        return result;
    }

}