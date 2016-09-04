package com.example.dell.task_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.task_3.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnone=(Button)findViewById(R.id.button);
        final EditText txtResult=(EditText) findViewById(R.id.editText);
        final EditText txt=(EditText) findViewById(R.id.editText2);

        btnone.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtResult.setText("");
            }
        });
    }
    public void onCheckboxClicked(View view){
        boolean checked=((CheckBox) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.textView);
        switch(view.getId()){
            case R.id.checkBox:
                if(checked){
                    Toast.makeText(this,"选择a",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"取消选择a",Toast.LENGTH_LONG).show();}
                break;
            case R.id.checkBox2:
                if(checked){
                    Toast.makeText(this,"选择b",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"取消选择b",Toast.LENGTH_LONG).show();}
                break;
            case R.id.checkBox3:
                if(checked){
                    Toast.makeText(this,"选择c",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"取消选择c",Toast.LENGTH_LONG).show();}
                break;
        }
    }
    public void onRadioButtonClicked(View view){
        boolean checked=((RadioButton) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.textView3);

        switch (view.getId()){
            case R.id.radioButton:
                if(checked)
                    textView.setText("您的性别为男");
                break;
            case R.id.radioButton2:
                if(checked)
                    textView.setText("您的性别为女");
                break;
        }
    }


}
