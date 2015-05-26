package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import com.kwyjibo.netrunner.ice.Ice;
import com.kwyjibo.netrunner.ice.IceType;

public class IceDB {
	
	public static Ice archer = new Ice("Archer", 4, 6, 4,
			new HashSet<IceType>(Arrays.asList(IceType.SENTRY, IceType.DESTROYER)));
	public static Ice cellPortal =  new Ice("Cell Portal", 5, 7, 1,
			new HashSet<IceType>(Arrays.asList(IceType.CODE_GATE, IceType.DEFLECTOR)));
	public static Ice chum = new Ice("Chum", 1, 4, 1,
			new HashSet<IceType>(Arrays.asList(IceType.CODE_GATE)));
	public static Ice dataMine = new Ice("Data Mine", 0, 2, 1,
			new HashSet<IceType>(Arrays.asList(IceType.TRAP)));
	public static Ice dataRaven = new Ice("Data Raven", 4, 4, 1,
			new HashSet<IceType>(Arrays.asList(IceType.SENTRY, IceType.TRACER, IceType.OBSERVER)));
	public static Ice enigma = new Ice("Enigma", 3, 2, 2,
			new HashSet<IceType>(Arrays.asList(IceType.CODE_GATE)));
	public static Ice hadriansWall = new Ice("Hadrian's Wall", 10, 7, 2,
			new HashSet<IceType>(Arrays.asList(IceType.BARRIER)));
	public static Ice heimdall10 = new Ice("Heimdall 1.0", 8, 6, 3,
			new HashSet<IceType>(Arrays.asList(IceType.BARRIER, IceType.BIOROID, IceType.AP)));
	public static Ice hunter = new Ice("Hunter", 1, 4, 1,
			new HashSet<IceType>(Arrays.asList(IceType.SENTRY, IceType.TRACER, IceType.OBSERVER)));
	public static Ice iceWall = new Ice("Ice Wall", 1, 1, 1,
			new HashSet<IceType>(Arrays.asList(IceType.BARRIER)));
	public static Ice ichi10 = new Ice("Ichi 1.0", 5, 4, 3,
			new HashSet<IceType>(Arrays.asList(IceType.SENTRY, IceType.BIOROID, IceType.TRACER, IceType.DESTROYER)));
	public static Ice lotusField = new Ice("Lotus Field", 5, 4, 1,
			new HashSet<IceType>(Arrays.asList(IceType.CODE_GATE)));		
	public static Ice matrixAnalyzer = new Ice("Matrix Analyzer", 1, 3, 1,
			new HashSet<IceType>(Arrays.asList(IceType.SENTRY, IceType.TRACER, IceType.OBSERVER)));
	public static Ice neuralKatana = new Ice("Neural Katana", 4, 3, 1,
			new HashSet<IceType>(Arrays.asList(IceType.SENTRY, IceType.AP)));
	public static Ice rototurret = new Ice("Rototurret", 4, 0, 2,
			new HashSet<IceType>(Arrays.asList(IceType.SENTRY, IceType.DESTROYER)));
	public static Ice shadow = new Ice("Shadow", 3, 1, 2,
			new HashSet<IceType>(Arrays.asList(IceType.SENTRY, IceType.TRACER)));
	public static Ice tollbooth = new Ice("Tollbooth", 8, 5, 1,
			new HashSet<IceType>(Arrays.asList(IceType.CODE_GATE)));
	public static Ice viktor10 = new Ice("Viktor 1.0", 3, 3, 2,
			new HashSet<IceType>(Arrays.asList(IceType.CODE_GATE, IceType.BIOROID, IceType.AP)));
	public static Ice wallOfStatic = new Ice("Wall of Static", 3, 3, 1,
			new HashSet<IceType>(Arrays.asList(IceType.BARRIER)));
	public static Ice wallOfThorns = new Ice("Wall of Thorns", 8, 5, 1,
			new HashSet<IceType>(Arrays.asList(IceType.BARRIER, IceType.AP)));
	
	public static List<Ice> getAll() {
		List<Ice> iceList = new ArrayList<Ice>();
		iceList.add(archer);
		iceList.add(cellPortal);
		iceList.add(chum);
		iceList.add(dataMine);
		iceList.add(dataRaven);
		iceList.add(enigma);
		iceList.add(hadriansWall);
		iceList.add(heimdall10);
		iceList.add(hunter);
		iceList.add(iceWall);
		iceList.add(ichi10);
		iceList.add(lotusField);		
		iceList.add(matrixAnalyzer);
		iceList.add(neuralKatana);
		iceList.add(rototurret);
		iceList.add(shadow);
		iceList.add(tollbooth);
		iceList.add(viktor10);
		iceList.add(wallOfStatic);
		iceList.add(wallOfThorns);
		
		
		return iceList;
		
	}

}
