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

public class SatuSamuelFragment extends Fragment {

	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.indonesia_bible_fragment, container, false);
		return v;
	}

	@Override 
	public void onActivityCreated(Bundle savedInstanceState) {  
		super.onActivityCreated(savedInstanceState);

		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 31; i++) {
			strings.add("1 Samuel " + (i + 1));
		}
		ListView lv = (ListView)getActivity().findViewById(R.id.list_bible);
		lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings));
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				switch (pos) {	
				case 0:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 1:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 2:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 3:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 4:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 5:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 6:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 7:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 8:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 9:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 10:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 11:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 12:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 13:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 14:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 15:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 16:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 17:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 18:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 19:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 20:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 21:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 22:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 23:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 24:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 25:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 26:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 27:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 28:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 29:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
					break;
				case 30:
					MessageIndoBible("1 Samuel No." + (pos + 1), "Injil 1 Samuel");
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
