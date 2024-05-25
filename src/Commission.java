class Commission implements Employee{
    private int itemSold;

    public int getItemSold(){
        return itemSold;
    }

    public void setItemSold(int itemSold){
        this.itemSold = itemSold;
    }

    @Override
    public int computeSalary(){
        int sold = 0;

        if(getItemSold() > 100){
            sold = (getItemSold() - 100) * 10;

            return (getItemSold() * 200) + sold;
        }
        return getItemSold() * 200;
    }
}
