package cs301.birthdaycake;

public class CakeModel {
    public boolean isCandlesLit = true;
    public int candlesNum = 2;
    public boolean isFrosting = true;
    public boolean isCandles = true;

    public CakeModel(){
        super();
    }

    public CakeModel(boolean isCandlesLit, int candlesNum, boolean isFrosting, boolean isCandles, boolean isLit){
        this.isCandlesLit = isCandlesLit;
        this.candlesNum = candlesNum;
        this.isFrosting = isFrosting;
        this.isCandles = isCandles;
    }

    public boolean isCandlesLit() {
        return isCandlesLit;
    }

    public void setCandlesLit(boolean candlesLit) {
        isCandlesLit = candlesLit;
    }

    public int getCandlesNum(){
        return this.candlesNum;
    }

    public void setCandlesNum(int candlesNum){
        this.candlesNum = candlesNum;
    }


    
}
