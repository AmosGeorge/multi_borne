import app.AppGame;

public final class Main {

	public static final void main (String [] arguments) {
		String title = "Sans titre";
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
