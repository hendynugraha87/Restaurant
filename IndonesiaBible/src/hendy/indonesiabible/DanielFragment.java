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

public class DanielFragment extends Fragment {

	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.indonesia_bible_fragment, container, false);
		return v;
	}

	@Override 
	public void onActivityCreated(Bundle savedInstanceState) {  
		super.onActivityCreated(savedInstanceState);

		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 12; i++) {
			strings.add("Daniel " + (i + 1));
		}
		ListView lv = (ListView)getActivity().findViewById(R.id.list_bible);
		lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings));
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				switch (pos) {	
				case 0:
					MessageIndoBible("Daniel No." + (pos + 1), "Injil Daniel");
					break;
				case 1:
					MessageIndoBible("Daniel No." + (pos + 1), "Injil Daniel");
					break;
				case 2:
					MessageIndoBible("Daniel No." + (pos + 1), "Injil Daniel");
					break;
				case 3:
					MessageIndoBible("Daniel No." + (pos + 1), "Injil Daniel");
					break;
				case 4:
					MessageIndoBible("Daniel No." + (pos + 1), "Injil Daniel");
					break;
				case 5:
					MessageIndoBible("Daniel No." + (pos + 1), "Injil Daniel");
					break;
				case 6:
					MessageIndoBible("Daniel No." + (pos + 1), "Injil Daniel");
					break;
				case 7:
					MessageIndoBible("Daniel No." + (pos + 1), "Injil Daniel");
					break;
				case 8:
					MessageIndoBible("Daniel No." + (pos + 1), "Injil Daniel");
					break;
				case 9:
					MessageIndoBible("Daniel No." + (pos + 1), "Injil Daniel");
					break;
				case 10:
					MessageIndoBible("Daniel No." + (pos + 1), "Injil Daniel");
					break;
				case 11:
					MessageIndoBible("Daniel No." + (pos + 1), "Injil Daniel");
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
