package edu.kvcc.cis298.cis298assignment2;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TemperatureConverter extends AppCompatActivity {


    private RadioGroup startGroup;
    private RadioButton startC,startF,startK,startR;

    private RadioGroup endGroup;
    private RadioButton endC,endF,endK,endR;

    private Button mConvert;

    private TextView solution;
    private TextView equation;

    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter);

        equation = (TextView)findViewById(R.id.equationSolution);
        solution = (TextView)findViewById(R.id.output);
        input = (EditText)findViewById(R.id.userTemp);

        startC = (RadioButton)findViewById(R.id.start1);
        startF = (RadioButton)findViewById(R.id.start2);
        startK = (RadioButton)findViewById(R.id.start3);
        startR = (RadioButton)findViewById(R.id.start4);

        endC = (RadioButton)findViewById(R.id.end1);
        endF = (RadioButton)findViewById(R.id.end2);
        endK = (RadioButton)findViewById(R.id.end3);
        endR = (RadioButton)findViewById(R.id.end4);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_temperature_converter, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void convert(View view){
        double value = Double.valueOf(input.getText().toString());
        if(startC.isChecked()){
            if(endC.isChecked()){
                value = UnitConverter.CtoC(value);
            }
            else if(endF.isChecked()){
                value = UnitConverter.CtoF(value);
            }
            else if(endK.isChecked()){
                value = UnitConverter.CtoK(value);
            }
            else if(endR.isChecked()){
                value = UnitConverter.CtoR(value);
            }
            solution.setText(Double.toString(value));
        }
        //Fahrenheit
        else if(startF.isChecked()){
            if(endC.isChecked()){
                value = UnitConverter.FtoC(value);
            }
            else if(endF.isChecked()){
                value = UnitConverter.FtoF(value);
            }
            else if(endK.isChecked()){
                value = UnitConverter.FtoK(value);
            }
            else if(endR.isChecked()){
                value = UnitConverter.FtoR(value);
            }
            solution.setText(Double.toString(value));
        }
        //Kelvin
        else if(startK.isChecked()){
            if(endC.isChecked()){
                value = UnitConverter.KtoC(value);
            }
            else if(endF.isChecked()){
                value = UnitConverter.KtoF(value);
            }
            else if(endK.isChecked()){
                value = UnitConverter.KtoK(value);
            }
            else if(endR.isChecked()){
                value = UnitConverter.KtoR(value);
            }
            solution.setText(Double.toString(value));
        }
        //Rankin
        else if(startR.isChecked()){
            if(endC.isChecked()){
                value = UnitConverter.RtoC(value);
            }
            else if(endF.isChecked()){
                value = UnitConverter.RtoF(value);
            }
            else if(endK.isChecked()){
                value = UnitConverter.RtoK(value);
            }
            else if(endR.isChecked()){
                value = UnitConverter.RtoR(value);
            }
            solution.setText(Double.toString(value));
        }


    }
}