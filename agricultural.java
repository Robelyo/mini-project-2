public class agricultural extends food{
    String crop;
    String origin;
    boolean natural;

   agricultural( String name, int cost, boolean Import, boolean Export, String expdate, float weightinkg, String crop, String origin, boolean natural) {
        super(name, cost, Import, Export, expdate, weightinkg);
        this.crop = crop;
        this.origin = origin;
        this.natural = natural;
    }

    @Override
    void info(){
        super.info();
        String nat=(natural)?"Natural":"Modified";
        System.out.println(nat+" "+crop+" from "+origin);
    }
    
}
