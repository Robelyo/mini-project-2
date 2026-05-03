public class main {

    public static void main(String[] args) {
        agricultural A1=new agricultural("YELLOW CORN", 400, false, false, "SEP 26 2026", 40, "CORN", "BRAZIL", false);
        agricultural A2=new agricultural("GROUND COFFEE", 2000, false, false, "OCT 22 2029", 120, "COFFEE", "ETHIOPIA", true);
        agricultural A3=new agricultural("CANNED BEANS", 800, false, false, "JULY 27 2026", 60, "KIDNEY BEANS", "SENEGAL", true);
        livestock L1=new livestock("BACON JERKY", 900, false, false, "AUG 22 2026", 45, "PIG", "YORKSHIRE", true);
        livestock L2=new livestock("LAMB CHOPS", 1400, false, false, "JAN 25 2027", 92, "SHEEP","ROMNEY", false);
        resources R1=new resources("GOLD", 40000, false, false,"SHELF STABLE", false);
        resources R2=new resources("CEMENT", 12000, false, false,"2 TO 3 MONTHS" , false);
        resources R3=new resources("GASOLINE", 60000, false, false, "6 MONTHS", true);
        manufactured M1=new manufactured("CAR", 120000, false, false, "NISSAN", "Nissan Altima", true);
        manufactured M2= new manufactured("TABLE", 700, false, false, "IKEA", "LINNMON", false);


        A1.Imported();
        A2.Imported();
        A2.Exported();
        A3.Exported();
        L1.Imported();
        L2.Imported();
        L2.Exported();
        R1.Exported();
        R2.Imported();
        R3.Imported();
        R3.Exported();
        M1.Exported();
        M2.Imported();


        A1.bestbefore();
        L2.bestbefore();
        A2.weighs();
        L2.weighs();

        A3.info();
        L1.info();
        R1.info();
        R2.info();
        M1.info();
        M2.info();

        System.out.println(A1.getid());
        System.out.println(L2.getid());
        System.out.println(A3.getid());
        System.out.println(R1.getid());
        System.out.println(M2.getid());
        System.out.println(M1.getid());
        System.out.println(R2.getid());


    }
}
