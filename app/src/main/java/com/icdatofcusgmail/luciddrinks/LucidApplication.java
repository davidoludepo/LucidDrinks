package com.icdatofcusgmail.luciddrinks;

import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.TreeMap;

/**
 * Created by DAVID OGUNDEPO on 07/16/2017.
 *
 */

public class LucidApplication extends Application {

    public  String[] Diamond;
    public Bundle sellerOruko;
    public TextView Idtext;
    public TextView Nametext;
    private static LucidApplication instance;
    public JSONArray selecteddrinks;
    public JSONObject prices;

    //     String FirstString, SecondString, ThirdString, FourthString, FifthString, SixthString, SeventhString, EighthString, NinthString, TenthString, ElevenString, TwelveString, ThirteenString, FourteenString, FifteenString, SixteenString, SeventeenString, EighteenString, NineteenString, TwentyString, TwentyOneString, TwentyTwoString, TwentyThreeString, TwentyFourString, TwentyFiveString, TwentySixString, TwentySevenString, TwentyEightString, TwentyNineString, ThirtyString, ThirtyOneString, ThirtyTwoString, ThirtyThreeString, ThirtyFourString, ThirtyFiveString, ThirtySixString, ThirtySevenString, ThirtyEightString, ThirtyNineString, FourtyString, FourtyOneString, FourtyTwoString, FourtyThreeString;


    public static int parseOne, parseTwo, parseThree, parseFour, parseFive, parseSix, parseSeven, parseEight, parseNine, parseTen, parseEleven, parseTwelve, parseThirteen, parseFourteen, parseFifteen, parseSixteen, parseSeventeen, parseEighteen, parseNineteen, parseTwenty, parseTwentyOne, parseTwentyTwo, parseTwentyThree, parseTwentyFour, parseTwentyFive, parseTwentySix, parseTwentySeven, parseTwentyEight, parseTwentyNine, parseThirty, parseThirtyOne, parseThirtyTwo, parseThirtyThree, parseThirtyFour, parseThirtyFive, parseThirtySix, parseThirtySeven, parseThirtyEight, parseThirtyNine, parseFourty, parseFourtyOne, parseFourtyTwo, parseFourtyThree;
    public static String FirstSubString, SecondSubString, ThirdSubString, FourthSubString, FifthSubString, SixthSubString, SeventhSubString, EighthSubString, NinthSubString, TenthSubString, EleventhSubString, TwelvethSubString, ThirteenthSubString, FourteenthSubString, FifteenthSubString, SixteenthSubString, SeventeenthSubString, EighteenthSubString, NineteenthSubString, TwentiethSubString, TwentyOneSubString, TwentyTwoSubString, TwentyThreeSubString, TwentyFourSubString, TwentyFiveSubString, TwentySixSubString, TwentySevenSubString, TwentyEightSubString, TwentyNineSubString, ThirtySubString, ThirtyOneSubString, ThirtyTwoSubString, ThirtyThreeSubString, ThirtyFourSubString, ThirtyFiveSubString, ThirtySixSubString, ThirtySevenSubString, ThirtyEightSubString, ThirtyNineSubString, FourtySubString, FourtyOneSubString, FourtyTwoSubString, FourtyThreeSubString;
    public static String FirstString, SecondString, ThirdString, FourthString, FifthString, SixthString, SeventhString, EighthString, NinthString, TenthString, ElevenString, TwelveString, ThirteenString, FourteenString, FifteenString, SixteenString, SeventeenString, EighteenString, NineteenString, TwentyString, TwentyOneString, TwentyTwoString, TwentyThreeString, TwentyFourString, TwentyFiveString, TwentySixString, TwentySevenString, TwentyEightString, TwentyNineString, ThirtyString, ThirtyOneString, ThirtyTwoString, ThirtyThreeString, ThirtyFourString, ThirtyFiveString, ThirtySixString, ThirtySevenString, ThirtyEightString, ThirtyNineString, FourtyString, FourtyOneString, FourtyTwoString, FourtyThreeString;


    public JSONObject stack;

    public int allinfoodcounter = 0;

