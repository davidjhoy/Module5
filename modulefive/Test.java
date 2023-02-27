package modulefive;

public class Test {


    public static void main(String[] args){


        SaturnSL1 sl = new SaturnSL1();
        // HondaCivic hc = new HondaCivic();
        HondaCivic hc = null;
        // Japanese jp = new Japanese();
        Japanese jp = null;
        German gr = new MercedesC230();
        // ChevyS10 cs = new Truck();
        ChevyS10 cs = null;
        SubaruOutback sb = new SubaruOutback( );
        Domestic dm = sl;
        // dm = hc;
        // dm = (Domestic) hc;

        // This makes sense since ChevyS10 implements Detroit which implements Domestic
        // dm = cs;
        dm = (Domestic) cs;
        // Import im = sb;
        Import im = null;
        // gr = im;
        // gr = (German) im;
        // jp = im;
        // jp = (German) im;
        jp = (Japanese) im;
        // Automobile a = cs;
        Automobile a = null;
        a = hc;

        System.out.println("Tests completed");

    }
    
}
