package probleme;

public class Exercitii {


    public void exemplu() {


        System.out.println("test");
    }


    //public void exempleString() {

    //     String ceva = "test";
    //    System.out.println(ceva.charAt(1));
    // }

    public void functie1String() {
        String exemplu = "cuvant";
        System.out.println(exemplu.charAt(1));
    }

    public void functie2String() {
        String exemplu = "cuvant";
        System.out.println(exemplu.concat("ul"));
    }

    public void functie3String() {
        String exemplu= "cuvant";
        System.out.println(exemplu.compareTo("cuvinte"));
    }

    public void functie4_1String() {
        String exemplu = "cuvant";
        System.out.println(exemplu.indexOf('a'));
    }
    public void functie4_2String() {
        String exemplu = "cuvant";
        System.out.println(exemplu.indexOf('a', 4));
    }
    public void functie4_3String() {
        String exemplu = "cuvant";
        System.out.println(exemplu.indexOf("uv"));
    }
    public void functie4_4String() {
        String exemplu = "cuvant";
        System.out.println(exemplu.indexOf("uv",4));
    }

    public void functie5String() {
        String exemplu = "";
        System.out.println(exemplu.isEmpty());
    }

    public void functie6_1String() {
        String exemplu = "paranormal";
        System.out.println(exemplu.lastIndexOf('a'));
    }
    public void functie6_2String() {
        String exemplu = "paranormal";
        System.out.println(exemplu.lastIndexOf('p',3));
    }
    public void functie6_3String() {
        String exemplu = "paranormal";
        System.out.println(exemplu.lastIndexOf("ma"));
    }
    public void functie6_4String() {
        String exemplu = "paranormal";
        System.out.println(exemplu.lastIndexOf("ma",1));
    }

    public void functie7String() {
        String exemplu = "cuvant";
        System.out.println(exemplu.length());
    }

    public void functie8_1String() {
        String exemplu = "paranormal";
        System.out.println(exemplu.replace('a','b'));
    }
    public void functie8_2String() {
        String exemplu = "paranormal";
        System.out.println(exemplu.replace("ar", "xx"));
    }

    public void functie9_1String() {
        String text="Ana,are,mere";
        String[] split = text.split(",");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
        System.out.println(split.length);
    }
    public void functie9_2String() {
        String text="Ana,are,mere";
        String[] split = text.split(",",2);
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split.length);
    }

    public void functie10_1String() {
        String exemplu = "cuvant";
        System.out.println(exemplu.startsWith("c"));
    }
    public void functie10_2String() {
        String exemplu = "cuvant";
        System.out.println(exemplu.startsWith("c",1));
    }

    public void functie11_1String() {
        String exemplu = "cuvant";
        System.out.println(exemplu.substring(1));
    }
    public void functie11_2String() {
        String exemplu = "cuvant";
        System.out.println(exemplu.substring(1,4));
    }

    public void functie12String() {
        String exemplu = "cuvant";
        System.out.println(exemplu.toCharArray());
    }

    public void functie13String() {
        String exemplu = "cuvant";
        System.out.println(exemplu.toUpperCase());
    }

    public void functie14String() {
        String exemplu = "CUVANT";
        System.out.println(exemplu.toLowerCase());
    }

    public void functie15String() {
        String exemplu = "  cu vant  ";
        System.out.println(exemplu.trim());
    }



}