    public TreeMap<String,String> prev;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        selecteddrinks = new JSONArray();
        prices = new JSONObject();
        prev = new TreeMap<>();

        stack = new JSONObject();

        //"Can Mirinda", "Glass Mirinda", "Pet Mirinda", "Can Pepsi",
        // "Glass Pepsi", "Pet Pepsi", "Can Savanna", "Pet Savanna",
        // "Can SevenUp", "Glass SevenUp", "Pet SevenUp", "Small Glass Sprite",
        // "Big Glass Sprite", "Pet Sprite", "Pet Teem", "Pet Lacasera",
        // "Pet Smoov", "Small Glass Coke", "Big Glass Coke","Small Pet Coke",
        // "Big Pet Coke", "Small Glass Fanta", "Big Glass Fanta", "Small Pet Fanta",
        // "Big Pet Fanta", "Sachet Water", "Pet Water", "Can MaltaGold", "Can Maltina",
        // "Can Himalt", "Can MaltaGuinness", "5Alive Juice", "Small Hollandia Juice",
        // "Big Hollandia Juice", "Small ChiExotic Juice", "Big ChiExotic Juice",
        // "Small Chivita Juice", "Big Chivita Juice", "Small HappyHour Juice",
        // "Big HappyHour Juice", "Small Glass Schweppes", "Big Glass Schweppes",
        // "Pet Schweppes"

        //  JSONArray
        JSONArray can_mirinda = new JSONArray();
        can_mirinda.add("150 naira C. Mirinda");
        can_mirinda.add("300 naira C. Mirinda(2)");
        can_mirinda.add("450 naira C. Mirinda(3)");
        can_mirinda.add("600 naira C. Mirinda(4)");
        can_mirinda.add("750 naira C. Mirinda(5)");
        can_mirinda.add("900 naira C. Mirinda(6)");
        prices.put("Can Mirinda", can_mirinda);

        JSONArray glass_mirinda = new JSONArray();
        glass_mirinda.add("80 naira G. Mirinda");
        glass_mirinda.add("160 naira G. Mirinda(2)");
        glass_mirinda.add("240 naira G. Mirinda(3)");
        glass_mirinda.add("320 naira G. Mirinda(4)");
        glass_mirinda.add("400 naira G. Mirinda(5)");
        glass_mirinda.add("480 naira G. Mirinda(6)");
        prices.put("Glass Mirinda", glass_mirinda);

        JSONArray pet_mirinda = new JSONArray();
        pet_mirinda.add("100 naira Pet Mirinda");
        pet_mirinda.add("200 naira Pet Mirinda(2)");
        pet_mirinda.add("300 naira Pet Mirinda(3)");
        pet_mirinda.add("400 naira Pet Mirinda(4)");
        pet_mirinda.add("500 naira Pet Mirinda(5)");
        pet_mirinda.add("600 naira Pet Mirinda(6)");
        prices.put("Pet Mirinda", pet_mirinda);

        JSONArray can_pepsi = new JSONArray();
        can_pepsi.add("150 naira Can Pepsi");
        can_pepsi.add("300 naira Can Pepsi(2)");
        can_pepsi.add("450 naira Can Pepsi(3)");
        can_pepsi.add("600 naira Can Pepsi(4)");
        can_pepsi.add("750 naira Can Pepsi(5)");
        can_pepsi.add("900 naira Can Pepsi(6)");
        prices.put("Can Pepsi", can_pepsi);

        JSONArray glass_pepsi = new JSONArray();
        glass_pepsi.add("80 naira Glass Pepsi");
        glass_pepsi.add("160 naira Glass Pepsi(2)");
        glass_pepsi.add("240 naira Glass Pepsi(3)");
        glass_pepsi.add("320 naira Glass Pepsi(4)");
        glass_pepsi.add("400 naira Glass Pepsi(5)");
        glass_pepsi.add("480 naira Glass Pepsi(6)");
        prices.put("Glass Pepsi", glass_pepsi);

