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
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class GitaBaktiFragment extends Fragment {

	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.indonesia_bible_fragment, container, false);
		return v;
	}

	@Override 
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 402; i++) {
			strings.add("Gita Bakti " + (i + 1));
		}
		ListView lv = (ListView)getActivity().findViewById(R.id.list_bible);
		lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings));
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				if(pos == 0){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 1){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 2){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 3){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 4){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 5){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 6){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 7){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 8){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 9){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 10){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 11){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 12){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 13){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 14){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 15){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 16){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 17){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 18){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 19){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 20){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 21){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 22){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 23){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 24){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 25){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 26){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 27){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 28){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 29){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 30){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 31){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 32){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 33){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 34){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 35){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 36){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 37){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 38){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 39){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 40){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 41){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 42){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 43){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 44){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 45){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 46){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 47){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 48){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
				}else if(pos == 49){
					MessageIndoBible("Gita Bakti No." + (pos + 1), "Kidung Gita Bakti");
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
