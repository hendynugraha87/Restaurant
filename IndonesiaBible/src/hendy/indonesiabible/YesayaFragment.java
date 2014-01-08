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

public class YesayaFragment extends Fragment {

	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.indonesia_bible_fragment, container, false);
		return v;
	}

	@Override 
	public void onActivityCreated(Bundle savedInstanceState) {  
		super.onActivityCreated(savedInstanceState);

		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 66; i++) {
			strings.add("Yesaya " + (i + 1));
		}
		ListView lv = (ListView)getActivity().findViewById(R.id.list_bible);
		lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings));
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				switch (pos) {	
				case 0:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 1:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 2:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 3:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 4:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 5:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 6:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 7:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 8:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 9:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 10:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 11:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 12:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 13:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 14:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 15:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 16:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 17:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 18:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 19:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 20:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 21:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 22:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 23:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 24:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 25:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 26:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 27:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 28:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 29:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 30:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 31:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 32:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 33:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 34:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 35:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 36:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 37:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 38:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 39:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 40:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 41:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 42:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 43:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 44:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 45:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 46:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 47:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 48:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 49:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 50:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 51:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 52:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 53:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 54:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 55:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 56:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 57:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 58:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 59:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 60:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 61:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 62:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 63:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 64:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
					break;
				case 65:
					MessageIndoBible("Yesaya No." + (pos + 1), "Injil Yesaya");
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
