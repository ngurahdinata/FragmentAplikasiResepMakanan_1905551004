package com.example.resepmakanan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link KeduaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class KeduaFragment extends Fragment {
    private TextView textView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public KeduaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment KeduaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static KeduaFragment newInstance(String param1, String param2) {
        KeduaFragment fragment = new KeduaFragment();
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
        View view = inflater.inflate(R.layout.fragment_kedua, container, false);

        textView = view.findViewById(R.id.text);
        textView.setText("RESEP SOTO MADURA ALA KAK SETO"+
                "\n" +
                "\n" +
                "\n" +
                "1 kg ayam (cuci bersih)\n" +
                "1 L air\n" +
                "1 ruas jari kunyit\n" +
                "1 ruas jari jahe\n" +
                "1 ruas jari lengkuas\n" +
                "3 butir kemiri\n" +
                "5 butir bawang merah\n" +
                "5 butir bawang putih\n" +
                "1 sdt ketumbar bubuk\n" +
                "Merica secukupnya\n" +
                "1 sdt garam\n" +
                "1 sdt gula pasir\n" +
                "1 bungkus royco ayam\n" +
                "1 batang sereh\n" +
                "3 lembar daun salam\n" +
                "5 lembar daun jeruk (buang tulang daunnya)\n" +
                "1 bungkus soun");
        return view;
    }
}