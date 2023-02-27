package modulefive;

public class Test {


    public static void main(String[] args){
        SaturnSL1 sl = new SaturnSL1();
        HondaCivic hc = new HondaCivic();
        // Japanese jp = new Japanese();
        German gr = new MercedesC230();
        // ChevyS10 cs = new Truck();
        ChevyS10 cs = null;
        SubaruOutback sb = new SubaruOutback( );
        Domestic dm = sl;
        // dm = hc;
        // dm = (Domestic) hc;

        // This makes sense since ChevyS10 implements Detroit which implements Domestic
        dm = cs;
        
        System.out.println("Tests completed");

    }
    
}