        JSONArray pet_pepsi = new JSONArray();
        pet_pepsi.add("100 naira Pet Pepsi");
        pet_pepsi.add("200 naira Pet Pepsi(2)");
        pet_pepsi.add("300 naira Pet Pepsi(3)");
        pet_pepsi.add("400 naira Pet Pepsi(4)");
        pet_pepsi.add("500 naira Pet Pepsi(5)");
        pet_pepsi.add("600 naira Pet Pepsi(6)");
        prices.put("Pet Pepsi", pet_pepsi);

        JSONArray can_savanna = new JSONArray();
        can_savanna.add("150 naira C. Savanna");
        can_savanna.add("300 naira C. Savanna(2)");
        can_savanna.add("450 naira C. Savanna(3)");
        can_savanna.add("600 naira C. Savanna(4)");
        can_savanna.add("750 naira C. Savanna(5)");
        can_savanna.add("900 naira C. Savanna(6)");
        prices.put("Can Savanna", can_savanna);

        JSONArray pet_savanna = new JSONArray();
        pet_savanna.add("100 naira P. Savanna");
        pet_savanna.add("200 naira P. Savanna(2)");
        pet_savanna.add("300 naira P. Savanna(3)");
        pet_savanna.add("400 naira P. Savanna(4)");
        pet_savanna.add("500 naira P. Savanna(5)");
        pet_savanna.add("600 naira P. Savanna(6)");
        prices.put("Pet Savanna", pet_savanna);

        JSONArray can_sevenUp = new JSONArray();
        can_sevenUp.add("150 naira C. SevenUp");
        can_sevenUp.add("300 naira C. SevenUp(2)");
        can_sevenUp.add("450 naira C. SevenUp(3)");
        can_sevenUp.add("600 naira C. SevenUp(4)");
        can_sevenUp.add("750 naira C. SevenUp(5)");
        can_sevenUp.add("900 naira C. SevenUp(6)");
        prices.put("Can SevenUp", can_sevenUp);

        JSONArray glass_sevenUp = new JSONArray();
        glass_sevenUp.add("80 naira G. SevenUp");
        glass_sevenUp.add("160 naira G. SevenUp(2)");
        glass_sevenUp.add("240 naira G. SevenUp(3)");
        glass_sevenUp.add("320 naira G. SevenUp(4)");
        glass_sevenUp.add("400 naira G. SevenUp(5)");
        glass_sevenUp.add("480 naira G. SevenUp(6)");
        prices.put("Glass SevenUp", glass_sevenUp);

        JSONArray pet_sevenUp = new JSONArray();
        pet_sevenUp.add("100 naira P. SevenUp");
        pet_sevenUp.add("200 naira P. SevenUp(2)");
        pet_sevenUp.add("300 naira P. SevenUp(3)");
        pet_sevenUp.add("400 naira P. SevenUp(4)");
        pet_sevenUp.add("500 naira P. SevenUp(5)");
        pet_sevenUp.add("600 naira P. SevenUp(6)");
        prices.put("Pet SevenUp", pet_sevenUp);

        JSONArray small_glass_sprite = new JSONArray();
        small_glass_sprite.add("80 naira Small G. Sprite");
        small_glass_sprite.add("160 naira Small G. Sprite(2)");
        small_glass_sprite.add("240 naira Small G. Sprite(3)");
        small_glass_sprite.add("320 naira Small G. Sprite(4)");
        small_glass_sprite.add("400 naira Small G. Sprite(5)");
        small_glass_sprite.add("480 naira Small G. Sprite(6)");
        prices.put("Small Glass Sprite", small_glass_sprite);

        JSONArray big_glass_sprite = new JSONArray();
        big_glass_sprite.add("100 naira Big G. Sprite");
        big_glass_sprite.add("200 naira Big G. Sprite(2)");
        big_glass_sprite.add("300 naira Big G. Sprite(3)");
        big_glass_sprite.add("400 naira Big G. Sprite(4)");
        big_glass_sprite.add("500 naira Big G. Sprite(5)");
        big_glass_sprite.add("600 naira Big G. Sprite(6)");
        prices.put("Big Glass Sprite", big_glass_sprite);

