package hendy.indonesiabible;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class KeluaranFragment extends Fragment{

	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.indonesia_bible_fragment, container, false);
		return v;
	}

	@Override 
	public void onActivityCreated(Bundle savedInstanceState) {  
		super.onActivityCreated(savedInstanceState);

		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 40; i++) {
			strings.add("Keluaran " + (i + 1));
		}
		final Fragment b = getParentFragment();
		ListView lv = (ListView)getActivity().findViewById(R.id.list_bible);
		lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings));
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				switch (pos) {	
				case 0:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 1:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 2:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 3:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 4:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 5:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 6:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 7:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 8:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 9:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 10:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 11:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 12:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 13:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 14:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 15:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 16:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 17:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 18:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 19:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 20:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 21:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 22:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 23:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 24:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 25:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 26:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 27:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 28:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 29:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 30:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 31:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 32:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 33:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 34:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 35:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 36:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 37:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 38:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
					break;
				case 39:
					MessageIndoBible("Keluaran No." + (pos + 1), "Injil Keluaran");
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
