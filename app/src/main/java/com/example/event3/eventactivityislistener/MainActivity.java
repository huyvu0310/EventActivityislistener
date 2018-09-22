package com.example.event3.eventactivityislistener;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends Activity
        implements OnClickListener{
    Button btnTong;
    EditText edita,editb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTong=(Button) findViewById(R.id.tong2so);
        btnTong.setOnClickListener(this);}
    @Override
    public void onClick(View arg0) {
        EditText edita=(EditText)
                findViewById(R.id.edtSoa);
        int a=Integer.parseInt(edita.getText()+"");
        EditText editb=(EditText) findViewById(R.id.edtSob);
        int b=Integer.parseInt(editb.getText()+"");
        TextView txtkq=(TextView) findViewById(R.id.edtKq);
        txtkq.setText((a+b)+"");


    }

}