        JSONArray pet_sprite = new JSONArray();
        pet_sprite.add("100 naira Pet Sprite");
        pet_sprite.add("200 naira Pet Sprite(2)");
        pet_sprite.add("300 naira Pet Sprite(3)");
        pet_sprite.add("400 naira Pet Sprite(4)");
        pet_sprite.add("500 naira Pet Sprite(5)");
        pet_sprite.add("600 naira Pet Sprite(6)");
        prices.put("Pet Sprite", pet_sprite);

        JSONArray pet_teem = new JSONArray();
        pet_teem.add("100 naira Pet Teem");
        pet_teem.add("200 naira Pet Teem(2)");
        pet_teem.add("300 naira Pet Teem(3)");
        pet_teem.add("400 naira Pet Teem(4)");
        pet_teem.add("500 naira Pet Teem(5)");
        pet_teem.add("600 naira Pet Teem(6)");
        prices.put("Pet Teem", pet_teem);

        JSONArray pet_lacasera = new JSONArray();
        pet_lacasera.add("100 naira Pet Lacasera");
        pet_lacasera.add("200 naira Pet Lacasera(2)");
        pet_lacasera.add("300 naira Pet Lacasera(3)");
        pet_lacasera.add("400 naira Pet Lacasera(4)");
        pet_lacasera.add("500 naira Pet Lacasera(5)");
        pet_lacasera.add("600 naira Pet Lacasera(6)");
        prices.put("Pet Lacasera", pet_lacasera);

        JSONArray pet_smoov = new JSONArray();
        pet_smoov.add("150 naira Pet Smoov");
        pet_smoov.add("300 naira Pet Smoov(2)");
        pet_smoov.add("450 naira Pet Smoov(3)");
        pet_smoov.add("600 naira Pet Smoov(4)");
        pet_smoov.add("750 naira Pet Smoov(5)");
        pet_smoov.add("900 naira Pet Smoov(6)");
        prices.put("Pet Smoov", pet_smoov);

        JSONArray small_glass_coke = new JSONArray();
        small_glass_coke.add("80 naira Small G. Coke");
        small_glass_coke.add("160 naira Small G. Coke(2)");
        small_glass_coke.add("240 naira Small G. Coke(3)");
        small_glass_coke.add("320 naira Small G. Coke(4)");
        small_glass_coke.add("400 naira Small G. Coke(5)");
        small_glass_coke.add("480 naira Small G. Coke(6)");
        prices.put("Small Glass Coke", small_glass_coke);

        JSONArray big_glass_coke = new JSONArray();
        big_glass_coke.add("100 naira Big G. Coke");
        big_glass_coke.add("200 naira Big G. Coke(2)");
        big_glass_coke.add("300 naira Big G. Coke(3)");
        big_glass_coke.add("400 naira Big G. Coke(4)");
        big_glass_coke.add("500 naira Big G. Coke(5)");
        big_glass_coke.add("600 naira Big G. Coke(6)");
        prices.put("Big Glass Coke", big_glass_coke);

        JSONArray small_pet_coke = new JSONArray();
        small_pet_coke.add("100 naira Small Pet Coke");
        small_pet_coke.add("200 naira Small Pet Coke(2)");
        small_pet_coke.add("300 naira Small Pet Coke(3)");
        small_pet_coke.add("400 naira Small Pet Coke(4)");
        small_pet_coke.add("500 naira Small Pet Coke(5)");
        small_pet_coke.add("600 naira Small Pet Coke(6)");
        prices.put("Small Pet Coke", small_pet_coke);

        JSONArray big_pet_coke = new JSONArray();
        big_pet_coke.add("150 naira Big Pet Coke");
        big_pet_coke.add("300 naira Big Pet Coke(2)");
        big_pet_coke.add("450 naira Big Pet Coke(3)");
        big_pet_coke.add("600 naira Big Pet Coke(4)");
        big_pet_coke.add("750 naira Big Pet Coke(5)");
        big_pet_coke.add("900 naira Big Pet Coke(6)");
        prices.put("Big Pet Coke", big_pet_coke);

