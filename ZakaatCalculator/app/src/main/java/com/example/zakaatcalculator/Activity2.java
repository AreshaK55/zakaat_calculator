package com.example.zakaatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    public int total=0, expenses=0, gold,silver,tax,wage,bank,fut,loan,stock,invest,cred;
    public double zakat=0;
    TextView show, asset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        show=(TextView)findViewById(R.id.payable);
        asset = (TextView)findViewById(R.id.assets);
}
public void Submit(View view){
    EditText text1 = (EditText)findViewById(R.id.Gold);
    if(isEmpty(text1)){
        gold = 0 ;
    }
    else{
     gold = Integer.parseInt(text1.getText().toString());}
    EditText text2 = (EditText)findViewById(R.id.Silver);
    if(isEmpty(text2)){
        silver = 0 ;
    }
    else{
      silver = Integer.parseInt(text2.getText().toString());}
    EditText text3 = (EditText)findViewById(R.id.Nisab);

     int nisab = Integer.parseInt(text3.getText().toString());
    EditText text4 = (EditText)findViewById(R.id.bank);
    if(isEmpty(text4)){
        bank = 0 ;
    }
    else{
     bank = Integer.parseInt(text4.getText().toString());}
    EditText text5 = (EditText)findViewById(R.id.future);
    if(isEmpty(text5)){
        fut = 0 ;
    }
    else{
     fut = Integer.parseInt(text5.getText().toString());}
    EditText text6 = (EditText)findViewById(R.id.loans);
    if(isEmpty(text6)){
        loan = 0 ;
    }
    else{
     loan = Integer.parseInt(text6.getText().toString());}
    EditText text7 = (EditText)findViewById(R.id.investment);
    if(isEmpty(text7)){
        invest = 0 ;
    }
    else{
     invest = Integer.parseInt(text7.getText().toString());}
    EditText text8 = (EditText)findViewById(R.id.stocks);
    if(isEmpty(text8)){
        stock = 0 ;
    }
    else{
        stock = Integer.parseInt(text8.getText().toString());
    }

    EditText text9 = (EditText)findViewById(R.id.credit);
    if(isEmpty(text9)){
        cred = 0 ;
    }
    else{
        cred = Integer.parseInt(text9.getText().toString());
    }

    EditText text10 = (EditText)findViewById(R.id.Wages);
    if(isEmpty(text10)){
        wage = 0 ;
    }
    else {
        wage = Integer.parseInt(text10.getText().toString());
    }

    EditText text11 = (EditText)findViewById(R.id.tax);
//    String tax = text11.getText().toString();
    if(isEmpty(text11)){
        tax = 0 ;
    }
    else{
     tax = Integer.parseInt(text11.getText().toString());
    }

    total = gold + silver + bank + invest + loan + fut + stock;
    expenses = cred + wage + tax;
    zakat = total - expenses ;
    asset.setText("RS. "+Double.toString(zakat));

    if(zakat > nisab){
        zakat = zakat * 0.025;
        show.setText("RS. "+ Double.toString(zakat));
    }
    else{
        show.setText("You are not eligible for zakaat. Your wealth is less than nisab.");
    }

}
    public boolean isEmpty(EditText etText) {
        if (etText.getText().toString().matches(""))
            return true;

        return false;
    }
}