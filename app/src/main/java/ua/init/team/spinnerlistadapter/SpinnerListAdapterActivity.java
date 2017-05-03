package ua.init.team.spinnerlistadapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class SpinnerListAdapterActivity extends Activity {

    Spinner mSpBaraholka;   // sp_baraholka
    Spinner mSpTechnics;    // sp_technics

    ListView mLvBaraholka;  //list_baraholka
    ListView mLvFurniture;  //list_furniture

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_list_adapter);

//        Spinner mSpBaraholka;   // sp_baraholka
        mSpBaraholka = (Spinner)findViewById(R.id.sp_baraholka);
        mSpBaraholka.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SpinnerListAdapterActivity.this, "spinner baraholka, position = " + position + " id = " + id, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
//
            }
        });

//        Spinner mSpTechnics;    // sp_technics
        mSpTechnics = (Spinner)findViewById(R.id.sp_technics);
        mSpTechnics.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SpinnerListAdapterActivity.this, "spinner technics, position = " + position + " id = " + id, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

//        ListView mLvBaraholka;  //list_baraholka
        mLvBaraholka = (ListView)findViewById(R.id.lv_baraholka);
        mLvBaraholka.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SpinnerListAdapterActivity.this, "list_view baraholka, position = " + position + " id = " + id, Toast.LENGTH_SHORT).show();
            }
        });

//        ListView mLvFurniture;  //list_furniture
        mLvFurniture = (ListView)findViewById(R.id.lv_furniture);
        mLvFurniture.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SpinnerListAdapterActivity.this, "list_view furniture, position = " + position + " id = " + id, Toast.LENGTH_SHORT).show();
            }
        });



    }
}
