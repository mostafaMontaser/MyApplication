package demo.jets.iti.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Main2Activity extends Activity implements Comunnicator{
int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        String s=  getIntent().getExtras().getString("name");
//        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        count=savedInstanceState.getInt("count");
        ( (FragD) getFragmentManager().findFragmentById(R.id.fragmentd)).changeData(""+ count);
    }

    @Override
    public void respond() {
        ( (FragD) getFragmentManager().findFragmentById(R.id.fragmentd)).changeData(""+ ++count);
    }
}
