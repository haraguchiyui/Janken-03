package com.lifeistech.android.janken;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView player;
    ImageView cpu;
    TextView result;
    int number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player=(TextView)findViewById(R.id.player);
        cpu=(ImageView)findViewById(R.id.cpu);
        result=(TextView)findViewById(R.id.result);
    }

    public void goo(View v){
        player.setText("あなたの手はグーです");
        Random random = new Random();
        number = random.nextInt(3);

        if(number==0) {
            cpu.setImageResource(R.drawable.goo);
            result.setText("引き分けです");
            result.setTextColor(Color.rgb(0,0,0));
        } else if(number==1){
            cpu.setImageResource(R.drawable.choki);
            result.setText("あなたの勝ちです");
            result.setTextColor(Color.rgb(255,0,0));
        }else if(number==2){
            cpu.setImageResource(R.drawable.paa);
            result.setText("あなたの負けです");
            result.setTextColor(Color.rgb(0,0,0));
        }
    }

    public void choki(View v){
        player.setText("あなたの手はチョキです" );
        Random random = new Random();
        number= random.nextInt(3);

        if(number==0){
            cpu.setImageResource(R.drawable.goo);
            result.setText("あなたの負けです");
            result.setTextColor(Color.rgb(0,0,0));
        }else if(number==1){
            cpu.setImageResource(R.drawable.choki);
            result.setText("引き分けです");
            result.setTextColor(Color.rgb(0,0,0));
        }else if(number==2){
            cpu.setImageResource(R.drawable.paa);
            result.setText("あなたの勝ちです");
            result.setTextColor(Color.rgb(255,0,0));
        }
    }

    public void paa(View v){
        player.setText("あなたの手はパーです");
        Random random = new Random();
        number = random.nextInt(3);

        if(number==0){
            cpu.setImageResource(R.drawable.goo);
            result.setText("あなたの勝ちです");
            result.setTextColor(Color.rgb(255,0,0));
        }else if(number==1){
            cpu.setImageResource(R.drawable.choki);
            result.setText("あなたの負けです");
            result.setTextColor(Color.rgb(0,0,0));
        }else if (number==2){
            cpu.setImageResource(R.drawable.paa);
            result.setText("引き分けです");
            result.setTextColor(Color.rgb(0,0,0));
        }
    }
}
