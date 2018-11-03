package np.com.shah.nishant.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        String newQ = getIntent().getStringExtra("keyQ");
        String newA = getIntent().getStringExtra("keyA");
        String newO1 = getIntent().getStringExtra("keyO1");
        String newO2 = getIntent().getStringExtra("keyO2");

        EditText newQu = (EditText) findViewById(R.id.addQuestion);
        newQu.setText(newQ);


    }


    public void closeActivity(View v) {
        finish();
    }

    public void saveCard(View v) {
        //Creating a TextView to set Question
        EditText newQ = (EditText) findViewById(R.id.addQuestion);
        String newQuestion = newQ.getText().toString();

        //Store Ans
        EditText ans = (EditText) findViewById(R.id.addAns);
        String answerNew = ans.getText().toString();


        Intent data = new Intent();
        data.putExtra("keyQuestion", newQuestion);
        data.putExtra("keyAns", answerNew);
        setResult(RESULT_OK, data);
        finish();


    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent editData) {


    }


}

