public final class manufactured extends goods {
    String manufacturer;
    String model;
    boolean assembled;

    manufactured(String name, int cost, boolean Import, boolean Export, String manufacturer, String model, boolean assembled) {
        super();
        this.name=name;
        this.cost=cost;
        this.Import=Import;
        this.Export=Export;
        this.manufacturer = manufacturer;
        this.model = model;
        this.assembled = assembled;
    }

    @Override
    void info(){
        super.info();
        String stat=(assembled)?"Assembled":"Parts for";
        System.out.println("This is "+stat+" "+model+" "+name+" made by "+manufacturer);
    }

    
}
