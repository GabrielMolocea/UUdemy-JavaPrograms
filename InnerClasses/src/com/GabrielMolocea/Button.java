package com.GabrielMolocea;

public class Button {
    private  String  titile;
    private  onClickLustener onClickLustener;
    
    public Button(String titile) {
        this.titile = titile;
    }
    
    public String getTitile() {
        return titile;
    }
    
    public void setOnClickLustener(onClickLustener onClickLustener) {
        this.onClickLustener = onClickLustener;
    }
    
    public  void onClick(){
        this.onClickLustener.onClick(this.titile);
    }
    public interface onClickLustener{
        public void onClick(String titile);
    }
}
