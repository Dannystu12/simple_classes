public class Printer {
    private int sheets;
    private int toner;

    public Printer(){
        this.sheets = 100;
        this.toner = 100;
    }

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets(){
        return sheets;
    }

    public int getToner(){
        return toner;
    }

    public void print(int sheets, int copies){
        int totalPages = sheets * copies;
        if(totalPages <= this.sheets && totalPages <= this.toner) {
            this.sheets -= totalPages;
            this.toner -= totalPages;
        }
    }

    public void refillPaper(int sheets){
        this.sheets += sheets;
    }

    public void refillToner(int toner){
        this.toner += toner;
    }



}
