package br.com.fvm.control;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import br.com.fvm.R;
import br.com.fvm.model.DAO.DataBaseHelper;

public class MainActivity extends AppCompatActivity {

    private DataBaseHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new DataBaseHelper(this);
        SQLiteDatabase db = helper. getWritableDatabase();

        ContentValues values = new ContentValues();
        values. put("name","Açai");
        values. put("description","Bom demais");
        values. put("price",1.2);
        long resultado = db. insert("products", null, values);

        TextView text= (TextView) findViewById(R.id.textView);
        text.setText("retorno: "+resultado);

    }
}