        JSONArray small_glass_fanta = new JSONArray();
        small_glass_fanta.add("80 naira Small G. Fanta");
        small_glass_fanta.add("160 naira Small G. Fanta(2)");
        small_glass_fanta.add("240 naira Small G. Fanta(3)");
        small_glass_fanta.add("320 naira Small G. Fanta(4)");
        small_glass_fanta.add("400 naira Small G. Fanta(5)");
        small_glass_fanta.add("480 naira Small G. Fanta(6)");
        prices.put("Small Glass Fanta", small_glass_fanta);

        JSONArray big_glass_fanta = new JSONArray();
        big_glass_fanta.add("100 naira Big G. Fanta");
        big_glass_fanta.add("200 naira Big G. Fanta(2)");
        big_glass_fanta.add("300 naira Big G. Fanta(3)");
        big_glass_fanta.add("400 naira Big G. Fanta(4)");
        big_glass_fanta.add("500 naira Big G. Fanta(5)");
        big_glass_fanta.add("600 naira Big G. Fanta(6)");
        prices.put("Big Glass Fanta", big_glass_fanta);

        JSONArray small_pet_fanta = new JSONArray();
        small_pet_fanta.add("100 naira Small P. Fanta");
        small_pet_fanta.add("200 naira Small P. Fanta(2)");
        small_pet_fanta.add("300 naira Small P. Fanta(3)");
        small_pet_fanta.add("400 naira Small P. Fanta(4)");
        small_pet_fanta.add("500 naira Small P. Fanta(5)");
        small_pet_fanta.add("600 naira Small P. Fanta(6)");
        prices.put("Small Pet Fanta", small_pet_fanta);

        JSONArray big_pet_fanta = new JSONArray();
        big_pet_fanta.add("150 naira Big P. Fanta");
        big_pet_fanta.add("300 naira Big P. Fanta(2)");
        big_pet_fanta.add("450 naira Big P. Fanta(3)");
        big_pet_fanta.add("600 naira Big P. Fanta(4)");
        big_pet_fanta.add("750 naira Big P. Fanta(5)");
        big_pet_fanta.add("900 naira Big P. Fanta(6)");
        prices.put("Big Pet Fanta", big_pet_fanta);

        JSONArray sachet_water = new JSONArray();
        sachet_water.add("5 naira Pure Water");
        sachet_water.add("10 naira Pure Water(2)");
        sachet_water.add("15 naira Pure Water(3)");
        sachet_water.add("20 naira Pure Water(4)");
        sachet_water.add("25 naira Pure Water(5)");
        sachet_water.add("30 naira Pure Water(6)");
        prices.put("Sachet Water", sachet_water);

        JSONArray pet_water = new JSONArray();
        pet_water.add("50 naira Bottle Water");
        pet_water.add("100 naira Bottle Water(2)");
        pet_water.add("150 naira Bottle Water(3)");
        pet_water.add("200 naira Bottle Water(4)");
        pet_water.add("250 naira Bottle Water(5)");
        pet_water.add("300 naira Bottle Water(6)");
        prices.put("Pet Water", pet_water);

        JSONArray can_maltagold = new JSONArray();
        can_maltagold.add("150 naira C. MaltaGold");
        can_maltagold.add("300 naira C. MaltaGold(2)");
        can_maltagold.add("450 naira C. MaltaGold(3)");
        can_maltagold.add("600 naira C. MaltaGold(4)");
        can_maltagold.add("750 naira C. MaltaGold(5)");
        can_maltagold.add("900 naira C. MaltaGold(6)");
        prices.put("Can MaltaGold", can_maltagold);

        JSONArray can_maltina = new JSONArray();
        can_maltina.add("150 naira C. Maltina");
        can_maltina.add("300 naira C. Maltina(2)");
        can_maltina.add("450 naira C. Maltina(3)");
        can_maltina.add("600 naira C. Maltina(4)");
        can_maltina.add("750 naira C. Maltina(5)");
        can_maltina.add("900 naira C. Maltina(6)");
        prices.put("Can Maltina", can_maltina);

