package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

    Integer goForward = 0;
    Integer goBack = 0;
    Integer Index;

    for (int i = 0; i < playList.length; i++) {
        if (selection.equals(playList[i])) {
            Index = i;

            if (Index > startIndex) {
                goForward = Index - startIndex;

                if (Index < playList.length -1) {
                    goBack = playList.length -1 - Index;
                }
            }
        }
    }
    if (goForward > goBack && goBack !=0) {
        return goBack;
    }
    else return goForward;
}
}
