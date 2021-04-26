package com.example.resepmakanan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PertamaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PertamaFragment extends Fragment {
    private TextView textView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PertamaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PertamaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PertamaFragment newInstance(String param1, String param2) {
        PertamaFragment fragment = new PertamaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pertama, container, false);

        textView = view.findViewById(R.id.text);
        textView.setText("RESEP SOTO MADURA ALA MBAK SITI"+
                "\n" +
                "\n" +
                "\n" +
                "400 g daging sapi has dalam, potong dadu\n" +
                "3 L air\n" +
                "4 Lembar daun jeruk\n" +
                "2 cm lengkuas\n" +
                "3 batang serai\n" +
                "1 sdt garam\n" +
                "2 sdt gula\n" +
                "2 sdt Royco Kaldu Sapi\n" +
                "3 sdm Bango Kecap Manis\n" +
                "Bumbu halus\n" +
                "2 sdt ketumbar bubuk\n" +
                "12 butir bawang merah\n" +
                "6 siung bawang putih\n" +
                "1 cm jahe\n" +
                "1 sdt kunyit bubuk\n" +
                "4 butir kemiri, sangrai\n" +
                "1 sdt merica putih bubuk");
        return view;
    }
}