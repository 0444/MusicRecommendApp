package example.yuhanmiyeon.musicrecommendapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SearchResultActivity extends AppCompatActivity
{
    TextView N;
    TextView S;
    TextView H1;
    TextView H2;
    TextView H3;
    TextView C;
    TextView O;
    String nn;
    String ss;
     String hh1;
     String hh2;
     String hh3;
     String cc;
    String oo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchresult);

        Button button = (Button)findViewById(R.id.SeachBB);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(SearchResultActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });

        nn=((SearchActivity)SearchActivity.context).name;
        ss=((SearchActivity)SearchActivity.context).sing;
        hh1=((SearchActivity)SearchActivity.context).hesh[0];
        hh2=((SearchActivity)SearchActivity.context).hesh[1];
        hh3=((SearchActivity)SearchActivity.context).hesh[2];
        cc=((SearchActivity)SearchActivity.context).country1;
        oo=((SearchActivity)SearchActivity.context).ost1;

        N=(TextView)findViewById(R.id.N);
        S=(TextView)findViewById(R.id.S);
        H1=(TextView)findViewById(R.id.H1);
        H2=(TextView)findViewById(R.id.H2);
        H3=(TextView)findViewById(R.id.H3);
        C=(TextView)findViewById(R.id.C);
        O=(TextView)findViewById(R.id.O);

        N.setText(nn);
        S.setText(ss);
        H1.setText(hh1);
        H2.setText(hh2);
        H3.setText(hh3);
        C.setText(cc);
        O.setText(oo);
    }
}
