package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import com.kwyjibo.netrunner.ice.Ice;
import com.kwyjibo.netrunner.ice.IceType;

public class IceDB {
	
	public static List<Ice> getAll() {
		List<Ice> iceList = new ArrayList<Ice>();
		iceList.add(new Ice("Lotus Field", 5, 4, 1,
				new HashSet<IceType>(Arrays.asList(IceType.CODE_GATE))));
		iceList.add(new Ice("Archer", 4, 6, 4,
				new HashSet<IceType>(Arrays.asList(IceType.SENTRY, IceType.DESTROYER))));
		iceList.add(new Ice("Ice Wall", 1, 1, 1,
				new HashSet<IceType>(Arrays.asList(IceType.BARRIER))));
		iceList.add(new Ice("Enigma", 3, 2, 2,
				new HashSet<IceType>(Arrays.asList(IceType.CODE_GATE))));
		iceList.add(new Ice("Neural Katana", 4, 3, 1,
				new HashSet<IceType>(Arrays.asList(IceType.SENTRY, IceType.AP))));
		iceList.add(new Ice("Excalibur", 2, 3, 1,
				new HashSet<IceType>(Arrays.asList(IceType.GRAIL, IceType.MYTHIC))));
		return iceList;
		
	}

}
