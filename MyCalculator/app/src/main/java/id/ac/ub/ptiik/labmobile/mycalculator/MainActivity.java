package id.ac.ub.ptiik.labmobile.mycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class MainActivity extends Activity implements View.OnClickListener {

    ArrayList<String> nilai = new ArrayList<String>();
    ArrayList<String> operator = new ArrayList<String>();
    int stack_counter = 0;

    String text_screen = "";

    TextView textScreen;
    TextView textScreenTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nilai.add("");

        textScreen = (TextView) findViewById(R.id.textViewScreen1);
        textScreenTop = (TextView) findViewById(R.id.textViewScreen2);

        Button button_0 = (Button) findViewById(R.id.button0);
        Button button_1 = (Button) findViewById(R.id.button1);
        Button button_2 = (Button) findViewById(R.id.button2);
        Button button_3 = (Button) findViewById(R.id.button3);
        Button button_4 = (Button) findViewById(R.id.button4);
        Button button_5 = (Button) findViewById(R.id.button5);
        Button button_6 = (Button) findViewById(R.id.button6);
        Button button_7 = (Button) findViewById(R.id.button7);
        Button button_8 = (Button) findViewById(R.id.button8);
        Button button_9 = (Button) findViewById(R.id.button9);

        Button buttonSamaDengan = (Button) findViewById(R.id.button_sama_dengan);
        Button buttonTambah = (Button) findViewById(R.id.button_tambah);
        Button buttonKoma = (Button) findViewById(R.id.button_koma);
        Button buttonKurang = (Button) findViewById(R.id.button_kurang);
        Button buttonKali = (Button) findViewById(R.id.button_kali);
        Button buttonBagi = (Button) findViewById(R.id.button_bagi);
        Button buttonDel = (Button) findViewById(R.id.button_del);
        Button buttonPersen = (Button) findViewById(R.id.button_mod);
        Button buttonC = (Button) findViewById(R.id.button_c);

        button_0.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);

        buttonSamaDengan.setOnClickListener(this);
        buttonTambah.setOnClickListener(this);
        buttonKoma.setOnClickListener(this);
        buttonKurang.setOnClickListener(this);
        buttonKali.setOnClickListener(this);
        buttonBagi.setOnClickListener(this);
        buttonDel.setOnClickListener(this);
        buttonPersen.setOnClickListener(this);
        buttonC.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button0) {
            //Toast.makeText(this, "0 ditekan!!", Toast.LENGTH_SHORT).show();
            nilai.set(stack_counter, nilai.get(stack_counter)+ "0");
            setScreen();
        }
        else if (v.getId() == R.id.button1) {
            //Toast.makeText(this, "1 ditekan!!", Toast.LENGTH_SHORT).show();
            nilai.set(stack_counter, nilai.get(stack_counter)+ "1");
            setScreen();
        }
        else if (v.getId() == R.id.button2) {
            Toast.makeText(this, "2 ditekan!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.button3) {
            Toast.makeText(this, "3 ditekan!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.button4) {
            Toast.makeText(this, "4 ditekan!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.button5) {
            Toast.makeText(this, "5 ditekan!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.button6) {
            Toast.makeText(this, "6 ditekan!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.button7) {
            Toast.makeText(this, "7 ditekan!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.button8) {
            Toast.makeText(this, "8 ditekan!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.button9) {
            Toast.makeText(this, "9 ditekan!!", Toast.LENGTH_SHORT).show();
        }


        else if (v.getId() == R.id.button_c) {
            Toast.makeText(this, "c ditekan!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.button_mod) {
            Toast.makeText(this, "% ditekan!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.button_del) {
            Toast.makeText(this, "del ditekan!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.button_bagi) {
            Toast.makeText(this, "/ ditekan!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.button_kali) {
            Toast.makeText(this, "x ditekan!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.button_kurang) {
            Toast.makeText(this, "- ditekan!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.button_tambah) {
            Toast.makeText(this, "+ ditekan!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.button_sama_dengan) {
            Toast.makeText(this, "= ditekan!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.button_koma) {
            Toast.makeText(this, ". ditekan!!", Toast.LENGTH_SHORT).show();
        }
    }

    private void setScreen() {
        text_screen = "";

        for (int x= 0; x < nilai.size(); x++){
            text_screen += nilai.get(x);
            //text_screen += operator.get(x);
        }

        textScreenTop.setText(text_screen);
    }
}
