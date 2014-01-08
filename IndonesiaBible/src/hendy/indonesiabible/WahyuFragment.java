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

public class WahyuFragment extends Fragment {

	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.indonesia_bible_fragment, container, false);
		return v;
	}

	@Override 
	public void onActivityCreated(Bundle savedInstanceState) {  
		super.onActivityCreated(savedInstanceState);

		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 22; i++) {
			strings.add("Wahyu " + (i + 1));
		}
		ListView lv = (ListView)getActivity().findViewById(R.id.list_bible);
		lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings));
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				switch (pos) {	
				case 0:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 1:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 2:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 3:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 4:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 5:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 6:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 7:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 8:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 9:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 10:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 11:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 12:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 13:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 14:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 15:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 16:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 17:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 18:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 19:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 20:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
					break;
				case 21:
					MessageIndoBible("Wahyu No." + (pos + 1), "Injil Wahyu");
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
