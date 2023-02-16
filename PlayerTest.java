class Player{
	void player(){System.out.println("I am  a player");}
}
class Cricket_Player extends Player{
	void c_player(){System.out.println("I am a Cricket player");}
}
class Football_Player extends Player{
	void f_player(){System.out.println("I am a Football player");}
}
class Hockey_Player extends Player{
	void h_player(){System.out.println("I am a Hockey player");}
}
class PlayerTest{
	public static void main (String args[]){
	Cricket_Player p1 = new Cricket_Player();
p1.player();
p1.c_player();
	Football_Player p2 = new Football_Player();
p2.player();
p2.f_player();
	Hockey_Player p3 = new Hockey_Player();
p3.player();
p3.h_player();
}
}