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

public class YehezkielFragment extends Fragment {

	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.indonesia_bible_fragment, container, false);
		return v;
	}

	@Override 
	public void onActivityCreated(Bundle savedInstanceState) {  
		super.onActivityCreated(savedInstanceState);

		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 48; i++) {
			strings.add("Yehezkiel " + (i + 1));
		}
		ListView lv = (ListView)getActivity().findViewById(R.id.list_bible);
		lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings));
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				switch (pos) {	
				case 0:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 1:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 2:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 3:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 4:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 5:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 6:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 7:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 8:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 9:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 10:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 11:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 12:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 13:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 14:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 15:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 16:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 17:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 18:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 19:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 20:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 21:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 22:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 23:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 24:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 25:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 26:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 27:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 28:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 29:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 30:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 31:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 32:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 33:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 34:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 35:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 36:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 37:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 38:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 39:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 40:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 41:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 42:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 43:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 44:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 45:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 46:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
					break;
				case 47:
					MessageIndoBible("Yehezkiel No." + (pos + 1), "Injil Yehezkiel");
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
