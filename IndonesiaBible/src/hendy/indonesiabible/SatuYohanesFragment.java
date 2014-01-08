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

public class SatuYohanesFragment extends Fragment {

	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.indonesia_bible_fragment, container, false);
		return v;
	}

	@Override 
	public void onActivityCreated(Bundle savedInstanceState) {  
		super.onActivityCreated(savedInstanceState);

		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			strings.add("1 Yohanes " + (i + 1));
		}
		ListView lv = (ListView)getActivity().findViewById(R.id.list_bible);
		lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings));
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				if(pos == 0){
					MessageIndoBible("1 Yohanes No." + (pos + 1), "Injil 1 Yohanes");
				}else if(pos == 1){
					MessageIndoBible("1 Yohanes No." + (pos + 1), "Injil 1 Yohanes");
				}else if(pos == 2){
					MessageIndoBible("1 Yohanes No." + (pos + 1), "Injil 1 Yohanes");
				}else if(pos == 3){
					MessageIndoBible("1 Yohanes No." + (pos + 1), "Injil 1 Yohanes");
				}else if(pos == 4){
					MessageIndoBible("1 Yohanes No." + (pos + 1), "Injil 1 Yohanes");
				}
				
				
				switch (pos) {	
				case 0:
					MessageIndoBible("1 Yohanes No." + (pos + 1), "Injil 1 Yohanes");
					break;
				case 1:
					MessageIndoBible("1 Yohanes No." + (pos + 1), "Injil 1 Yohanes");
					break;
				case 2:
					MessageIndoBible("1 Yohanes No." + (pos + 1), "Injil 1 Yohanes");
					break;
				case 3:
					MessageIndoBible("1 Yohanes No." + (pos + 1), "Injil 1 Yohanes");
					break;
				case 4:
					MessageIndoBible("1 Yohanes No." + (pos + 1), "Injil 1 Yohanes");
					break;
				default:
					break;
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
