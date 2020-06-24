package example.yuhanmiyeon.musicrecommendapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SearchResultActivity extends AppCompatActivity
{
    TextView N,S,H1,H2,H3,C,O;
    String n,s,h1,h2,h3,c,o;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchresult);

        Button SButton = (Button)findViewById(R.id.SeachBB);
        SButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(SearchResultActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });

        n=((SearchActivity)SearchActivity.context).name;
        s=((SearchActivity)SearchActivity.context).sing;
        h1=((SearchActivity)SearchActivity.context).hesh[0];
        h2=((SearchActivity)SearchActivity.context).hesh[1];
        h3=((SearchActivity)SearchActivity.context).hesh[2];
        c=((SearchActivity)SearchActivity.context).country;
        o=((SearchActivity)SearchActivity.context).ost;

        N=(TextView)findViewById(R.id.N);
        S=(TextView)findViewById(R.id.S);
        H1=(TextView)findViewById(R.id.H1);
        H2=(TextView)findViewById(R.id.H2);
        H3=(TextView)findViewById(R.id.H3);
        C=(TextView)findViewById(R.id.C);
        O=(TextView)findViewById(R.id.O);

        N.setText(n);
        S.setText(s);
        H1.setText(h1);
        H2.setText(h2);
        H3.setText(h3);
        C.setText(c);
        O.setText(o);
    }
}
