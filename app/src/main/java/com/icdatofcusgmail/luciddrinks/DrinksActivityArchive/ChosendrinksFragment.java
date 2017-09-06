package com.icdatofcusgmail.luciddrinks.DrinksActivityArchive;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.icdatofcusgmail.luciddrinks.LucidApplication;
import com.icdatofcusgmail.luciddrinks.R;

/**
 * Created by DAVID OGUNDEPO on 07/16/2017.
 *
 */

public class ChosendrinksFragment extends Fragment {

    TextView textView, textView2nd, textView3rd, textView4th, textView5th, textView6th, textView7th, textView8th, textView9th, textView10th, textView11th, textView12th, textView13th, textView14th, textView15th, textView16th, textView17th, textView18th, textView19th, textView20th, textView21st, textView22nd, textView23rd, textView24th, textView25th, textView26th, textView27th, textView28th, textView29th, textView30th, textView31st, textView32nd, textView33rd, textView34th, textView35th, textView36th, textView37th, textView38th, textView39th, textView40th, textView41st, textView42nd, textView43rd;
    ImageButton imageButton, imageButton2nd, imageButton3rd, imageButton4th, imageButton5th, imageButton6th, imageButton7th, imageButton8th, imageButton9th, imageButton10th, imageButton11th, imageButton12th, imageButton13th, imageButton14th, imageButton15th, imageButton16th, imageButton17th, imageButton18th, imageButton19th, imageButton20th, imageButton21st, imageButton22nd, imageButton23rd, imageButton24th, imageButton25th, imageButton26th, imageButton27th, imageButton28th, imageButton29th, imageButton30th, imageButton31st, imageButton32nd, imageButton33rd, imageButton34th, imageButton35th, imageButton36th, imageButton37th, imageButton38th, imageButton39th, imageButton40th, imageButton41st, imageButton42nd, imageButton43rd;
    OnPriceSetListener onPriceSetListener;

