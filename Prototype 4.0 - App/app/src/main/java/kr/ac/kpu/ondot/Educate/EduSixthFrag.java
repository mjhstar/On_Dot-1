package kr.ac.kpu.ondot.Educate;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.ac.kpu.ondot.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EduSixthFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EduSixthFrag extends Fragment {

    public EduSixthFrag() {
        // Required empty public constructor
    }

    public static EduSixthFrag newInstance(){
        Bundle args = new Bundle();
        EduSixthFrag fragment = new EduSixthFrag();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.edu_sixth_frag, container, false);
    }

}
