package dev.gigacat;

import com.badlogic.gdx.Game;
import dev.gigacat.screens.GameScreen;

public class Serenia extends Game {

	@Override
	public void create() {
		setScreen(new GameScreen(this));
	}
}