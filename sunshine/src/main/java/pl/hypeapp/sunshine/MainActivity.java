package pl.hypeapp.sunshine;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstaneStace) {
            View rootView = layoutInflater.inflate(R.layout.fragment_main, viewGroup, false);

            String[] fakeDatas = {
                    "Dzisiaj - słonecznie - 88/63",
                    "Jutro - pochmurnie - 82/22",
                    "Niedziela - pochmurnie - 22/22",
                    "Poniedziałek - deszczowo - 22/33",
                    "Wtorek - upalnie - 22/11",
                    "Środa - deszczowo - 23/22",
                    "Czwartek - upalnie - 22/33",
                    "Piątek - pochmurnie - 21/33",
                    "Sobota - deszczowo - 23/23",
                    "Niedziela - pochmurnie - 22/22",
                    "Poniedziałek - deszczowo - 22/33",
                    "Wtorek - upalnie - 22/11",
                    "Środa - deszczowo - 23/22",
                    "Czwartek - upalnie - 22/33",
                    "Piątek - pochmurnie - 21/33"
            };

            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast,
                    R.id.list_item_forecast_textview, fakeDatas);
            ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
            listView.setAdapter(arrayAdapter);

            return rootView;

        }

    }
}
