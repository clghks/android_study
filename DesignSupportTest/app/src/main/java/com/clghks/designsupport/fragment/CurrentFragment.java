package com.clghks.designsupport.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.clghks.designsupport.R;

public class CurrentFragment extends Fragment {
    TextView textView;

    private static final String ARGS_KEY = "idx";

    public static CurrentFragment CurrentFragment(int position) {
        CurrentFragment fragment = new CurrentFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARGS_KEY, position);
        fragment.setArguments(bundle);
        return fragment;
    }

    public CurrentFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_current, container, false);
        textView = (TextView)rootView.findViewById(R.id.textView);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int idx = getArguments().getInt(ARGS_KEY, -1);
        textView.setText("Page Position=" + idx);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
