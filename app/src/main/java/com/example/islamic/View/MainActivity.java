package com.example.islamic.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.islamic.Presenter.presenter;
import com.example.islamic.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView id_text;
    private Button id_countup,id_cuontdwon,id_reset;
    private presenter p = new presenter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


              id_text = (TextView) findViewById(R.id.id_text);

              id_countup = (Button) findViewById(R.id.id_countup);
              id_cuontdwon = (Button) findViewById(R.id.id_cuontdwon);
              id_reset = (Button) findViewById(R.id.id_reset);


        int num = 0;
        id_text.setText(""+num);

              id_countup.setOnClickListener(this);
              id_cuontdwon.setOnClickListener(this);
              id_reset.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {



            if(v.getId()==R.id.id_countup)
            {


                  id_text.setText(""+sum());


            }
            else if(v.getId()==R.id.id_cuontdwon)
            {
                  id_text.setText(""+subc());
            }
            else if(v.getId()==R.id.id_reset)
            {
                    id_text.setText(""+res());
            }


    }

    private int res() {



          return p.reset();
    }

    private int subc() {

       return   p.sub();
    }

    private int sum() {

        return   p.add();
    }
}