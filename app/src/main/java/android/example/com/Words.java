package android.example.com;

public class Words {
    private String englishWord;
    private String nepaliWord;
    private static final int NO_IMAGE = -1;
    private int imageR = NO_IMAGE;

    public Words(String nepaliWord, String englishWord, int imageResource){
        this.nepaliWord = nepaliWord;
        this.englishWord = englishWord;
        imageR = imageResource;
    }
    public Words(String nepaliWord, String englishWord){
        this.nepaliWord = nepaliWord;
        this.englishWord = englishWord;
    }
    public  String getEnglishWord(){
        return englishWord;
    }
    public String getNepaliWord(){
        return nepaliWord;
    }
    public int getImageR(){
        return imageR;
    }
    public boolean hasImage(){
        return imageR != NO_IMAGE;
    }
}
