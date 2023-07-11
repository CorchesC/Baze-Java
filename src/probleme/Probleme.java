package probleme;

import java.util.Scanner;

public class Probleme {




    //todo:Se dă un șir de caractere. Să se determine câte vocale din șir sunt cuprinse între două consoane.
    public void soluti1(){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Intriduceti  un text");


        String text=scanner.nextLine();

//        int x=Integer.parseInt(scanner.nextLine());

        int ct=contorVocaleIntreConsoane(text);

        String solutie="";

        solutie+="In textul "+text;
        solutie+="Se afla "+ct+" voacale in interiorul a doua consoane";


        System.out.println(solutie);



    }

    private boolean isVocala(char caracter){

        if(!Character.isAlphabetic(caracter)){

            return false;
        }
        String vocale="AEIOUaeiou";
        return  vocale.contains(caracter+"");
    }
    private boolean isConsoana(char caracter){

        if(!Character.isAlphabetic(caracter)) {

            return false;
        }
        return !isVocala(caracter);
    }

    public int contorVocaleIntreConsoane(String str) {
        int nr =0;
        for (int i =1; i < str.length()-1; i++) {
            if (isConsoana(str.charAt(i-1)) == true && isVocala(str.charAt(i)) == true && isConsoana(str.charAt(i+1)) == true ) {
                nr++;
            };
        }
        return nr;
    }










}
