package example.yuhanmiyeon.musicrecommendapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    int i;
    int j;
    int count;
    int m=0;
    private int[] music={R.raw.music1,R.raw.music2,R.raw.music3,R.raw.music4};
    private   int[] score=new int[10];
    private MediaPlayer md;
    private MediaPlayer md2;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Button buttonA = (Button) findViewById(R.id.buttonA);
        Button buttonB = (Button) findViewById(R.id.buttonB);
        Button m1 = (Button) findViewById(R.id.m1);
        Button m2 = (Button) findViewById(R.id.m2);


        textView=(TextView)findViewById(R.id.textV);
        j=i+1;
                m1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        md.start();
                        m++;
                        if(m==2){
                        md.stop();
                        m=0;}
                    }
                });

                m2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        md2.start();
                        m++;
                        if(m==2){
                        md2.stop();
                        m=0; }
                    }
                });
                buttonA.setOnClickListener(new View.OnClickListener() {
                    @Override

                    public void onClick(View v) {

                        if(j==4){i++; }
                        if(j==4){j=i+1;}

                        md=MediaPlayer.create(TestActivity.this,music[i]);
                        md2=MediaPlayer.create(TestActivity.this,music[j]);

                        j++;
                        count++;
                        score[i]++;

                        if (count==6) {
                            md=MediaPlayer.create(TestActivity.this,music[4]);

                            md2=MediaPlayer.create(TestActivity.this,music[4]);

                            Intent intent = new Intent(TestActivity.this, TestResultActivity.class);
                            startActivity(intent);
                        }

                    }
                });

                buttonB.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        score[j-1]++;
                        if(j==4){i++;
                            j=i+1;}


                        md=MediaPlayer.create(TestActivity.this,music[i]);
                        md2=MediaPlayer.create(TestActivity.this,music[j]);

                        j++;
                        count++;

                        if (count==6) {
                         Intent intent = new Intent(TestActivity.this, TestResultActivity.class);
                            startActivity(intent);
                        }
                    }

                });
    }

}
