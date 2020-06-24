package example.yuhanmiyeon.musicrecommendapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TestResultActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        textView=(TextView)findViewById(R.id.TextV);
        textView2=(TextView)findViewById(R.id.textV2);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testresult);

        Button RButton = (Button)findViewById(R.id.Retest);
        RButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TestResultActivity.this,TestActivity.class);
                startActivity(intent);
            }
        });
        Button SButton = (Button)findViewById(R.id.testStart);
        SButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TestResultActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}