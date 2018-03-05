package com.srm.dixitsoham.fragments;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SimpleAddition extends Fragment {

    TextView text;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("On Attach", " OnAttach method");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("On create", " Oncreatemethod");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e(" onCreateView", " onCreateView method");
        View view = inflater.inflate(R.layout.simple_addition_frag, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        text = getActivity().findViewById(R.id.frag_textView);
    }

    public void setMessage(String message) {
        text.setText(message);
    }
}
