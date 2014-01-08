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

public class HakimFragment extends Fragment {

	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.indonesia_bible_fragment, container, false);
		return v;
	}

	@Override 
	public void onActivityCreated(Bundle savedInstanceState) {  
		super.onActivityCreated(savedInstanceState);

		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 21; i++) {
			strings.add("Hakim - Hakim " + (i + 1));
		}
		ListView lv = (ListView)getActivity().findViewById(R.id.list_bible);
		lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings));
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				switch (pos) {	
				case 0:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 1:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 2:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 3:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 4:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 5:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 6:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 7:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 8:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 9:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 10:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 11:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 12:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 13:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 14:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 15:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 16:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 17:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 18:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 19:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
					break;
				case 20:
					MessageIndoBible("Hakim-Hakim No." + (pos + 1), "Injil Hakim-Hakim");
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
