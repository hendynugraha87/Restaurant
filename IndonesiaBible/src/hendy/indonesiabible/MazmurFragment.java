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

public class MazmurFragment extends Fragment {

	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.indonesia_bible_fragment, container, false);
		return v;
	}

	@Override 
	public void onActivityCreated(Bundle savedInstanceState) {  
		super.onActivityCreated(savedInstanceState);

		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 150; i++) {
			strings.add("Mazmur " + (i + 1));
		}
		ListView lv = (ListView)getActivity().findViewById(R.id.list_bible);
		lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings));
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				switch (pos) {	
				case 0:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 1:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 2:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 3:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 4:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 5:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 6:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 7:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 8:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 9:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 10:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 11:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 12:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 13:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 14:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 15:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 16:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 17:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 18:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 19:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 20:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 21:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 22:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 23:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 24:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 25:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 26:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 27:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 28:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 29:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 30:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 31:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 32:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 33:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 34:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 35:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 36:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 37:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 38:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 39:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 40:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 41:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 42:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 43:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 44:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 45:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 46:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 47:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 48:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 49:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 50:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 51:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 52:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 53:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 54:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 55:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 56:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 57:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 58:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 59:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 60:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 61:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 62:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 63:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 64:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 65:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 66:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 67:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 68:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 69:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 70:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 71:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 72:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 73:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 74:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 75:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 76:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 77:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 78:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 79:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 80:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 81:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 82:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 83:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 84:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 85:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 86:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 87:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 88:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 89:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 90:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 91:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 92:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 93:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 94:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 95:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 96:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 97:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 98:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 99:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 100:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 101:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 102:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 103:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 104:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 105:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 106:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 107:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 108:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 109:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 110:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 111:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 112:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 113:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 114:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 115:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 116:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 117:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 118:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 119:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 120:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 121:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 122:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 123:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 124:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 125:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 126:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 127:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 128:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 129:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 130:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 131:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 132:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 133:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 134:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 135:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 136:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 137:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 138:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 139:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 140:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 141:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 142:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 143:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 144:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 145:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 146:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 147:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 148:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
					break;
				case 149:
					MessageIndoBible("Mazmur No." + (pos + 1), "Injil Mazmur");
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
