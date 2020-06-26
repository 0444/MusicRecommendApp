package example.yuhanmiyeon.musicrecommendapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Movie;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity
{
    public static Context context;

    Button SearchB;

    EditText singname, singer;

    CheckBox H_idol;
    CheckBox H_band;
    CheckBox H_trot;
    CheckBox H_healing;
    CheckBox H_calm;
    CheckBox H_dreamlike;
    CheckBox H_daybreak;
    CheckBox H_depressed;
    CheckBox H_noisily;
    CheckBox H_excited;
    CheckBox H_walk;
    CheckBox H_summer;
    CheckBox H_powerful;
    CheckBox H_strong;
    CheckBox H_grand;

    RadioGroup Country;
    RadioButton Korea;
    RadioButton Japan;
    RadioButton China;
    RadioButton Rest;

    RadioGroup Ost;
    RadioButton Ani;
    RadioButton Drama;
    RadioButton Movie;

    String name;
    String sing;
    String country1;
    String ost1;
    String hesh[]={" "," "," "};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        context=this;

        singname=(EditText)findViewById(R.id.SingName);
        singer=(EditText)findViewById(R.id.Singer);

        H_idol=(CheckBox)findViewById(R.id.H_idol);
        H_band=(CheckBox)findViewById(R.id.H_band);
        H_trot=(CheckBox)findViewById(R.id.H_trot);
        H_healing=(CheckBox)findViewById(R.id.H_healing);
        H_calm=(CheckBox)findViewById(R.id.H_calm);
        H_dreamlike=(CheckBox)findViewById(R.id.H_dreamlike);
        H_daybreak=(CheckBox)findViewById(R.id.H_daybreak);
        H_depressed=(CheckBox)findViewById(R.id.H_depressed);
        H_noisily=(CheckBox)findViewById(R.id.H_noisily);
        H_excited=(CheckBox)findViewById(R.id.H_excited);
        H_walk=(CheckBox)findViewById(R.id.H_walk);
        H_summer=(CheckBox)findViewById(R.id.H_summer);
        H_powerful=(CheckBox)findViewById(R.id.H_power);
        H_strong=(CheckBox)findViewById(R.id.H_strong);
        H_grand=(CheckBox)findViewById(R.id.H_grand);

        Country=(RadioGroup)findViewById(R.id.Country);
        Country.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if(checkedId == R.id.Korea) {country1= Korea.getText().toString();}
                    else if(checkedId == R.id.Japan) {country1= Japan.getText().toString();}
                    else if(checkedId == R.id.China) {country1= China.getText().toString();}
                    else if(checkedId == R.id.Rest) {country1= Rest.getText().toString();}
            }
        });

        Korea=(RadioButton)findViewById(R.id.Korea);
        Japan=(RadioButton)findViewById(R.id.Japan);
        China=(RadioButton)findViewById(R.id.China);
        Rest=(RadioButton)findViewById(R.id.Rest);

        Ost=(RadioGroup)findViewById(R.id.OST);
        Ost.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
             if(checkedId == R.id.Ani) {ost1= Ani.getText().toString();}
             else if(checkedId == R.id.Drama) {ost1= Drama.getText().toString();}
             else if(checkedId == R.id.Movie) {ost1= Movie.getText().toString();}
            }
        });

        Ani=(RadioButton)findViewById(R.id.Ani);
        Drama=(RadioButton)findViewById(R.id.Drama);
        Movie=(RadioButton)findViewById(R.id.Movie);

        SearchB=(Button) findViewById(R.id.SeachButton);
        SearchB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            name=singname.getText().toString();
            sing=singer.getText().toString();

                for(int i=0;i<3;i++)
                {
                    if(H_idol.isChecked()==true  &&hesh[i].equals(" "))
                         {hesh[i]= H_idol.getText().toString();
                          H_idol.setChecked(false);}
                    if(H_band.isChecked() == true &&hesh[i].equals(" "))
                         {hesh[i]= H_band.getText().toString();
                          H_band.setChecked(false);}
                    if(H_trot.isChecked() == true &&hesh[i].equals(" "))
                         {hesh[i]= H_trot.getText().toString();
                          H_trot.setChecked(false);}
                    if(H_healing.isChecked() == true &&hesh[i].equals(" "))
                         {hesh[i]= H_healing.getText().toString();
                          H_healing.setChecked(false);}
                    if(H_calm.isChecked() == true &&hesh[i].equals(" "))
                         {hesh[i]= H_calm.getText().toString();
                          H_calm.setChecked(false);}
                    if(H_dreamlike.isChecked() == true &&hesh[i].equals(" "))
                         {hesh[i]= H_dreamlike.getText().toString();
                          H_dreamlike.setChecked(false);}
                    if(H_daybreak.isChecked() == true &&hesh[i].equals(" "))
                         {hesh[i]= H_daybreak.getText().toString();
                          H_daybreak.setChecked(false);}
                    if(H_depressed.isChecked() == true &&hesh[i].equals(" "))
                         {hesh[i]= H_depressed.getText().toString();
                          H_depressed.setChecked(false);}
                    if(H_noisily.isChecked() == true &&hesh[i].equals(" "))
                    {hesh[i]= H_noisily.getText().toString();
                        H_noisily.setChecked(false);}
                    if(H_excited.isChecked() == true &&hesh[i].equals(" "))
                         {hesh[i]= H_excited.getText().toString();
                          H_excited.setChecked(false);}
                    if(H_walk.isChecked() == true &&hesh[i].equals(" "))
                         {hesh[i]= H_walk.getText().toString();
                          H_walk.setChecked(false);}
                    if(H_summer.isChecked() == true &&hesh[i].equals(" "))
                         {hesh[i]= H_summer.getText().toString();
                          H_summer.setChecked(false);}
                    if(H_powerful.isChecked() == true &&hesh[i].equals(" "))
                         {hesh[i]= H_powerful.getText().toString();
                          H_powerful.setChecked(false);}
                    if(H_strong.isChecked() == true &&hesh[i].equals(" "))
                         {hesh[i]= H_strong.getText().toString();
                          H_strong.setChecked(false);}
                    if(H_grand.isChecked() == true &&hesh[i].equals(" "))
                         {hesh[i]= H_grand.getText().toString();
                          H_grand.setChecked(false);}
                }

                Intent intent=new Intent(SearchActivity.this,SearchResultActivity.class);
                startActivity(intent);
            }
        });
    }
}
