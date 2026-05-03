public class livestock extends food {
    String animal;
    String breed;
    boolean GMO;

    livestock(String name, int cost, boolean Import, boolean Export, String expdate, float weightinkg, String animal, String breed, boolean GMO) {
        super(name, cost, Import, Export, expdate, weightinkg);
        this.animal = animal;
        this.breed = breed;
        this.GMO = GMO;
    }

    @Override
    void info(){
        super.info();
        String G=(GMO)?"GMO":"NON GMO";
        System.out.println(breed+" "+G+" "+animal);
    }

}
