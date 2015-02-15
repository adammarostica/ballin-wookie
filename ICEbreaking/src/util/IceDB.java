package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import ICEbreaking.ICE;

public class IceDB {
	
	public static List<ICE> getAll() {
		List<ICE> iceList = new ArrayList<ICE>();
		iceList.add(new ICE("Lotus Field", 5, 4, 1,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.CODE_GATE))));
		iceList.add(new ICE("Archer", 4, 6, 4,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.SENTRY, ICE.IceType.DESTROYER))));
		iceList.add(new ICE("Ice Wall", 1, 1, 1,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.BARRIER))));
		iceList.add(new ICE("Enigma", 3, 2, 2,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.CODE_GATE))));
		iceList.add(new ICE("Neural Katana", 4, 3, 1,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.SENTRY, ICE.IceType.AP))));
		iceList.add(new ICE("Excalibur", 2, 3, 1,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.GRAIL, ICE.IceType.MYTHIC))));
		return iceList;
		
	}

}
