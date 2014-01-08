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

public class YeremiaFragment extends Fragment {

	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.indonesia_bible_fragment, container, false);
		return v;
	}

	@Override 
	public void onActivityCreated(Bundle savedInstanceState) {  
		super.onActivityCreated(savedInstanceState);

		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 52; i++) {
			strings.add("Yeremia " + (i + 1));
		}
		ListView lv = (ListView)getActivity().findViewById(R.id.list_bible);
		lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings));
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				switch (pos) {	
				case 0:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 1:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 2:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 3:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 4:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 5:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 6:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 7:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 8:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 9:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 10:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 11:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 12:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 13:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 14:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 15:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 16:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 17:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 18:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 19:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 20:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 21:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 22:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 23:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 24:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 25:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 26:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 27:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 28:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 29:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 30:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 31:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 32:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 33:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 34:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 35:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 36:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 37:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 38:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 39:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 40:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 41:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 42:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 43:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 44:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 45:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 46:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 47:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 48:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 49:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 50:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
					break;
				case 51:
					MessageIndoBible("Yeremia No." + (pos + 1), "Injil Yeremia");
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
