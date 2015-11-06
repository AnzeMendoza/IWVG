package ticTacToe.v340.views;

import ticTacToe.v340.controllers.StartController;

class StartView {

	private StartController startController;
	
	StartView(StartController startController){
		this.startController = startController;
	}
	
	void interact(){
		int users = new LimitedIntDialog("Cuántos usuarios?", 0, 2).read();
		startController.setUsers(users);
		new BoardView(startController).write();
	}
}
