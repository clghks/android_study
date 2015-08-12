package com.clghks.designsupport.fragment;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.clghks.designsupport.R;

public class FloatingButtonFragment extends Fragment implements OnClickListener{
    private CoordinatorLayout coordinatorLayout;
    private FloatingActionButton floatingActionButton;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_floating_button, container, false);

        coordinatorLayout = (CoordinatorLayout)view.findViewById(R.id.coordinatorLayout);

        floatingActionButton = (FloatingActionButton)view.findViewById(R.id.actionButton);
        floatingActionButton.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.actionButton){
            viwSnackBar();
        }
    }

    public void viwSnackBar() {
        Snackbar.make(coordinatorLayout, R.string.snackbar_text, Snackbar.LENGTH_LONG)
                .setAction(R.string.snackbar_action, this)
                .setActionTextColor(getResources().getColor(R.color.color_snackbar_action))
                .show();
    }
}