    LucidApplication app;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.drinkmenufragment3_chosendrink, container, false);

        app = LucidApplication.getInstance();

        textView = (Button) view.findViewById(R.id.Istchosenbutton);
        textView.setVisibility(View.GONE);
        textView2nd = (Button) view.findViewById(R.id.Secondchosenbutton);
        textView2nd.setVisibility(View.GONE);
        textView3rd = (Button) view.findViewById(R.id.Thirdchosenbutton);
        textView3rd.setVisibility(View.GONE);
        textView4th = (Button) view.findViewById(R.id.Fourthchosenbutton);
        textView4th.setVisibility(View.GONE);
        textView5th = (Button) view.findViewById(R.id.Fifthchosenbutton);
        textView5th.setVisibility(View.GONE);
        textView6th = (Button) view.findViewById(R.id.Sixthchosenbutton);
        textView6th.setVisibility(View.GONE);
        textView7th = (Button) view.findViewById(R.id.Seventhchosenbutton);
        textView7th.setVisibility(View.GONE);
        textView8th = (Button) view.findViewById(R.id.Eightchosenbutton);
        textView8th.setVisibility(View.GONE);
        textView9th = (Button) view.findViewById(R.id.Ninthchosenbutton);
        textView9th.setVisibility(View.GONE);
        textView10th = (Button) view.findViewById(R.id.Tenthchosenbutton);
        textView10th.setVisibility(View.GONE);
        textView11th = (Button) view.findViewById(R.id.Eleventhchosenbutton);
        textView11th.setVisibility(View.GONE);
        textView12th = (Button) view.findViewById(R.id.Twelvthchosenbutton);
        textView12th.setVisibility(View.GONE);
        textView13th = (Button) view.findViewById(R.id.Thirteenthchosenbutton);
        textView13th.setVisibility(View.GONE);
        textView14th = (Button) view.findViewById(R.id.Fourteenthchosenbutton);
        textView14th.setVisibility(View.GONE);
        textView15th = (Button) view.findViewById(R.id.Fifteenthchosenbutton);
        textView15th.setVisibility(View.GONE);
        textView16th = (Button) view.findViewById(R.id.Sixteenthchosenbutton);
        textView16th.setVisibility(View.GONE);
        textView17th = (Button) view.findViewById(R.id.Seventeenthchosenbutton);
        textView17th.setVisibility(View.GONE);
        textView18th = (Button) view.findViewById(R.id.Eighteenthchosenbutton);
        textView18th.setVisibility(View.GONE);
        textView19th = (Button) view.findViewById(R.id.Nineteenthchosenbutton);
        textView19th.setVisibility(View.GONE);
        textView20th = (Button) view.findViewById(R.id.Twentiethchosenbutton);
        textView20th.setVisibility(View.GONE);
        textView21st = (Button) view.findViewById(R.id.TwentyIstchosenbutton);
        textView21st.setVisibility(View.GONE);
        textView22nd = (Button) view.findViewById(R.id.TwentySecondchosenbutton);
        textView22nd.setVisibility(View.GONE);
        textView23rd = (Button) view.findViewById(R.id.TwentyThirdchosenbutton);
        textView23rd.setVisibility(View.GONE);
        textView24th = (Button) view.findViewById(R.id.TwentyFourthchosenbutton);
        textView24th.setVisibility(View.GONE);
        textView25th = (Button) view.findViewById(R.id.TwentyFifthchosenbutton);
        textView25th.setVisibility(View.GONE);
        textView26th = (Button) view.findViewById(R.id.TwentySixthchosenbutton);
        textView26th.setVisibility(View.GONE);
        textView27th = (Button) view.findViewById(R.id.TwentySeventhchosenbutton);
        textView27th.setVisibility(View.GONE);
        textView28th = (Button) view.findViewById(R.id.TwentyEightchosenbutton);
        textView28th.setVisibility(View.GONE);
        textView29th = (Button) view.findViewById(R.id.TwentyNinthchosenbutton);
        textView29th.setVisibility(View.GONE);
        textView30th = (Button) view.findViewById(R.id.Thirtiethchosenbutton);
        textView30th.setVisibility(View.GONE);
        textView31st = (Button) view.findViewById(R.id.ThirtyIstchosenbutton);
        textView31st.setVisibility(View.GONE);
        textView32nd = (Button) view.findViewById(R.id.ThirtySecondchosenbutton);
        textView32nd.setVisibility(View.GONE);
        textView33rd = (Button) view.findViewById(R.id.ThirtyThirdchosenbutton);
        textView33rd.setVisibility(View.GONE);
        textView34th = (Button) view.findViewById(R.id.ThirtyFourthchosenbutton);
        textView34th.setVisibility(View.GONE);
        textView35th = (Button) view.findViewById(R.id.ThirtyFifthchosenbutton);
        textView35th.setVisibility(View.GONE);
        textView36th = (Button) view.findViewById(R.id.ThirtySixthchosenbutton);
        textView36th.setVisibility(View.GONE);
        textView37th = (Button) view.findViewById(R.id.ThirtySeventhchosenbutton);
        textView37th.setVisibility(View.GONE);
        textView38th = (Button) view.findViewById(R.id.ThirtyEighthchosenbutton);
        textView38th.setVisibility(View.GONE);
        textView39th = (Button) view.findViewById(R.id.ThirtyNinthchosenbutton);
        textView39th.setVisibility(View.GONE);
        textView40th = (Button) view.findViewById(R.id.Fourtiethchosenbutton);
        textView40th.setVisibility(View.GONE);
        textView41st = (Button) view.findViewById(R.id.FourtyOnechosenbutton);
        textView41st.setVisibility(View.GONE);
        textView42nd = (Button) view.findViewById(R.id.FourtyTwochosenbutton);
        textView42nd.setVisibility(View.GONE);
        textView43rd = (Button) view.findViewById(R.id.FourtyThreechosenbutton);
        textView43rd.setVisibility(View.GONE);








        imageButton = (ImageButton) view.findViewById(R.id.Istchosendeletebutton);
        imageButton.setVisibility(View.GONE);
        imageButton2nd = (ImageButton) view.findViewById(R.id.Secondchosendeletebutton);
        imageButton2nd.setVisibility(View.GONE);
        imageButton3rd = (ImageButton) view.findViewById(R.id.Thirdchosendeletebutton);
        imageButton3rd.setVisibility(View.GONE);
        imageButton4th = (ImageButton) view.findViewById(R.id.Fourthchosendeletebutton);
        imageButton4th.setVisibility(View.GONE);
        imageButton5th = (ImageButton) view.findViewById(R.id.Fifthchosendeletebutton);
        imageButton5th.setVisibility(View.GONE);
        imageButton6th = (ImageButton) view.findViewById(R.id.Sixthchosendeletebutton);
        imageButton6th.setVisibility(View.GONE);
        imageButton7th = (ImageButton) view.findViewById(R.id.Seventhchosendeletebutton);
        imageButton7th.setVisibility(View.GONE);
        imageButton8th = (ImageButton) view.findViewById(R.id.Eightchosendeletebutton);
        imageButton8th.setVisibility(View.GONE);
        imageButton9th = (ImageButton) view.findViewById(R.id.Ninthchosendeleltebutton);
        imageButton9th.setVisibility(View.GONE);
        imageButton10th = (ImageButton) view.findViewById(R.id.Tenthchosendeletebutton);
        imageButton10th.setVisibility(View.GONE);
        imageButton11th = (ImageButton) view.findViewById(R.id.Eleventhchosendeleltebutton);
        imageButton11th.setVisibility(View.GONE);
        imageButton12th = (ImageButton) view.findViewById(R.id.Twelvthchosendeletebutton);
        imageButton12th.setVisibility(View.GONE);
        imageButton13th = (ImageButton) view.findViewById(R.id.Thirteenthchosendeleltebutton);
        imageButton13th.setVisibility(View.GONE);
        imageButton14th = (ImageButton) view.findViewById(R.id.Fourteenthchosendeletebutton);
        imageButton14th.setVisibility(View.GONE);
        imageButton15th = (ImageButton) view.findViewById(R.id.Fifteenthchosendeleltebutton);
        imageButton15th.setVisibility(View.GONE);
        imageButton16th = (ImageButton) view.findViewById(R.id.Sixteenthchosendeletebutton);
        imageButton16th.setVisibility(View.GONE);
        imageButton17th = (ImageButton) view.findViewById(R.id.Seventeenthchosendeleltebutton);
        imageButton17th.setVisibility(View.GONE);
        imageButton18th = (ImageButton) view.findViewById(R.id.Eighteenthchosendeletebutton);
        imageButton18th.setVisibility(View.GONE);
        imageButton19th = (ImageButton) view.findViewById(R.id.Nineteenthchosendeleltebutton);
        imageButton19th.setVisibility(View.GONE);
        imageButton20th = (ImageButton) view.findViewById(R.id.Twentiethchosendeletebutton);
        imageButton20th.setVisibility(View.GONE);

        imageButton21st = (ImageButton) view.findViewById(R.id.TwentyIstchosendeletebutton);
        imageButton21st.setVisibility(View.GONE);
        imageButton22nd = (ImageButton) view.findViewById(R.id.TwentySecondchosendeletebutton);
        imageButton22nd.setVisibility(View.GONE);
        imageButton23rd = (ImageButton) view.findViewById(R.id.TwentyThirdchosendeletebutton);
        imageButton23rd.setVisibility(View.GONE);
        imageButton24th = (ImageButton) view.findViewById(R.id.TwentyFourthchosendeletebutton);
        imageButton24th.setVisibility(View.GONE);
        imageButton25th = (ImageButton) view.findViewById(R.id.TwentyFifthchosendeletebutton);
        imageButton25th.setVisibility(View.GONE);
        imageButton26th = (ImageButton) view.findViewById(R.id.TwentySixthchosendeletebutton);
        imageButton26th.setVisibility(View.GONE);
        imageButton27th = (ImageButton) view.findViewById(R.id.TwentySeventhchosendeletebutton);
        imageButton27th.setVisibility(View.GONE);
        imageButton28th = (ImageButton) view.findViewById(R.id.TwentyEightchosendeletebutton);
        imageButton28th.setVisibility(View.GONE);
        imageButton29th = (ImageButton) view.findViewById(R.id.TwentyNinthchosendeleltebutton);
        imageButton29th.setVisibility(View.GONE);
        imageButton30th = (ImageButton) view.findViewById(R.id.Thirtiethchosendeletebutton);
        imageButton30th.setVisibility(View.GONE);
        imageButton31st = (ImageButton) view.findViewById(R.id.ThirtyIstchosendeleltebutton);
        imageButton31st.setVisibility(View.GONE);
        imageButton32nd = (ImageButton) view.findViewById(R.id.ThirtySecondchosendeletebutton);
        imageButton32nd.setVisibility(View.GONE);
        imageButton33rd = (ImageButton) view.findViewById(R.id.ThirtyThirdchosendeleltebutton);
        imageButton33rd.setVisibility(View.GONE);
        imageButton34th = (ImageButton) view.findViewById(R.id.ThirtyFourthchosendeletebutton);
        imageButton34th.setVisibility(View.GONE);
        imageButton35th = (ImageButton) view.findViewById(R.id.ThirtyFifthchosendeleltebutton);
        imageButton35th.setVisibility(View.GONE);
        imageButton36th = (ImageButton) view.findViewById(R.id.ThirtySixthchosendeletebutton);
        imageButton36th.setVisibility(View.GONE);
        imageButton37th = (ImageButton) view.findViewById(R.id.ThirtySeventhchosendeleltebutton);
        imageButton37th.setVisibility(View.GONE);
        imageButton38th = (ImageButton) view.findViewById(R.id.ThirtyEighthchosendeletebutton);
        imageButton38th.setVisibility(View.GONE);
        imageButton39th = (ImageButton) view.findViewById(R.id.ThirtyNinthchosendeleltebutton);
        imageButton39th.setVisibility(View.GONE);
        imageButton40th = (ImageButton) view.findViewById(R.id.Fourtiethchosendeletebutton);
        imageButton40th.setVisibility(View.GONE);
        imageButton41st = (ImageButton) view.findViewById(R.id.FourtyOnechosendeleltebutton);
        imageButton41st.setVisibility(View.GONE);
        imageButton42nd = (ImageButton) view.findViewById(R.id.FourtyTwochosendeletebutton);
        imageButton42nd.setVisibility(View.GONE);
        imageButton43rd = (ImageButton) view.findViewById(R.id.FourtyThreechosendeleltebutton);
        imageButton43rd.setVisibility(View.GONE);

        return view;
    }

    interface OnPriceSetListener {
        void setPrice(String price);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            onPriceSetListener = (OnPriceSetListener) activity;
        } catch (Exception ignored) {
        }
    }

    public void updateInfo(String name) {

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setVisibility(View.GONE);
                imageButton.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("0");
                if (!imageButton.isShown() && imageButton2nd.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2nd.setVisibility(View.GONE);
                imageButton2nd.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView2nd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("1");
                if (!imageButton2nd.isShown() && imageButton.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton3rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView3rd.setVisibility(View.GONE);
                imageButton3rd.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView3rd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("2");
                if (!imageButton3rd.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton4th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView4th.setVisibility(View.GONE);
                imageButton4th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView4th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("3");
                if (!imageButton4th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton5th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView5th.setVisibility(View.GONE);
                imageButton5th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView5th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("4");
                if (!imageButton5th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton6th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView6th.setVisibility(View.GONE);
                imageButton6th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView6th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("5");
                if (!imageButton6th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton7th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView7th.setVisibility(View.GONE);
                imageButton7th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView7th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("6");
                if (!imageButton7th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown()  || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton8th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView8th.setVisibility(View.GONE);
                imageButton8th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView8th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("7");
                if (!imageButton8th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton9th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView9th.setVisibility(View.GONE);
                imageButton9th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView9th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("8");
                if (!imageButton9th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }

            }
        });

        imageButton10th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView10th.setVisibility(View.GONE);
                imageButton10th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView10th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("9");
                if (!imageButton10th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton11th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView11th.setVisibility(View.GONE);
                imageButton11th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView11th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("10");
                if (!imageButton11th.isShown() && imageButton2nd.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton12th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView12th.setVisibility(View.GONE);
                imageButton12th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView12th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("11");
                if (!imageButton12th.isShown() && imageButton.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton2nd.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton13th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView13th.setVisibility(View.GONE);
                imageButton13th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView13th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("12");
                if (!imageButton13th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton3rd.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton14th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView14th.setVisibility(View.GONE);
                imageButton14th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView14th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("13");
                if (!imageButton14th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton4th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton15th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView15th.setVisibility(View.GONE);
                imageButton15th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView15th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("14");
                if (!imageButton15th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton5th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton16th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView16th.setVisibility(View.GONE);
                imageButton16th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView16th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("15");
                if (!imageButton16th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton17th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView17th.setVisibility(View.GONE);
                imageButton17th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView17th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("16");
                if (!imageButton17th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton7th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton18th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18th.setVisibility(View.GONE);
                imageButton18th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView18th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("17");
                if (!imageButton18th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton8th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton19th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView19th.setVisibility(View.GONE);
                imageButton19th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView19th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("18");
                if (!imageButton19th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton9th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }

            }
        });

        imageButton20th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView20th.setVisibility(View.GONE);
                imageButton20th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView20th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("19");
                if (!imageButton20th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton10th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });





        imageButton21st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView21st.setVisibility(View.GONE);
                imageButton21st.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView21st.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("20");
                if (!imageButton21st.isShown() && imageButton2nd.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown()  || imageButton.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton22nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView22nd.setVisibility(View.GONE);
                imageButton22nd.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView22nd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("21");
                if (!imageButton22nd.isShown() && imageButton.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton2nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton23rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView23rd.setVisibility(View.GONE);
                imageButton23rd.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView23rd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("22");
                if (!imageButton23rd.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton3rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton24th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView24th.setVisibility(View.GONE);
                imageButton24th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView24th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("23");
                if (!imageButton24th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton4th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton25th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView25th.setVisibility(View.GONE);
                imageButton25th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView25th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("24");
                if (!imageButton25th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton26th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView26th.setVisibility(View.GONE);
                imageButton26th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView26th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("25");
                if (!imageButton26th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton6th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton27th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView27th.setVisibility(View.GONE);
                imageButton27th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView27th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("26");
                if (!imageButton27th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown()  || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton7th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton28th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView28th.setVisibility(View.GONE);
                imageButton28th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView28th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("27");
                if (!imageButton28th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton8th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton29th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView29th.setVisibility(View.GONE);
                imageButton29th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView29th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("28");
                if (!imageButton29th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton9th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }

            }
        });

        imageButton30th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView30th.setVisibility(View.GONE);
                imageButton30th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView30th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("29");
                if (!imageButton30th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton10th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton31st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView31st.setVisibility(View.GONE);
                imageButton31st.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView31st.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("30");
                if (!imageButton31st.isShown() && imageButton2nd.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton11th.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton32nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView32nd.setVisibility(View.GONE);
                imageButton32nd.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView32nd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("31");
                if (!imageButton32nd.isShown() && imageButton.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton2nd.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton12th.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton33rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView33rd.setVisibility(View.GONE);
                imageButton33rd.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView33rd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("32");
                if (!imageButton33rd.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton3rd.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton13th.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton34th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView34th.setVisibility(View.GONE);
                imageButton34th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView34th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("33");
                if (!imageButton34th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton4th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton14th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton35th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView35th.setVisibility(View.GONE);
                imageButton35th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView35th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("34");
                if (!imageButton35th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton5th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton15th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton36th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView36th.setVisibility(View.GONE);
                imageButton36th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView36th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("35");
                if (!imageButton36th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton6th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton16th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton37th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView37th.setVisibility(View.GONE);
                imageButton37th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView37th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("36");
                if (!imageButton37th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton7th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton17th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton38th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView38th.setVisibility(View.GONE);
                imageButton38th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView38th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("37");
                if (!imageButton38th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton8th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton18th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton39th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView39th.setVisibility(View.GONE);
                imageButton39th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView39th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("38");
                if (!imageButton39th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton9th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton19th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }

            }
        });

        imageButton40th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView40th.setVisibility(View.GONE);
                imageButton40th.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView40th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("39");
                if (!imageButton40th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton10th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton20th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });


        imageButton41st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView41st.setVisibility(View.GONE);
                imageButton41st.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView41st.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("40");
                if (!imageButton41st.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton10th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton20th.isShown() || imageButton40th.isShown() || imageButton42nd.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton42nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView42nd.setVisibility(View.GONE);
                imageButton42nd.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView42nd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("41");
                if (!imageButton42nd.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton10th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton20th.isShown() || imageButton41st.isShown() || imageButton40th.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton43rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView43rd.setVisibility(View.GONE);
                imageButton43rd.setVisibility(View.GONE);
                DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView43rd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("42");
                if (!imageButton43rd.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton10th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton20th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown() || imageButton40th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });



        if (name.contentEquals("150 naira C. Mirinda")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira C. Mirinda(2)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 naira C. Mirinda(3)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira C. Mirinda(4)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 naira C. Mirinda(5)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 naira C. Mirinda(6)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("80 naira G. Mirinda")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 naira G. Mirinda(2)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 naira G. Mirinda(3)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 naira G. Mirinda(4)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira G. Mirinda(5)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 naira G. Mirinda(6)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 naira Pet Mirinda")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 naira Pet Mirinda(2)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira Pet Mirinda(3)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira Pet Mirinda(4)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("500 naira Pet Mirinda(5)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("600 naira Pet Mirinda(6)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("150 naira Can Pepsi")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira Can Pepsi(2)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 naira Can Pepsi(3)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira Can Pepsi(4)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 naira Can Pepsi(5)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 naira Can Pepsi(6)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("80 naira Glass Pepsi")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 naira Glass Pepsi(2)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 naira Glass Pepsi(3)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 naira Glass Pepsi(4)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira Glass Pepsi(5)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 naira Glass Pepsi(6)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 naira Pet Pepsi")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 naira Pet Pepsi(2)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira Pet Pepsi(3)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira Pet Pepsi(4)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 naira Pet Pepsi(5)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira Pet Pepsi(6)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        }


        if (name.contentEquals("150 naira C. Savanna")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira C. Savanna(2)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 naira C. Savanna(3)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira C. Savanna(4)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("750 naira C. Savanna(5)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("900 naira C. Savanna(6)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 naira P. Savanna")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 naira P. Savanna(2)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira P. Savanna(3)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira P. Savanna(4)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("500 naira P. Savanna(5)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("600 naira P. Savanna(6)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("150 naira C. SevenUp")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira C. SevenUp(2)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 naira C. SevenUp(3)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira C. SevenUp(4)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 naira C. SevenUp(5)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 naira C. SevenUp(6)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        }


        if (name.contentEquals("80 naira G. SevenUp")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 naira G. SevenUp(2)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 naira G. SevenUp(3)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 naira G. SevenUp(4)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("400 naira G. SevenUp(5)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("480 naira G. SevenUp(6)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 naira P. SevenUp")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 naira P. SevenUp(2)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira P. SevenUp(3)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira P. SevenUp(4)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 naira P. SevenUp(5)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira P. SevenUp(6)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("80 naira Small G. Sprite")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 naira Small G. Sprite(2)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 naira Small G. Sprite(3)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 naira Small G. Sprite(4)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira Small G. Sprite(5)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 naira Small G. Sprite(6)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 naira Big G. Sprite")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 naira Big G. Sprite(2)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira Big G. Sprite(3)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira Big G. Sprite(4)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("500 naira Big G. Sprite(5)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("600 naira Big G. Sprite(6)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 naira Pet Sprite")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 naira Pet Sprite(2)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira Pet Sprite(3)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira Pet Sprite(4)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 naira Pet Sprite(5)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira Pet Sprite(6)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 naira Pet Teem")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 naira Pet Teem(2)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira Pet Teem(3)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira Pet Teem(4)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 naira Pet Teem(5)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira Pet Teem(6)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 naira Pet Lacasera")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 naira Pet Lacasera(2)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("300 naira Pet Lacasera(3)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("400 naira Pet Lacasera(4)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("500 naira Pet Lacasera(5)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("600 naira Pet Lacasera(6)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("150 naira Pet Smoov")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira Pet Smoov(2)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("450 naira Pet Smoov(3)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("600 naira Pet Smoov(4)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("750 naira Pet Smoov(5)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("900 naira Pet Smoov(6)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("80 naira Small G. Coke")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 naira Small G. Coke(2)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 naira Small G. Coke(3)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 naira Small G. Coke(4)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira Small G. Coke(5)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 naira Small G. Coke(6)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 naira Big G. Coke")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 naira Big G. Coke(2)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira Big G. Coke(3)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira Big G. Coke(4)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 naira Big G. Coke(5)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira Big G. Coke(6)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 naira Small Pet Coke")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 naira Small Pet Coke(2)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira Small Pet Coke(3)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira Small Pet Coke(4)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 naira Small Pet Coke(5)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira Small Pet Coke(6)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        }



        if (name.contentEquals("150 naira Big Pet Coke")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira Big Pet Coke(2)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 naira Big Pet Coke(3)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira Big Pet Coke(4)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 naira Big Pet Coke(5)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 naira Big Pet Coke(6)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("80 naira Small G. Fanta")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 naira Small G. Fanta(2)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 naira Small G. Fanta(3)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 naira Small G. Fanta(4)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira Small G. Fanta(5)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 naira Small G. Fanta(6)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 naira Big G. Fanta")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 naira Big G. Fanta(2)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira Big G. Fanta(3)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira Big G. Fanta(4)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("500 naira Big G. Fanta(5)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("600 naira Big G. Fanta(6)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 naira Small P. Fanta")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 naira Small P. Fanta(2)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira Small P. Fanta(3)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira Small P. Fanta(4)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 naira Small P. Fanta(5)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira Small P. Fanta(6)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("150 naira Big P. Fanta")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira Big P. Fanta(2)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 naira Big P. Fanta(3)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira Big P. Fanta(4)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 naira Big P. Fanta(5)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 naira Big P. Fanta(6)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("5 naira Pure Water")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("10 naira Pure Water(2)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("15 naira Pure Water(3)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("20 naira Pure Water(4)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("25 naira Pure Water(5)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("30 naira Pure Water(6)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        }


        if (name.contentEquals("50 naira Bottle Water")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("100 naira Bottle Water(2)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("150 naira Bottle Water(3)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 naira Bottle Water(4)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("250 naira Bottle Water(5)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("300 naira Bottle Water(6)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("150 naira C. MaltaGold")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira C. MaltaGold(2)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 naira C. MaltaGold(3)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira C. MaltaGold(4)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("750 naira C. MaltaGold(5)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("900 naira C. MaltaGold(6)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("150 naira C. Maltina")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira C. Maltina(2)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 naira C. Maltina(3)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira C. Maltina(4)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 naira C. Maltina(5)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 naira C. Maltina(6)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        }


        if (name.contentEquals("150 naira C. Himalt")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira C. Himalt(2)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 naira C. Himalt(3)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira C. Himalt(4)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("750 naira C. Himalt(5)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("900 naira C. Himalt(6)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("150 naira C. MaltaGuinness")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira C. MaltaGuinness(2)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 naira C. MaltaGuinness(3)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira C. MaltaGuinness(4)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 naira C. MaltaGuinness(5)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 naira C. MaltaGuinness(6)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("500 naira 5Alive Juice")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 naira 5Alive Juice(2)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 naira 5Alive Juice(3)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 naira 5Alive Juice(4)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2500 naira 5Alive Juice(5)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 naira 5Alive Juice(6)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("300 naira Small Hollandia Juice")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira Small Hollandia Juice(2)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 naira Small Hollandia Juice(3)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 naira Small Hollandia Juice(4)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 naira Small Hollandia Juice(5)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1800 naira Small Hollandia Juice(6)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("500 naira Big Hollandia Juice")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 naira Big Hollandia Juice(2)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 naira Big Hollandia Juice(3)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 naira Big Hollandia Juice(4)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2500 naira Big Hollandia Juice(5)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 naira Big Hollandia Juice(6)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("300 naira Small ChiExotic Juice")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira Small ChiExotic Juice(2)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 naira Small ChiExotic Juice(3)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 naira Small ChiExotic Juice(4)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 naira Small ChiExotic Juice(5)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 naira Small ChiExotic Juice(6)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("500 naira Big ChiExotic Juice")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 naira Big ChiExotic Juice(2)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 naira Big ChiExotic Juice(3)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2000 naira Big ChiExotic Juice(4)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2500 naira Big ChiExotic Juice(5)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2000 naira Big ChiExotic Juice(6)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("300 naira Small Chivita Juice")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira Small Chivita Juice(2)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("900 naira Small Chivita Juice(3)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1200 naira Small Chivita Juice(4)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 naira Small Chivita Juice(5)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1800 naira Small Chivita Juice(6)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("500 naira Big Chivita Juice")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 naira Big Chivita Juice(2)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 naira Big Chivita Juice(3)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 naira Big Chivita Juice(4)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2500 naira Big Chivita Juice(5)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 naira Big Chivita Juice(6)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("300 naira Small HappyHour Juice")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira Small HappyHour Juice(2)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 naira Small HappyHour Juice(3)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 naira Small HappyHour Juice(4)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 naira Small HappyHour Juice(5)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 naira Small HappyHour Juice(6)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("500 naira Big HappyHour Juice")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 naira Big HappyHour Juice(2)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 naira Big HappyHour Juice(3)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 naira Big HappyHour Juice(4)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2500 naira Big HappyHour Juice(5)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 naira Big HappyHour Juice(6)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("80 naira Small G. Schweppes")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 naira Small G. Schweppes(2)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 naira Small G. Schweppes(3)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 naira Small G. Schweppes(4)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira Small G. Schweppes(5)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 naira Small G. Schweppes(6)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 naira Big G. Schweppes")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 naira Big G. Schweppes(2)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira Big G. Schweppes(3)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 naira Big G. Schweppes(4)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 naira Big G. Schweppes(5)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira Big G. Schweppes(6)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("150 naira Pet Schweppes")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 naira Pet Schweppes(2)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 naira Pet Schweppes(3)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 naira Pet Schweppes(4)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 naira Pet Schweppes(5)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 naira Pet Schweppes(6)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        }

        DrinksmenuActivity.Pcount.setText("" + "PLATE COUNT" + "");
    }

}
