package com.blogspot.programer27android.calculator;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import static java.lang.Double.parseDouble;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.editText1)
    TextInputEditText editText1;
    @BindView(R.id.editText2)
    TextInputEditText editText2;

    @BindView(R.id.Hitung)
    Button Hitung;

    @BindView(R.id.editText3)
    EditText hasilid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        final TextInputEditText angka1=editText1;
        final TextInputEditText angka2=editText2;
        final EditText hasil=hasilid;
        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1=angka1.getText().toString();
                String nilai2=angka2.getText().toString();
                if (TextUtils.isEmpty(nilai1.trim())){
                    angka1.setError("masukkan Angka");
                    angka1.requestFocus();
                }else if (TextUtils.isEmpty(nilai2.trim())){
                    angka2.setError("masukkan Angka");
                    angka2.requestFocus();
                }else{
                    Double nilaidouble1=parseDouble(nilai1);
                    Double nilaidouble2=parseDouble(nilai2);
                    Double hitungkali=nilaidouble1*nilaidouble2;
                    hasil.setText("Hasil: "+ hitungkali);
                }
            }
        });
    }
}
