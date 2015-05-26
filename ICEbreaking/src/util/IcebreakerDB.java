package util;

import java.util.Arrays;
import java.util.HashSet;

import com.kwyjibo.netrunner.ice.IceType;
import com.kwyjibo.netrunner.ice.Icebreaker;

public class IcebreakerDB {

	public static Icebreaker aurora = new Icebreaker("Aurora", 3, 1, 2, 3, 2, 1,
			new HashSet<IceType>(Arrays.asList(IceType.BARRIER)));
	public static Icebreaker batteringRam = new Icebreaker("Battering Ram", 5, 3, 1, 1, 2, 2,
			new HashSet<IceType>(Arrays.asList(IceType.BARRIER)));
	public static Icebreaker corroder =  new Icebreaker("Corroder", 2, 2, 1, 1, 1, 1,
			new HashSet<IceType>(Arrays.asList(IceType.BARRIER)));
	public static Icebreaker crypsis = new Icebreaker("Crypsis", 5, 0, 1, 1, 1, 1,
			new HashSet<IceType>(Arrays.asList(IceType.AI)));
	public static Icebreaker femmeFatale = new Icebreaker("Femme Fatale", 9, 2, 2, 1, 1, 1,
			new HashSet<IceType>(Arrays.asList(IceType.SENTRY)));
	public static Icebreaker gordianBlade = new Icebreaker("Gordian Blade", 4, 2, 1, 1, 1, 1,
			new HashSet<IceType>(Arrays.asList(IceType.CODE_GATE)));
	public static Icebreaker mimic = new Icebreaker("Mimic", 3, 3, 1, 1, true,
			new HashSet<IceType>(Arrays.asList(IceType.SENTRY)));
	public static Icebreaker ninja = new Icebreaker("Ninja", 4, 0, 3, 5, 1, 1,
			new HashSet<IceType>(Arrays.asList(IceType.SENTRY)));
	public static Icebreaker pipeline = new Icebreaker("Pipeline", 3, 1, 2, 1, 1, 1,
			new HashSet<IceType>(Arrays.asList(IceType.SENTRY)));
	public static Icebreaker wyrm = new Icebreaker("Wyrm", 1, 1, 1, 1, 3, 1,
			new HashSet<IceType>(Arrays.asList(IceType.AI)));
	public static Icebreaker yog = new Icebreaker("Yog.0", 5, 3, 0, 1, true,
			new HashSet<IceType>(Arrays.asList(IceType.CODE_GATE)));
	
	
}
