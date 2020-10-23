package com.example.ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {

    TextView tv1, tv2;
    Spinner spin1, spin2;
    ListView lv;
    int a,row,x=0;
    String[]continent ={"Select","asia","africa","america","europe",};
    String [][]arrCnatry={
            {"Select","Japan","India","China","Thailand","South Korea","Vietnam","Nepal"},
            {"Select","Kenya","Ethiopia","Ghana","Nigeria","Morocco","Sudan","Egypt"},
            {"Select","United states","Canada","Brazil","Mexico","Argentina","Cuba","Peru"},
            {"Select","Germany","United Kingdom","Italy","France","Spain","Netherlands","Sweden"}
    };
    String [][] arrciti_as={
            {"Tokyo","Osaka","Kyoto","Kumamoto","Sagamihara"},
            {"Mumbai","Delhi","Bangalore","Chennai","Kolkata"},
            {"Beijing","Tianjin","Anqing","Chaohu","Hefei"},
            {"Bangkok","Nonthaburi","Pak kret","Hat Yai","Phuket"},
            {"Andong","Ansan","Anseong","Anyang","Asan"},
            {"Can Tho","Da Nang","Haiphong","Hanoi","Ho Chi Minh"},
            {"Katmandu","Pokhara","Lalitpur","BaharatPur","Birganj"},
    };
    String [][] arrciti_af={
            {"Mombasa","Nairobi","Kisumu","Nakuru","Eldoret"},
            {"Addis Ababa","Mekelle","Gondar","Adama","Hawassa"},
            {"Accra","Kumasi","Tamale","Ashaiman","Sunyani"},
            {"Lagos","Kano","Ibadan","Benin City","Jos"},
            {"Casablanca","Fez","Tangier","Marrakesh","Meknes"},
            {"Omdurman","Khartoum","Nyala","Kassala","El-Gadarif"},
            {"Cairo","Alexandria","Giza","Suez","Luxor"},
    };
    String [][] arrciti_am={
            {"Los Angeles","Chicago","California","Texas","Ohio"},
            {"Toronto","Montreal","Calgary","Ottawa","Edmonton"},
            {"Rio","Salvador","Mananus","Curitiba","Porto Alegre"},
            {"Mexico city","Acolman","Guadalajara","Tijuana","Zapopan"},
            {"Buenos Aires","Cordoba","Rosario","Mendoza","La Plata"},
            {"Havana","Santa Clara","Las Tunas","Bayamo","Matanzas"},
            {"Lima","Arequipa","Trujillo","Chiclayo","Piura"},
    };
    String [][] arrciti_ero={
            {"Berlin","Hamburg","Munich","Bremen","Dresden"},
            {"Liverpool","London","Manchester","Lincoln","Lancaster"},
            {"Rome","Venice","Milan","Naples","Catania"},
            {"Lyon","Paris","Nice","Toulouse","Montpellier"},
            {"Madrid","Barcelona","Seville","Bilbao","Zaragoza"},
            {"Amsterdam","Leiden","Rotterdam","The Hague","Haarlem"},
            {"Stockholm","Arboga","Arvika","Sigtuna","Uppsala"}
    };
    String[][] meida_as={
            {"13920000","2200"},{"2660000","223"},{"1475000","827"},{"738000","390"},{"720000","328"},
            {"12400000","603"},{"16780000","1500"},{"8440000","709"},{"7000000","426"},{"4500000","206"},
            {"21500000","16410"},{"15621000","12000"},{"5300000","13590"},{"859000","2063"},{"8000000","11434"},
            {"8305000","1560"},{"250000","39"},{"190200","36"},{"156000","21"},{"416500","534"},
            {"158700","1590"},{"716700","150"},{"190000","554"},{"5170000","7355"},{"308000","542"},
            {"1280000","1430"},{"1130000","1285"},{"2028000","1520"},{"8000000","3300"},{"8990000","2060"},
            {"1440000","49"},{"523000","464"},{"513200","37"},{"280000","433"},{"204000","75"}
    };

    String[][] meida_af={
            {"1200000","295km^2"},{"4390000","696km^2"},{"397000","550km^2"},{"570000","123"},{"475000","-----"},
            {"3300000","527k^2"},{"310400","---__----"},{"299000","192km^2"},{"324000","1111"},{"315200","50km^2"},
            {"5000000","173"},{"3340000","254"},{"950000","750"},{"298000","idk"},{"208000","?"},
            {"8000000","1170km^2"},{"2280000","499"},{"2550000","3080"},{"1495000","1024"},{"873000","?"},
            {"3350000","220"},{"1200000","320"},{"947000","?"},{"928000","?"},{"632000","370"},
            {"2300000","614"},{"639000","1010"},{"564000","?"},{"419000","?"},{"360000","?"},
            {"9500000","3085"},{"5200000","2679"},{"8800000","1579"},{"744000","250"},{"506000","416"}
    };

    String[][] meida_am={
            {"3700000","1300"},{"2695000","606"},{"39512000","163600"},{"28995800","695600"},{"11689000","116000"},
            {"2700500","630"},{"1700600","431"},{"1200200","825"},{"934000","2790"},{"932500","767"},
            {"6718000","1220"},{"2800000","693"},{"2180000","11400"},{"1900000","430"},{"1400000","496"},
            {"8900000","1480"},{"136000","86"},{"1460100","151"},{"1900000","637"},{"1155000","893"},
            {"2891000","203"},{"1391000","576"},{"1270000","178"},{"115000","54"},{"765000","203"},
            {"2130000","728"},{"242400","514"},{"171000","891"},{"222000","918"},{"145000","317"},
            {"8800000","2600"},{"1000000","69"},{"919000","1100"},{"552000","174"},{"484000","621"}
    };
    String[][] meida_ero={
            {"3700000","890"},{"1800000","755"},{"1400000","310"},{"567000","326"},{"556700","328"},
            {"498000","111"},{"8900000","1572"},{"552000","115"},{"97500","35"},{"52000","?"},
            {"4340000","1280"},{"260000","414"},{"1399000","181"},{"967000","119"},{"311500","182"},{"311000","182"},
            {"516000","47"},{"2140000","105"},{"340000","71"},{"479000","118"},{"285000","56"},
            {"3200000","604"},{"1620000","101"},{"688000","140"},{"345000","41"},{"666880","973"},
            {"872680","219"},{"124000","23"},{"651000","324"},{"544000","98"},{"161000","32"},
            {"975000","188"},{"10330","9"},{"14000","10"},{"8400","4"},{"172000","48"}
    };
    String [][] info=new String[2][35]; // 7 מדינות * 5 ערים = 35
    String [][] arrciti=new String[5][7];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin2= findViewById(R.id.spin2);
        spin1 = findViewById(R.id.spin);
        tv1 = findViewById(R.id.tv);
        tv2 = findViewById(R.id.tv2);
        lv = findViewById(R.id.lv);
        spin1.setOnItemSelectedListener(this);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, //
                R.layout.support_simple_spinner_dropdown_item,continent);
        spin1.setAdapter(adp);

        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE); //

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        Spinner spinner = (Spinner) parent;
        if (spinner.getId()==R.id.spin) {
            switch (position) {
                case 1:
                    arrciti = arrciti_as;
                    info = meida_as;
                    break;
                case 2:
                    arrciti = arrciti_af;
                    info = meida_af;
                    break;
                case 3:
                    arrciti = arrciti_am;
                    info = meida_am;
                    break;
                case 4:
                    arrciti = arrciti_ero;
                    info = meida_ero;
                    break;
            }
                if (position == 0) {
                    lv.setAdapter(null);
                    tv1.setText("");
                    tv2.setText("");
                }
                else {
                    row = position - 1;
                    spin2.setOnItemSelectedListener(this);
                    ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
                            R.layout.support_simple_spinner_dropdown_item, arrCnatry[row]);
                    spin2.setAdapter(adp);
                }

        }
        else if(spinner.getId()== R.id.spin2){
            row=position-1;
            if (position == 0) {
                lv.setAdapter(null);
                tv1.setText("");
                tv2.setText("");
            }
            else {
                lv.setOnItemClickListener(this);
                ArrayAdapter<String> adp2 = new ArrayAdapter<String>(this,
                        R.layout.support_simple_spinner_dropdown_item,arrciti[row]);
                lv.setAdapter(adp2);
                a=row;
            }
        }
    }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (a){
            case 0:
                x=position;
                break;
            case 1:
                x=5+position;
                break;
            case 2:
                x=10+position;
                break;
            case 3:
                x=15+position;
                break;
            case 4:
                x=20+position;
                break;
            case 5:
                x=25+position;
                break;
            case 6:
                x=30+position;
                break;
        }

        tv2.setText(info[x][0]);
        tv1.setText(info[x][1]);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}