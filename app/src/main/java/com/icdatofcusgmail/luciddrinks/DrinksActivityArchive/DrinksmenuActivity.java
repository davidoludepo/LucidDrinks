package com.icdatofcusgmail.luciddrinks.DrinksActivityArchive;

import android.app.Dialog;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.antonionicolaspina.revealtextview.RevealTextView;
import com.icdatofcusgmail.luciddrinks.LoginActivityArchive.LoginActivity;
import com.icdatofcusgmail.luciddrinks.LucidApplication;
import com.icdatofcusgmail.luciddrinks.MyCountlesston;
import com.icdatofcusgmail.luciddrinks.R;
import com.icdatofcusgmail.luciddrinks.ServingActivityArchive.ServingActivity;
import com.muddzdev.styleabletoastlibrary.StyleableToast;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import de.hdodenhof.circleimageview.CircleImageView;

public class DrinksmenuActivity extends AppCompatActivity  implements MidFielder, DrinkspriceFragment.OnNameSetListener, ChosendrinksFragment.OnPriceSetListener, AdapterView.OnItemClickListener{

    PowerManager.WakeLock wakeLock;
    Toolbar toolbar_foodmenu;
    private RelativeLayout relative;
    public static TextView textView, textView2nd, textView3rd, textView4th, textView5th, textView6th, textView7th, textView8th, textView9th, textView10th, textView11th, textView12th, textView13th, textView14th, textView15th, textView16th, textView17th, textView18th, textView19th, textView20th, textView21st, textView22nd, textView23rd, textView24th, textView25th, textView26th, textView27th, textView28th, textView29th, textView30th, textView31st, textView32nd, textView33rd, textView34th, textView35th, textView36th, textView37th, textView38th, textView39th, textView40th, textView41st, textView42nd, textView43rd;
    Button button, button2, button3, button4, button5, button6;
    static Button Pcount, Purchase;
    ListView ShowForThis;
    TextView WelcomeSweet, fullUsername, Lucid;
    TextView NoOfPlates;
    private ImageView AnimatedImageView;
    CircleImageView circleImageView;
    public static int out = 0;

    public static String playtcount = "";
    public static String stringplayti = "Buying all in a plate";
    String stringplaytii = "Buying all in two plates";
    String stringplaytiii = "Buying all in three plates";
    String stringplaytiv = "Buying all in four plates";
    String stringplaytv = "Buying all in five plates";
    String stringplaytvi = "Buying all in six plates";
    String stringplaytvii = "Buying all in seven plates";
    String stringplaytviii = "Buying all in eight plates";
    String stringplaytix = "Buying all in nine plates";
    String stringplaytx = "Buying all in ten plates";
    String stringplaytxi = "Buying all in oneone plates";
    String stringplaytxii = "Buying all in onetwo plates";
    String stringplaytxiii = "Buying all in onethree plates";
    String stringplaytxiv = "Buying all in onefour plates";
    String stringplaytxv = "Buying all in onefive plates";
    String stringplaytxvi = "Buying all in onesix plates";
    String stringplaytxvii = "Buying all in oneseven plates";
    String stringplaytxviii = "Buying all in oneeight plates";
    String stringplaytxix = "Buying all in onenine plates";
    String stringplaytxx = "Buying all in oneten plates";
    String stringplaytxxi = "Buying all in twoone plates";
    String stringplaytxxii = "Buying all in twotwo plates";
    String stringplaytxxiii = "Buying all in twothree plates";
    String stringplaytxxiv = "Buying all in twofour plates";
    String stringplaytxxv = "Buying all in twofive plates";
    String stringplaytxxvi = "Buying all in twosix plates";
    String stringplaytxxvii = "Buying all in twoseven plates";
    String stringplaytxxviii = "Buying all in twoeight plates";
    String stringplaytxxix = "Buying all in twonine plates";
    String stringplaytxxx = "Buying all in twoten plates";

    LucidApplication app;

    String update_url = "http://192.168.2.75/account_balance_difference.php";
    String insert_url = "http://192.168.2.75/snacks_transaction_success.php";
    AlertDialog.Builder Dweezy;


    private enum OperationAnimation {
        BEGIN, ADJOURN
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinksmenu);

        app = LucidApplication.getInstance();

        Dweezy = new AlertDialog.Builder(DrinksmenuActivity.this);

