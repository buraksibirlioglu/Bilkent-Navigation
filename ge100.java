    package com.example.burak.myapplication;

    import android.content.Context;
    import android.content.Intent;
    import android.content.SharedPreferences;
    import android.os.Bundle;
    import android.support.v4.app.FragmentActivity;
    import android.text.Editable;
    import android.text.TextWatcher;
    import android.util.Log;
    import android.view.MenuItem;
    import android.view.View;
    import android.widget.AdapterView;
    import android.widget.ArrayAdapter;
    import android.widget.EditText;
    import android.widget.ImageButton;
    import android.widget.ListView;
    import android.widget.PopupMenu;
    import android.widget.TextView;
    import android.widget.Toast;


    import com.google.android.gms.maps.SupportMapFragment;

    import com.google.android.gms.maps.model.LatLng;

    import java.io.File;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.io.OutputStreamWriter;

    public class ge100 extends FragmentActivity
    {
        private ListView lv2;
        ArrayAdapter<String> adapter2;
        String str_text;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.ge100);
            String options[] = {"Option 1", "Option 2", "Option 3", "Option 4", "Option 5",
                    "Option 6", "Option 7",
                    "Option 8", "Option 9", "Option 10", "Option 11"};
            adapter2 = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, options);
            lv2 = (ListView) findViewById(R.id.list_view_two);
            lv2.setAdapter(adapter2);
            lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapter, View view, int position,
                                        long id) {
                    Object o = adapter.getItemAtPosition(position);
                    str_text = o.toString();
                    str_text=str_text.substring(7);
                    //*finish();
                    Intent i = new Intent(getApplicationContext(), option.class);
                    i.putExtra("option", str_text);
                    startActivity(i);
                }
            });
        }
        public int optionChosen()
        {
            int result=0;
            if(str_text!=null)
                result= Integer.parseInt(str_text);
            return result;
        }

    }
