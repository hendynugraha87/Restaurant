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

public class AyubFragment extends Fragment {

	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.indonesia_bible_fragment, container, false);
		return v;
	}

	@Override 
	public void onActivityCreated(Bundle savedInstanceState) {  
		super.onActivityCreated(savedInstanceState);

		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 42; i++) {
			strings.add("Ayub " + (i + 1));
		}
		ListView lv = (ListView)getActivity().findViewById(R.id.list_bible);
		lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings));
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				switch (pos) {
				case 0:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 1:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 2:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 3:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 4:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 5:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 6:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 7:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 8:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 9:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 10:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 11:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 12:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 13:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 14:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 15:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 16:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 17:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 18:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 19:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 20:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 21:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 22:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 23:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 24:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 25:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 26:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 27:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 28:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 29:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 30:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 31:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 32:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 33:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 34:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 35:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 36:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 37:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 38:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 39:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 40:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
					break;
				case 41:
					MessageIndoBible("Ayub No." + (pos + 1), "Injil Ayub");
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
