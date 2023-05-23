public class Bozo {
    public static void main(java.lang.String[] args) throws java.io.IOException{
//        Random rd = new Random(10);
//        System.out.println(rd.getRandomNumber());
//        System.out.println(rd.getSemente());
//        System.out.println(rd.getIntRand(3));
//        System.out.println(rd.getRand());
//        rd.setSemente(100);
//        System.out.println(rd.getSemente());
        RolaDados rola = new RolaDados(6);
        System.out.println(rola.getListaDeDados());
        Dado dd = new Dado();
        //System.out.println(dd.rolar());
        System.out.println(dd);
    }
}
