package com.icdatofcusgmail.luciddrinks.DrinksActivityArchive;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.icdatofcusgmail.luciddrinks.LucidApplication;
import com.icdatofcusgmail.luciddrinks.R;

import static com.icdatofcusgmail.luciddrinks.LucidApplication.*;

/**
 * Created by DAVID OGUNDEPO on 07/16/2017.
 *
 */

public class ChosenplateCounter extends Fragment {

    public static int balance_exceeded_checker, items_been_selected;
    public static TextView feetag;

    Spinner spinner;
    TextView textView, textView2nd, textView3rd, textView4th, textView5th, textView6th, textView7th, textView8th, textView9th, textView10th, textView11th, textView12th, textView13th, textView14th, textView15th, textView16th, textView17th, textView18th, textView19th, textView20th, textView21st, textView22nd, textView23rd, textView24th, textView25th, textView26th, textView27th, textView28th, textView29th, textView30th, textView31st, textView32nd, textView33rd, textView34th, textView35th, textView36th, textView37th, textView38th, textView39th, textView40th, textView41st, textView42nd, textView43rd;
    Button button, button2, button3, button4, button5, button6;

    LucidApplication app;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.drinkmenufragment5_chosenplate_counter, container, false);

        app = LucidApplication.getInstance();

//        textView = (Button) view.findViewById(R.id.Istchosenbutton);
//        textView2nd = (Button) view.findViewById(R.id.Secondchosenbutton);
//        textView3rd = (Button) view.findViewById(R.id.Thirdchosenbutton);
//        textView4th = (Button) view.findViewById(R.id.Fourthchosenbutton);
//        textView5th = (Button) view.findViewById(R.id.Fifthchosenbutton);
//        textView6th = (Button) view.findViewById(R.id.Sixthchosenbutton);
//        textView7th = (Button) view.findViewById(R.id.Seventhchosenbutton);
//        textView8th = (Button) view.findViewById(R.id.Eightchosenbutton);
//        textView9th = (Button) view.findViewById(R.id.Ninthchosenbutton);
//        textView10th = (Button) view.findViewById(R.id.Tenthchosenbutton);
//        textView11th = (Button) view.findViewById(R.id.Eleventhchosenbutton);
//        textView12th = (Button) view.findViewById(R.id.Twelvthchosenbutton);
//        textView13th = (Button) view.findViewById(R.id.Thirteenthchosenbutton);
//        textView14th = (Button) view.findViewById(R.id.Fourteenthchosenbutton);
//        textView15th = (Button) view.findViewById(R.id.Fifteenthchosenbutton);
//        textView16th = (Button) view.findViewById(R.id.Sixteenthchosenbutton);
//        textView17th = (Button) view.findViewById(R.id.Seventeenthchosenbutton);
//        textView18th = (Button) view.findViewById(R.id.Eighteenthchosenbutton);
//        textView19th = (Button) view.findViewById(R.id.Nineteenthchosenbutton);
//        textView20th = (Button) view.findViewById(R.id.Twentiethchosenbutton);
//        textView21st = (Button) view.findViewById(R.id.TwentyIstchosenbutton);
//        textView22nd = (Button) view.findViewById(R.id.TwentySecondchosenbutton);
//        textView23rd = (Button) view.findViewById(R.id.TwentyThirdchosenbutton);
//        textView24th = (Button) view.findViewById(R.id.TwentyFourthchosenbutton);
//        textView25th = (Button) view.findViewById(R.id.TwentyFifthchosenbutton);
//        textView26th = (Button) view.findViewById(R.id.TwentySixthchosenbutton);
//        textView27th = (Button) view.findViewById(R.id.TwentySeventhchosenbutton);
//        textView28th = (Button) view.findViewById(R.id.TwentyEightchosenbutton);
//        textView29th = (Button) view.findViewById(R.id.TwentyNinthchosenbutton);
//        textView30th = (Button) view.findViewById(R.id.Thirtiethchosenbutton);
//        textView31st = (Button) view.findViewById(R.id.ThirtyIstchosenbutton);
//        textView32nd = (Button) view.findViewById(R.id.ThirtySecondchosenbutton);
//        textView33rd = (Button) view.findViewById(R.id.ThirtyThirdchosenbutton);
//        textView34th = (Button) view.findViewById(R.id.ThirtyFourthchosenbutton);
//        textView35th = (Button) view.findViewById(R.id.ThirtyFifthchosenbutton);
//        textView36th = (Button) view.findViewById(R.id.ThirtySixthchosenbutton);
//        textView37th = (Button) view.findViewById(R.id.ThirtySeventhchosenbutton);
//        textView38th = (Button) view.findViewById(R.id.ThirtyEighthchosenbutton);
//        textView39th = (Button) view.findViewById(R.id.ThirtyNinthchosenbutton);
//        textView40th = (Button) view.findViewById(R.id.Fourtiethchosenbutton);
//        textView41st = (Button) view.findViewById(R.id.FourtyOnechosenbutton);
//        textView42nd = (Button) view.findViewById(R.id.FourtyTwochosenbutton);
//        textView43rd = (Button) view.findViewById(R.id.FourtyThreechosenbutton);

        return view;
    }

    public void updatePrice(String deductPrice) {

        int cve = Integer.parseInt(deductPrice.substring(0, deductPrice.indexOf(" n")));
        app.allinfoodcounter = app.allinfoodcounter - cve;
        feetag.setText("" + app.allinfoodcounter + "");

        DrinksmenuActivity.Pcount.setText("" + "PLATE COUNT" + "");
    }

    public void updateInfo(String price) {

        button = (Button) getActivity().findViewById(R.id.Istpricebutton);
        button2 = (Button) getActivity().findViewById(R.id.Secondpricebutton);
        button3 = (Button) getActivity().findViewById(R.id.Thirdpricebutton);
        button4 = (Button) getActivity().findViewById(R.id.Fourthpricebutton);
        button5 = (Button) getActivity().findViewById(R.id.Fifthpricebutton);
        button6 = (Button) getActivity().findViewById(R.id.Sixthpricebutton);

        feetag = (TextView) getActivity().findViewById(R.id.counter);

        feetag.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int feetag, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int feetag) {

            }

            @Override
            public void afterTextChanged(Editable s) {



                /* <!-- Please note the below strictly requires HighSea for for crashesAdmiNes --!> */ //i.e light

                try {
                    Bundle bundle = getActivity().getIntent().getExtras();
                    items_been_selected = Integer.parseInt(String.valueOf(s));
                    balance_exceeded_checker = Integer.parseInt(String.valueOf(bundle.getString("accountbalance")));

                    if (items_been_selected > balance_exceeded_checker) {
                        feetag.setTextColor(Color.parseColor("#B71C1C"));
                    } else if (items_been_selected < balance_exceeded_checker) {
                        feetag.setTextColor(Color.parseColor("#000000"));
                    } else if (items_been_selected == balance_exceeded_checker) {
                        feetag.setTextColor(Color.parseColor("#303F9F"));
                    }
                } catch (Exception ignored) {

                }
            }
        });



        if (price.contentEquals("150 naira C. Mirinda")) {
            FirstString = button.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinfoodcounter = app.allinfoodcounter + parseOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("0", "150 naira C. Mirinda");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "150 naira C. Mirinda");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FirstSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira C. Mirinda(2)")) {
            FirstString = button2.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinfoodcounter = app.allinfoodcounter + parseOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("0", "300 naira C. Mirinda(2)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "300 naira C. Mirinda(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FirstSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("450 naira C. Mirinda(3)")) {
            FirstString = button3.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinfoodcounter = app.allinfoodcounter + parseOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("0", "450 naira C. Mirinda(3)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "450 naira C. Mirinda(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FirstSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira C. Mirinda(4)")) {
            FirstString = button4.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinfoodcounter = app.allinfoodcounter + parseOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("0", "600 naira C. Mirinda(4)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "600 naira C. Mirinda(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FirstSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("750 naira C. Mirinda(5)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinfoodcounter = app.allinfoodcounter + parseOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("0", "750 naira C. Mirinda(5)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "750 naira C. Mirinda(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FirstSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("900 naira C. Mirinda(6)")) {
//            FirstString = button6.getText().toString();
//            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
//            parseOne = Integer.parseInt(FirstSubString);
//            if (!app.prev.containsKey("0")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseOne;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("0", "900 naira C. Mirinda(6)");
//            } else {
//                String val = app.prev.get("0");
//                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(FirstSubString) != parseOne) {
//                    app.prev.remove("0");
//                    app.prev.put("0", "900 naira C. Mirinda(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FirstSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseOne;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//
//        }

        if (price.contentEquals("80 naira G. Mirinda")) {
            SecondString = button.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("1", "80 naira G. Mirinda");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "80 naira G. Mirinda");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SecondSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("160 naira G. Mirinda(2)")) {
            SecondString = button2.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("1", "160 naira G. Mirinda(2)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "160 naira G. Mirinda(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SecondSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("240 naira G. Mirinda(3)")) {
            SecondString = button3.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("1", "240 naira G. Mirinda(3)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "240 naira G. Mirinda(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SecondSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("320 naira G. Mirinda(4)")) {
            SecondString = button4.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("1", "320 naira G. Mirinda(4)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "320 naira G. Mirinda(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SecondSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira G. Mirinda(5)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("1", "400 naira G. Mirinda(5)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "400 naira G. Mirinda(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SecondSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("480 naira G. Mirinda(6)")) {
//            SecondString = button6.getText().toString();
//            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
//            parseTwo = Integer.parseInt(SecondSubString);
//            if (!app.prev.containsKey("1")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseTwo;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("1", "480 naira G. Mirinda(6)");
//            } else {
//                String val = app.prev.get("1");
//                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(SecondSubString) != parseTwo) {
//                    app.prev.remove("1");
//                    app.prev.put("1", "480 naira G. Mirinda(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SecondSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseTwo;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("100 naira Pet Mirinda")) {
            ThirdString = button.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("2", "100 naira Pet Mirinda");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "100 naira Pet Mirinda");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirdSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 naira Pet Mirinda(2)")) {
            ThirdString = button2.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("2", "200 naira Pet Mirinda(2)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "200 naira Pet Mirinda(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirdSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }


        } else if (price.contentEquals("300 naira Pet Mirinda(3)")) {
            ThirdString = button3.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("2", "300 naira Pet Mirinda(3)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "300 naira Pet Mirinda(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirdSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Pet Mirinda(4)")) {
            ThirdString = button4.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("2", "400 naira Pet Mirinda(4)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "400 naira Pet Mirinda(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirdSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 naira Pet Mirinda(5)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("2", "500 naira Pet Mirinda(5)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "500 naira Pet Mirinda(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirdSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("600 naira Pet Mirinda(6)")) {
//            ThirdString = button6.getText().toString();
//            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
//            parseThree = Integer.parseInt(ThirdSubString);
//            if (!app.prev.containsKey("2")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseThree;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("2", "600 naira Pet Mirinda(6)");
//            } else {
//                String val = app.prev.get("2");
//                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(ThirdSubString) != parseThree) {
//                    app.prev.remove("2");
//                    app.prev.put("2", "600 naira Pet Mirinda(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirdSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseThree;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("150 naira Can Pepsi")) {
            FourthString = button.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("3", "150 naira Can Pepsi");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "150 naira Can Pepsi");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira Can Pepsi(2)")) {
            FourthString = button2.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("3", "300 naira Can Pepsi(2)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "300 naira Can Pepsi(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("450 naira Can Pepsi(3)")) {
            FourthString = button3.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("3", "450 naira Can Pepsi(3)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "450 naira Can Pepsi(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira Can Pepsi(4)")) {
            FourthString = button4.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("3", "600 naira Can Pepsi(4)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "600 naira Can Pepsi(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("750 naira Can Pepsi(5)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("3", "750 naira Can Pepsi(5)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "750 naira Can Pepsi(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("900 naira Can Pepsi(6)")) {
//            FourthString = button6.getText().toString();
//            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
//            parseFour = Integer.parseInt(FourthSubString);
//            if (!app.prev.containsKey("3")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseFour;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("3", "900 naira Can Pepsi(6)");
//            } else {
//                String val = app.prev.get("3");
//                FourthSubString = val.substring(0, val.indexOf("n")).trim();
//
//                if (Integer.parseInt(FourthSubString) != parseFour) {
//                    app.prev.remove("3");
//                    app.prev.put("3", "900 naira Can Pepsi(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourthSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseFour;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }


        if (price.contentEquals("80 naira Glass Pepsi")) {
            FifthString = button.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFive;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("4", "80 naira Glass Pepsi");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "80 naira Glass Pepsi");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("160 naira Glass Pepsi(2)")) {
            FifthString = button2.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFive;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("4", "160 naira Glass Pepsi(2)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "160 naira Glass Pepsi(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("240 naira Glass Pepsi(3)")) {
            FifthString = button3.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFive;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("4", "240 naira Glass Pepsi(3)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "240 naira Glass Pepsi(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("320 naira Glass Pepsi(4)")) {
            FifthString = button4.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFive;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("4", "320 naira Glass Pepsi(4)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "320 naira Glass Pepsi(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Glass Pepsi(5)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFive;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("4", "400 naira Glass Pepsi(5)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "400 naira Glass Pepsi(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("480 naira Glass Pepsi(6)")) {
//            FifthString = button6.getText().toString();
//            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
//            parseFive = Integer.parseInt(FifthSubString);
//            if (!app.prev.containsKey("4")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseFive;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("4", "480 naira Glass Pepsi(6)");
//            } else {
//                String val = app.prev.get("4");
//                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(FifthSubString) != parseFive) {
//                    app.prev.remove("4");
//                    app.prev.put("4", "480 naira Glass Pepsi(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifthSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseFive;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//
//        }

        if (price.contentEquals("100 naira Pet Pepsi")) {
            SixthString = button.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSix;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("5", "100 naira Pet Pepsi");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "100 naira Pet Pepsi");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSix;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 naira Pet Pepsi(2)")) {
            SixthString = button2.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSix;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("5", "200 naira Pet Pepsi(2)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "200 naira Pet Pepsi(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSix;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira Pet Pepsi(3)")) {
            SixthString = button3.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSix;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("5", "300 naira Pet Pepsi(3)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "300 naira Pet Pepsi(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSix;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Pet Pepsi(4)")) {
            SixthString = button4.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSix;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("5", "400 naira Pet Pepsi(4)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "400 naira Pet Pepsi(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSix;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 naira Pet Pepsi(5)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSix;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("5", "500 naira Pet Pepsi(5)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "500 naira Pet Pepsi(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSix;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("600 naira Pet Pepsi(6)")) {
//            SixthString = button6.getText().toString();
//            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
//            parseSix = Integer.parseInt(SixthSubString);
//            if (!app.prev.containsKey("5")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseSix;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("5", "600 naira Pet Pepsi(6)");
//            } else {
//                String val = app.prev.get("5");
//                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(SixthSubString) != parseSix) {
//                    app.prev.remove("5");
//                    app.prev.put("5", "600 naira Pet Pepsi(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixthSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseSix;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("150 naira C. Savanna")) {
            SeventhString = button.getText().toString();
            SeventhSubString = SeventhString.substring(SeventhString.indexOf(""), SeventhString.indexOf(" "));
            parseSeven = Integer.parseInt(SeventhSubString);
            if (!app.prev.containsKey("6")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("6", "150 naira C. Savanna");
            } else {
                String val = app.prev.get("6");
                SeventhSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SeventhSubString) != parseSeven) {
                    app.prev.remove("6");
                    app.prev.put("6", "150 naira C. Savanna");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventhSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira C. Savanna(2)")) {
            SeventhString = button2.getText().toString();
            SeventhSubString = SeventhString.substring(SeventhString.indexOf(""), SeventhString.indexOf(" "));
            parseSeven = Integer.parseInt(SeventhSubString);
            if (!app.prev.containsKey("6")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("6", "300 naira C. Savanna(2)");
            } else {
                String val = app.prev.get("6");
                SeventhSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SeventhSubString) != parseSeven) {
                    app.prev.remove("6");
                    app.prev.put("6", "300 naira C. Savanna(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventhSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }


        } else if (price.contentEquals("450 naira C. Savanna(3)")) {
            SeventhString = button3.getText().toString();
            SeventhSubString = SeventhString.substring(SeventhString.indexOf(""), SeventhString.indexOf(" "));
            parseSeven = Integer.parseInt(SeventhSubString);
            if (!app.prev.containsKey("6")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("6", "450 naira C. Savanna(3)");
            } else {
                String val = app.prev.get("6");
                SeventhSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SeventhSubString) != parseSeven) {
                    app.prev.remove("6");
                    app.prev.put("6", "450 naira C. Savanna(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventhSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira C. Savanna(4)")) {
            SeventhString = button4.getText().toString();
            SeventhSubString = SeventhString.substring(SeventhString.indexOf(""), SeventhString.indexOf(" "));
            parseSeven = Integer.parseInt(SeventhSubString);
            if (!app.prev.containsKey("6")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("6", "600 naira C. Savanna(4)");
            } else {
                String val = app.prev.get("6");
                SeventhSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SeventhSubString) != parseSeven) {
                    app.prev.remove("6");
                    app.prev.put("6", "600 naira C. Savanna(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventhSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("750 naira C. Savanna(5)")) {
            SeventhString = button5.getText().toString();
            SeventhSubString = SeventhString.substring(SeventhString.indexOf(""), SeventhString.indexOf(" "));
            parseSeven = Integer.parseInt(SeventhSubString);
            if (!app.prev.containsKey("6")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("6", "750 naira C. Savanna(5)");
            } else {
                String val = app.prev.get("6");
                SeventhSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SeventhSubString) != parseSeven) {
                    app.prev.remove("6");
                    app.prev.put("6", "750 naira C. Savanna(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventhSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("900 naira C. Savanna(6)")) {
//            SeventhString = button6.getText().toString();
//            SeventhSubString = SeventhString.substring(SeventhString.indexOf(""), SeventhString.indexOf(" "));
//            parseSeven = Integer.parseInt(SeventhSubString);
//            if (!app.prev.containsKey("6")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseSeven;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("6", "900 naira C. Savanna(6)");
//            } else {
//                String val = app.prev.get("6");
//                SeventhSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(SeventhSubString) != parseSeven) {
//                    app.prev.remove("6");
//                    app.prev.put("6", "900 naira C. Savanna(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventhSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseSeven;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("100 naira P. Savanna")) {
            EighthString = button.getText().toString();
            EighthSubString = EighthString.substring(EighthString.indexOf(""), EighthString.indexOf(" "));
            parseEight = Integer.parseInt(EighthSubString);
            if (!app.prev.containsKey("7")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEight;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("7", "100 naira P. Savanna");
            } else {
                String val = app.prev.get("7");
                EighthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(EighthSubString) != parseEight) {
                    app.prev.remove("7");
                    app.prev.put("7", "100 naira P. Savanna");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 naira P. Savanna(2)")) {
            EighthString = button2.getText().toString();
            EighthSubString = EighthString.substring(EighthString.indexOf(""), EighthString.indexOf(" "));
            parseEight = Integer.parseInt(EighthSubString);
            if (!app.prev.containsKey("7")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEight;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("7", "200 naira P. Savanna(2)");
            } else {
                String val = app.prev.get("7");
                EighthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(EighthSubString) != parseEight) {
                    app.prev.remove("7");
                    app.prev.put("7", "200 naira P. Savanna(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }


        } else if (price.contentEquals("300 naira P. Savanna(3)")) {
            EighthString = button3.getText().toString();
            EighthSubString = EighthString.substring(EighthString.indexOf(""), EighthString.indexOf(" "));
            parseEight = Integer.parseInt(EighthSubString);
            if (!app.prev.containsKey("7")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEight;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("7", "300 naira P. Savanna(3)");
            } else {
                String val = app.prev.get("7");
                EighthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(EighthSubString) != parseEight) {
                    app.prev.remove("7");
                    app.prev.put("7", "300 naira P. Savanna(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira P. Savanna(4)")) {
            EighthString = button4.getText().toString();
            EighthSubString = EighthString.substring(EighthString.indexOf(""), EighthString.indexOf(" "));
            parseEight = Integer.parseInt(EighthSubString);
            if (!app.prev.containsKey("7")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEight;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("7", "400 naira P. Savanna(4)");
            } else {
                String val = app.prev.get("7");
                EighthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(EighthSubString) != parseEight) {
                    app.prev.remove("7");
                    app.prev.put("7", "400 naira P. Savanna(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 naira P. Savanna(5)")) {
            EighthString = button5.getText().toString();
            EighthSubString = EighthString.substring(EighthString.indexOf(""), EighthString.indexOf(" "));
            parseEight = Integer.parseInt(EighthSubString);
            if (!app.prev.containsKey("7")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEight;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("7", "500 naira P. Savanna(5)");
            } else {
                String val = app.prev.get("7");
                EighthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(EighthSubString) != parseEight) {
                    app.prev.remove("7");
                    app.prev.put("7", "500 naira P. Savanna(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("600 naira P. Savanna(6)")) {
//            EighthString = button6.getText().toString();
//            EighthSubString = EighthString.substring(EighthString.indexOf(""), EighthString.indexOf(" "));
//            parseEight = Integer.parseInt(EighthSubString);
//            if (!app.prev.containsKey("7")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseEight;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("7", "600 naira P. Savanna(6)");
//            } else {
//                String val = app.prev.get("7");
//                EighthSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(EighthSubString) != parseEight) {
//                    app.prev.remove("7");
//                    app.prev.put("7", "600 naira P. Savanna(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighthSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseEight;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("150 naira C. SevenUp")) {
            NinthString = button.getText().toString();
            NinthSubString = NinthString.substring(NinthString.indexOf(""), NinthString.indexOf(" "));
            parseNine = Integer.parseInt(NinthSubString);
            if (!app.prev.containsKey("8")) {
                app.allinfoodcounter = app.allinfoodcounter + parseNine;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("8", "150 naira C. SevenUp");
            } else {
                String val = app.prev.get("8");
                NinthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(NinthSubString) != parseNine) {
                    app.prev.remove("8");
                    app.prev.put("8", "150 naira C. SevenUp");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NinthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira C. SevenUp(2)")) {
            NinthString = button2.getText().toString();
            NinthSubString = NinthString.substring(NinthString.indexOf(""), NinthString.indexOf(" "));
            parseNine = Integer.parseInt(NinthSubString);
            if (!app.prev.containsKey("8")) {
                app.allinfoodcounter = app.allinfoodcounter + parseNine;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("8", "300 naira C. SevenUp(2)");
            } else {
                String val = app.prev.get("8");
                NinthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(NinthSubString) != parseNine) {
                    app.prev.remove("8");
                    app.prev.put("8", "300 naira C. SevenUp(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NinthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("450 naira C. SevenUp(3)")) {
            NinthString = button3.getText().toString();
            NinthSubString = NinthString.substring(NinthString.indexOf(""), NinthString.indexOf(" "));
            parseNine = Integer.parseInt(NinthSubString);
            if (!app.prev.containsKey("8")) {
                app.allinfoodcounter = app.allinfoodcounter + parseNine;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("8", "450 naira C. SevenUp(3)");
            } else {
                String val = app.prev.get("8");
                NinthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(NinthSubString) != parseNine) {
                    app.prev.remove("8");
                    app.prev.put("8", "450 naira C. SevenUp(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NinthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira C. SevenUp(4)")) {
            NinthString = button4.getText().toString();
            NinthSubString = NinthString.substring(NinthString.indexOf(""), NinthString.indexOf(" "));
            parseNine = Integer.parseInt(NinthSubString);
            if (!app.prev.containsKey("8")) {
                app.allinfoodcounter = app.allinfoodcounter + parseNine;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("8", "600 naira C. SevenUp(4)");
            } else {
                String val = app.prev.get("8");
                NinthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(NinthSubString) != parseNine) {
                    app.prev.remove("8");
                    app.prev.put("8", "600 naira C. SevenUp(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NinthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("750 naira C. SevenUp(5)")) {
            NinthString = button5.getText().toString();
            NinthSubString = NinthString.substring(NinthString.indexOf(""), NinthString.indexOf(" "));
            parseNine = Integer.parseInt(NinthSubString);
            if (!app.prev.containsKey("8")) {
                app.allinfoodcounter = app.allinfoodcounter + parseNine;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("8", "750 naira C. SevenUp(5)");
            } else {
                String val = app.prev.get("8");
                NinthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(NinthSubString) != parseNine) {
                    app.prev.remove("8");
                    app.prev.put("8", "750 naira C. SevenUp(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NinthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("900 naira C. SevenUp(6)")) {
//            NinthString = button6.getText().toString();
//            NinthSubString = NinthString.substring(NinthString.indexOf(""), NinthString.indexOf(" "));
//            parseNine = Integer.parseInt(NinthSubString);
//            if (!app.prev.containsKey("8")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseNine;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("8", "900 naira C. SevenUp(6)");
//            } else {
//                String val = app.prev.get("8");
//                NinthSubString = val.substring(0, val.indexOf("n")).trim();
//
//                if (Integer.parseInt(NinthSubString) != parseNine) {
//                    app.prev.remove("8");
//                    app.prev.put("8", "900 naira C. SevenUp(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NinthSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseNine;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("80 naira G. SevenUp")) {
            TenthString = button.getText().toString();
            TenthSubString = TenthString.substring(TenthString.indexOf(""), TenthString.indexOf(" "));
            parseTen = Integer.parseInt(TenthSubString);
            if (!app.prev.containsKey("9")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("9", "80 naira G. SevenUp");
            } else {
                String val = app.prev.get("9");
                TenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TenthSubString) != parseTen) {
                    app.prev.remove("9");
                    app.prev.put("9", "80 naira G. SevenUp");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("160 naira G. SevenUp(2)")) {
            TenthString = button2.getText().toString();
            TenthSubString = TenthString.substring(TenthString.indexOf(""), TenthString.indexOf(" "));
            parseTen = Integer.parseInt(TenthSubString);
            if (!app.prev.containsKey("9")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("9", "160 naira G. SevenUp(2)");
            } else {
                String val = app.prev.get("9");
                TenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TenthSubString) != parseTen) {
                    app.prev.remove("9");
                    app.prev.put("9", "160 naira G. SevenUp(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }


        } else if (price.contentEquals("240 naira G. SevenUp(3)")) {
            TenthString = button3.getText().toString();
            TenthSubString = TenthString.substring(TenthString.indexOf(""), TenthString.indexOf(" "));
            parseTen = Integer.parseInt(TenthSubString);
            if (!app.prev.containsKey("9")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("9", "240 naira G. SevenUp(3)");
            } else {
                String val = app.prev.get("9");
                TenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TenthSubString) != parseTen) {
                    app.prev.remove("9");
                    app.prev.put("9", "240 naira G. SevenUp(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("320 naira G. SevenUp(4)")) {
            TenthString = button4.getText().toString();
            TenthSubString = TenthString.substring(TenthString.indexOf(""), TenthString.indexOf(" "));
            parseTen = Integer.parseInt(TenthSubString);
            if (!app.prev.containsKey("9")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("9", "320 naira G. SevenUp(4)");
            } else {
                String val = app.prev.get("9");
                TenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TenthSubString) != parseTen) {
                    app.prev.remove("9");
                    app.prev.put("9", "320 naira G. SevenUp(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira G. SevenUp(5)")) {
            TenthString = button5.getText().toString();
            TenthSubString = TenthString.substring(TenthString.indexOf(""), TenthString.indexOf(" "));
            parseTen = Integer.parseInt(TenthSubString);
            if (!app.prev.containsKey("9")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("9", "400 naira G. SevenUp(5)");
            } else {
                String val = app.prev.get("9");
                TenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TenthSubString) != parseTen) {
                    app.prev.remove("9");
                    app.prev.put("9", "400 naira G. SevenUp(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("480 naira G. SevenUp(6)")) {
//            TenthString = button6.getText().toString();
//            TenthSubString = TenthString.substring(TenthString.indexOf(""), TenthString.indexOf(" "));
//            parseTen = Integer.parseInt(TenthSubString);
//            if (!app.prev.containsKey("9")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseTen;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("9", "480 naira G. SevenUp(6)");
//            } else {
//                String val = app.prev.get("9");
//                TenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(TenthSubString) != parseTen) {
//                    app.prev.remove("9");
//                    app.prev.put("9", "480 naira G. SevenUp(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TenthSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseTen;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("100 naira P. SevenUp")) {
            ElevenString = button.getText().toString();
            EleventhSubString = ElevenString.substring(ElevenString.indexOf(""), ElevenString.indexOf(" "));
            parseEleven = Integer.parseInt(EleventhSubString);
            if (!app.prev.containsKey("10")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("10", "100 naira P. SevenUp");
            } else {
                String val = app.prev.get("10");
                EleventhSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(EleventhSubString) != parseEleven) {
                    app.prev.remove("10");
                    app.prev.put("10", "100 naira P. SevenUp");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EleventhSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 naira P. SevenUp(2)")) {
            ElevenString = button2.getText().toString();
            EleventhSubString = ElevenString.substring(ElevenString.indexOf(""), ElevenString.indexOf(" "));
            parseEleven = Integer.parseInt(EleventhSubString);
            if (!app.prev.containsKey("10")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("10", "200 naira P. SevenUp(2)");
            } else {
                String val = app.prev.get("10");
                EleventhSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(EleventhSubString) != parseEleven) {
                    app.prev.remove("10");
                    app.prev.put("10", "200 naira P. SevenUp(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EleventhSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira P. SevenUp(3)")) {
            ElevenString = button3.getText().toString();
            EleventhSubString = ElevenString.substring(ElevenString.indexOf(""), ElevenString.indexOf(" "));
            parseEleven = Integer.parseInt(EleventhSubString);
            if (!app.prev.containsKey("10")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("10", "300 naira P. SevenUp(3)");
            } else {
                String val = app.prev.get("10");
                EleventhSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(EleventhSubString) != parseEleven) {
                    app.prev.remove("10");
                    app.prev.put("10", "300 naira P. SevenUp(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EleventhSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira P. SevenUp(4)")) {
            ElevenString = button4.getText().toString();
            EleventhSubString = ElevenString.substring(ElevenString.indexOf(""), ElevenString.indexOf(" "));
            parseEleven = Integer.parseInt(EleventhSubString);
            if (!app.prev.containsKey("10")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("10", "400 naira P. SevenUp(4)");
            } else {
                String val = app.prev.get("10");
                EleventhSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(EleventhSubString) != parseEleven) {
                    app.prev.remove("10");
                    app.prev.put("10", "400 naira P. SevenUp(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EleventhSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 naira P. SevenUp(5)")) {
            ElevenString = button5.getText().toString();
            EleventhSubString = ElevenString.substring(ElevenString.indexOf(""), ElevenString.indexOf(" "));
            parseEleven = Integer.parseInt(EleventhSubString);
            if (!app.prev.containsKey("10")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("10", "500 naira P. SevenUp(5)");
            } else {
                String val = app.prev.get("10");
                EleventhSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(EleventhSubString) != parseEleven) {
                    app.prev.remove("10");
                    app.prev.put("10", "500 naira P. SevenUp(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EleventhSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("600 naira P. SevenUp(6)")) {
//            ElevenString = button6.getText().toString();
//            EleventhSubString = ElevenString.substring(ElevenString.indexOf(""), ElevenString.indexOf(" "));
//            parseEleven = Integer.parseInt(EleventhSubString);
//            if (!app.prev.containsKey("10")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseEleven;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("10", "600 naira P. SevenUp(6)");
//            } else {
//                String val = app.prev.get("10");
//                EleventhSubString = val.substring(0, val.indexOf("n")).trim();
//
//                if (Integer.parseInt(EleventhSubString) != parseEleven) {
//                    app.prev.remove("10");
//                    app.prev.put("10", "600 naira P. SevenUp(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EleventhSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseEleven;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("80 naira Small G. Sprite")) {
            TwelveString = button.getText().toString();
            TwelvethSubString = TwelveString.substring(TwelveString.indexOf(""), TwelveString.indexOf(" "));
            parseTwelve = Integer.parseInt(TwelvethSubString);
            if (!app.prev.containsKey("11")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("11", "80 naira Small G. Sprite");
            } else {
                String val = app.prev.get("11");
                TwelvethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwelvethSubString) != parseTwelve) {
                    app.prev.remove("11");
                    app.prev.put("11", "80 naira Small G. Sprite");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwelvethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("160 naira Small G. Sprite(2)")) {
            TwelveString = button2.getText().toString();
            TwelvethSubString = TwelveString.substring(TwelveString.indexOf(""), TwelveString.indexOf(" "));
            parseTwelve = Integer.parseInt(TwelvethSubString);
            if (!app.prev.containsKey("11")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("11", "160 naira Small G. Sprite(2)");
            } else {
                String val = app.prev.get("11");
                TwelvethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwelve) {
                    app.prev.remove("11");
                    app.prev.put("11", "160 naira Small G. Sprite(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwelvethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("240 naira Small G. Sprite(3)")) {
            TwelveString = button3.getText().toString();
            TwelvethSubString = TwelveString.substring(TwelveString.indexOf(""), TwelveString.indexOf(" "));
            parseTwelve = Integer.parseInt(TwelvethSubString);
            if (!app.prev.containsKey("11")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("11", "240 naira Small G. Sprite(3)");
            } else {
                String val = app.prev.get("11");
                TwelvethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwelvethSubString) != parseTwelve) {
                    app.prev.remove("11");
                    app.prev.put("11", "240 naira Small G. Sprite(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwelvethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("320 naira Small G. Sprite(4)")) {
            TwelveString = button4.getText().toString();
            TwelvethSubString = TwelveString.substring(TwelveString.indexOf(""), TwelveString.indexOf(" "));
            parseTwelve = Integer.parseInt(TwelvethSubString);
            if (!app.prev.containsKey("11")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("11", "320 naira Small G. Sprite(4)");
            } else {
                String val = app.prev.get("11");
                TwelvethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwelvethSubString) != parseTwelve) {
                    app.prev.remove("11");
                    app.prev.put("11", "320 naira Small G. Sprite(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwelvethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Small G. Sprite(5)")) {
            TwelveString = button5.getText().toString();
            TwelvethSubString = TwelveString.substring(TwelveString.indexOf(""), TwelveString.indexOf(" "));
            parseTwelve = Integer.parseInt(TwelvethSubString);
            if (!app.prev.containsKey("11")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("11", "400 naira Small G. Sprite(5)");
            } else {
                String val = app.prev.get("11");
                TwelvethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwelvethSubString) != parseTwelve) {
                    app.prev.remove("11");
                    app.prev.put("11", "400 naira Small G. Sprite(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwelvethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("480 naira Small G. Sprite(6)")) {
//            TwelveString = button6.getText().toString();
//            TwelvethSubString = TwelveString.substring(TwelveString.indexOf(""), TwelveString.indexOf(" "));
//            parseTwelve = Integer.parseInt(TwelvethSubString);
//            if (!app.prev.containsKey("11")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("11", "480 naira Small G. Sprite(6)");
//            } else {
//                String val = app.prev.get("11");
//                TwelvethSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(TwelvethSubString) != parseTwelve) {
//                    app.prev.remove("11");
//                    app.prev.put("11", "480 naira Small G. Sprite(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwelvethSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("100 naira Big G. Sprite")) {
            ThirteenString = button.getText().toString();
            ThirteenthSubString = ThirteenString.substring(ThirteenString.indexOf(""), ThirteenString.indexOf(" "));
            parseThirteen = Integer.parseInt(ThirteenthSubString);
            if (!app.prev.containsKey("12")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("12", "100 naira Big G. Sprite");
            } else {
                String val = app.prev.get("12");
                ThirteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirteenthSubString) != parseThirteen) {
                    app.prev.remove("12");
                    app.prev.put("12", "100 naira Big G. Sprite");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 naira Big G. Sprite(2)")) {
            ThirteenString = button2.getText().toString();
            ThirteenthSubString = ThirteenString.substring(ThirteenString.indexOf(""), ThirteenString.indexOf(" "));
            parseThirteen = Integer.parseInt(ThirteenthSubString);
            if (!app.prev.containsKey("12")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("12", "200 naira Big G. Sprite(2)");
            } else {
                String val = app.prev.get("12");
                ThirteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirteenthSubString) != parseThirteen) {
                    app.prev.remove("12");
                    app.prev.put("12", "200 naira Big G. Sprite(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }


        } else if (price.contentEquals("300 naira Big G. Sprite(3)")) {
            ThirteenString = button3.getText().toString();
            ThirteenthSubString = ThirteenString.substring(ThirteenString.indexOf(""), ThirteenString.indexOf(" "));
            parseThirteen = Integer.parseInt(ThirteenthSubString);
            if (!app.prev.containsKey("12")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("12", "300 naira Big G. Sprite(3)");
            } else {
                String val = app.prev.get("12");
                ThirteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirteenthSubString) != parseThirteen) {
                    app.prev.remove("12");
                    app.prev.put("12", "300 naira Big G. Sprite(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Big G. Sprite(4)")) {
            ThirteenString = button4.getText().toString();
            ThirteenthSubString = ThirteenString.substring(ThirteenString.indexOf(""), ThirteenString.indexOf(" "));
            parseThirteen = Integer.parseInt(ThirteenthSubString);
            if (!app.prev.containsKey("12")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("12", "400 naira Big G. Sprite(4)");
            } else {
                String val = app.prev.get("12");
                ThirteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirteenthSubString) != parseThirteen) {
                    app.prev.remove("12");
                    app.prev.put("12", "400 naira Big G. Sprite(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 naira Big G. Sprite(5)")) {
            ThirteenString = button5.getText().toString();
            ThirteenthSubString = ThirteenString.substring(ThirteenString.indexOf(""), ThirteenString.indexOf(" "));
            parseThirteen = Integer.parseInt(ThirteenthSubString);
            if (!app.prev.containsKey("12")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("12", "500 naira Big G. Sprite(5)");
            } else {
                String val = app.prev.get("12");
                ThirteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirteenthSubString) != parseThirteen) {
                    app.prev.remove("12");
                    app.prev.put("12", "500 naira Big G. Sprite(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("600 naira Big G. Sprite(6)")) {
//            ThirteenString = button6.getText().toString();
//            ThirteenthSubString = ThirteenString.substring(ThirteenString.indexOf(""), ThirteenString.indexOf(" "));
//            parseThirteen = Integer.parseInt(ThirteenthSubString);
//            if (!app.prev.containsKey("12")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("12", "600 naira Big G. Sprite(6)");
//            } else {
//                String val = app.prev.get("12");
//                ThirteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(ThirteenthSubString) != parseThirteen) {
//                    app.prev.remove("12");
//                    app.prev.put("12", "600 naira Big G. Sprite(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirteenthSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("100 naira Pet Sprite")) {
            FourteenString = button.getText().toString();
            FourteenthSubString = FourteenString.substring(FourteenString.indexOf(""), FourteenString.indexOf(" "));
            parseFourteen = Integer.parseInt(FourteenthSubString);
            if (!app.prev.containsKey("13")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("13", "100 naira Pet Sprite");
            } else {
                String val = app.prev.get("13");
                FourteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourteenthSubString) != parseFourteen) {
                    app.prev.remove("13");
                    app.prev.put("13", "100 naira Pet Sprite");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 naira Pet Sprite(2)")) {
            FourteenString = button2.getText().toString();
            FourteenthSubString = FourteenString.substring(FourteenString.indexOf(""), FourteenString.indexOf(" "));
            parseFourteen = Integer.parseInt(FourteenthSubString);
            if (!app.prev.containsKey("13")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("13", "200 naira Pet Sprite(2)");
            } else {
                String val = app.prev.get("13");
                FourteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourteenthSubString) != parseFourteen) {
                    app.prev.remove("13");
                    app.prev.put("13", "200 naira Pet Sprite(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira Pet Sprite(3)")) {
            FourteenString = button3.getText().toString();
            FourteenthSubString = FourteenString.substring(FourteenString.indexOf(""), FourteenString.indexOf(" "));
            parseFourteen = Integer.parseInt(FourteenthSubString);
            if (!app.prev.containsKey("13")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("13", "300 naira Pet Sprite(3)");
            } else {
                String val = app.prev.get("13");
                FourteenthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FourteenthSubString) != parseFourteen) {
                    app.prev.remove("13");
                    app.prev.put("13", "300 naira Pet Sprite(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Pet Sprite(4)")) {
            FourteenString = button4.getText().toString();
            FourteenthSubString = FourteenString.substring(FourteenString.indexOf(""), FourteenString.indexOf(" "));
            parseFourteen = Integer.parseInt(FourteenthSubString);
            if (!app.prev.containsKey("13")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("13", "400 naira Pet Sprite(4)");
            } else {
                String val = app.prev.get("13");
                FourteenthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FourteenthSubString) != parseFourteen) {
                    app.prev.remove("13");
                    app.prev.put("13", "400 naira Pet Sprite(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 naira Pet Sprite(5)")) {
            FourteenString = button5.getText().toString();
            FourteenthSubString = FourteenString.substring(FourteenString.indexOf(""), FourteenString.indexOf(" "));
            parseFourteen = Integer.parseInt(FourteenthSubString);
            if (!app.prev.containsKey("13")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("13", "500 naira Pet Sprite(5)");
            } else {
                String val = app.prev.get("13");
                FourteenthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FourteenthSubString) != parseFourteen) {
                    app.prev.remove("13");
                    app.prev.put("13", "500 naira Pet Sprite(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("600 naira Pet Sprite(6)")) {
//            FourteenString = button6.getText().toString();
//            FourteenthSubString = FourteenString.substring(FourteenString.indexOf(""), FourteenString.indexOf(" "));
//            parseFourteen = Integer.parseInt(FourteenthSubString);
//            if (!app.prev.containsKey("13")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("13", "600 naira Pet Sprite(6)");
//            } else {
//                String val = app.prev.get("13");
//                FourteenthSubString = val.substring(0, val.indexOf("n")).trim();
//
//                if (Integer.parseInt(FourteenthSubString) != parseFourteen) {
//                    app.prev.remove("13");
//                    app.prev.put("13", "600 naira Pet Sprite(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourteenthSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("100 naira Pet Teem")) {
            FifteenString = button.getText().toString();
            FifteenthSubString = FifteenString.substring(FifteenString.indexOf(""), FifteenString.indexOf(" "));
            parseFifteen = Integer.parseInt(FifteenthSubString);
            if (!app.prev.containsKey("14")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("14", "100 naira Pet Teem");
            } else {
                String val = app.prev.get("14");
                FifteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifteenthSubString) != parseFifteen) {
                    app.prev.remove("14");
                    app.prev.put("14", "100 naira Pet Teem");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 naira Pet Teem(2)")) {
            FifteenString = button2.getText().toString();
            FifteenthSubString = FifteenString.substring(FifteenString.indexOf(""), FifteenString.indexOf(" "));
            parseFifteen = Integer.parseInt(FifteenthSubString);
            if (!app.prev.containsKey("14")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("14", "200 naira Pet Teem(2)");
            } else {
                String val = app.prev.get("14");
                FifteenthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FifteenthSubString) != parseFifteen) {
                    app.prev.remove("14");
                    app.prev.put("14", "200 naira Pet Teem(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira Pet Teem(3)")) {
            FifteenString = button3.getText().toString();
            FifteenthSubString = FifteenString.substring(FifteenString.indexOf(""), FifteenString.indexOf(" "));
            parseFifteen = Integer.parseInt(FifteenthSubString);
            if (!app.prev.containsKey("14")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("14", "300 naira Pet Teem(3)");
            } else {
                String val = app.prev.get("14");
                FifteenthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FifthSubString) != parseFifteen) {
                    app.prev.remove("14");
                    app.prev.put("14", "300 naira Pet Teem(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Pet Teem(4)")) {
            FifteenString = button4.getText().toString();
            FifteenthSubString = FifteenString.substring(FifteenString.indexOf(""), FifteenString.indexOf(" "));
            parseFifteen = Integer.parseInt(FifteenthSubString);
            if (!app.prev.containsKey("14")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("14", "400 naira Pet Teem(4)");
            } else {
                String val = app.prev.get("14");
                FifteenthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FifteenthSubString) != parseFifteen) {
                    app.prev.remove("14");
                    app.prev.put("14", "400 naira Pet Teem(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 naira Pet Teem(5)")) {
            FifteenString = button5.getText().toString();
            FifteenthSubString = FifteenString.substring(FifteenString.indexOf(""), FifteenString.indexOf(" "));
            parseFifteen = Integer.parseInt(FifteenthSubString);
            if (!app.prev.containsKey("14")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("14", "500 naira Pet Teem(5)");
            } else {
                String val = app.prev.get("14");
                FifteenthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FifteenthSubString) != parseFifteen) {
                    app.prev.remove("14");
                    app.prev.put("14", "500 naira Pet Teem(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("600 naira Pet Teem(6)")) {
//            FifteenString = button6.getText().toString();
//            FifteenthSubString = FifteenString.substring(FifteenString.indexOf(""), FifteenString.indexOf(" "));
//            parseFifteen = Integer.parseInt(FifteenthSubString);
//            if (!app.prev.containsKey("14")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("14", "600 naira Pet Teem(6)");
//            } else {
//                String val = app.prev.get("14");
//                FifteenthSubString = val.substring(0, val.indexOf("n")).trim();
//
//                if (Integer.parseInt(FifteenthSubString) != parseFifteen) {
//                    app.prev.remove("14");
//                    app.prev.put("14", "600 naira Pet Teem(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifteenthSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("100 naira Pet Lacasera")) {
            SixteenString = button.getText().toString();
            SixteenthSubString = SixteenString.substring(SixteenString.indexOf(""), SixteenString.indexOf(" "));
            parseSixteen = Integer.parseInt(SixteenthSubString);
            if (!app.prev.containsKey("15")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("15", "100 naira Pet Lacasera");
            } else {
                String val = app.prev.get("15");
                SixteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixteenthSubString) != parseSixteen) {
                    app.prev.remove("15");
                    app.prev.put("15", "100 naira Pet Lacasera");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 naira Pet Lacasera(2)")) {
            SixteenString = button2.getText().toString();
            SixteenthSubString = SixteenString.substring(SixteenString.indexOf(""), SixteenString.indexOf(" "));
            parseSixteen = Integer.parseInt(SixteenthSubString);
            if (!app.prev.containsKey("15")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("15", "200 naira Pet Lacasera(2)");
            } else {
                String val = app.prev.get("15");
                SixteenthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(SixteenthSubString) != parseSixteen) {
                    app.prev.remove("15");
                    app.prev.put("15", "200 naira Pet Lacasera(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira Pet Lacasera(3)")) {
            SixteenString = button3.getText().toString();
            SixteenthSubString = SixteenString.substring(SixteenString.indexOf(""), SixteenString.indexOf(" "));
            parseSixteen = Integer.parseInt(SixteenthSubString);
            if (!app.prev.containsKey("15")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("15", "300 naira Pet Lacasera(3)");
            } else {
                String val = app.prev.get("15");
                SixteenthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(SixteenthSubString) != parseSixteen) {
                    app.prev.remove("15");
                    app.prev.put("15", "300 naira Pet Lacasera(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Pet Lacasera(4)")) {
            SixteenString = button4.getText().toString();
            SixteenthSubString = SixteenString.substring(SixteenString.indexOf(""), SixteenString.indexOf(" "));
            parseSixteen = Integer.parseInt(SixteenthSubString);
            if (!app.prev.containsKey("15")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("15", "400 naira Pet Lacasera(4)");
            } else {
                String val = app.prev.get("15");
                SixteenthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(SixteenthSubString) != parseSixteen) {
                    app.prev.remove("15");
                    app.prev.put("15", "400 naira Pet Lacasera(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 naira Pet Lacasera(5)")) {
            SixteenString = button5.getText().toString();
            SixteenthSubString = SixteenString.substring(SixteenString.indexOf(""), SixteenString.indexOf(" "));
            parseSixteen = Integer.parseInt(SixteenthSubString);
            if (!app.prev.containsKey("15")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("15", "500 naira Pet Lacasera(5)");
            } else {
                String val = app.prev.get("15");
                SixteenthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(SixteenthSubString) != parseSixteen) {
                    app.prev.remove("15");
                    app.prev.put("15", "500 naira Pet Lacasera(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("600 naira Pet Lacasera(6)")) {
//            SixteenString = button6.getText().toString();
//            SixteenthSubString = SixteenString.substring(SixteenString.indexOf(""), SixteenString.indexOf(" "));
//            parseSixteen = Integer.parseInt(SixteenthSubString);
//            if (!app.prev.containsKey("15")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("15", "600 naira Pet Lacasera(6)");
//            } else {
//                String val = app.prev.get("15");
//                SixteenthSubString = val.substring(0, val.indexOf("n")).trim();
//
//                if (Integer.parseInt(SixteenthSubString) != parseSixteen) {
//                    app.prev.remove("15");
//                    app.prev.put("15", "600 naira Pet Lacasera(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixteenthSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("150 naira Pet Smoov")) {
            SeventeenString = button.getText().toString();
            SeventeenthSubString = SeventeenString.substring(SeventeenString.indexOf(""), SeventeenString.indexOf(" "));
            parseSeventeen = Integer.parseInt(SeventeenthSubString);
            if (!app.prev.containsKey("16")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("16", "150 naira Pet Smoov");
            } else {
                String val = app.prev.get("16");
                SeventeenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SeventeenthSubString) != parseSeventeen) {
                    app.prev.remove("16");
                    app.prev.put("16", "150 naira Pet Smoov");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventeenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira Pet Smoov(2)")) {
            SeventeenString = button2.getText().toString();
            SeventeenthSubString = SeventeenString.substring(SeventeenString.indexOf(""), SeventeenString.indexOf(" "));
            parseSeventeen = Integer.parseInt(SeventeenthSubString);
            if (!app.prev.containsKey("16")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("16", "300 naira Pet Smoov(2)");
            } else {
                String val = app.prev.get("16");
                SeventeenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SeventeenthSubString) != parseSeventeen) {
                    app.prev.remove("16");
                    app.prev.put("16", "300 naira Pet Smoov(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventeenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("450 naira Pet Smoov(3)")) {
            SeventeenString = button3.getText().toString();
            SeventeenthSubString = SeventeenString.substring(SeventeenString.indexOf(""), SeventeenString.indexOf(" "));
            parseSeventeen = Integer.parseInt(SeventeenthSubString);
            if (!app.prev.containsKey("16")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("16", "450 naira Pet Smoov(3)");
            } else {
                String val = app.prev.get("16");
                SeventeenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SeventeenthSubString) != parseSeventeen) {
                    app.prev.remove("16");
                    app.prev.put("16", "450 naira Pet Smoov(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventeenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira Pet Smoov(4)")) {
            SeventeenString = button4.getText().toString();
            SeventeenthSubString = SeventeenString.substring(SeventeenString.indexOf(""), SeventeenString.indexOf(" "));
            parseSeventeen = Integer.parseInt(SeventeenthSubString);
            if (!app.prev.containsKey("16")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("16", "600 naira Pet Smoov(4)");
            } else {
                String val = app.prev.get("16");
                SeventeenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SeventeenthSubString) != parseSeventeen) {
                    app.prev.remove("16");
                    app.prev.put("16", "600 naira Pet Smoov(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventeenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("750 naira Pet Smoov(5)")) {
            SeventeenString = button5.getText().toString();
            SeventeenthSubString = SeventeenString.substring(SeventeenString.indexOf(""), SeventeenString.indexOf(" "));
            parseSeventeen = Integer.parseInt(SeventeenthSubString);
            if (!app.prev.containsKey("16")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("16", "750 naira Pet Smoov(5)");
            } else {
                String val = app.prev.get("16");
                SeventeenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SeventeenthSubString) != parseSeventeen) {
                    app.prev.remove("16");
                    app.prev.put("16", "750 naira Pet Smoov(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventeenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("900 naira Pet Smoov(6)")) {
//            SeventeenString = button6.getText().toString();
//            SeventeenthSubString = SeventeenString.substring(SeventeenString.indexOf(""), SeventeenString.indexOf(" "));
//            parseSeventeen = Integer.parseInt(SeventeenthSubString);
//            if (!app.prev.containsKey("16")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("16", "900 naira Pet Smoov(6)");
//            } else {
//                String val = app.prev.get("16");
//                SeventeenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(SeventeenthSubString) != parseSeventeen) {
//                    app.prev.remove("16");
//                    app.prev.put("16", "900 naira Pet Smoov(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventeenthSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("80 naira Small G. Coke")) {
            EighteenString = button.getText().toString();
            EighteenthSubString = EighteenString.substring(EighteenString.indexOf(""), EighteenString.indexOf(" "));
            parseEighteen = Integer.parseInt(EighteenthSubString);
            if (!app.prev.containsKey("17")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("17", "80 naira Small G. Coke");
            } else {
                String val = app.prev.get("17");
                EighteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(EighteenthSubString) != parseEighteen) {
                    app.prev.remove("17");
                    app.prev.put("17", "80 naira Small G. Coke");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("160 naira Small G. Coke(2)")) {
            EighteenString = button2.getText().toString();
            EighteenthSubString = EighteenString.substring(EighteenString.indexOf(""), EighteenString.indexOf(" "));
            parseEighteen = Integer.parseInt(EighteenthSubString);
            if (!app.prev.containsKey("17")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("17", "160 naira Small G. Coke(2)");
            } else {
                String val = app.prev.get("17");
                EighteenthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(EighteenthSubString) != parseEighteen) {
                    app.prev.remove("17");
                    app.prev.put("17", "160 naira Small G. Coke(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("240 naira Small G. Coke(3)")) {
            EighteenString = button3.getText().toString();
            EighteenthSubString = EighteenString.substring(EighteenString.indexOf(""), EighteenString.indexOf(" "));
            parseEighteen = Integer.parseInt(EighteenthSubString);
            if (!app.prev.containsKey("17")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("17", "240 naira Small G. Coke(3)");
            } else {
                String val = app.prev.get("17");
                EighteenthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(EighteenthSubString) != parseEighteen) {
                    app.prev.remove("17");
                    app.prev.put("17", "240 naira Small G. Coke(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("320 naira Small G. Coke(4)")) {
            EighteenString = button4.getText().toString();
            EighteenthSubString = EighteenString.substring(EighteenString.indexOf(""), EighteenString.indexOf(" "));
            parseEighteen = Integer.parseInt(EighteenthSubString);
            if (!app.prev.containsKey("17")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("17", "320 naira Small G. Coke(4)");
            } else {
                String val = app.prev.get("17");
                EighteenthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(EighteenthSubString) != parseEighteen) {
                    app.prev.remove("17");
                    app.prev.put("17", "320 naira Small G. Coke(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Small G. Coke(5)")) {
            EighteenString = button5.getText().toString();
            EighteenthSubString = EighteenString.substring(EighteenString.indexOf(""), EighteenString.indexOf(" "));
            parseEighteen = Integer.parseInt(EighteenthSubString);
            if (!app.prev.containsKey("17")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("17", "400 naira Small G. Coke(5)");
            } else {
                String val = app.prev.get("17");
                EighteenthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(EighteenthSubString) != parseEighteen) {
                    app.prev.remove("17");
                    app.prev.put("17", "400 naira Small G. Coke(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("480 naira Small G. Coke(6)")) {
//            EighteenString = button6.getText().toString();
//            EighteenthSubString = EighteenString.substring(EighteenString.indexOf(""), EighteenString.indexOf(" "));
//            parseEighteen = Integer.parseInt(EighteenthSubString);
//            if (!app.prev.containsKey("17")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("17", "480 naira Small G. Coke(6)");
//            } else {
//                String val = app.prev.get("17");
//                EighteenthSubString = val.substring(0, val.indexOf("n")).trim();
//
//                if (Integer.parseInt(EighteenthSubString) != parseEighteen) {
//                    app.prev.remove("17");
//                    app.prev.put("17", "480 naira Small G. Coke(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighteenthSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("100 naira Big G. Coke")) {
            NineteenString = button.getText().toString();
            NineteenthSubString = NineteenString.substring(NineteenString.indexOf(""), NineteenString.indexOf(" "));
            parseNineteen = Integer.parseInt(NineteenthSubString);
            if (!app.prev.containsKey("18")) {
                app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("18", "100 naira Big G. Coke");
            } else {
                String val = app.prev.get("18");
                NineteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(NineteenthSubString) != parseNineteen) {
                    app.prev.remove("18");
                    app.prev.put("18", "100 naira Big G. Coke");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 naira Big G. Coke(2)")) {
            NineteenString = button2.getText().toString();
            NineteenthSubString = NineteenString.substring(NineteenString.indexOf(""), NineteenString.indexOf(" "));
            parseNineteen = Integer.parseInt(NineteenthSubString);
            if (!app.prev.containsKey("18")) {
                app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("18", "200 naira Big G. Coke(2)");
            } else {
                String val = app.prev.get("18");
                NineteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(NineteenthSubString) != parseNineteen) {
                    app.prev.remove("18");
                    app.prev.put("18", "200 naira Big G. Coke(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira Big G. Coke(3)")) {
            NineteenString = button3.getText().toString();
            NineteenthSubString = NineteenString.substring(NineteenString.indexOf(""), NineteenString.indexOf(" "));
            parseNineteen = Integer.parseInt(NineteenthSubString);
            if (!app.prev.containsKey("18")) {
                app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("18", "300 naira Big G. Coke(3)");
            } else {
                String val = app.prev.get("18");
                NineteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(NineteenthSubString) != parseNineteen) {
                    app.prev.remove("18");
                    app.prev.put("18", "300 naira Big G. Coke(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Big G. Coke(4)")) {
            NineteenString = button4.getText().toString();
            NineteenthSubString = NineteenString.substring(NineteenString.indexOf(""), NineteenString.indexOf(" "));
            parseNineteen = Integer.parseInt(NineteenthSubString);
            if (!app.prev.containsKey("18")) {
                app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("18", "400 naira Big G. Coke(4)");
            } else {
                String val = app.prev.get("18");
                NineteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(NineteenthSubString) != parseNineteen) {
                    app.prev.remove("18");
                    app.prev.put("18", "400 naira Big G. Coke(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 naira Big G. Coke(5)")) {
            NineteenString = button5.getText().toString();
            NineteenthSubString = NineteenString.substring(NineteenString.indexOf(""), NineteenString.indexOf(" "));
            parseNineteen = Integer.parseInt(NineteenthSubString);
            if (!app.prev.containsKey("18")) {
                app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("18", "500 naira Big G. Coke(5)");
            } else {
                String val = app.prev.get("18");
                NineteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(NineteenthSubString) != parseNineteen) {
                    app.prev.remove("18");
                    app.prev.put("18", "500 naira Big G. Coke(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("600 naira Big G. Coke(6)")) {
//            NineteenString = button6.getText().toString();
//            NineteenthSubString = NineteenString.substring(NineteenString.indexOf(""), NineteenString.indexOf(" "));
//            parseNineteen = Integer.parseInt(NineteenthSubString);
//            if (!app.prev.containsKey("18")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("18", "600 naira Big G. Coke(6)");
//            } else {
//                String val = app.prev.get("18");
//                NineteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(NineteenthSubString) != parseNineteen) {
//                    app.prev.remove("18");
//                    app.prev.put("18", "600 naira Big G. Coke(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineteenthSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("100 naira Small Pet Coke")) {
            TwentyString = button.getText().toString();
            TwentiethSubString = TwentyString.substring(TwentyString.indexOf(""), TwentyString.indexOf(" "));
            parseTwenty = Integer.parseInt(TwentiethSubString);
            if (!app.prev.containsKey("19")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("19", "100 naira Small Pet Coke");
            } else {
                String val = app.prev.get("19");
                TwentiethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentiethSubString) != parseTwenty) {
                    app.prev.remove("19");
                    app.prev.put("19", "100 naira Small Pet Coke");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentiethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 naira Small Pet Coke(2)")) {
            TwentyString = button2.getText().toString();
            TwentiethSubString = TwentyString.substring(TwentyString.indexOf(""), TwentyString.indexOf(" "));
            parseTwenty = Integer.parseInt(TwentiethSubString);
            if (!app.prev.containsKey("19")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("19", "200 naira Small Pet Coke(2)");
            } else {
                String val = app.prev.get("19");
                TwentiethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentiethSubString) != parseTwenty) {
                    app.prev.remove("19");
                    app.prev.put("19", "200 naira Small Pet Coke(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentiethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira Small Pet Coke(3)")) {
            TwentyString = button3.getText().toString();
            TwentiethSubString = TwentyString.substring(TwentyString.indexOf(""), TwentyString.indexOf(" "));
            parseTwenty = Integer.parseInt(TwentiethSubString);
            if (!app.prev.containsKey("19")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("19", "300 naira Small Pet Coke(3)");
            } else {
                String val = app.prev.get("19");
                TwentiethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentiethSubString) != parseTwenty) {
                    app.prev.remove("19");
                    app.prev.put("19", "300 naira Small Pet Coke(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentiethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Small Pet Coke(4)")) {
            TwentyString = button4.getText().toString();
            TwentiethSubString = TwentyString.substring(TwentyString.indexOf(""), TwentyString.indexOf(" "));
            parseTwenty = Integer.parseInt(TwentiethSubString);
            if (!app.prev.containsKey("19")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("19", "400 naira Small Pet Coke(4)");
            } else {
                String val = app.prev.get("19");
                TwentiethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentiethSubString) != parseTwenty) {
                    app.prev.remove("19");
                    app.prev.put("19", "400 naira Small Pet Coke(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentiethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 naira Small Pet Coke(5)")) {
            TwentyString = button5.getText().toString();
            TwentiethSubString = TwentyString.substring(TwentyString.indexOf(""), TwentyString.indexOf(" "));
            parseTwenty = Integer.parseInt(TwentiethSubString);
            if (!app.prev.containsKey("19")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("19", "500 naira Small Pet Coke(5)");
            } else {
                String val = app.prev.get("19");
                TwentiethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentiethSubString) != parseTwenty) {
                    app.prev.remove("19");
                    app.prev.put("19", "500 naira Small Pet Coke(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentiethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("600 naira Small Pet Coke(6)")) {
//            TwentyString = button6.getText().toString();
//            TwentiethSubString = TwentyString.substring(TwentyString.indexOf(""), TwentyString.indexOf(" "));
//            parseTwenty = Integer.parseInt(TwentiethSubString);
//            if (!app.prev.containsKey("19")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("19", "600 naira Small Pet Coke(6)");
//            } else {
//                String val = app.prev.get("19");
//                TwentiethSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(TwentiethSubString) != parseTwenty) {
//                    app.prev.remove("19");
//                    app.prev.put("19", "600 naira Small Pet Coke(6)`");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentiethSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }


        if (price.contentEquals("150 naira Big Pet Coke")) {
            TwentyOneString = button.getText().toString();
            TwentyOneSubString = TwentyOneString.substring(TwentyOneString.indexOf(""), TwentyOneString.indexOf(" "));
            parseTwentyOne = Integer.parseInt(TwentyOneSubString);
            if (!app.prev.containsKey("20")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("20", "150 naira Big Pet Coke");
            } else {
                String val = app.prev.get("20");
                TwentyOneSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyOneSubString) != parseTwentyOne) {
                    app.prev.remove("20");
                    app.prev.put("20", "150 naira Big Pet Coke");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira Big Pet Coke(2)")) {
            TwentyOneString = button2.getText().toString();
            TwentyOneSubString = TwentyOneString.substring(TwentyOneString.indexOf(""), TwentyOneString.indexOf(" "));
            parseTwentyOne = Integer.parseInt(TwentyOneSubString);
            if (!app.prev.containsKey("20")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("20", "300 naira Big Pet Coke(2)");
            } else {
                String val = app.prev.get("20");
                TwentyOneSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyOneSubString) != parseTwentyOne) {
                    app.prev.remove("20");
                    app.prev.put("20", "300 naira Big Pet Coke(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("450 naira Big Pet Coke(3)")) {
            TwentyOneString = button3.getText().toString();
            TwentyOneSubString = TwentyOneString.substring(TwentyOneString.indexOf(""), TwentyOneString.indexOf(" "));
            parseTwentyOne = Integer.parseInt(TwentyOneSubString);
            if (!app.prev.containsKey("20")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("20", "450 naira Big Pet Coke(3)");
            } else {
                String val = app.prev.get("20");
                TwentyOneSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyOneSubString) != parseTwentyOne) {
                    app.prev.remove("20");
                    app.prev.put("20", "450 naira Big Pet Coke(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira Big Pet Coke(4)")) {
            TwentyOneString = button4.getText().toString();
            TwentyOneSubString = TwentyOneString.substring(TwentyOneString.indexOf(""), TwentyOneString.indexOf(" "));
            parseTwentyOne = Integer.parseInt(TwentyOneSubString);
            if (!app.prev.containsKey("20")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("20", "600 naira Big Pet Coke(4)");
            } else {
                String val = app.prev.get("20");
                TwentyOneSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyOneSubString) != parseTwentyOne) {
                    app.prev.remove("20");
                    app.prev.put("20", "600 naira Big Pet Coke(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("750 naira Big Pet Coke(5)")) {
            TwentyOneString = button5.getText().toString();
            TwentyOneSubString = TwentyOneString.substring(TwentyOneString.indexOf(""), TwentyOneString.indexOf(" "));
            parseTwentyOne = Integer.parseInt(TwentyOneSubString);
            if (!app.prev.containsKey("20")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("20", "750 naira Big Pet Coke(5)");
            } else {
                String val = app.prev.get("20");
                TwentyOneSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyOneSubString) != parseTwentyOne) {
                    app.prev.remove("20");
                    app.prev.put("20", "750 naira Big Pet Coke(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("900 naira Big Pet Coke(6)")) {
//            TwentyOneString = button6.getText().toString();
//            TwentyOneSubString = TwentyOneString.substring(TwentyOneString.indexOf(""), TwentyOneString.indexOf(" "));
//            parseTwentyOne = Integer.parseInt(TwentyOneSubString);
//            if (!app.prev.containsKey("20")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("20", "900 naira Big Pet Coke(6)");
//            } else {
//                String val = app.prev.get("20");
//                TwentyOneSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(TwentyOneSubString) != parseTwentyOne) {
//                    app.prev.remove("20");
//                    app.prev.put("20", "900 naira Big Pet Coke(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyOneSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//
//        }

        if (price.contentEquals("80 naira Small G. Fanta")) {
            TwentyTwoString = button.getText().toString();
            TwentyTwoSubString = TwentyTwoString.substring(TwentyTwoString.indexOf(""), TwentyTwoString.indexOf(" "));
            parseTwentyTwo = Integer.parseInt(TwentyTwoSubString);
            if (!app.prev.containsKey("21")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("21", "80 naira Small G. Fanta");
            } else {
                String val = app.prev.get("21");
                TwentyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyTwoSubString) != parseTwentyTwo) {
                    app.prev.remove("21");
                    app.prev.put("21", "80 naira Small G. Fanta");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("160 naira Small G. Fanta(2)")) {
            TwentyTwoString = button2.getText().toString();
            TwentyTwoSubString = TwentyTwoString.substring(TwentyTwoString.indexOf(""), TwentyTwoString.indexOf(" "));
            parseTwentyTwo = Integer.parseInt(TwentyTwoSubString);
            if (!app.prev.containsKey("21")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("21", "160 naira Small G. Fanta(2)");
            } else {
                String val = app.prev.get("21");
                TwentyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyTwoSubString) != parseTwentyTwo) {
                    app.prev.remove("21");
                    app.prev.put("21", "160 naira Small G. Fanta(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("240 naira Small G. Fanta(3)")) {
            TwentyTwoString = button3.getText().toString();
            TwentyTwoSubString = TwentyTwoString.substring(TwentyTwoString.indexOf(""), TwentyTwoString.indexOf(" "));
            parseTwentyTwo = Integer.parseInt(TwentyTwoSubString);
            if (!app.prev.containsKey("21")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("21", "240 naira Small G. Fanta(3)");
            } else {
                String val = app.prev.get("21");
                TwentyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyTwoSubString) != parseTwentyTwo) {
                    app.prev.remove("21");
                    app.prev.put("21", "240 naira Small G. Fanta(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("320 naira Small G. Fanta(4)")) {
            TwentyTwoString = button4.getText().toString();
            TwentyTwoSubString = TwentyTwoString.substring(TwentyTwoString.indexOf(""), TwentyTwoString.indexOf(" "));
            parseTwentyTwo = Integer.parseInt(TwentyTwoSubString);
            if (!app.prev.containsKey("21")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("21", "320 naira Small G. Fanta(4)");
            } else {
                String val = app.prev.get("21");
                TwentyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyTwoSubString) != parseTwentyTwo) {
                    app.prev.remove("21");
                    app.prev.put("21", "320 naira Small G. Fanta(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Small G. Fanta(5)")) {
            TwentyTwoString = button5.getText().toString();
            TwentyTwoSubString = TwentyTwoString.substring(TwentyTwoString.indexOf(""), TwentyTwoString.indexOf(" "));
            parseTwentyTwo = Integer.parseInt(TwentyTwoSubString);
            if (!app.prev.containsKey("21")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("21", "400 naira Small G. Fanta(5)");
            } else {
                String val = app.prev.get("21");
                TwentyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyTwoSubString) != parseTwentyTwo) {
                    app.prev.remove("21");
                    app.prev.put("21", "400 naira Small G. Fanta(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("480 naira Small G. Fanta(6)")) {
//            TwentyTwoString = button6.getText().toString();
//            TwentyTwoSubString = TwentyTwoString.substring(TwentyTwoString.indexOf(""), TwentyTwoString.indexOf(" "));
//            parseTwentyTwo = Integer.parseInt(TwentyTwoSubString);
//            if (!app.prev.containsKey("21")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("21", "480 naira Small G. Fanta(6)");
//            } else {
//                String val = app.prev.get("21");
//                TwentyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(TwentyTwoSubString) != parseTwentyTwo) {
//                    app.prev.remove("21");
//                    app.prev.put("21", "480 naira Small G. Fanta(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyTwoSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("100 naira Big G. Fanta")) {
            TwentyThreeString = button.getText().toString();
            TwentyThreeSubString = TwentyThreeString.substring(TwentyThreeString.indexOf(""), TwentyThreeString.indexOf(" "));
            parseTwentyThree = Integer.parseInt(TwentyThreeSubString);
            if (!app.prev.containsKey("22")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("22", "100 naira Big G. Fanta");
            } else {
                String val = app.prev.get("22");
                TwentyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyThreeSubString) != parseTwentyThree) {
                    app.prev.remove("22");
                    app.prev.put("22", "100 naira Big G. Fanta");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 naira Big G. Fanta(2)")) {
            TwentyThreeString = button2.getText().toString();
            TwentyThreeSubString = TwentyThreeString.substring(TwentyThreeString.indexOf(""), TwentyThreeString.indexOf(" "));
            parseTwentyThree = Integer.parseInt(TwentyThreeSubString);
            if (!app.prev.containsKey("22")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("22", "200 naira Big G. Fanta(2)");
            } else {
                String val = app.prev.get("22");
                TwentyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyThreeSubString) != parseTwentyThree) {
                    app.prev.remove("22");
                    app.prev.put("22", "200 naira Big G. Fanta(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }


        } else if (price.contentEquals("300 naira Big G. Fanta(3)")) {
            TwentyThreeString = button3.getText().toString();
            TwentyThreeSubString = TwentyThreeString.substring(TwentyThreeString.indexOf(""), TwentyThreeString.indexOf(" "));
            parseTwentyThree = Integer.parseInt(TwentyThreeSubString);
            if (!app.prev.containsKey("22")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("22", "300 naira Big G. Fanta(3)");
            } else {
                String val = app.prev.get("22");
                TwentyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyThreeSubString) != parseTwentyThree) {
                    app.prev.remove("22");
                    app.prev.put("22", "300 naira Big G. Fanta(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Big G. Fanta(4)")) {
            TwentyThreeString = button4.getText().toString();
            TwentyThreeSubString = TwentyThreeString.substring(TwentyThreeString.indexOf(""), TwentyThreeString.indexOf(" "));
            parseTwentyThree = Integer.parseInt(TwentyThreeSubString);
            if (!app.prev.containsKey("22")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("22", "400 naira Big G. Fanta(4)");
            } else {
                String val = app.prev.get("22");
                TwentyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyThreeSubString) != parseTwentyThree) {
                    app.prev.remove("22");
                    app.prev.put("22", "400 naira Big G. Fanta(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 naira Big G. Fanta(5)")) {
            TwentyThreeString = button5.getText().toString();
            TwentyThreeSubString = TwentyThreeString.substring(TwentyThreeString.indexOf(""), TwentyThreeString.indexOf(" "));
            parseTwentyThree = Integer.parseInt(TwentyThreeSubString);
            if (!app.prev.containsKey("22")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("22", "500 naira Big G. Fanta(5)");
            } else {
                String val = app.prev.get("22");
                TwentyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyThreeSubString) != parseTwentyThree) {
                    app.prev.remove("22");
                    app.prev.put("22", "500 naira Big G. Fanta(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("600 naira Big G. Fanta(6)")) {
//            TwentyThreeString = button6.getText().toString();
//            TwentyThreeSubString = TwentyThreeString.substring(TwentyThreeString.indexOf(""), TwentyThreeString.indexOf(" "));
//            parseTwentyThree = Integer.parseInt(TwentyThreeSubString);
//            if (!app.prev.containsKey("22")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("22", "600 naira Big G. Fanta(6)");
//            } else {
//                String val = app.prev.get("22");
//                TwentyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(TwentyThreeSubString) != parseTwentyThree) {
//                    app.prev.remove("22");
//                    app.prev.put("22", "600 naira Big G. Fanta(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyThreeSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }








        /////////////POINT OF TOO MUCH













        if (price.contentEquals("100 naira Small P. Fanta")) {
            TwentyFourString = button.getText().toString();
            TwentyFourSubString = TwentyFourString.substring(TwentyFourString.indexOf(""), TwentyFourString.indexOf(" "));
            parseTwentyFour = Integer.parseInt(TwentyFourSubString);
            if (!app.prev.containsKey("23")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("23", "100 naira Small P. Fanta");
            } else {
                String val = app.prev.get("23");
                TwentyFourSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyFourSubString) != parseTwentyFour) {
                    app.prev.remove("23");
                    app.prev.put("23", "100 naira Small P. Fanta");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFourSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 naira Small P. Fanta(2)")) {
            TwentyFourString = button2.getText().toString();
            TwentyFourSubString = TwentyFourString.substring(TwentyFourString.indexOf(""), TwentyFourString.indexOf(" "));
            parseTwentyFour = Integer.parseInt(TwentyFourSubString);
            if (!app.prev.containsKey("23")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("23", "200 naira Small P. Fanta(2)");
            } else {
                String val = app.prev.get("23");
                TwentyFourSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(TwentyFourSubString) != parseTwentyFour) {
                    app.prev.remove("23");
                    app.prev.put("23", "200 naira Small P. Fanta(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFourSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira Small P. Fanta(3)")) {
            TwentyFourString = button3.getText().toString();
            TwentyFourSubString = TwentyFourString.substring(TwentyFourString.indexOf(""), TwentyFourString.indexOf(" "));
            parseTwentyFour = Integer.parseInt(TwentyFourSubString);
            if (!app.prev.containsKey("23")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("23", "300 naira Small P. Fanta(3)");
            } else {
                String val = app.prev.get("23");
                TwentyFourSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(TwentyFourSubString) != parseTwentyFour) {
                    app.prev.remove("23");
                    app.prev.put("23", "300 naira Small P. Fanta(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFourSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Small P. Fanta(4)")) {
            TwentyFourString = button4.getText().toString();
            TwentyFourSubString = TwentyFourString.substring(TwentyFourString.indexOf(""), TwentyFourString.indexOf(" "));
            parseTwentyFour = Integer.parseInt(TwentyFourSubString);
            if (!app.prev.containsKey("23")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("23", "400 naira Small P. Fanta(4)");
            } else {
                String val = app.prev.get("23");
                TwentyFourSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(TwentyFourSubString) != parseTwentyFour) {
                    app.prev.remove("23");
                    app.prev.put("23", "400 naira Small P. Fanta(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFourSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 naira Small P. Fanta(5)")) {
            TwentyFourString = button5.getText().toString();
            TwentyFourSubString = TwentyFourString.substring(TwentyFourString.indexOf(""), TwentyFourString.indexOf(" "));
            parseTwentyFour = Integer.parseInt(TwentyFourSubString);
            if (!app.prev.containsKey("23")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("23", "500 naira Small P. Fanta(5)");
            } else {
                String val = app.prev.get("23");
                TwentyFourSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(TwentyFourSubString) != parseTwentyFour) {
                    app.prev.remove("23");
                    app.prev.put("23", "500 naira Small P. Fanta(5)`");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFourSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("600 naira Small P. Fanta(6)")) {
//            TwentyFourString = button6.getText().toString();
//            TwentyFourSubString = TwentyFourString.substring(TwentyFourString.indexOf(""), TwentyFourString.indexOf(" "));
//            parseTwentyFour = Integer.parseInt(TwentyFourSubString);
//            if (!app.prev.containsKey("23")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("23", "600 naira Small P. Fanta(6)");
//            } else {
//                String val = app.prev.get("23");
//                TwentyFourSubString = val.substring(0, val.indexOf("n")).trim();
//
//                if (Integer.parseInt(TwentyFourSubString) != parseTwentyFour) {
//                    app.prev.remove("23");
//                    app.prev.put("23", "600 naira Small P. Fanta(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFourSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }


        if (price.contentEquals("150 naira Big P. Fanta")) {
            TwentyFiveString = button.getText().toString();
            TwentyFiveSubString = TwentyFiveString.substring(TwentyFiveString.indexOf(""), TwentyFiveString.indexOf(" "));
            parseTwentyFive = Integer.parseInt(TwentyFiveSubString);
            if (!app.prev.containsKey("24")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFive;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("24", "150 naira Big P. Fanta");
            } else {
                String val = app.prev.get("24");
                TwentyFiveSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyFiveSubString) != parseTwentyFive) {
                    app.prev.remove("24");
                    app.prev.put("24", "150 naira Big P. Fanta");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFiveSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira Big P. Fanta(2)")) {
            TwentyFiveString = button2.getText().toString();
            TwentyFiveSubString = TwentyFiveString.substring(TwentyFiveString.indexOf(""), TwentyFiveString.indexOf(" "));
            parseTwentyFive = Integer.parseInt(TwentyFiveSubString);
            if (!app.prev.containsKey("24")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFive;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("24", "300 naira Big P. Fanta(2)");
            } else {
                String val = app.prev.get("24");
                TwentyFiveSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyFiveSubString) != parseTwentyFive) {
                    app.prev.remove("24");
                    app.prev.put("24", "300 naira Big P. Fanta(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFiveSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("450 naira Big P. Fanta(3)")) {
            TwentyFiveString = button3.getText().toString();
            TwentyFiveSubString = TwentyFiveString.substring(TwentyFiveString.indexOf(""), TwentyFiveString.indexOf(" "));
            parseTwentyFive = Integer.parseInt(TwentyFiveSubString);
            if (!app.prev.containsKey("24")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFive;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("24", "450 naira Big P. Fanta(3)");
            } else {
                String val = app.prev.get("24");
                TwentyFiveSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyFiveSubString) != parseTwentyFive) {
                    app.prev.remove("24");
                    app.prev.put("24", "450 naira Big P. Fanta(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFiveSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira Big P. Fanta(4)")) {
            TwentyFiveString = button4.getText().toString();
            TwentyFiveSubString = TwentyFiveString.substring(TwentyFiveString.indexOf(""), TwentyFiveString.indexOf(" "));
            parseTwentyFive = Integer.parseInt(TwentyFiveSubString);
            if (!app.prev.containsKey("24")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFive;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("24", "600 naira Big P. Fanta(4)");
            } else {
                String val = app.prev.get("24");
                TwentyFiveSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyFiveSubString) != parseTwentyFive) {
                    app.prev.remove("24");
                    app.prev.put("24", "600 naira Big P. Fanta(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFiveSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("750 naira Big P. Fanta(5)")) {
            TwentyFiveString = button5.getText().toString();
            TwentyFiveSubString = TwentyFiveString.substring(TwentyFiveString.indexOf(""), TwentyFiveString.indexOf(" "));
            parseTwentyFive = Integer.parseInt(TwentyFiveSubString);
            if (!app.prev.containsKey("24")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFive;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("24", "750 naira Big P. Fanta(5)");
            } else {
                String val = app.prev.get("24");
                TwentyFiveSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyFiveSubString) != parseTwentyFive) {
                    app.prev.remove("24");
                    app.prev.put("24", "750 naira Big P. Fanta(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFiveSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("900 naira Big P. Fanta(6)")) {
//            TwentyFiveString = button6.getText().toString();
//            TwentyFiveSubString = TwentyFiveString.substring(TwentyFiveString.indexOf(""), TwentyFiveString.indexOf(" "));
//            parseTwentyFive = Integer.parseInt(TwentyFiveSubString);
//            if (!app.prev.containsKey("24")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFive;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("24", "900 naira Big P. Fanta(6)");
//            } else {
//                String val = app.prev.get("24");
//                TwentyFiveSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(TwentyFiveSubString) != parseTwentyFive) {
//                    app.prev.remove("24");
//                    app.prev.put("24", "900 naira Big P. Fanta(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFiveSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFive;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//
//        }

        if (price.contentEquals("5 naira Pure Water")) {
            TwentySixString = button.getText().toString();
            TwentySixSubString = TwentySixString.substring(TwentySixString.indexOf(""), TwentySixString.indexOf(" "));
            parseTwentySix = Integer.parseInt(TwentySixSubString);
            if (!app.prev.containsKey("25")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentySix;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("25", "5 naira Pure Water");
            } else {
                String val = app.prev.get("25");
                TwentySixSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentySixSubString) != parseTwentySix) {
                    app.prev.remove("25");
                    app.prev.put("25", "5 naira Pure Water");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentySixSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentySix;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("10 naira Pure Water(2)")) {
            TwentySixString = button2.getText().toString();
            TwentySixSubString = TwentySixString.substring(TwentySixString.indexOf(""), TwentySixString.indexOf(" "));
            parseTwentySix = Integer.parseInt(TwentySixSubString);
            if (!app.prev.containsKey("25")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentySix;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("25", "10 naira Pure Water(2)");
            } else {
                String val = app.prev.get("25");
                TwentySixSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentySixSubString) != parseTwentySix) {
                    app.prev.remove("25");
                    app.prev.put("25", "10 naira Pure Water(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentySixSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentySix;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("15 naira Pure Water(3)")) {
            TwentySixString = button3.getText().toString();
            TwentySixSubString = TwentySixString.substring(TwentySixString.indexOf(""), TwentySixString.indexOf(" "));
            parseTwentySix = Integer.parseInt(TwentySixSubString);
            if (!app.prev.containsKey("25")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentySix;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("25", "15 naira Pure Water(3)");
            } else {
                String val = app.prev.get("25");
                TwentySixSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentySixSubString) != parseTwentySix) {
                    app.prev.remove("25");
                    app.prev.put("25", "15 naira Pure Water(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentySixSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentySix;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("20 naira Pure Water(4)")) {
            TwentySixString = button4.getText().toString();
            TwentySixSubString = TwentySixString.substring(TwentySixString.indexOf(""), TwentySixString.indexOf(" "));
            parseTwentySix = Integer.parseInt(TwentySixSubString);
            if (!app.prev.containsKey("25")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentySix;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("25", "20 naira Pure Water(4)");
            } else {
                String val = app.prev.get("25");
                TwentySixSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentySixSubString) != parseTwentySix) {
                    app.prev.remove("25");
                    app.prev.put("25", "20 naira Pure Water(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentySixSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentySix;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("25 naira Pure Water(5)")) {
            TwentySixString = button5.getText().toString();
            TwentySixSubString = TwentySixString.substring(TwentySixString.indexOf(""), TwentySixString.indexOf(" "));
            parseTwentySix = Integer.parseInt(TwentySixSubString);
            if (!app.prev.containsKey("25")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentySix;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("25", "25 naira Pure Water(5)");
            } else {
                String val = app.prev.get("25");
                TwentySixSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentySixSubString) != parseTwentySix) {
                    app.prev.remove("25");
                    app.prev.put("25", "25 naira Pure Water(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentySixSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentySix;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("30 naira Pure Water(6)")) {
//            TwentySixString = button6.getText().toString();
//            TwentySixSubString = TwentySixString.substring(TwentySixString.indexOf(""), TwentySixString.indexOf(" "));
//            parseTwentySix = Integer.parseInt(TwentySixSubString);
//            if (!app.prev.containsKey("25")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseTwentySix;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("25", "30 naira Pure Water(6)");
//            } else {
//                String val = app.prev.get("25");
//                TwentySixSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(TwentySixSubString) != parseTwentySix) {
//                    app.prev.remove("25");
//                    app.prev.put("25", "30 naira Pure Water(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentySixSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseTwentySix;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("50 naira Bottle Water")) {
            TwentySevenString = button.getText().toString();
            TwentySevenSubString = TwentySevenString.substring(TwentySevenString.indexOf(""), TwentySevenString.indexOf(" "));
            parseTwentySeven = Integer.parseInt(TwentySevenSubString);
            if (!app.prev.containsKey("26")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentySeven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("26", "50 naira Bottle Water");
            } else {
                String val = app.prev.get("26");
                TwentySevenSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentySevenSubString) != parseTwentySeven) {
                    app.prev.remove("26");
                    app.prev.put("26", "50 naira Bottle Water");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentySevenSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentySeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("100 naira Bottle Water(2)")) {
            TwentySevenString = button2.getText().toString();
            TwentySevenSubString = TwentySevenString.substring(TwentySevenString.indexOf(""), TwentySevenString.indexOf(" "));
            parseTwentySeven = Integer.parseInt(TwentySevenSubString);
            if (!app.prev.containsKey("26")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentySeven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("26", "100 naira Bottle Water(2)");
            } else {
                String val = app.prev.get("26");
                TwentySevenSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentySevenSubString) != parseTwentySeven) {
                    app.prev.remove("26");
                    app.prev.put("26", "100 naira Bottle Water(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentySevenSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentySeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }


        } else if (price.contentEquals("150 naira Bottle Water(3)")) {
            TwentySevenString = button3.getText().toString();
            TwentySevenSubString = TwentySevenString.substring(TwentySevenString.indexOf(""), TwentySevenString.indexOf(" "));
            parseTwentySeven = Integer.parseInt(TwentySevenSubString);
            if (!app.prev.containsKey("26")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentySeven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("26", "150 naira Bottle Water(3)");
            } else {
                String val = app.prev.get("26");
                TwentySevenSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentySevenSubString) != parseTwentySeven) {
                    app.prev.remove("26");
                    app.prev.put("26", "150 naira Bottle Water(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentySevenSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentySeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 naira Bottle Water(4)")) {
            TwentySevenString = button4.getText().toString();
            TwentySevenSubString = TwentySevenString.substring(TwentySevenString.indexOf(""), TwentySevenString.indexOf(" "));
            parseTwentySeven = Integer.parseInt(TwentySevenSubString);
            if (!app.prev.containsKey("26")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentySeven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("26", "200 naira Bottle Water(4)");
            } else {
                String val = app.prev.get("26");
                TwentySevenSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentySevenSubString) != parseTwentySeven) {
                    app.prev.remove("26");
                    app.prev.put("26", "200 naira Bottle Water(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentySevenSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentySeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("250 naira Bottle Water(5)")) {
            TwentySevenString = button5.getText().toString();
            TwentySevenSubString = TwentySevenString.substring(TwentySevenString.indexOf(""), TwentySevenString.indexOf(" "));
            parseTwentySeven = Integer.parseInt(TwentySevenSubString);
            if (!app.prev.containsKey("26")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentySeven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("26", "250 naira Bottle Water(5)");
            } else {
                String val = app.prev.get("26");
                TwentySevenSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentySevenSubString) != parseTwentySeven) {
                    app.prev.remove("26");
                    app.prev.put("26", "250 naira Bottle Water(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentySevenSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentySeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("300 naira Bottle Water(6)")) {
//            TwentySevenString = button6.getText().toString();
//            TwentySevenSubString = TwentySevenString.substring(TwentySevenString.indexOf(""), TwentySevenString.indexOf(" "));
//            parseTwentySeven = Integer.parseInt(TwentySevenSubString);
//            if (!app.prev.containsKey("26")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseTwentySeven;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("26", "300 naira Bottle Water(6)");
//            } else {
//                String val = app.prev.get("26");
//                TwentySevenSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(TwentySevenSubString) != parseTwentySeven) {
//                    app.prev.remove("26");
//                    app.prev.put("26", "300 naira Bottle Water(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentySevenSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseTwentySeven;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("150 naira C. MaltaGold")) {
            TwentyEightString = button.getText().toString();
            TwentyEightSubString = TwentyEightString.substring(TwentyEightString.indexOf(""), TwentyEightString.indexOf(" "));
            parseTwentyEight = Integer.parseInt(TwentyEightSubString);
            if (!app.prev.containsKey("27")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyEight;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("27", "150 naira C. MaltaGold");
            } else {
                String val = app.prev.get("27");
                TwentyEightSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyEightSubString) != parseTwentyEight) {
                    app.prev.remove("27");
                    app.prev.put("27", "150 naira C. MaltaGold");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyEightSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira C. MaltaGold(2)")) {
            TwentyEightString = button2.getText().toString();
            TwentyEightSubString = TwentyEightString.substring(TwentyEightString.indexOf(""), TwentyEightString.indexOf(" "));
            parseTwentyEight = Integer.parseInt(TwentyEightSubString);
            if (!app.prev.containsKey("27")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyEight;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("27", "300 naira C. MaltaGold(2)");
            } else {
                String val = app.prev.get("27");
                TwentyEightSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyEightSubString) != parseTwentyEight) {
                    app.prev.remove("27");
                    app.prev.put("27", "300 naira C. MaltaGold(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyEightSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }


        } else if (price.contentEquals("450 naira C. MaltaGold(3)")) {
            TwentyEightString = button3.getText().toString();
            TwentyEightSubString = TwentyEightString.substring(TwentyEightString.indexOf(""), TwentyEightString.indexOf(" "));
            parseTwentyEight = Integer.parseInt(TwentyEightSubString);
            if (!app.prev.containsKey("27")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyEight;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("27", "450 naira C. MaltaGold(3)");
            } else {
                String val = app.prev.get("27");
                TwentyEightSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyEightSubString) != parseTwentyEight) {
                    app.prev.remove("27");
                    app.prev.put("27", "450 naira C. MaltaGold(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyEightSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira C. MaltaGold(4)")) {
            TwentyEightString = button4.getText().toString();
            TwentyEightSubString = TwentyEightString.substring(TwentyEightString.indexOf(""), TwentyEightString.indexOf(" "));
            parseTwentyEight = Integer.parseInt(TwentyEightSubString);
            if (!app.prev.containsKey("27")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyEight;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("27", "600 naira C. MaltaGold(4)");
            } else {
                String val = app.prev.get("27");
                TwentyEightSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyEightSubString) != parseTwentyEight) {
                    app.prev.remove("27");
                    app.prev.put("27", "600 naira C. MaltaGold(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyEightSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("750 naira C. MaltaGold(5)")) {
            TwentyEightString = button5.getText().toString();
            TwentyEightSubString = TwentyEightString.substring(TwentyEightString.indexOf(""), TwentyEightString.indexOf(" "));
            parseTwentyEight = Integer.parseInt(TwentyEightSubString);
            if (!app.prev.containsKey("27")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyEight;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("27", "750 naira C. MaltaGold(5)");
            } else {
                String val = app.prev.get("27");
                TwentyEightSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyEightSubString) != parseTwentyEight) {
                    app.prev.remove("27");
                    app.prev.put("27", "750 naira C. MaltaGold(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyEightSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("900 naira C. MaltaGold(6)")) {
//            TwentyEightString = button6.getText().toString();
//            TwentyEightSubString = TwentyEightString.substring(TwentyEightString.indexOf(""), TwentyEightString.indexOf(" "));
//            parseTwentyEight = Integer.parseInt(TwentyEightSubString);
//            if (!app.prev.containsKey("27")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseTwentyEight;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("27", "900 naira C. MaltaGold(6)");
//            } else {
//                String val = app.prev.get("27");
//                TwentyEightSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(TwentyEightSubString) != parseTwentyEight) {
//                    app.prev.remove("27");
//                    app.prev.put("27", "900 naira C. MaltaGold(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyEightSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyEight;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("150 naira C. Maltina")) {
            TwentyNineString = button.getText().toString();
            TwentyNineSubString = TwentyNineString.substring(TwentyNineString.indexOf(""), TwentyNineString.indexOf(" "));
            parseTwentyNine = Integer.parseInt(TwentyNineSubString);
            if (!app.prev.containsKey("28")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyNine;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("28", "150 naira C. Maltina");
            } else {
                String val = app.prev.get("28");
                TwentyNineSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyNineSubString) != parseTwentyNine) {
                    app.prev.remove("28");
                    app.prev.put("28", "150 naira C. Maltina");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyNineSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira C. Maltina(2)")) {
            TwentyNineString = button2.getText().toString();
            TwentyNineSubString = TwentyNineString.substring(TwentyNineString.indexOf(""), TwentyNineString.indexOf(" "));
            parseTwentyNine = Integer.parseInt(TwentyNineSubString);
            if (!app.prev.containsKey("28")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyNine;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("28", "300 naira C. Maltina(2)");
            } else {
                String val = app.prev.get("28");
                TwentyNineSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(TwentyNineSubString) != parseTwentyNine) {
                    app.prev.remove("28");
                    app.prev.put("28", "300 naira C. Maltina(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyNineSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("450 naira C. Maltina(3)")) {
            TwentyNineString = button3.getText().toString();
            TwentyNineSubString = TwentyNineString.substring(TwentyNineString.indexOf(""), TwentyNineString.indexOf(" "));
            parseTwentyNine = Integer.parseInt(TwentyNineSubString);
            if (!app.prev.containsKey("28")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyNine;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("28", "450 naira C. Maltina(3)");
            } else {
                String val = app.prev.get("28");
                TwentyNineSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(TwentyNineSubString) != parseTwentyNine) {
                    app.prev.remove("28");
                    app.prev.put("28", "450 naira C. Maltina(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyNineSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira C. Maltina(4)")) {
            TwentyNineString = button4.getText().toString();
            TwentyNineSubString = TwentyNineString.substring(TwentyNineString.indexOf(""), TwentyNineString.indexOf(" "));
            parseTwentyNine = Integer.parseInt(TwentyNineSubString);
            if (!app.prev.containsKey("28")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyNine;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("28", "600 naira C. Maltina(4)");
            } else {
                String val = app.prev.get("28");
                TwentyNineSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(TwentyNineSubString) != parseTwentyNine) {
                    app.prev.remove("28");
                    app.prev.put("28", "600 naira C. Maltina(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyNineSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("750 naira C. Maltina(5)")) {
            TwentyNineString = button5.getText().toString();
            TwentyNineSubString = TwentyNineString.substring(TwentyNineString.indexOf(""), TwentyNineString.indexOf(" "));
            parseTwentyNine = Integer.parseInt(TwentyNineSubString);
            if (!app.prev.containsKey("28")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyNine;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("28", "750 naira C. Maltina(5)");
            } else {
                String val = app.prev.get("28");
                TwentyNineSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(TwentyNineSubString) != parseTwentyNine) {
                    app.prev.remove("28");
                    app.prev.put("28", "750 naira C. Maltina(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyNineSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("900 naira C. Maltina(6)")) {
//            TwentyNineString = button6.getText().toString();
//            TwentyNineSubString = TwentyNineString.substring(TwentyNineString.indexOf(""), TwentyNineString.indexOf(" "));
//            parseTwentyNine = Integer.parseInt(TwentyNineSubString);
//            if (!app.prev.containsKey("28")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseTwentyNine;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("28", "900 naira C. Maltina(6)");
//            } else {
//                String val = app.prev.get("28");
//                TwentyNineSubString = val.substring(0, val.indexOf("n")).trim();
//
//                if (Integer.parseInt(TwentyNineSubString) != parseTwentyNine) {
//                    app.prev.remove("28");
//                    app.prev.put("28", "900 naira C. Maltina(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyNineSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyNine;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("150 naira C. Himalt")) {
            ThirtyString = button.getText().toString();
            ThirtySubString = ThirtyString.substring(ThirtyString.indexOf(""), ThirtyString.indexOf(" "));
            parseThirty = Integer.parseInt(ThirtySubString);
            if (!app.prev.containsKey("29")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("29", "150 naira C. Himalt");
            } else {
                String val = app.prev.get("29");
                ThirtySubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtySubString) != parseThirty) {
                    app.prev.remove("29");
                    app.prev.put("29", "150 naira C. Himalt");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira C. Himalt(2)")) {
            ThirtyString = button2.getText().toString();
            ThirtySubString = ThirtyString.substring(ThirtyString.indexOf(""), ThirtyString.indexOf(" "));
            parseThirty = Integer.parseInt(ThirtySubString);
            if (!app.prev.containsKey("29")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("29", "300 naira C. Himalt(2)");
            } else {
                String val = app.prev.get("29");
                ThirtySubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtySubString) != parseThirty) {
                    app.prev.remove("29");
                    app.prev.put("29", "300 naira C. Himalt(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }


        } else if (price.contentEquals("450 naira C. Himalt(3)")) {
            ThirtyString = button3.getText().toString();
            ThirtySubString = ThirtyString.substring(ThirtyString.indexOf(""), ThirtyString.indexOf(" "));
            parseThirty = Integer.parseInt(ThirtySubString);
            if (!app.prev.containsKey("29")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("29", "450 naira C. Himalt(3)");
            } else {
                String val = app.prev.get("29");
                ThirtySubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtySubString) != parseThirty) {
                    app.prev.remove("29");
                    app.prev.put("29", "450 naira C. Himalt(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira C. Himalt(4)")) {
            ThirtyString = button4.getText().toString();
            ThirtySubString = ThirtyString.substring(ThirtyString.indexOf(""), ThirtyString.indexOf(" "));
            parseThirty = Integer.parseInt(ThirtySubString);
            if (!app.prev.containsKey("29")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("29", "600 naira C. Himalt(4)");
            } else {
                String val = app.prev.get("29");
                ThirtySubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtySubString) != parseThirty) {
                    app.prev.remove("29");
                    app.prev.put("29", "600 naira C. Himalt(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("750 naira C. Himalt(5)")) {
            ThirtyString = button5.getText().toString();
            ThirtySubString = ThirtyString.substring(ThirtyString.indexOf(""), ThirtyString.indexOf(" "));
            parseThirty = Integer.parseInt(ThirtySubString);
            if (!app.prev.containsKey("29")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("29", "750 naira C. Himalt(5)");
            } else {
                String val = app.prev.get("29");
                ThirtySubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtySubString) != parseThirty) {
                    app.prev.remove("29");
                    app.prev.put("29", "750 naira C. Himalt(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("900 naira C. Himalt(6)")) {
//            ThirtyString = button6.getText().toString();
//            ThirtySubString = ThirtyString.substring(ThirtyString.indexOf(""), ThirtyString.indexOf(" "));
//            parseThirty = Integer.parseInt(ThirtySubString);
//            if (!app.prev.containsKey("29")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseThirty;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("29", "900 naira C. Himalt(6)");
//            } else {
//                String val = app.prev.get("29");
//                ThirtySubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(ThirtySubString) != parseThirty) {
//                    app.prev.remove("29");
//                    app.prev.put("29", "900 naira C. Himalt(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseThirty;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("150 naira C. MaltaGuinness")) {
            ThirtyOneString = button.getText().toString();
            ThirtyOneSubString = ThirtyOneString.substring(ThirtyOneString.indexOf(""), ThirtyOneString.indexOf(" "));
            parseThirtyOne = Integer.parseInt(ThirtyOneSubString);
            if (!app.prev.containsKey("30")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("30", "150 naira C. MaltaGuinness");
            } else {
                String val = app.prev.get("30");
                ThirtyOneSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyOneSubString) != parseThirtyOne) {
                    app.prev.remove("30");
                    app.prev.put("30", "150 naira C. MaltaGuinness");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira C. MaltaGuinness(2)")) {
            ThirtyOneString = button2.getText().toString();
            ThirtyOneSubString = ThirtyOneString.substring(ThirtyOneString.indexOf(""), ThirtyOneString.indexOf(" "));
            parseThirtyOne = Integer.parseInt(ThirtyOneSubString);
            if (!app.prev.containsKey("30")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("30", "300 naira C. MaltaGuinness(2)");
            } else {
                String val = app.prev.get("30");
                ThirtyOneSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtyOneSubString) != parseThirtyOne) {
                    app.prev.remove("30");
                    app.prev.put("30", "300 naira C. MaltaGuinness(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("450 naira C. MaltaGuinness(3)")) {
            ThirtyOneString = button3.getText().toString();
            ThirtyOneSubString = ThirtyOneString.substring(ThirtyOneString.indexOf(""), ThirtyOneString.indexOf(" "));
            parseThirtyOne = Integer.parseInt(ThirtyOneSubString);
            if (!app.prev.containsKey("30")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("30", "450 naira C. MaltaGuinness(3)");
            } else {
                String val = app.prev.get("30");
                ThirtyOneSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtyOneSubString) != parseThirtyOne) {
                    app.prev.remove("30");
                    app.prev.put("30", "450 naira C. MaltaGuinness(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira C. MaltaGuinness(4)")) {
            ThirtyOneString = button4.getText().toString();
            ThirtyOneSubString = ThirtyOneString.substring(ThirtyOneString.indexOf(""), ThirtyOneString.indexOf(" "));
            parseThirtyOne = Integer.parseInt(ThirtyOneSubString);
            if (!app.prev.containsKey("30")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("30", "600 naira C. MaltaGuinness(4)");
            } else {
                String val = app.prev.get("30");
                ThirtyOneSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtyOneSubString) != parseThirtyOne) {
                    app.prev.remove("30");
                    app.prev.put("30", "600 naira C. MaltaGuinness(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("750 naira C. MaltaGuinness(5)")) {
            ThirtyOneString = button5.getText().toString();
            ThirtyOneSubString = ThirtyOneString.substring(ThirtyOneString.indexOf(""), ThirtyOneString.indexOf(" "));
            parseThirtyOne = Integer.parseInt(ThirtyOneSubString);
            if (!app.prev.containsKey("30")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("30", "750 naira C. MaltaGuinness(5)");
            } else {
                String val = app.prev.get("30");
                ThirtyOneSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtyOneSubString) != parseThirtyOne) {
                    app.prev.remove("30");
                    app.prev.put("30", "750 naira C. MaltaGuinness(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("900 naira C. MaltaGuinness(6)")) {
//            ThirtyOneString = button6.getText().toString();
//            ThirtyOneSubString = ThirtyOneString.substring(ThirtyOneString.indexOf(""), ThirtyOneString.indexOf(" "));
//            parseThirtyOne = Integer.parseInt(ThirtyOneSubString);
//            if (!app.prev.containsKey("30")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseThirtyOne;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("30", "900 naira C. MaltaGuinness(6)");
//            } else {
//                String val = app.prev.get("30");
//                ThirtyOneSubString = val.substring(0, val.indexOf("n")).trim();
//
//                if (Integer.parseInt(ThirtyOneSubString) != parseThirtyOne) {
//                    app.prev.remove("30");
//                    app.prev.put("30", "900 naira C. MaltaGuinness(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyOneSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyOne;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("500 naira 5Alive Juice")) {
            ThirtyTwoString = button.getText().toString();
            ThirtyTwoSubString = ThirtyTwoString.substring(ThirtyTwoString.indexOf(""), ThirtyTwoString.indexOf(" "));
            parseThirtyTwo = Integer.parseInt(ThirtyTwoSubString);
            if (!app.prev.containsKey("31")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("31", "500 naira 5Alive Juice");
            } else {
                String val = app.prev.get("31");
                ThirtyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyTwoSubString) != parseThirtyTwo) {
                    app.prev.remove("31");
                    app.prev.put("31", "500 naira 5Alive Juice");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1000 naira 5Alive Juice(2)")) {
            ThirtyTwoString = button2.getText().toString();
            ThirtyTwoSubString = ThirtyTwoString.substring(ThirtyTwoString.indexOf(""), ThirtyTwoString.indexOf(" "));
            parseThirtyTwo = Integer.parseInt(ThirtyTwoSubString);
            if (!app.prev.containsKey("31")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("31", "1000 naira 5Alive Juice(2)");
            } else {
                String val = app.prev.get("31");
                ThirtyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyTwoSubString) != parseThirtyTwo) {
                    app.prev.remove("31");
                    app.prev.put("31", "1000 naira 5Alive Juice(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1500 naira 5Alive Juice(3)")) {
            ThirtyTwoString = button3.getText().toString();
            ThirtyTwoSubString = ThirtyTwoString.substring(ThirtyTwoString.indexOf(""), ThirtyTwoString.indexOf(" "));
            parseThirtyTwo = Integer.parseInt(ThirtyTwoSubString);
            if (!app.prev.containsKey("31")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("31", "1500 naira 5Alive Juice(3)");
            } else {
                String val = app.prev.get("31");
                ThirtyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyTwoSubString) != parseThirtyTwo) {
                    app.prev.remove("31");
                    app.prev.put("31", "1500 naira 5Alive Juice(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("2000 naira 5Alive Juice(4)")) {
            ThirtyTwoString = button4.getText().toString();
            ThirtyTwoSubString = ThirtyTwoString.substring(ThirtyTwoString.indexOf(""), ThirtyTwoString.indexOf(" "));
            parseThirtyTwo = Integer.parseInt(ThirtyTwoSubString);
            if (!app.prev.containsKey("31")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("31", "2000 naira 5Alive Juice(4)");
            } else {
                String val = app.prev.get("31");
                ThirtyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyTwoSubString) != parseThirtyTwo) {
                    app.prev.remove("31");
                    app.prev.put("31", "2000 naira 5Alive Juice(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("2500 naira 5Alive Juice(5)")) {
            ThirtyTwoString = button5.getText().toString();
            ThirtyTwoSubString = ThirtyTwoString.substring(ThirtyTwoString.indexOf(""), ThirtyTwoString.indexOf(" "));
            parseThirtyTwo = Integer.parseInt(ThirtyTwoSubString);
            if (!app.prev.containsKey("31")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("31", "2500 naira 5Alive Juice(5)");
            } else {
                String val = app.prev.get("31");
                ThirtyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyTwoSubString) != parseThirtyTwo) {
                    app.prev.remove("31");
                    app.prev.put("31", "2500 naira 5Alive Juice(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("3000 naira 5Alive Juice(6)")) {
//            ThirtyTwoString = button6.getText().toString();
//            ThirtyTwoSubString = ThirtyTwoString.substring(ThirtyTwoString.indexOf(""), ThirtyTwoString.indexOf(" "));
//            parseThirtyTwo = Integer.parseInt(ThirtyTwoSubString);
//            if (!app.prev.containsKey("31")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseThirtyTwo;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("31", "3000 naira 5Alive Juice(6)");
//            } else {
//                String val = app.prev.get("31");
//                ThirtyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(ThirtyTwoSubString) != parseThirtyTwo) {
//                    app.prev.remove("31");
//                    app.prev.put("31", "3000 naira 5Alive Juice(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyTwoSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyTwo;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("300 naira Small Hollandia Juice")) {
            ThirtyThreeString = button.getText().toString();
            ThirtyThreeSubString = ThirtyThreeString.substring(ThirtyThreeString.indexOf(""), ThirtyThreeString.indexOf(" "));
            parseThirtyThree = Integer.parseInt(ThirtyThreeSubString);
            if (!app.prev.containsKey("32")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("32", "300 naira Small Hollandia Juice");
            } else {
                String val = app.prev.get("32");
                ThirtyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyThreeSubString) != parseThirtyThree) {
                    app.prev.remove("32");
                    app.prev.put("32", "300 naira Small Hollandia Juice");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira Small Hollandia Juice(2)")) {
            ThirtyThreeString = button2.getText().toString();
            ThirtyThreeSubString = ThirtyThreeString.substring(ThirtyThreeString.indexOf(""), ThirtyThreeString.indexOf(" "));
            parseThirtyThree = Integer.parseInt(ThirtyThreeSubString);
            if (!app.prev.containsKey("32")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("32", "600 naira Small Hollandia Juice(2)");
            } else {
                String val = app.prev.get("32");
                ThirtyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyThreeSubString) != parseThirtyThree) {
                    app.prev.remove("32");
                    app.prev.put("32", "600 naira Small Hollandia Juice(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }


        } else if (price.contentEquals("900 naira Small Hollandia Juice(3)")) {
            ThirtyThreeString = button3.getText().toString();
            ThirtyThreeSubString = ThirtyThreeString.substring(ThirtyThreeString.indexOf(""), ThirtyThreeString.indexOf(" "));
            parseThirtyThree = Integer.parseInt(ThirtyThreeSubString);
            if (!app.prev.containsKey("32")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("32", "900 naira Small Hollandia Juice(3)");
            } else {
                String val = app.prev.get("32");
                ThirtyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyThreeSubString) != parseThirtyThree) {
                    app.prev.remove("32");
                    app.prev.put("32", "900 naira Small Hollandia Juice(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1200 naira Small Hollandia Juice(4)")) {
            ThirtyThreeString = button4.getText().toString();
            ThirtyThreeSubString = ThirtyThreeString.substring(ThirtyThreeString.indexOf(""), ThirtyThreeString.indexOf(" "));
            parseThirtyThree = Integer.parseInt(ThirtyThreeSubString);
            if (!app.prev.containsKey("32")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("32", "1200 naira Small Hollandia Juice(4)");
            } else {
                String val = app.prev.get("32");
                ThirtyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyThreeSubString) != parseThirtyThree) {
                    app.prev.remove("32");
                    app.prev.put("32", "1200 naira Small Hollandia Juice(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1500 naira Small Hollandia Juice(5)")) {
            ThirtyThreeString = button5.getText().toString();
            ThirtyThreeSubString = ThirtyThreeString.substring(ThirtyThreeString.indexOf(""), ThirtyThreeString.indexOf(" "));
            parseThirtyThree = Integer.parseInt(ThirtyThreeSubString);
            if (!app.prev.containsKey("32")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("32", "1500 naira Small Hollandia Juice(5)");
            } else {
                String val = app.prev.get("32");
                ThirtyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyThreeSubString) != parseThirtyThree) {
                    app.prev.remove("32");
                    app.prev.put("32", "1500 naira Small Hollandia Juice(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("1800 naira Small Hollandia Juice(6)")) {
//            ThirtyThreeString = button6.getText().toString();
//            ThirtyThreeSubString = ThirtyThreeString.substring(ThirtyThreeString.indexOf(""), ThirtyThreeString.indexOf(" "));
//            parseThirtyThree = Integer.parseInt(ThirtyThreeSubString);
//            if (!app.prev.containsKey("32")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseThirtyThree;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("32", "1800 naira Small Hollandia Juice(6)");
//            } else {
//                String val = app.prev.get("32");
//                ThirtyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(ThirtyThreeSubString) != parseThirtyThree) {
//                    app.prev.remove("32");
//                    app.prev.put("32", "1800 naira Small Hollandia Juice(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyThreeSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyThree;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("500 naira Big Hollandia Juice")) {
            ThirtyFourString = button.getText().toString();
            ThirtyFourSubString = ThirtyFourString.substring(ThirtyFourString.indexOf(""), ThirtyFourString.indexOf(" "));
            parseThirtyFour = Integer.parseInt(ThirtyFourSubString);
            if (!app.prev.containsKey("33")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("33", "500 naira Big Hollandia Juice");
            } else {
                String val = app.prev.get("33");
                ThirtyFourSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyFourSubString) != parseThirtyFour) {
                    app.prev.remove("33");
                    app.prev.put("33", "500 naira Big Hollandia Juice");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyFourSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1000 naira Big Hollandia Juice(2)")) {
            ThirtyFourString = button2.getText().toString();
            ThirtyFourSubString = ThirtyFourString.substring(ThirtyFourString.indexOf(""), ThirtyFourString.indexOf(" "));
            parseThirtyFour = Integer.parseInt(ThirtyFourSubString);
            if (!app.prev.containsKey("33")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("33", "1000 naira Big Hollandia Juice(2)");
            } else {
                String val = app.prev.get("33");
                ThirtyFourSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyFourSubString) != parseThirtyFour) {
                    app.prev.remove("33");
                    app.prev.put("33", "1000 naira Big Hollandia Juice(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyFourSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1500 naira Big Hollandia Juice(3)")) {
            ThirtyFourString = button3.getText().toString();
            ThirtyFourSubString = ThirtyFourString.substring(ThirtyFourString.indexOf(""), ThirtyFourString.indexOf(" "));
            parseThirtyFour = Integer.parseInt(ThirtyFourSubString);
            if (!app.prev.containsKey("33")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("33", "1500 naira Big Hollandia Juice(3)");
            } else {
                String val = app.prev.get("33");
                ThirtyFourSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtyFourSubString) != parseThirtyFour) {
                    app.prev.remove("33");
                    app.prev.put("33", "1500 naira Big Hollandia Juice(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyFourSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("2000 naira Big Hollandia Juice(4)")) {
            ThirtyFourString = button4.getText().toString();
            ThirtyFourSubString = ThirtyFourString.substring(ThirtyFourString.indexOf(""), ThirtyFourString.indexOf(" "));
            parseThirtyFour = Integer.parseInt(ThirtyFourSubString);
            if (!app.prev.containsKey("33")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("33", "2000 naira Big Hollandia Juice(4)");
            } else {
                String val = app.prev.get("33");
                ThirtyFourSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtyFourSubString) != parseThirtyFour) {
                    app.prev.remove("33");
                    app.prev.put("33", "2000 naira Big Hollandia Juice(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyFourSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("2500 naira Big Hollandia Juice(5)")) {
            ThirtyFourString = button5.getText().toString();
            ThirtyFourSubString = ThirtyFourString.substring(ThirtyFourString.indexOf(""), ThirtyFourString.indexOf(" "));
            parseThirtyFour = Integer.parseInt(ThirtyFourSubString);
            if (!app.prev.containsKey("33")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("33", "2500 naira Big Hollandia Juice(5)");
            } else {
                String val = app.prev.get("33");
                ThirtyFourSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtyFourSubString) != parseThirtyFour) {
                    app.prev.remove("33");
                    app.prev.put("33", "2500 naira Big Hollandia Juice(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyFourSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("3000 naira Big Hollandia Juice(6)")) {
//            ThirtyFourString = button6.getText().toString();
//            ThirtyFourSubString = ThirtyFourString.substring(ThirtyFourString.indexOf(""), ThirtyFourString.indexOf(" "));
//            parseThirtyFour = Integer.parseInt(ThirtyFourSubString);
//            if (!app.prev.containsKey("33")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseThirtyFour;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("33", "3000 naira Big Hollandia Juice(6)");
//            } else {
//                String val = app.prev.get("33");
//                ThirtyFourSubString = val.substring(0, val.indexOf("n")).trim();
//
//                if (Integer.parseInt(ThirtyFourSubString) != parseThirtyFour) {
//                    app.prev.remove("33");
//                    app.prev.put("33", "3000 naira Big Hollandia Juice(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyFourSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyFour;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("300 naira Small ChiExotic Juice")) {
            ThirtyFiveString = button.getText().toString();
            ThirtyFiveSubString = ThirtyFiveString.substring(ThirtyFiveString.indexOf(""), ThirtyFiveString.indexOf(" "));
            parseThirtyFive = Integer.parseInt(ThirtyFiveSubString);
            if (!app.prev.containsKey("34")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyFive;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("34", "300 naira Small ChiExotic Juice");
            } else {
                String val = app.prev.get("34");
                ThirtyFiveSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyFiveSubString) != parseThirtyFive) {
                    app.prev.remove("34");
                    app.prev.put("34", "300 naira Small ChiExotic Juice");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyFiveSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira Small ChiExotic Juice(2)")) {
            ThirtyFiveString = button2.getText().toString();
            ThirtyFiveSubString = ThirtyFiveString.substring(ThirtyFiveString.indexOf(""), ThirtyFiveString.indexOf(" "));
            parseThirtyFive = Integer.parseInt(ThirtyFiveSubString);
            if (!app.prev.containsKey("34")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyFive;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("34", "600 naira Small ChiExotic Juice(2)");
            } else {
                String val = app.prev.get("34");
                ThirtyFiveSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtyFiveSubString) != parseThirtyFive) {
                    app.prev.remove("34");
                    app.prev.put("34", "600 naira Small ChiExotic Juice(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyFiveSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("900 naira Small ChiExotic Juice(3)")) {
            ThirtyFiveString = button3.getText().toString();
            ThirtyFiveSubString = ThirtyFiveString.substring(ThirtyFiveString.indexOf(""), ThirtyFiveString.indexOf(" "));
            parseThirtyFive = Integer.parseInt(ThirtyFiveSubString);
            if (!app.prev.containsKey("34")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyFive;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("34", "900 naira Small ChiExotic Juice(3)");
            } else {
                String val = app.prev.get("34");
                ThirtyFiveSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(TwentyFiveSubString) != parseThirtyFive) {
                    app.prev.remove("34");
                    app.prev.put("34", "900 naira Small ChiExotic Juice(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyFiveSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1200 naira Small ChiExotic Juice(4)")) {
            ThirtyFiveString = button4.getText().toString();
            ThirtyFiveSubString = ThirtyFiveString.substring(ThirtyFiveString.indexOf(""), ThirtyFiveString.indexOf(" "));
            parseThirtyFive = Integer.parseInt(ThirtyFiveSubString);
            if (!app.prev.containsKey("34")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyFive;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("34", "1200 naira Small ChiExotic Juice(4)");
            } else {
                String val = app.prev.get("34");
                ThirtyFiveSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtyFiveSubString) != parseThirtyFive) {
                    app.prev.remove("34");
                    app.prev.put("34", "1200 naira Small ChiExotic Juice(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyFiveSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1500 naira Small ChiExotic Juice(5)")) {
            ThirtyFiveString = button5.getText().toString();
            ThirtyFiveSubString = ThirtyFiveString.substring(ThirtyFiveString.indexOf(""), ThirtyFiveString.indexOf(" "));
            parseThirtyFive = Integer.parseInt(ThirtyFiveSubString);
            if (!app.prev.containsKey("34")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyFive;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("34", "1500 naira Small ChiExotic Juice(5)");
            } else {
                String val = app.prev.get("34");
                ThirtyFiveSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtyFiveSubString) != parseThirtyFive) {
                    app.prev.remove("34");
                    app.prev.put("34", "1500 naira Small ChiExotic Juice(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyFiveSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("1800 naira Small ChiExotic Juice(6)")) {
//            ThirtyFiveString = button6.getText().toString();
//            ThirtyFiveSubString = ThirtyFiveString.substring(ThirtyFiveString.indexOf(""), ThirtyFiveString.indexOf(" "));
//            parseThirtyFive = Integer.parseInt(ThirtyFiveSubString);
//            if (!app.prev.containsKey("34")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseThirtyFive;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("34", "1800 naira Small ChiExotic Juice(6)");
//            } else {
//                String val = app.prev.get("34");
//                ThirtyFiveSubString = val.substring(0, val.indexOf("n")).trim();
//
//                if (Integer.parseInt(ThirtyFiveSubString) != parseThirtyFive) {
//                    app.prev.remove("34");
//                    app.prev.put("34", "1800 naira Small ChiExotic Juice(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyFiveSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyFive;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("500 naira Big ChiExotic Juice")) {
            ThirtySixString = button.getText().toString();
            ThirtySixSubString = ThirtySixString.substring(ThirtySixString.indexOf(""), ThirtySixString.indexOf(" "));
            parseThirtySix = Integer.parseInt(ThirtySixSubString);
            if (!app.prev.containsKey("35")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtySix;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("35", "500 naira Big ChiExotic Juice");
            } else {
                String val = app.prev.get("35");
                ThirtySixSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtySixSubString) != parseThirtySix) {
                    app.prev.remove("35");
                    app.prev.put("35", "500 naira Big ChiExotic Juice");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySixSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtySix;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1000 naira Big ChiExotic Juice(2)")) {
            ThirtySixString = button2.getText().toString();
            ThirtySixSubString = ThirtySixString.substring(ThirtySixString.indexOf(""), ThirtySixString.indexOf(" "));
            parseThirtySix = Integer.parseInt(ThirtySixSubString);
            if (!app.prev.containsKey("35")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtySix;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("35", "1000 naira Big ChiExotic Juice(2)");
            } else {
                String val = app.prev.get("35");
                ThirtySixSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtySixSubString) != parseThirtySix) {
                    app.prev.remove("35");
                    app.prev.put("35", "1000 naira Big ChiExotic Juice(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySixSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtySix;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1500 naira Big ChiExotic Juice(3)")) {
            ThirtySixString = button3.getText().toString();
            ThirtySixSubString = ThirtySixString.substring(ThirtySixString.indexOf(""), ThirtySixString.indexOf(" "));
            parseThirtySix = Integer.parseInt(ThirtySixSubString);
            if (!app.prev.containsKey("35")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtySix;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("35", "1500 naira Big ChiExotic Juice(3)");
            } else {
                String val = app.prev.get("35");
                ThirtySixSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtySixSubString) != parseThirtySix) {
                    app.prev.remove("35");
                    app.prev.put("35", "1500 naira Big ChiExotic Juice(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySixSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtySix;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("2000 naira Big ChiExotic Juice(4)")) {
            ThirtySixString = button4.getText().toString();
            ThirtySixSubString = ThirtySixString.substring(ThirtySixString.indexOf(""), ThirtySixString.indexOf(" "));
            parseThirtySix = Integer.parseInt(ThirtySixSubString);
            if (!app.prev.containsKey("35")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtySix;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("35", "2000 naira Big ChiExotic Juice(4)");
            } else {
                String val = app.prev.get("35");
                ThirtySixSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtySixSubString) != parseThirtySix) {
                    app.prev.remove("35");
                    app.prev.put("35", "2000 naira Big ChiExotic Juice(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySixSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtySix;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("2500 naira Big ChiExotic Juice(5)")) {
            ThirtySixString = button5.getText().toString();
            ThirtySixSubString = ThirtySixString.substring(ThirtySixString.indexOf(""), ThirtySixString.indexOf(" "));
            parseThirtySix = Integer.parseInt(ThirtySixSubString);
            if (!app.prev.containsKey("35")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtySix;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("35", "2500 naira Big ChiExotic Juice(5)");
            } else {
                String val = app.prev.get("35");
                ThirtySixSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtySixSubString) != parseThirtySix) {
                    app.prev.remove("35");
                    app.prev.put("35", "2500 naira Big ChiExotic Juice(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySixSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtySix;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("3000 naira Big ChiExotic Juice(6)")) {
//            ThirtySixString = button6.getText().toString();
//            ThirtySixSubString = ThirtySixString.substring(ThirtySixString.indexOf(""), ThirtySixString.indexOf(" "));
//            parseThirtySix = Integer.parseInt(ThirtySixSubString);
//            if (!app.prev.containsKey("35")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseThirtySix;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("35", "3000 naira Big ChiExotic Juice(6)");
//            } else {
//                String val = app.prev.get("35");
//                ThirtySixSubString = val.substring(0, val.indexOf("n")).trim();
//
//                if (Integer.parseInt(ThirtySixSubString) != parseThirtySix) {
//                    app.prev.remove("35");
//                    app.prev.put("35", "3000 naira Big ChiExotic Juice(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySixSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseThirtySix;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("300 naira Small Chivita Juice")) {
            ThirtySevenString = button.getText().toString();
            ThirtySevenSubString = ThirtySevenString.substring(ThirtySevenString.indexOf(""), ThirtySevenString.indexOf(" "));
            parseThirtySeven = Integer.parseInt(ThirtySevenSubString);
            if (!app.prev.containsKey("36")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtySeven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("36", "300 naira Small Chivita Juice");
            } else {
                String val = app.prev.get("36");
                ThirtySevenSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtySevenSubString) != parseThirtySeven) {
                    app.prev.remove("36");
                    app.prev.put("36", "300 naira Small Chivita Juice");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySevenSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtySeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira Small Chivita Juice(2)")) {
            ThirtySevenString = button2.getText().toString();
            ThirtySevenSubString = ThirtySevenString.substring(ThirtySevenString.indexOf(""), ThirtySevenString.indexOf(" "));
            parseThirtySeven = Integer.parseInt(ThirtySevenSubString);
            if (!app.prev.containsKey("36")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtySeven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("36", "600 naira Small Chivita Juice(2)");
            } else {
                String val = app.prev.get("36");
                ThirtySevenSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtySevenSubString) != parseThirtySeven) {
                    app.prev.remove("36");
                    app.prev.put("36", "600 naira Small Chivita Juice(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySevenSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtySeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("900 naira Small Chivita Juice(3)")) {
            ThirtySevenString = button3.getText().toString();
            ThirtySevenSubString = ThirtySevenString.substring(ThirtySevenString.indexOf(""), ThirtySevenString.indexOf(" "));
            parseThirtySeven = Integer.parseInt(ThirtySevenSubString);
            if (!app.prev.containsKey("36")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtySeven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("36", "900 naira Small Chivita Juice(3)");
            } else {
                String val = app.prev.get("36");
                ThirtySevenSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtySevenSubString) != parseThirtySeven) {
                    app.prev.remove("36");
                    app.prev.put("36", "900 naira Small Chivita Juice(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySevenSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtySeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1200 naira Small Chivita Juice(4)")) {
            ThirtySevenString = button4.getText().toString();
            ThirtySevenSubString = ThirtySevenString.substring(ThirtySevenString.indexOf(""), ThirtySevenString.indexOf(" "));
            parseThirtySeven = Integer.parseInt(ThirtySevenSubString);
            if (!app.prev.containsKey("36")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtySeven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("36", "1200 naira Small Chivita Juice(4)");
            } else {
                String val = app.prev.get("36");
                ThirtySevenSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtySevenSubString) != parseThirtySeven) {
                    app.prev.remove("36");
                    app.prev.put("36", "1200 naira Small Chivita Juice(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySevenSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtySeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1500 naira Small Chivita Juice(5)")) {
            ThirtySevenString = button5.getText().toString();
            ThirtySevenSubString = ThirtySevenString.substring(ThirtySevenString.indexOf(""), ThirtySevenString.indexOf(" "));
            parseThirtySeven = Integer.parseInt(ThirtySevenSubString);
            if (!app.prev.containsKey("36")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtySeven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("36", "1500 naira Small Chivita Juice(5)");
            } else {
                String val = app.prev.get("36");
                ThirtySevenSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtySevenSubString) != parseThirtySeven) {
                    app.prev.remove("36");
                    app.prev.put("36", "1500 naira Small Chivita Juice(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySevenSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtySeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("1800 naira Small Chivita Juice(6)")) {
//            ThirtySevenString = button6.getText().toString();
//            ThirtySevenSubString = ThirtySevenString.substring(ThirtySevenString.indexOf(""), ThirtySevenString.indexOf(" "));
//            parseThirtySeven = Integer.parseInt(ThirtySevenSubString);
//            if (!app.prev.containsKey("36")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseThirtySeven;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("36", "1800 naira Small Chivita Juice(6)");
//            } else {
//                String val = app.prev.get("36");
//                ThirtySevenSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(ThirtySevenSubString) != parseThirtySeven) {
//                    app.prev.remove("36");
//                    app.prev.put("36", "1800 naira Small Chivita Juice(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtySevenSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseThirtySeven;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("500 naira Big Chivita Juice")) {
            ThirtyEightString = button.getText().toString();
            ThirtyEightSubString = ThirtyEightString.substring(ThirtyEightString.indexOf(""), ThirtyEightString.indexOf(" "));
            parseThirtyEight = Integer.parseInt(ThirtyEightSubString);
            if (!app.prev.containsKey("37")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyEight;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("37", "500 naira Big Chivita Juice");
            } else {
                String val = app.prev.get("37");
                ThirtyEightSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyEightSubString) != parseThirtyEight) {
                    app.prev.remove("37");
                    app.prev.put("37", "500 naira Big Chivita Juice");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyEightSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1000 naira Big Chivita Juice(2)")) {
            ThirtyEightString = button2.getText().toString();
            ThirtyEightSubString = ThirtyEightString.substring(ThirtyEightString.indexOf(""), ThirtyEightString.indexOf(" "));
            parseThirtyEight = Integer.parseInt(ThirtyEightSubString);
            if (!app.prev.containsKey("37")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyEight;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("37", "1000 naira Big Chivita Juice(2)");
            } else {
                String val = app.prev.get("37");
                ThirtyEightSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtyEightSubString) != parseThirtyEight) {
                    app.prev.remove("37");
                    app.prev.put("37", "1000 naira Big Chivita Juice(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyEightSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1500 naira Big Chivita Juice(3)")) {
            ThirtyEightString = button3.getText().toString();
            ThirtyEightSubString = ThirtyEightString.substring(ThirtyEightString.indexOf(""), ThirtyEightString.indexOf(" "));
            parseThirtyEight = Integer.parseInt(ThirtyEightSubString);
            if (!app.prev.containsKey("37")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyEight;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("37", "1500 naira Big Chivita Juice(3)");
            } else {
                String val = app.prev.get("37");
                ThirtyEightSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtyEightSubString) != parseThirtyEight) {
                    app.prev.remove("37");
                    app.prev.put("37", "1500 naira Big Chivita Juice(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyEightSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("2000 naira Big Chivita Juice(4)")) {
            ThirtyEightString = button4.getText().toString();
            ThirtyEightSubString = ThirtyEightString.substring(ThirtyEightString.indexOf(""), ThirtyEightString.indexOf(" "));
            parseThirtyEight = Integer.parseInt(ThirtyEightSubString);
            if (!app.prev.containsKey("37")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyEight;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("37", "2000 naira Big Chivita Juice(4)");
            } else {
                String val = app.prev.get("37");
                ThirtyEightSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtyEightSubString) != parseThirtyEight) {
                    app.prev.remove("37");
                    app.prev.put("37", "2000 naira Big Chivita Juice(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyEightSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("2500 naira Big Chivita Juice(5)")) {
            ThirtyEightString = button5.getText().toString();
            ThirtyEightSubString = ThirtyEightString.substring(ThirtyEightString.indexOf(""), ThirtyEightString.indexOf(" "));
            parseThirtyEight = Integer.parseInt(ThirtyEightSubString);
            if (!app.prev.containsKey("37")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyEight;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("37", "2500 naira Big Chivita Juice(5)");
            } else {
                String val = app.prev.get("37");
                ThirtyEightSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(ThirtyEightSubString) != parseThirtyEight) {
                    app.prev.remove("37");
                    app.prev.put("37", "2500 naira Big Chivita Juice(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyEightSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("3000 naira Big Chivita Juice(6)")) {
//            ThirtyEightString = button6.getText().toString();
//            ThirtyEightSubString = ThirtyEightString.substring(ThirtyEightString.indexOf(""), ThirtyEightString.indexOf(" "));
//            parseThirtyEight = Integer.parseInt(ThirtyEightSubString);
//            if (!app.prev.containsKey("37")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseThirtyEight;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("37", "3000 naira Big Chivita Juice(6)");
//            } else {
//                String val = app.prev.get("37");
//                ThirtyEightSubString = val.substring(0, val.indexOf("n")).trim();
//
//                if (Integer.parseInt(ThirtyEightSubString) != parseThirtyEight) {
//                    app.prev.remove("37");
//                    app.prev.put("37", "3000 naira Big Chivita Juice(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyEightSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyEight;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("300 naira Small HappyHour Juice")) {
            ThirtyNineString = button.getText().toString();
            ThirtyNineSubString = ThirtyNineString.substring(ThirtyNineString.indexOf(""), ThirtyNineString.indexOf(" "));
            parseThirtyNine = Integer.parseInt(ThirtyNineSubString);
            if (!app.prev.containsKey("38")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyNine;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("38", "300 naira Small HappyHour Juice");
            } else {
                String val = app.prev.get("38");
                ThirtyNineSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyNineSubString) != parseThirtyNine) {
                    app.prev.remove("38");
                    app.prev.put("38", "300 naira Small HappyHour Juice");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyNineSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira Small HappyHour Juice(2)")) {
            ThirtyNineString = button2.getText().toString();
            ThirtyNineSubString = ThirtyNineString.substring(ThirtyNineString.indexOf(""), ThirtyNineString.indexOf(" "));
            parseThirtyNine = Integer.parseInt(ThirtyNineSubString);
            if (!app.prev.containsKey("38")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyNine;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("38", "600 naira Small HappyHour Juice(2)");
            } else {
                String val = app.prev.get("38");
                ThirtyNineSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyNineSubString) != parseThirtyNine) {
                    app.prev.remove("38");
                    app.prev.put("38", "600 naira Small HappyHour Juice(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyNineSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("900 naira Small HappyHour Juice(3)")) {
            ThirtyNineString = button3.getText().toString();
            ThirtyNineSubString = ThirtyNineString.substring(ThirtyNineString.indexOf(""), ThirtyNineString.indexOf(" "));
            parseThirtyNine = Integer.parseInt(ThirtyNineSubString);
            if (!app.prev.containsKey("38")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyNine;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("38", "900 naira Small HappyHour Juice(3)");
            } else {
                String val = app.prev.get("38");
                ThirtyNineSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyNineSubString) != parseThirtyNine) {
                    app.prev.remove("38");
                    app.prev.put("38", "900 naira Small HappyHour Juice(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyNineSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1200 naira Small HappyHour Juice(4)")) {
            ThirtyNineString = button4.getText().toString();
            ThirtyNineSubString = ThirtyNineString.substring(ThirtyNineString.indexOf(""), ThirtyNineString.indexOf(" "));
            parseThirtyNine = Integer.parseInt(ThirtyNineSubString);
            if (!app.prev.containsKey("38")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyNine;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("38", "1200 naira Small HappyHour Juice(4)");
            } else {
                String val = app.prev.get("38");
                ThirtyNineSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyNineSubString) != parseThirtyNine) {
                    app.prev.remove("38");
                    app.prev.put("38", "1200 naira Small HappyHour Juice(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyNineSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1500 naira Small HappyHour Juice(5)")) {
            ThirtyNineString = button5.getText().toString();
            ThirtyNineSubString = ThirtyNineString.substring(ThirtyNineString.indexOf(""), ThirtyNineString.indexOf(" "));
            parseThirtyNine = Integer.parseInt(ThirtyNineSubString);
            if (!app.prev.containsKey("38")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirtyNine;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("38", "1500 naira Small HappyHour Juice(5)");
            } else {
                String val = app.prev.get("38");
                ThirtyNineSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirtyNineSubString) != parseThirtyNine) {
                    app.prev.remove("38");
                    app.prev.put("38", "1500 naira Small HappyHour Juice(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyNineSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("2000 naira Small HappyHour Juice(6)")) {
//            ThirtyNineString = button6.getText().toString();
//            ThirtyNineSubString = ThirtyNineString.substring(ThirtyNineString.indexOf(""), ThirtyNineString.indexOf(" "));
//            parseThirtyNine = Integer.parseInt(ThirtyNineSubString);
//            if (!app.prev.containsKey("38")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseThirtyNine;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("38", "2000 naira Small HappyHour Juice(6)");
//            } else {
//                String val = app.prev.get("38");
//                ThirtyNineSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(ThirtyNineSubString) != parseThirtyNine) {
//                    app.prev.remove("38");
//                    app.prev.put("38", "2000 naira Small HappyHour Juice(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirtyNineSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseThirtyNine;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("500 naira Big HappyHour Juice")) {
            FourtyString = button.getText().toString();
            FourtySubString = FourtyString.substring(FourtyString.indexOf(""), FourtyString.indexOf(" "));
            parseFourty = Integer.parseInt(FourtySubString);
            if (!app.prev.containsKey("39")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("39", "500 naira Big HappyHour Juice");
            } else {
                String val = app.prev.get("39");
                FourtySubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourtySubString) != parseFourty) {
                    app.prev.remove("39");
                    app.prev.put("39", "500 naira Big HappyHour Juice");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtySubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1000 naira Big HappyHour Juice(2)")) {
            FourtyString = button2.getText().toString();
            FourtySubString = FourtyString.substring(FourtyString.indexOf(""), FourtyString.indexOf(" "));
            parseFourty = Integer.parseInt(FourtySubString);
            if (!app.prev.containsKey("39")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("39", "1000 naira Big HappyHour Juice(2)");
            } else {
                String val = app.prev.get("39");
                FourtySubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourtySubString) != parseFourty) {
                    app.prev.remove("39");
                    app.prev.put("39", "1000 naira Big HappyHour Juice(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtySubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1500 naira Big HappyHour Juice(3)")) {
            FourtyString = button3.getText().toString();
            FourtySubString = FourtyString.substring(FourtyString.indexOf(""), FourtyString.indexOf(" "));
            parseFourty = Integer.parseInt(FourtySubString);
            if (!app.prev.containsKey("39")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("39", "1500 naira Big HappyHour Juice(3)");
            } else {
                String val = app.prev.get("39");
                FourtySubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourtySubString) != parseFourty) {
                    app.prev.remove("39");
                    app.prev.put("39", "1500 naira Big HappyHour Juice(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtySubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("2000 naira Big HappyHour Juice(4)")) {
            FourtyString = button4.getText().toString();
            FourtySubString = FourtyString.substring(FourtyString.indexOf(""), FourtyString.indexOf(" "));
            parseFourty = Integer.parseInt(FourtySubString);
            if (!app.prev.containsKey("39")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("39", "2000 naira Big HappyHour Juice(4)");
            } else {
                String val = app.prev.get("39");
                FourtySubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourtySubString) != parseFourty) {
                    app.prev.remove("39");
                    app.prev.put("39", "2000 naira Big HappyHour Juice(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtySubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("2500 naira Big HappyHour Juice(5)")) {
            FourtyString = button5.getText().toString();
            FourtySubString = FourtyString.substring(FourtyString.indexOf(""), FourtyString.indexOf(" "));
            parseFourty = Integer.parseInt(FourtySubString);
            if (!app.prev.containsKey("39")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("39", "2500 naira Big HappyHour Juice(5)");
            } else {
                String val = app.prev.get("39");
                FourtySubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourtySubString) != parseFourty) {
                    app.prev.remove("39");
                    app.prev.put("39", "2500 naira Big HappyHour Juice(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtySubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("3000 naira Big HappyHour Juice(6)")) {
//            FourtyString = button6.getText().toString();
//            FourtySubString = FourtyString.substring(FourtyString.indexOf(""), FourtyString.indexOf(" "));
//            parseFourty = Integer.parseInt(FourtySubString);
//            if (!app.prev.containsKey("39")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseFourty;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("39", "3000 naira Big HappyHour Juice(6)");
//            } else {
//                String val = app.prev.get("39");
//                FourtySubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(FourtySubString) != parseFourty) {
//                    app.prev.remove("39");
//                    app.prev.put("39", "3000 naira Big HappyHour Juice(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtySubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseFourty;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }


        if (price.contentEquals("80 naira Small G. Schweppes")) {
            FourtyOneString = button.getText().toString();
            FourtyOneSubString = FourtyOneString.substring(FourtyOneString.indexOf(""), FourtyOneString.indexOf(" "));
            parseFourtyOne = Integer.parseInt(FourtyOneSubString);
            if (!app.prev.containsKey("40")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourtyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("40", "80 naira Small G. Schweppes");
            } else {
                String val = app.prev.get("40");
                FourtyOneSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourtyOneSubString) != parseFourtyOne) {
                    app.prev.remove("40");
                    app.prev.put("40", "80 naira Small G. Schweppes");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("160 naira Small G. Schweppes(2)")) {
            FourtyOneString = button2.getText().toString();
            FourtyOneSubString = FourtyOneString.substring(FourtyOneString.indexOf(""), FourtyOneString.indexOf(" "));
            parseFourtyOne = Integer.parseInt(FourtyOneSubString);
            if (!app.prev.containsKey("40")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourtyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("40", "160 naira Small G. Schweppes(2)");
            } else {
                String val = app.prev.get("40");
                FourtyOneSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FourtyOneSubString) != parseFourtyOne) {
                    app.prev.remove("40");
                    app.prev.put("40", "160 naira Small G. Schweppes(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("240 naira Small G. Schweppes(3)")) {
            FourtyOneString = button3.getText().toString();
            FourtyOneSubString = FourtyOneString.substring(FourtyOneString.indexOf(""), FourtyOneString.indexOf(" "));
            parseFourtyOne = Integer.parseInt(FourtyOneSubString);
            if (!app.prev.containsKey("40")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourtyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("40", "240 naira Small G. Schweppes(3)");
            } else {
                String val = app.prev.get("40");
                FourtyOneSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FourtyOneSubString) != parseFourtyOne) {
                    app.prev.remove("40");
                    app.prev.put("40", "240 naira Small G. Schweppes(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("320 naira Small G. Schweppes(4)")) {
            FourtyOneString = button4.getText().toString();
            FourtyOneSubString = FourtyOneString.substring(FourtyOneString.indexOf(""), FourtyOneString.indexOf(" "));
            parseFourtyOne = Integer.parseInt(FourtyOneSubString);
            if (!app.prev.containsKey("40")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourtyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("40", "320 naira Small G. Schweppes(4)");
            } else {
                String val = app.prev.get("40");
                FourtyOneSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FourtyOneSubString) != parseFourtyOne) {
                    app.prev.remove("40");
                    app.prev.put("40", "320 naira Small G. Schweppes(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Small G. Schweppes(5)")) {
            FourtyOneString = button5.getText().toString();
            FourtyOneSubString = FourtyOneString.substring(FourtyOneString.indexOf(""), FourtyOneString.indexOf(" "));
            parseFourtyOne = Integer.parseInt(FourtyOneSubString);
            if (!app.prev.containsKey("40")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourtyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("40", "400 naira Small G. Schweppes(5)");
            } else {
                String val = app.prev.get("40");
                FourtyOneSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FourtyOneSubString) != parseFourtyOne) {
                    app.prev.remove("40");
                    app.prev.put("40", "400 naira Small G. Schweppes(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("480 naira Small G. Schweppes(6)")) {
//            FourtyOneString = button6.getText().toString();
//            FourtyOneSubString = FourtyOneString.substring(FourtyOneString.indexOf(""), FourtyOneString.indexOf(" "));
//            parseFourtyOne = Integer.parseInt(FourtyOneSubString);
//            if (!app.prev.containsKey("40")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseFourtyOne;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("40", "480 naira Small G. Schweppes(6)");
//            } else {
//                String val = app.prev.get("40");
//                FourtyOneSubString = val.substring(0, val.indexOf("n")).trim();
//
//                if (Integer.parseInt(FourtyOneSubString) != parseFourtyOne) {
//                    app.prev.remove("40");
//                    app.prev.put("40", "480 naira Small G. Schweppes(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyOneSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyOne;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }

        if (price.contentEquals("100 naira Big G. Schweppes")) {
            FourtyTwoString = button.getText().toString();
            FourtyTwoSubString = FourtyTwoString.substring(FourtyTwoString.indexOf(""), FourtyTwoString.indexOf(" "));
            parseFourtyTwo = Integer.parseInt(FourtyTwoSubString);
            if (!app.prev.containsKey("41")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourtyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("41", "100 naira Big G. Schweppes");
            } else {
                String val = app.prev.get("41");
                FourtyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourtyTwoSubString) != parseFourtyTwo) {
                    app.prev.remove("41");
                    app.prev.put("41", "100 naira Big G. Schweppes");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 naira Big G. Schweppes(2)")) {
            FourtyTwoString = button2.getText().toString();
            FourtyTwoSubString = FourtyTwoString.substring(FourtyTwoString.indexOf(""), FourtyTwoString.indexOf(" "));
            parseFourtyTwo = Integer.parseInt(FourtyTwoSubString);
            if (!app.prev.containsKey("41")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourtyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("41", "200 naira Big G. Schweppes(2)");
            } else {
                String val = app.prev.get("41");
                FourtyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourtyTwoSubString) != parseFourtyTwo) {
                    app.prev.remove("41");
                    app.prev.put("41", "200 naira Big G. Schweppes(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira Big G. Schweppes(3)")) {
            FourtyTwoString = button3.getText().toString();
            FourtyTwoSubString = FourtyTwoString.substring(FourtyTwoString.indexOf(""), FourtyTwoString.indexOf(" "));
            parseFourtyTwo = Integer.parseInt(FourtyTwoSubString);
            if (!app.prev.containsKey("41")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourtyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("41", "300 naira Big G. Schweppes(3)");
            } else {
                String val = app.prev.get("41");
                FourtyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourtyTwoSubString) != parseFourtyTwo) {
                    app.prev.remove("41");
                    app.prev.put("41", "300 naira Big G. Schweppes(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Big G. Schweppes(4)")) {
            FourtyTwoString = button4.getText().toString();
            FourtyTwoSubString = FourtyTwoString.substring(FourtyTwoString.indexOf(""), FourtyTwoString.indexOf(" "));
            parseFourtyTwo = Integer.parseInt(FourtyTwoSubString);
            if (!app.prev.containsKey("41")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourtyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("41", "400 naira Big G. Schweppes(4)");
            } else {
                String val = app.prev.get("41");
                FourtyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourtyTwoSubString) != parseFourtyTwo) {
                    app.prev.remove("41");
                    app.prev.put("41", "400 naira Big G. Schweppes(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 naira Big G. Schweppes(5)")) {
            FourtyTwoString = button5.getText().toString();
            FourtyTwoSubString = FourtyTwoString.substring(FourtyTwoString.indexOf(""), FourtyTwoString.indexOf(" "));
            parseFourtyTwo = Integer.parseInt(FourtyTwoSubString);
            if (!app.prev.containsKey("41")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourtyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("41", "500 naira Big G. Schweppes(5)");
            } else {
                String val = app.prev.get("41");
                FourtyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourtyTwoSubString) != parseFourtyTwo) {
                    app.prev.remove("41");
                    app.prev.put("41", "500 naira Big G. Schweppes(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("600 naira Big G. Schweppes(6)")) {
//            FourtyTwoString = button6.getText().toString();
//            FourtyTwoSubString = FourtyTwoString.substring(FourtyTwoString.indexOf(""), FourtyTwoString.indexOf(" "));
//            parseFourtyTwo = Integer.parseInt(FourtyTwoSubString);
//            if (!app.prev.containsKey("41")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseFourtyTwo;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("41", "600 naira Big G. Schweppes(6)");
//            } else {
//                String val = app.prev.get("41");
//                FourtyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(FourtyTwoSubString) != parseFourtyTwo) {
//                    app.prev.remove("41");
//                    app.prev.put("41", "600 naira Big G. Schweppes(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyTwoSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyTwo;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }



        if (price.contentEquals("150 naira Pet Schweppes")) {
            FourtyThreeString = button.getText().toString();
            FourtyThreeSubString = FourtyThreeString.substring(FourtyThreeString.indexOf(""), FourtyThreeString.indexOf(" "));
            parseFourtyThree = Integer.parseInt(FourtyThreeSubString);
            if (!app.prev.containsKey("42")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourtyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("42", "150 naira Pet Schweppes");
            } else {
                String val = app.prev.get("42");
                FourtyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourtyThreeSubString) != parseFourtyThree) {
                    app.prev.remove("42");
                    app.prev.put("42", "150 naira Pet Schweppes");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira Pet Schweppes(2)")) {
            FourtyThreeString = button2.getText().toString();
            FourtyThreeSubString = FourtyThreeString.substring(FourtyThreeString.indexOf(""), FourtyThreeString.indexOf(" "));
            parseFourtyThree = Integer.parseInt(FourtyThreeSubString);
            if (!app.prev.containsKey("42")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourtyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("42", "300 naira Pet Schweppes(2)");
            } else {
                String val = app.prev.get("42");
                FourtyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourtyThreeSubString) != parseFourtyThree) {
                    app.prev.remove("42");
                    app.prev.put("42", "300 naira Pet Schweppes(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("450 naira Pet Schweppes(3)")) {
            FourtyThreeString = button3.getText().toString();
            FourtyThreeSubString = FourtyThreeString.substring(FourtyThreeString.indexOf(""), FourtyThreeString.indexOf(" "));
            parseFourtyThree = Integer.parseInt(FourtyThreeSubString);
            if (!app.prev.containsKey("42")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourtyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("42", "450 naira Pet Schweppes(3)");
            } else {
                String val = app.prev.get("39");
                FourtyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourtyThreeSubString) != parseFourtyThree) {
                    app.prev.remove("42");
                    app.prev.put("42", "450 naira Pet Schweppes(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira Pet Schweppes(4)")) {
            FourtyThreeString = button4.getText().toString();
            FourtyThreeSubString = FourtyThreeString.substring(FourtyThreeString.indexOf(""), FourtyThreeString.indexOf(" "));
            parseFourtyThree = Integer.parseInt(FourtyThreeSubString);
            if (!app.prev.containsKey("42")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourtyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("42", "600 naira Pet Schweppes(4)");
            } else {
                String val = app.prev.get("42");
                FourtyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourtyThreeSubString) != parseFourtyThree) {
                    app.prev.remove("42");
                    app.prev.put("42", "600 naira Pet Schweppes(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
        else if (price.contentEquals("750 naira Pet Schweppes(5)")) {
            FourtyThreeString = button5.getText().toString();
            FourtyThreeSubString = FourtyThreeString.substring(FourtyThreeString.indexOf(""), FourtyThreeString.indexOf(" "));
            parseFourtyThree = Integer.parseInt(FourtyThreeSubString);
            if (!app.prev.containsKey("39")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourtyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("42", "750 naira Pet Schweppes(5)");
            } else {
                String val = app.prev.get("42");
                FourtyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourtyThreeSubString) != parseFourtyThree) {
                    app.prev.remove("42");
                    app.prev.put("42", "750 naira Pet Schweppes(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
//        else if (price.contentEquals("900 naira Pet Schweppes(6)")) {
//            FourtyThreeString = button6.getText().toString();
//            FourtyThreeSubString = FourtyThreeString.substring(FourtyThreeString.indexOf(""), FourtyThreeString.indexOf(" "));
//            parseFourtyThree = Integer.parseInt(FourtyThreeSubString);
//            if (!app.prev.containsKey("42")) {
//                app.allinfoodcounter = app.allinfoodcounter + parseFourtyThree;
//                feetag.setText("" + app.allinfoodcounter + "");
//                app.prev.put("42", "900 naira Pet Schweppes(6)");
//            } else {
//                String val = app.prev.get("42");
//                FourtyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));
//
//                if (Integer.parseInt(FourtyThreeSubString) != parseFourtyThree) {
//                    app.prev.remove("42");
//                    app.prev.put("42", "900 naira Pet Schweppes(6)");
//                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourtyThreeSubString);
//                    app.allinfoodcounter = app.allinfoodcounter + parseFourtyThree;
//                    feetag.setText("" + app.allinfoodcounter + "");
//                }
//            }
//        }
    }
}
