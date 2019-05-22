import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.XRandR;
import org.lwjgl.opengl.XRandR.Screen;

import app.AppGame;

public final class Main {

	public static final void main (String [] arguments) throws LWJGLException {
		String title = "Sans titre";
		
        int bpp = 24;
        // get the resolutions and frequencys from XRandR
        System.err.println("xrandr " + XRandR.getScreenNames().length);
        Screen[] resolutions = XRandR.getResolutions(XRandR.getScreenNames()[0]);
        System.err.println("resolutions " + resolutions.length);
        DisplayMode[] modes = new DisplayMode[resolutions.length];
        System.err.println("modes " + modes.length);
		
		System.err.println();
		
		new AppGame (title, 1280, 1024, true) {
			@Override
			public void init () {
				this.addState (new pages.Welcome (AppGame.PAGES_WELCOME));
				this.addState (new pages.Games (AppGame.PAGES_GAMES));
				this.addState (new pages.Players (AppGame.PAGES_PLAYERS));
				this.addState (new pages.Pause (AppGame.PAGES_PAUSE));
				this.addState (new games.test.World (AppGame.GAMES_TEST_WORLD));
			}
		};
	}
}
