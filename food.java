public class food extends goods{
    String expdate;
    float weightinkg;
    
    
    food(String name, int cost, boolean Import, boolean Export, String expdate, float weightinkg) {
        super();
        this.name = name;
        this.cost = cost;
        this.Import = Import;
        this.Export = Export;
        this.expdate = expdate;
        this.weightinkg = weightinkg;
    }
    
    void bestbefore(){
        System.out.println(expdate);
    }

    void weighs(){
        System.out.println(weightinkg);
    }

}
