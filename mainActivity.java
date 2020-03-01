package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five,six,seven,eight,nine,dosomik,zero,sum,sub,mul,div,soman;
    Button c;
    EditText ed1;
    Float res1,res2;
    boolean Add,Sub,Mul,Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one =(Button)findViewById(R.id.one);
        two =(Button)findViewById(R.id.two);
        three =(Button)findViewById(R.id.three);
        four =(Button)findViewById(R.id.four);
        five =(Button)findViewById(R.id.five);
        six =(Button)findViewById(R.id.six);
        seven =(Button)findViewById(R.id.seven);
        eight =(Button)findViewById(R.id.eight);
        nine =(Button)findViewById(R.id.nine);

        zero =(Button)findViewById(R.id.zero);
        dosomik =(Button)findViewById(R.id.dosomik);
        sum =(Button)findViewById(R.id.sum);
        sub =(Button)findViewById(R.id.sub);
        mul =(Button)findViewById(R.id.mul);
        div =(Button)findViewById(R.id.div);
        soman =(Button)findViewById(R.id.soman);
        c =(Button)findViewById(R.id.c);

        ed1=(EditText)findViewById(R.id.editText);

         one.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 ed1.setText(ed1.getText()+"1");
             }
         });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });
        dosomik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else {
                    res1=Float.parseFloat(ed1.getText()+"");
                    Add=true;
                    ed1.setText(null);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else {
                    res1=Float.parseFloat(ed1.getText()+"");
                    Div=true;
                    ed1.setText(null);
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else {
                    res1=Float.parseFloat(ed1.getText()+"");
                    Sub=true;
                    ed1.setText(null);
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else {
                    res1=Float.parseFloat(ed1.getText()+"");
                    Mul=true;
                    ed1.setText(null);
                }
            }
        });


        soman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2=Float.parseFloat(ed1.getText()+"");
                if (Add==true){
                    ed1.setText(res1+res2+"");
                    Add=false;
                }

                if (Sub==true){
                    ed1.setText(res1-res2+"");
                    Sub=false;
                }

                if (Mul==true){
                    ed1.setText(res1*res2+"");
                    Mul=false;
                }

                if (Div==true){
                    ed1.setText(res1/res2+"");
                    Div=false;
                }
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });

    }
}
