package demo.jets.iti.myapplication;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button button;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button= (Button) findViewById(R.id.button);
        fragmentManager=getFragmentManager();
        fragmentManager.beginTransaction().add(R.id.container,new FragA(),"FragA").commit();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);

                intent.putExtra("name", "Mostafa");
                intent.putExtra("age",10);
                Log.i("+++++++++++++++","Oncreate");
//                Bundle bundle=new Bundle();
//                bundle.putString("name","Mostafa");
//                intent.putExtras(bundle);

               // startActivity(intent);
                fragmentManager.beginTransaction().replace(R.id.container,new FragB()).addToBackStack("FragB").commit();
            }
        });
    }


}
