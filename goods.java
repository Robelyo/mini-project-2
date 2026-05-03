public class goods {
    protected String name;
    protected int cost;
    protected boolean Import;
    protected boolean Export;
    protected int id;

    
    public goods() {
    this.id = idgenerator.idgen();
    }
    
    public int getid(){
        return id;
    }
    
    final void Imported(){
        Import=true;
    }

    final void Exported(){
        Export=true;
    }

    void info(){
        System.out.println("Name: "+name+", Cost: "+cost+", Imported: "+Import+", Exported: " +Export);
    }
}
