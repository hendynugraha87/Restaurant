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

public class KisahFragment extends Fragment {

	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.indonesia_bible_fragment, container, false);
		return v;
	}

	@Override 
	public void onActivityCreated(Bundle savedInstanceState) {  
		super.onActivityCreated(savedInstanceState);

		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 28; i++) {
			strings.add("Kisah Para Rasul " + (i + 1));
		}
		ListView lv = (ListView)getActivity().findViewById(R.id.list_bible);
		lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings));
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				switch (pos) {	
				case 0:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 1:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 2:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 3:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 4:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 5:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 6:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 7:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 8:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 9:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 10:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 11:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 12:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 13:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 14:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 15:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 16:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 17:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 18:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 19:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 20:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 21:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 22:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 23:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 24:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 25:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 26:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
					break;
				case 27:
					MessageIndoBible("Kisah Para Rasul No." + (pos + 1), "Injil Kisah Para Rasul");
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