        playtcount = stringplayti;
        ShowForThis = (ListView) findViewById(R.id.listView);
        PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
        wakeLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "deprecatedmyfoot");
        wakeLock.acquire();
        textView = (Button) findViewById(R.id.Istchosenbutton);
        textView2nd = (Button) findViewById(R.id.Secondchosenbutton);
        textView3rd = (Button) findViewById(R.id.Thirdchosenbutton);
        textView4th = (Button) findViewById(R.id.Fourthchosenbutton);
        textView5th = (Button) findViewById(R.id.Fifthchosenbutton);
        textView6th = (Button) findViewById(R.id.Sixthchosenbutton);
        textView7th = (Button) findViewById(R.id.Seventhchosenbutton);
        textView8th = (Button) findViewById(R.id.Eightchosenbutton);
        textView9th = (Button) findViewById(R.id.Ninthchosenbutton);
        textView10th = (Button) findViewById(R.id.Tenthchosenbutton);
        textView11th = (Button) findViewById(R.id.Eleventhchosenbutton);
        textView12th = (Button) findViewById(R.id.Twelvthchosenbutton);
        textView13th = (Button) findViewById(R.id.Thirteenthchosenbutton);
        textView14th = (Button) findViewById(R.id.Fourteenthchosenbutton);
        textView15th = (Button) findViewById(R.id.Fifteenthchosenbutton);
        textView16th = (Button) findViewById(R.id.Sixteenthchosenbutton);
        textView17th = (Button) findViewById(R.id.Seventeenthchosenbutton);
        textView18th = (Button) findViewById(R.id.Eighteenthchosenbutton);
        textView19th = (Button) findViewById(R.id.Nineteenthchosenbutton);
        textView20th = (Button) findViewById(R.id.Twentiethchosenbutton);
        textView21st = (Button) findViewById(R.id.TwentyIstchosenbutton);
        textView22nd = (Button) findViewById(R.id.TwentySecondchosenbutton);
        textView23rd = (Button) findViewById(R.id.TwentyThirdchosenbutton);
        textView24th = (Button) findViewById(R.id.TwentyFourthchosenbutton);
        textView25th = (Button) findViewById(R.id.TwentyFifthchosenbutton);
        textView26th = (Button) findViewById(R.id.TwentySixthchosenbutton);
        textView27th = (Button) findViewById(R.id.TwentySeventhchosenbutton);
        textView28th = (Button) findViewById(R.id.TwentyEightchosenbutton);
        textView29th = (Button) findViewById(R.id.TwentyNinthchosenbutton);
        textView30th = (Button) findViewById(R.id.Thirtiethchosenbutton);
        textView31st = (Button) findViewById(R.id.ThirtyIstchosenbutton);
        textView32nd = (Button) findViewById(R.id.ThirtySecondchosenbutton);
        textView33rd = (Button) findViewById(R.id.ThirtyThirdchosenbutton);
        textView34th = (Button) findViewById(R.id.ThirtyFourthchosenbutton);
        textView35th = (Button) findViewById(R.id.ThirtyFifthchosenbutton);
        textView36th = (Button) findViewById(R.id.ThirtySixthchosenbutton);
        textView37th = (Button) findViewById(R.id.ThirtySeventhchosenbutton);
        textView38th = (Button) findViewById(R.id.ThirtyEighthchosenbutton);
        textView39th = (Button) findViewById(R.id.ThirtyNinthchosenbutton);
        textView40th = (Button) findViewById(R.id.Fourtiethchosenbutton);
        textView41st = (Button) findViewById(R.id.FourtyOnechosenbutton);
        textView42nd = (Button) findViewById(R.id.FourtyTwochosenbutton);
        textView43rd = (Button) findViewById(R.id.FourtyThreechosenbutton);

        NoOfPlates = (TextView) findViewById(R.id.CountMyPlate);

        WelcomeSweet = (TextView) findViewById(R.id.UserWelcome);
        fullUsername = (TextView) findViewById(R.id.fullUsername);
        Lucid = (RevealTextView) findViewById(R.id.AppName);
        Typeface blackface = Typeface.createFromAsset(getAssets(), "customfont/buttonfor.otf");
        Lucid.setTypeface(blackface);

        button = (Button) findViewById(R.id.Istpricebutton);
        button2 = (Button) findViewById(R.id.Secondpricebutton);
        button3 = (Button) findViewById(R.id.Thirdpricebutton);
        button4 = (Button) findViewById(R.id.Fourthpricebutton);
        button5 = (Button) findViewById(R.id.Fifthpricebutton);
        button6 = (Button) findViewById(R.id.Sixthpricebutton);
        Pcount = (Button) findViewById(R.id.button);

        Purchase = (Button) findViewById(R.id.button20000);

        AnimatedImageView = (ImageView) findViewById(R.id.animatedImages);

        circleImageView = (CircleImageView) findViewById(R.id.ServerImage);
        final Bundle bundle = getIntent().getExtras();
        getUserAppearance(bundle.getString("image"));

        if (!textView.isShown() && !textView2nd.isShown() && !textView3rd.isShown()
                && !textView4th.isShown() && !textView5th.isShown() && !textView6th.isShown()
                && !textView7th.isShown() && !textView8th.isShown() && !textView9th.isShown()
                && !textView10th.isShown() && !textView11th.isShown() && !textView12th.isShown()
                && !textView13th.isShown() && !textView14th.isShown() && !textView15th.isShown()
                && !textView16th.isShown() && !textView17th.isShown() && !textView18th.isShown()
                && !textView19th.isShown() && !textView20th.isShown() && !textView21st.isShown()
                && !textView22nd.isShown() && !textView23rd.isShown() && !textView24th.isShown()
                && !textView25th.isShown() && !textView26th.isShown() && !textView27th.isShown()
                && !textView28th.isShown() && !textView29th.isShown() && !textView30th.isShown()
                && !textView31st.isShown() && !textView32nd.isShown() && !textView33rd.isShown()
                && !textView34th.isShown() && !textView35th.isShown() && !textView36th.isShown()
                && !textView37th.isShown() && !textView38th.isShown() && !textView39th.isShown()
                && !textView40th.isShown()  && !textView41st.isShown() && !textView42nd.isShown()
                && !textView43rd.isShown()) {
            Pcount.setEnabled(false);
            Purchase.setEnabled(false);
        }

        Bundle FirstParcel = getIntent().getExtras();
        try {
            WelcomeSweet.setText("Welcome,  " + FirstParcel.getString("king") + "");
        } catch (Exception ignored) {

        }

        Bundle SecondParcel = getIntent().getExtras();
        try {
            fullUsername.setText("" + SecondParcel.getString("kingDavid") + "");
        } catch (Exception ignored) {

        }

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        relative = (RelativeLayout) findViewById(R.id.activity_drinksmenu);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(android.R.color.transparent));
        }
        toolbar_foodmenu = (Toolbar) findViewById(R.id.ToolbardrinksmenuActivity);
        setSupportActionBar(toolbar_foodmenu);

        try {
            getSupportActionBar().setTitle("");
        }catch (NullPointerException ignored) {

        }

    }

    private void getUserAppearance(String url) {
        Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_failed_userappearancesub).into(circleImageView, new com.squareup.picasso.Callback()  {
            @Override
            public void onSuccess() {

            }

            @Override
            public void onError() {

            }
        });

    }

    public void ConfirmMyPurchase(View v) {

        if (ChosenplateCounter.feetag.getCurrentTextColor() == Color.parseColor("#B71C1C")) {
            AlertDialog.Builder notExactly = new AlertDialog.Builder(DrinksmenuActivity.this);
            notExactly.setMessage("You've kinda exceeded your Balance");
            notExactly.setPositiveButton("I'm Sorry", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            notExactly.create().show();
        } else if (ChosenplateCounter.feetag.getCurrentTextColor() == Color.parseColor("#303F9F")) {
            AlertDialog.Builder notBeyond = new AlertDialog.Builder(DrinksmenuActivity.this);
            notBeyond.setMessage("Ummmm....Your Purchase really can't be equal with your Balance");
            notBeyond.setPositiveButton("I'm Sorry", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            notBeyond.create().show();
        } else {
            final AlertDialog.Builder builder = new AlertDialog.Builder(DrinksmenuActivity.this);
            builder.setTitle("Confirm Purchase");
            builder.setMessage("The item(s) you selected will be bought by clicking \nSENDDATA");
            builder.setCancelable(false);

            builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    playtcount = stringplayti;
                    ChosenplateCounter.feetag.setText("" + Integer.toString(out) + "");
                    DrinksmenuActivity.Pcount.setText("" + "PLATE COUNT" + "");

                    StyleableToast NotConfirmed = new StyleableToast(getApplicationContext(), "Transaction not Confirmed", Toast.LENGTH_SHORT).spinIcon();
                    NotConfirmed.setBackgroundColor(Color.parseColor("#FF5A5F"));
                    NotConfirmed.setTextColor(Color.WHITE);
                    NotConfirmed.show();
                }
            });
            builder.setPositiveButton(R.string.done, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    StringRequest fromJingSun = new StringRequest(Request.Method.POST, update_url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(final String response) {
                                    try {
                                        JSONArray jsonArray = new JSONArray(response);
                                        JSONObject jsonObject = jsonArray.getJSONObject(0);
                                        String code = jsonObject.getString("code");
                                        Dweezy.setMessage(code);
                                        Dweezy.setCancelable(false);
                                        exhibitAnswer(code);
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    }) {
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String,String> params = new HashMap<String, String>();
                            params.put("accountbalance_diff", ChosenplateCounter.feetag.getText().toString());
                            params.put("user_name", fullUsername.getText().toString());
                            return params;
                        }
                    };
                    MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(fromJingSun);
                }

            }).setIcon(R.drawable.a_announcement);
            Dialog dialog = builder.create();
            try {
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.LTGRAY));
            } catch (NullPointerException ignored) {

            }
            dialog.show();

         //   myOwnPay = (TextView) view.findViewById(R.id.myPaynotYours);

        }
    }

    public void exhibitAnswer(final String code) {
        Dweezy.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if (code.equals("Transaction Successful"))
                {
                    StyleableToast TranCompleted = new StyleableToast(getApplicationContext(), "Transaction Verified", Toast.LENGTH_SHORT).spinIcon();
                    TranCompleted.setBackgroundColor(Color.parseColor("#FF5A5F"));
                    TranCompleted.setTextColor(Color.WHITE);
                    TranCompleted.setIcon(R.drawable.da_confirmpurchasetoasticon);
                    TranCompleted.show();

                    Intent intent = new Intent(getBaseContext(), ServingActivity.class);
                    intent.putExtra("Roman", playtcount);

                    Bundle dweezy = new Bundle();
                    dweezy.putString("favouritism", textView.getText().toString());
                    intent.putExtras(dweezy);

                    Bundle tobi = new Bundle();
                    tobi.putString("genius", textView2nd.getText().toString());
                    intent.putExtras(tobi);

                    Bundle emmanuel = new Bundle();
                    emmanuel.putString("generous", textView3rd.getText().toString());
                    intent.putExtras(emmanuel);

                    Bundle joseph = new Bundle();
                    joseph.putString("focused", textView4th.getText().toString());
                    intent.putExtras(joseph);

                    Bundle godwin = new Bundle();
                    godwin.putString("creativebeast", textView5th.getText().toString());
                    intent.putExtras(godwin);

                    Bundle funmilayo = new Bundle();
                    funmilayo.putString("bestmom", textView6th.getText().toString());
                    intent.putExtras(funmilayo);

                    Bundle james = new Bundle();
                    james.putString("bestdad", textView7th.getText().toString());
                    intent.putExtras(james);

                    Bundle tomilola = new Bundle();
                    tomilola.putString("biggersis", textView8th.getText().toString());
                    intent.putExtras(tomilola);

                    Bundle opeyemi = new Bundle();
                    opeyemi.putString("biggestsis", textView9th.getText().toString());
                    intent.putExtras(opeyemi);

                    Bundle david = new Bundle();
                    david.putString("dhalson", textView10th.getText().toString());
                    intent.putExtras(david);

                    Bundle obla = new Bundle();
                    obla.putString("chikito", textView11th.getText().toString());
                    intent.putExtras(obla);

                    Bundle love = new Bundle();
                    love.putString("blackdiamond", textView12th.getText().toString());
                    intent.putExtras(love);

                    Bundle ikechukwu = new Bundle();
                    ikechukwu.putString("smilingfull", textView13th.getText().toString());
                    intent.putExtras(ikechukwu);

                    Bundle kaskas = new Bundle();
                    kaskas.putString("versatile", textView14th.getText().toString());
                    intent.putExtras(kaskas);

                    Bundle havillah = new Bundle();
                    havillah.putString("crazitivity", textView15th.getText().toString());
                    intent.putExtras(havillah);

                    Bundle samuel = new Bundle();
                    samuel.putString("humility", textView16th.getText().toString());
                    intent.putExtras(samuel);

                    Bundle praise = new Bundle();
                    praise.putString("omuaranprince", textView17th.getText().toString());
                    intent.putExtras(praise);

                    Bundle albert = new Bundle();
                    albert.putString("zambian", textView18th.getText().toString());
                    intent.putExtras(albert);

                    Bundle akinfenwa = new Bundle();
                    akinfenwa.putString("silentassasin", textView19th.getText().toString());
                    intent.putExtras(akinfenwa);

                    Bundle aize = new Bundle();
                    aize.putString("speciallyunique", textView20th.getText().toString());
                    intent.putExtras(aize);

                    Bundle eruku = new Bundle();
                    eruku.putString("oribee", textView21st.getText().toString());
                    intent.putExtras(eruku);

                    Bundle demilade = new Bundle();
                    demilade.putString("blackoyinbo", textView22nd.getText().toString());
                    intent.putExtras(demilade);

                    Bundle dimeji = new Bundle();
                    dimeji.putString("westbrook", textView23rd.getText().toString());
                    intent.putExtras(dimeji);

                    Bundle westbrook = new Bundle();
                    westbrook.putString("mvp", textView24th.getText().toString());
                    intent.putExtras(westbrook);

                    Bundle curry = new Bundle();
                    curry.putString("babyfaceassasin", textView25th.getText().toString());
                    intent.putExtras(curry);

                    Bundle oyedepo = new Bundle();
                    oyedepo.putString("baba", textView26th.getText().toString());
                    intent.putExtras(oyedepo);

                    Bundle damola = new Bundle();
                    damola.putString("geelord", textView27th.getText().toString());
                    intent.putExtras(damola);

                    Bundle bukunmi = new Bundle();
                    bukunmi.putString("myguy", textView28th.getText().toString());
                    intent.putExtras(bukunmi);

                    Bundle solomon = new Bundle();
                    solomon.putString("okowon", textView29th.getText().toString());
                    intent.putExtras(solomon);

                    Bundle tolani = new Bundle();
                    tolani.putString("submissive", textView30th.getText().toString());
                    intent.putExtras(tolani);

                    Bundle ganyan = new Bundle();
                    ganyan.putString("sokind", textView31st.getText().toString());
                    intent.putExtras(ganyan);

                    Bundle keziah = new Bundle();
                    keziah.putString("smilesmile", textView33rd.getText().toString());
                    intent.putExtras(keziah);

                    Bundle maryam = new Bundle();
                    maryam.putString("myhand", textView33rd.getText().toString());
                    intent.putExtras(maryam);

                    Bundle mrenoch = new Bundle();
                    mrenoch.putString("mentor", textView34th.getText().toString());
                    intent.putExtras(mrenoch);

                    Bundle shittu = new Bundle();
                    shittu.putString("softwareboss", textView35th.getText().toString());
                    intent.putExtras(shittu);

                    Bundle pastorchris = new Bundle();
                    pastorchris.putString("letspray", textView36th.getText().toString());
                    intent.putExtras(pastorchris);

                    Bundle deborah = new Bundle();
                    deborah.putString("owobird", textView37th.getText().toString());
                    intent.putExtras(deborah);

                    Bundle engrope = new Bundle();
                    engrope.putString("acceptance", textView38th.getText().toString());
                    intent.putExtras(engrope);

                    Bundle drojo = new Bundle();
                    drojo.putString("myprof", textView39th.getText().toString());
                    intent.putExtras(drojo);

                    Bundle drgana = new Bundle();
                    drgana.putString("impactful", textView40th.getText().toString());
                    intent.putExtras(drgana);

                    Bundle calabar = new Bundle();
                    calabar.putString("letsplay", textView41st.getText().toString());
                    intent.putExtras(calabar);

                    Bundle pemisire = new Bundle();
                    pemisire.putString("myboy", textView42nd.getText().toString());
                    intent.putExtras(pemisire);

                    Bundle firebomi = new Bundle();
                    firebomi.putString("mygal", textView43rd.getText().toString());
                    intent.putExtras(firebomi);



                    Bundle PrincessFiancee = new Bundle();
                    PrincessFiancee.putString("prince", WelcomeSweet.getText().toString().substring(8));
                    intent.putExtras(PrincessFiancee);

                    StringRequest stringRequest = new StringRequest(Request.Method.POST, insert_url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    try {
                                        JSONArray jsonArray = new JSONArray(response);
                                        JSONObject jsonObject = jsonArray.getJSONObject(0);

                                        String code = jsonObject.getString("tranc_success");

                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }

                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    }){
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {

                            String[] snacksNames = {
                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf("naira")+6) : null,
                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf("naira")+6) : null,
                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf("naira")+6) : null,
                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf("naira")+6) : null,
                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf("naira")+6) : null,
                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf("naira")+6) : null,
                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf("naira")+6) : null,
                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf("naira")+6) : null,
                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf("naira")+6) : null,
                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf("naira")+6) : null,
                                    textView11th.isShown() ? textView11th.getText().toString().substring(textView11th.getText().toString().indexOf("naira")+6) : null,
                                    textView12th.isShown() ? textView12th.getText().toString().substring(textView12th.getText().toString().indexOf("naira")+6) : null,
                                    textView13th.isShown() ? textView13th.getText().toString().substring(textView13th.getText().toString().indexOf("naira")+6) : null,
                                    textView14th.isShown() ? textView14th.getText().toString().substring(textView14th.getText().toString().indexOf("naira")+6) : null,
                                    textView15th.isShown() ? textView15th.getText().toString().substring(textView15th.getText().toString().indexOf("naira")+6) : null,
                                    textView16th.isShown() ? textView16th.getText().toString().substring(textView16th.getText().toString().indexOf("naira")+6) : null,
                                    textView17th.isShown() ? textView17th.getText().toString().substring(textView17th.getText().toString().indexOf("naira")+6) : null,
                                    textView18th.isShown() ? textView18th.getText().toString().substring(textView18th.getText().toString().indexOf("naira")+6) : null,
                                    textView19th.isShown() ? textView19th.getText().toString().substring(textView19th.getText().toString().indexOf("naira")+6) : null,
                                    textView20th.isShown() ? textView20th.getText().toString().substring(textView20th.getText().toString().indexOf("naira")+6) : null,
                                    textView21st.isShown() ? textView21st.getText().toString().substring(textView21st.getText().toString().indexOf("naira")+6) : null,
                                    textView22nd.isShown() ? textView22nd.getText().toString().substring(textView22nd.getText().toString().indexOf("naira")+6) : null,
                                    textView23rd.isShown() ? textView23rd.getText().toString().substring(textView23rd.getText().toString().indexOf("naira")+6) : null,
                                    textView24th.isShown() ? textView24th.getText().toString().substring(textView24th.getText().toString().indexOf("naira")+6) : null,
                                    textView25th.isShown() ? textView25th.getText().toString().substring(textView25th.getText().toString().indexOf("naira")+6) : null,
                                    textView26th.isShown() ? textView26th.getText().toString().substring(textView26th.getText().toString().indexOf("naira")+6) : null,
                                    textView27th.isShown() ? textView27th.getText().toString().substring(textView27th.getText().toString().indexOf("naira")+6) : null,
                                    textView28th.isShown() ? textView28th.getText().toString().substring(textView28th.getText().toString().indexOf("naira")+6) : null,
                                    textView29th.isShown() ? textView29th.getText().toString().substring(textView29th.getText().toString().indexOf("naira")+6) : null,
                                    textView30th.isShown() ? textView30th.getText().toString().substring(textView30th.getText().toString().indexOf("naira")+6) : null,
                                    textView31st.isShown() ? textView31st.getText().toString().substring(textView31st.getText().toString().indexOf("naira")+6) : null,
                                    textView32nd.isShown() ? textView32nd.getText().toString().substring(textView32nd.getText().toString().indexOf("naira")+6) : null,
                                    textView33rd.isShown() ? textView33rd.getText().toString().substring(textView33rd.getText().toString().indexOf("naira")+6) : null,
                                    textView34th.isShown() ? textView34th.getText().toString().substring(textView34th.getText().toString().indexOf("naira")+6) : null,
                                    textView35th.isShown() ? textView35th.getText().toString().substring(textView35th.getText().toString().indexOf("naira")+6) : null,
                                    textView36th.isShown() ? textView36th.getText().toString().substring(textView36th.getText().toString().indexOf("naira")+6) : null,
                                    textView37th.isShown() ? textView37th.getText().toString().substring(textView37th.getText().toString().indexOf("naira")+6) : null,
                                    textView38th.isShown() ? textView38th.getText().toString().substring(textView38th.getText().toString().indexOf("naira")+6) : null,
                                    textView39th.isShown() ? textView39th.getText().toString().substring(textView39th.getText().toString().indexOf("naira")+6) : null,
                                    textView40th.isShown() ? textView40th.getText().toString().substring(textView40th.getText().toString().indexOf("naira")+6) : null,
                                    textView41st.isShown() ? textView41st.getText().toString().substring(textView41st.getText().toString().indexOf("naira")+6) : null,
                                    textView42nd.isShown() ? textView42nd.getText().toString().substring(textView42nd.getText().toString().indexOf("naira")+6) : null,
                                    textView43rd.isShown() ? textView43rd.getText().toString().substring(textView43rd.getText().toString().indexOf("naira")+6) : null


                            };

                            String[] snacksPrices = {
                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf(""), textView.getText().toString().indexOf(" ")) : null,
                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf(""), textView2nd.getText().toString().indexOf(" ")) : null,
                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf(""), textView3rd.getText().toString().indexOf(" ")) : null,
                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf(""), textView4th.getText().toString().indexOf(" ")) : null,
                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf(""), textView5th.getText().toString().indexOf(" ")) : null,
                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf(""), textView6th.getText().toString().indexOf(" ")) : null,
                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf(""), textView7th.getText().toString().indexOf(" ")) : null,
                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf(""), textView8th.getText().toString().indexOf(" ")) : null,
                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf(""), textView9th.getText().toString().indexOf(" ")) : null,
                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf(""), textView10th.getText().toString().indexOf(" ")) : null,
                                    textView11th.isShown() ? textView11th.getText().toString().substring(textView11th.getText().toString().indexOf(""), textView11th.getText().toString().indexOf(" ")) : null,
                                    textView12th.isShown() ? textView12th.getText().toString().substring(textView12th.getText().toString().indexOf(""), textView12th.getText().toString().indexOf(" ")) : null,
                                    textView13th.isShown() ? textView13th.getText().toString().substring(textView13th.getText().toString().indexOf(""), textView13th.getText().toString().indexOf(" ")) : null,
                                    textView14th.isShown() ? textView14th.getText().toString().substring(textView14th.getText().toString().indexOf(""), textView14th.getText().toString().indexOf(" ")) : null,
                                    textView15th.isShown() ? textView15th.getText().toString().substring(textView15th.getText().toString().indexOf(""), textView15th.getText().toString().indexOf(" ")) : null,
                                    textView16th.isShown() ? textView16th.getText().toString().substring(textView16th.getText().toString().indexOf(""), textView16th.getText().toString().indexOf(" ")) : null,
                                    textView17th.isShown() ? textView17th.getText().toString().substring(textView17th.getText().toString().indexOf(""), textView17th.getText().toString().indexOf(" ")) : null,
                                    textView18th.isShown() ? textView18th.getText().toString().substring(textView18th.getText().toString().indexOf(""), textView18th.getText().toString().indexOf(" ")) : null,
                                    textView19th.isShown() ? textView19th.getText().toString().substring(textView19th.getText().toString().indexOf(""), textView19th.getText().toString().indexOf(" ")) : null,
                                    textView20th.isShown() ? textView20th.getText().toString().substring(textView20th.getText().toString().indexOf(""), textView20th.getText().toString().indexOf(" ")) : null,
                                    textView21st.isShown() ? textView21st.getText().toString().substring(textView21st.getText().toString().indexOf(""), textView21st.getText().toString().indexOf(" ")) : null,
                                    textView22nd.isShown() ? textView22nd.getText().toString().substring(textView22nd.getText().toString().indexOf(""), textView22nd.getText().toString().indexOf(" ")) : null,
                                    textView23rd.isShown() ? textView23rd.getText().toString().substring(textView23rd.getText().toString().indexOf(""), textView23rd.getText().toString().indexOf(" ")) : null,
                                    textView24th.isShown() ? textView24th.getText().toString().substring(textView24th.getText().toString().indexOf(""), textView24th.getText().toString().indexOf(" ")) : null,
                                    textView25th.isShown() ? textView25th.getText().toString().substring(textView25th.getText().toString().indexOf(""), textView25th.getText().toString().indexOf(" ")) : null,
                                    textView26th.isShown() ? textView26th.getText().toString().substring(textView26th.getText().toString().indexOf(""), textView26th.getText().toString().indexOf(" ")) : null,
                                    textView27th.isShown() ? textView27th.getText().toString().substring(textView27th.getText().toString().indexOf(""), textView27th.getText().toString().indexOf(" ")) : null,
                                    textView28th.isShown() ? textView28th.getText().toString().substring(textView28th.getText().toString().indexOf(""), textView28th.getText().toString().indexOf(" ")) : null,
                                    textView29th.isShown() ? textView29th.getText().toString().substring(textView29th.getText().toString().indexOf(""), textView29th.getText().toString().indexOf(" ")) : null,
                                    textView30th.isShown() ? textView30th.getText().toString().substring(textView30th.getText().toString().indexOf(""), textView30th.getText().toString().indexOf(" ")) : null,
                                    textView31st.isShown() ? textView31st.getText().toString().substring(textView31st.getText().toString().indexOf(""), textView31st.getText().toString().indexOf(" ")) : null,
                                    textView32nd.isShown() ? textView32nd.getText().toString().substring(textView32nd.getText().toString().indexOf(""), textView32nd.getText().toString().indexOf(" ")) : null,
                                    textView33rd.isShown() ? textView33rd.getText().toString().substring(textView33rd.getText().toString().indexOf(""), textView33rd.getText().toString().indexOf(" ")) : null,
                                    textView34th.isShown() ? textView34th.getText().toString().substring(textView34th.getText().toString().indexOf(""), textView34th.getText().toString().indexOf(" ")) : null,
                                    textView35th.isShown() ? textView35th.getText().toString().substring(textView35th.getText().toString().indexOf(""), textView35th.getText().toString().indexOf(" ")) : null,
                                    textView36th.isShown() ? textView36th.getText().toString().substring(textView36th.getText().toString().indexOf(""), textView36th.getText().toString().indexOf(" ")) : null,
                                    textView37th.isShown() ? textView37th.getText().toString().substring(textView37th.getText().toString().indexOf(""), textView37th.getText().toString().indexOf(" ")) : null,
                                    textView38th.isShown() ? textView38th.getText().toString().substring(textView38th.getText().toString().indexOf(""), textView38th.getText().toString().indexOf(" ")) : null,
                                    textView39th.isShown() ? textView39th.getText().toString().substring(textView39th.getText().toString().indexOf(""), textView39th.getText().toString().indexOf(" ")) : null,
                                    textView40th.isShown() ? textView40th.getText().toString().substring(textView40th.getText().toString().indexOf(""), textView40th.getText().toString().indexOf(" ")) : null,
                                    textView41st.isShown() ? textView41st.getText().toString().substring(textView41st.getText().toString().indexOf(""), textView41st.getText().toString().indexOf(" ")) : null,
                                    textView42nd.isShown() ? textView42nd.getText().toString().substring(textView42nd.getText().toString().indexOf(""), textView42nd.getText().toString().indexOf(" ")) : null,
                                    textView43rd.isShown() ? textView43rd.getText().toString().substring(textView43rd.getText().toString().indexOf(""), textView43rd.getText().toString().indexOf(" ")) : null



                            };

                            Map<String, String> params = new HashMap<String, String>();
                            for (String Names : snacksNames) {
                                if (!(Names == null))
                                    params.put("snacks_names", Arrays.toString(snacksNames).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
                            }
                            for (String Prices : snacksPrices) {
                                if (!(Prices == null))
                                    params.put("snacks_prices", Arrays.toString(snacksPrices).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
                            }
                            params.put("buyer_name", fullUsername.getText().toString());
                            params.put("no_plates", NoOfPlates.getText().toString());
                            params.put("total_price", ChosenplateCounter.feetag.getText().toString());
                            params.put("vendor_id", app.Idtext.getText().toString());

                            return params;
                        }
                    };
                    MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequest);

                    startActivity(intent);
                }
            }
        });
        AlertDialog alertDialog = Dweezy.create();
        alertDialog.show();
    }


    @Override
    public void respond(int ant) {
        FragmentManager manager = getFragmentManager();

        DrinkspriceFragment fpf = (DrinkspriceFragment) manager.findFragmentById(R.id.Fragmentdrinkprice);
        fpf.Datachange(ant);
    }


    @Override
    public void setPrice(String price) {
        ChosenplateCounter cpc = (ChosenplateCounter) getFragmentManager().findFragmentById(R.id.FragmentCounter);
        cpc.updatePrice(price);
    }

    @Override
    public void setName(String name) {
        ChosendrinksFragment cff = (ChosendrinksFragment) getFragmentManager().findFragmentById(R.id.FragmentChosendrink);
        cff.updateInfo(name);

        ChosenplateCounter cpc = (ChosenplateCounter) getFragmentManager().findFragmentById(R.id.FragmentCounter);
        cpc.updateInfo(name);

        Pcount.setEnabled(true);
        Purchase.setEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.drinksactivityappbarmain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.check_balance:
                break;

            case R.id.log_out:
                break;
        }
        return false;
    }

    public void checkMyBalance(MenuItem item) {
        Bundle myMoney = getIntent().getExtras();
        myMoney.getString("");
        Snackbar CheckMyMoney = Snackbar.make(relative, "Your balance is: " + myMoney.getString("accountbalance"), Snackbar.LENGTH_LONG);
        CheckMyMoney.setActionTextColor(Color.GREEN);
        CheckMyMoney.show();
    }

    public void AlrightImOff(MenuItem item) {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        setTitle("");
        alertDialog.setTitle("End Transaction");
        alertDialog.setMessage("This action will cancel this current operation. Do you want to cancel your transaction? ");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).setIcon(R.drawable.a_alert);

        Dialog dialog = alertDialog.create();
        dialog.show();
    }

    public void maxPlateCount(View view) {

        out = Integer.parseInt(String.valueOf(app.allinfoodcounter));

        final AlertDialog.Builder builder = new AlertDialog.Builder(DrinksmenuActivity.this);

        try { final String[] whiteRing = app.Diamond;
            builder.setItems(whiteRing, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    if (which == 0) {
                        Pcount.setText("" + "PLATE COUNT" + "");
                        NoOfPlates.setText("1");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in a plate", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(out) + "");
                        playtcount = stringplayti;
                    }
                    if (which == 1) {
                        Pcount.setText("PLATE COUNT\n(2)");
                        NoOfPlates.setText("2");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in two diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(2 * out ) + "");
                        playtcount = stringplaytii;
                    }
                    if (which == 2) {
                        Pcount.setText("PLATE COUNT\n(3)");
                        NoOfPlates.setText("3");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in three diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(3 * out ) + "");
                        playtcount = stringplaytiii;
                    }
                    if (which == 3) {
                        Pcount.setText("PLATE COUNT\n(4)");
                        NoOfPlates.setText("4");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in four diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(4 * out ) + "");
                        playtcount = stringplaytiv;
                    }
                    if (which == 4) {
                        Pcount.setText("PLATE COUNT\n(5)");
                        NoOfPlates.setText("5");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in five diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(5 * out ) + "");
                        playtcount = stringplaytv;
                    }
                    if (which == 5) {
                        Pcount.setText("PLATE COUNT\n(6)");
                        NoOfPlates.setText("6");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in six diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(6 * out ) + "");
                        playtcount = stringplaytvi;
                    }
                    if (which == 6) {
                        Pcount.setText("PLATE COUNT\n(7)");
                        NoOfPlates.setText("7");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in seven diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(7 * out ) + "");
                        playtcount = stringplaytvii;
                    }
                    if (which == 7) {
                        Pcount.setText("PLATE COUNT\n(8)");
                        NoOfPlates.setText("8");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in eight diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(8 * out ) + "");
                        playtcount = stringplaytviii;
                    }
                    if (which == 8) {
                        Pcount.setText("PLATE COUNT\n(9)");
                        NoOfPlates.setText("9");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in nine diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(9 * out ) + "");
                        playtcount = stringplaytix;
                    }
                    if (which == 9) {
                        Pcount.setText("PLATE COUNT\n(10)");
                        NoOfPlates.setText("" + "10" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in ten diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(10 * out ) + "");
                        playtcount = stringplaytx;
                    }
                    if (which == 10) {
                        Pcount.setText("PLATE COUNT\n(11)");
                        NoOfPlates.setText("" + "11" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in eleven diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(11 * out ) + "");
                        playtcount = stringplaytxi;
                    }
                    if (which == 11) {
                        Pcount.setText("PLATE COUNT\n(12)");
                        NoOfPlates.setText("" + "12" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twelve diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(12 * out ) + "");
                        playtcount = stringplaytxii;
                    }
                    if (which == 12) {
                        Pcount.setText("PLATE COUNT\n(13)");
                        NoOfPlates.setText("" + "13" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in thirteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(13 * out ) + "");
                        playtcount = stringplaytxiii;
                    }
                    if (which == 13) {
                        Pcount.setText("PLATE COUNT\n(14)");
                        NoOfPlates.setText("" + "14" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in fourteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(14 * out ) + "");
                        playtcount = stringplaytxiv;
                    }
                    if (which == 14) {
                        Pcount.setText("PLATE COUNT\n(15)");
                        NoOfPlates.setText("" + "15" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in fifteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(15 * out ) + "");
                        playtcount = stringplaytxv;
                    }
                    if (which == 15) {
                        Pcount.setText("PLATE COUNT\n(16)");
                        NoOfPlates.setText("" + "16" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in sixteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(16 * out ) + "");
                        playtcount = stringplaytxvi;
                    }
                    if (which == 16) {
                        Pcount.setText("PLATE COUNT\n(17)");
                        NoOfPlates.setText("" + "17" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in seventeen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(17 * out ) + "");
                        playtcount = stringplaytxvii;
                    }
                    if (which == 17) {
                        Pcount.setText("PLATE COUNT\n(18)");
                        NoOfPlates.setText("" + "18" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in eighteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(18 * out ) + "");
                        playtcount = stringplaytxviii;
                    }
                    if (which == 18) {
                        Pcount.setText("PLATE COUNT\n(19)");
                        NoOfPlates.setText("" + "19" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in nineteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(19 * out ) + "");
                        playtcount = stringplaytxix;
                    }
                    if (which == 19) {
                        Pcount.setText("PLATE COUNT\n(20)");
                        NoOfPlates.setText("" + "20" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twenty diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(20 * out ) + "");
                        playtcount = stringplaytxx;
                    }
                    if (which == 20) {
                        Pcount.setText("PLATE COUNT\n(21)");
                        NoOfPlates.setText("" + "21" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyone diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(21 * out ) + "");
                        playtcount = stringplaytxxi;
                    }
                    if (which == 21) {
                        Pcount.setText("PLATE COUNT\n(22)");
                        NoOfPlates.setText("" + "22" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentytwo diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(22 * out ) + "");
                        playtcount = stringplaytxxii;
                    }
                    if (which == 22) {
                        Pcount.setText("PLATE COUNT\n(23)");
                        NoOfPlates.setText("" + "23" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentythree diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(23 * out ) + "");
                        playtcount = stringplaytxxiii;
                    }
                    if (which == 23) {
                        Pcount.setText("PLATE COUNT\n(24)");
                        NoOfPlates.setText("" + "24" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyfour diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(24 * out ) + "");
                        playtcount = stringplaytxxiv;
                    }
                    if (which == 24) {
                        Pcount.setText("PLATE COUNT\n(25)");
                        NoOfPlates.setText("" + "25" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyfive diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(25 * out ) + "");
                        playtcount = stringplaytxxv;
                    }
                    if (which == 25) {
                        Pcount.setText("PLATE COUNT\n(26)");
                        NoOfPlates.setText("" + "26" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentysix diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(26 * out ) + "");
                        playtcount = stringplaytxxvi;
                    }
                    if (which == 26) {
                        Pcount.setText("PLATE COUNT\n(27)");
                        NoOfPlates.setText("" + "27" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyseven diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(27 * out ) + "");
                        playtcount = stringplaytxxvii;
                    }
                    if (which == 27) {
                        Pcount.setText("PLATE COUNT\n(28)");
                        NoOfPlates.setText("" + "28" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyeight diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(28 * out ) + "");
                        playtcount = stringplaytxxviii;
                    }
                    if (which == 28) {
                        Pcount.setText("PLATE COUNT\n(29)");
                        NoOfPlates.setText("" + "29" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentynine diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(29 * out ) + "");
                        playtcount = stringplaytxxix;
                    }
                    if (which == 29) {
                        Pcount.setText("PLATE COUNT\n(30)");
                        NoOfPlates.setText("" + "30" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in thirty diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(30 * out ) + "");
                        playtcount = stringplaytxxx;
                    }
                }
            });
        }
        catch (NullPointerException ignored) {

        }
        builder.setCancelable(true);
        Dialog dialog = builder.create();
        dialog.show();
    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        setTitle("");
        alertDialog.setTitle("End Transaction");
        alertDialog.setMessage("This action will cancel this current operation. Do you want to cancel your transaction? ");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).setIcon(R.drawable.a_alert);

        Dialog dialog = alertDialog.create();
        dialog.show();
    }

    @Override
    public boolean onSupportNavigateUp() {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("End Transaction");
        alertDialog.setMessage("This action will cancel this current operation. Do you want to Cancel your transaction? ");
        alertDialog.setIcon(R.drawable.a_alert);
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.create().show();
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("FoodmenuActivity","onStart invoked");
        reverseAnime(OperationAnimation.BEGIN);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("FoodmenuActivity","onResume invoked");
        wakeLock.acquire();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("FoodmenuActivity", "onPause invoked");
        wakeLock.release();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("FoodmenuActivity","onStop invoked");
        reverseAnime(OperationAnimation.ADJOURN);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("FoodmenuActivity","onRestart invoked");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("FoodmenuActivity","onDestroy invoked");
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    private void reverseAnime(OperationAnimation bedCheck) {
        Drawable graphicsPad = AnimatedImageView.getDrawable();
        Animatable crazitivity = ((Animatable) graphicsPad);
        switch (bedCheck) {
            case BEGIN:
                crazitivity.start();
                break;
            case ADJOURN:
                crazitivity.stop();
                break;
        }
    }
}
