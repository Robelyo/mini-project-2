public final class resources extends goods{
    String shelflife;
    boolean toxicity;

    resources(String name, int cost, boolean Import, boolean Export, String shelflife, boolean toxicity) {
        super();
        this.name=name;
        this.cost=cost;
        this.Import=Import;
        this.Export=Export;
        this.shelflife = shelflife;
        this.toxicity = toxicity;
    }

    @Override
    void info(){
        super.info();
        String tox=(toxicity)?"toxic":"non toxic";
        System.out.println("It is "+tox+", and has a shelflife of "+shelflife);
    }
    
}
