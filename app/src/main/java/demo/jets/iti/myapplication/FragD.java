package demo.jets.iti.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Mostafa Montaser on 2/28/2016.
 */
public class FragD extends Fragment{
    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragd,container,false);
        textView= (TextView) view.findViewById(R.id.txt);
        return view;
    }
    public void changeData(String s){
        textView.setText(s);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
