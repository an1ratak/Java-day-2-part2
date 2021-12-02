
public class Move {
int depth;
int position;
int aim;
	public Move() {
		depth=0;
		position=0;
		aim=0;
	}
	public void MoveFoward(int i) {
		position+=i;
		depth+= i*aim;
	}
	public void ChangeDepth(int i) {
		aim+=i;
	}
	public int returnPosition() {
		return position;
	}
	public int returnDepth() {
		return depth;
	}
	public int returnAim() {
		return aim;
	}
}
