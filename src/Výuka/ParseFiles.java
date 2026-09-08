package Výuka;

import fileworks.DataExport;
import fileworks.DataImport;

import java.io.IOException;

public class ParseFiles {
    public static void main(String[] args) throws IOException {

        String path = "data/countries.txt";

        DataImport di = new DataImport(path);
        DataExport de = new DataExport("output.txt");

        //di.printFile();

    //     System.out.println(di.readLine()); //výpis 1 řádku
//
    //    //To do: vypsat cely obsah bez print file
    //
    //   while (di.hasNext()){
    //        System.out.println(di.readLine());
    //    }
//
    //    di.hasNext();
//
    //    di.reinitializeRead();
    //    //To do: vypsat informace 1 řádku
//
    //    String line = di.readLine();
    //    String name;
    //    String continent;
    //    long population;
    //    double avgAge;
    //    String[]tokens = line.split(";");
//
    //    name = tokens[0];
    //    continent = tokens[1];
    //    population = Long.parseLong(tokens[2]);
    //    avgAge = Double.parseDouble(tokens[3]);
//
//
    //    System.out.println(name);
    //    System.out.println(continent);
    //    System.out.println(population);
    //    System.out.println(avgAge);
    //
    //
        Country czechia = new Country("Czech Republic", "Europe", 10_000_000, 85.0);




        // Vypsat všechny řádky jako objekty třídy
        //1. přečíst soubor
        //1.1 přečíst řádek

        while (di.hasNext()) {
            String line = di.readLine();
            String[] tokens = line.split(";");
            String name = tokens[0];
            String continent = tokens[1];
            long population = Long.parseLong(tokens[2]);
            double avgAge = Double.parseDouble(tokens[3]);

            Country oneCountry = new Country(name, continent, population, avgAge);

            if (oneCountry.continent.contains("Europe")) {
                de.writeLine(oneCountry.toString());
            }
        }


        // Do souboru vypsat pouze zeme evropy



        di.finishImport();

    }
}