        JSONArray can_himalt = new JSONArray();
        can_himalt.add("150 naira C. Himalt");
        can_himalt.add("300 naira C. Himalt(2)");
        can_himalt.add("450 naira C. Himalt(3)");
        can_himalt.add("600 naira C. Himalt(4)");
        can_himalt.add("750 naira C. Himalt(5)");
        can_himalt.add("900 naira C. Himalt(6)");
        prices.put("Can Himalt", can_himalt);

        JSONArray can_maltaguinness = new JSONArray();
        can_maltaguinness.add("150 naira C. MaltaGuinness");
        can_maltaguinness.add("300 naira C. MaltaGuinness(2)");
        can_maltaguinness.add("450 naira C. MaltaGuinness(3)");
        can_maltaguinness.add("600 naira C. MaltaGuinness(4)");
        can_maltaguinness.add("750 naira C. MaltaGuinness(5)");
        can_maltaguinness.add("900 naira C. MaltaGuinness(6)");
        prices.put("Can MaltaGuinness", can_maltaguinness);

        JSONArray fivealive_juice = new JSONArray();
        fivealive_juice.add("500 naira 5Alive Juice");
        fivealive_juice.add("1000 naira 5Alive Juice(2)");
        fivealive_juice.add("1500 naira 5Alive Juice(3)");
        fivealive_juice.add("2000 naira 5Alive Juice(4)");
        fivealive_juice.add("2500 naira 5Alive Juice(5)");
        fivealive_juice.add("3000 naira 5Alive Juice(6)");
        prices.put("5Alive Juice", fivealive_juice);

        JSONArray small_hollandia_juice = new JSONArray();
        small_hollandia_juice.add("300 naira Small Hollandia Juice");
        small_hollandia_juice.add("600 naira Small Hollandia Juice(2)");
        small_hollandia_juice.add("900 naira Small Hollandia Juice(3)");
        small_hollandia_juice.add("1200 naira Small Hollandia Juice(4)");
        small_hollandia_juice.add("1500 naira Small Hollandia Juice(5)");
        small_hollandia_juice.add("1800 naira Small Hollandia Juice(6)");
        prices.put("Small Hollandia Juice", small_hollandia_juice);

        JSONArray big_hollandia_juice = new JSONArray();
        big_hollandia_juice.add("500 naira Big Hollandia Juice");
        big_hollandia_juice.add("1000 naira Big Hollandia Juice(2)");
        big_hollandia_juice.add("1500 naira Big Hollandia Juice(3)");
        big_hollandia_juice.add("2000 naira Big Hollandia Juice(4)");
        big_hollandia_juice.add("2500 naira Big Hollandia Juice(5)");
        big_hollandia_juice.add("3000 naira Big Hollandia Juice(6)");
        prices.put("Big Hollandia Juice", big_hollandia_juice);

        JSONArray small_chiexotic_juice = new JSONArray();
        small_chiexotic_juice.add("300 naira Small ChiExotic Juice");
        small_chiexotic_juice.add("600 naira Small ChiExotic Juice(2)");
        small_chiexotic_juice.add("900 naira Small ChiExotic Juice(3)");
        small_chiexotic_juice.add("1200 naira Small ChiExotic Juice(4)");
        small_chiexotic_juice.add("1500 naira Small ChiExotic Juice(5)");
        small_chiexotic_juice.add("1800 naira Small ChiExotic Juice(6)");
        prices.put("Small ChiExotic Juice", small_chiexotic_juice);

        JSONArray big_chiexotic_juice = new JSONArray();
        big_chiexotic_juice.add("500 naira Big ChiExotic Juice");
        big_chiexotic_juice.add("1000 naira Big ChiExotic Juice(2)");
        big_chiexotic_juice.add("1500 naira Big ChiExotic Juice(3)");
        big_chiexotic_juice.add("2000 naira Big ChiExotic Juice(4)");
        big_chiexotic_juice.add("2500 naira Big ChiExotic Juice(5)");
        big_chiexotic_juice.add("3000 naira Big ChiExotic Juice(6)");
        prices.put("Big ChiExotic Juice", big_chiexotic_juice);

