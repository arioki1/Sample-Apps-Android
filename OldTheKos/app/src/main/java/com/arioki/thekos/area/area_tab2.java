package com.arioki.thekos.area;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arioki.thekos.R;

/**
 * Created by docotel on 3/2/16.
 */
public class area_tab2 extends Fragment {

    public static area_tab2 newInstance(){
        return new area_tab2();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.area_tab2, container, false);

        return rootView;
    }
}