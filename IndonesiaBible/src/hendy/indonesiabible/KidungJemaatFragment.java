package hendy.indonesiabible;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KidungJemaatFragment extends Fragment {

	@Override 
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.indonesia_bible_fragment, container, false);
		return v;
	}
	
	@Override 
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 502; i++) {
 		   strings.add("Kidung Jemaat " + (i + 1));
 		}
        ListView lv = (ListView)getActivity().findViewById(R.id.list_bible);
        lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings));
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				if(pos == 0){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 1){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 2){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 3){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 4){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 5){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 6){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 7){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 8){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 9){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 10){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 11){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 12){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 13){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 14){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 15){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 16){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 17){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 18){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 19){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 20){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 21){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 22){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 23){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 24){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 25){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 26){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 27){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 28){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 29){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 30){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 31){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 32){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 33){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 34){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 35){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 36){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 37){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 38){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 39){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 40){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 41){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 42){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 43){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 44){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 45){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 46){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 47){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 48){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}else if(pos == 49){
					MessageIndoBible("Kidung Jemaat No." + (pos + 1), "Kidung Jemaat");
				}
			}
		});
	}
	
	private void MessageIndoBible(String title, String message){
		AlertDialog.Builder alert = new AlertDialog.Builder(getActivity(), AlertDialog.THEME_HOLO_DARK);
		alert.setTitle(title)
			.setIcon(R.drawable.ic_launcher)
			.setMessage(message)
			.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					dialog.dismiss();
				}
			}).show();
	}
	
}