        JSONArray small_chivita_juice = new JSONArray();
        small_chivita_juice.add("300 naira Small Chivita Juice");
        small_chivita_juice.add("600 naira Small Chivita Juice(2)");
        small_chivita_juice.add("900 naira Small Chivita Juice(3)");
        small_chivita_juice.add("1200 naira Small Chivita Juice(4)");
        small_chivita_juice.add("1500 naira Small Chivita Juice(5)");
        small_chivita_juice.add("1800 naira Small Chivita Juice(6)");
        prices.put("Small Chivita Juice", small_chivita_juice);

        JSONArray big_chivita_juice = new JSONArray();
        big_chivita_juice.add("500 naira Big Chivita Juice");
        big_chivita_juice.add("1000 naira Big Chivita Juice(2)");
        big_chivita_juice.add("1500 naira Big Chivita Juice(3)");
        big_chivita_juice.add("2000 naira Big Chivita Juice(4)");
        big_chivita_juice.add("2500 naira Big Chivita Juice(5)");
        big_chivita_juice.add("3000 naira Big Chivita Juice(6)");
        prices.put("Big Chivita Juice", big_chivita_juice);

        JSONArray small_happyhour_juice = new JSONArray();
        small_happyhour_juice.add("300 naira Small HappyHour Juice");
        small_happyhour_juice.add("600 naira Small HappyHour Juice(2)");
        small_happyhour_juice.add("900 naira Small HappyHour Juice(3)");
        small_happyhour_juice.add("1200 naira Small HappyHour Juice(4)");
        small_happyhour_juice.add("1500 naira Small HappyHour Juice(5)");
        small_happyhour_juice.add("2000 naira Small HappyHour Juice(6)");
        prices.put("Small HappyHour Juice", small_happyhour_juice);

        JSONArray big_happyhour_juice = new JSONArray();
        big_happyhour_juice.add("500 naira Big HappyHour Juice");
        big_happyhour_juice.add("1000 naira Big HappyHour Juice(2)");
        big_happyhour_juice.add("1500 naira Big HappyHour Juice(3)");
        big_happyhour_juice.add("2000 naira Big HappyHour Juice(4)");
        big_happyhour_juice.add("2500 naira Big HappyHour Juice(5)");
        big_happyhour_juice.add("3000 naira Big HappyHour Juice(6)");
        prices.put("Big HappyHour Juice", big_happyhour_juice);

        JSONArray small_glass_schweppes = new JSONArray();
        small_glass_schweppes.add("80 naira Small G. Schweppes");
        small_glass_schweppes.add("160 naira Small G. Schweppes(2)");
        small_glass_schweppes.add("240 naira Small G. Schweppes(3)");
        small_glass_schweppes.add("320 naira Small G. Schweppes(4)");
        small_glass_schweppes.add("400 naira Small G. Schweppes(5)");
        small_glass_schweppes.add("480 naira Small G. Schweppes(6)");
        prices.put("Small Glass Schweppes", small_glass_schweppes);

        JSONArray big_glass_schweppes = new JSONArray();
        big_glass_schweppes.add("100 naira Big G. Schweppes");
        big_glass_schweppes.add("200 naira Big G. Schweppes(2)");
        big_glass_schweppes.add("300 naira Big G. Schweppes(3)");
        big_glass_schweppes.add("400 naira Big G. Schweppes(4)");
        big_glass_schweppes.add("500 naira Big G. Schweppes(5)");
        big_glass_schweppes.add("600 naira Big G. Schweppes(6)");
        prices.put("Big Glass Schweppes", big_glass_schweppes);

        JSONArray pet_schweppes = new JSONArray();
        pet_schweppes.add("150 naira Pet Schweppes");
        pet_schweppes.add("300 naira Pet Schweppes(2)");
        pet_schweppes.add("450 naira Pet Schweppes(3)");
        pet_schweppes.add("600 naira Pet Schweppes(4)");
        pet_schweppes.add("750 naira Pet Schweppes(5)");
        pet_schweppes.add("900 naira Pet Schweppes(6)");
        prices.put("Pet Schweppes", pet_schweppes);



    }

    public static LucidApplication getInstance(){
        return instance;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

}