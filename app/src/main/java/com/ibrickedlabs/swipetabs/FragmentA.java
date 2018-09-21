package com.ibrickedlabs.swipetabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentA extends Fragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View view= inflater.inflate(R.layout.frag_layout,container,false);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText("Fragment_A");
        return view;
    }

}
