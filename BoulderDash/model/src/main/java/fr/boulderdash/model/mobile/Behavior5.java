/*
 * package fr.boulderdash.model.mobile;
 * 
 * import fr.boulderdash.model.Collision;
 * 
 * public class Behavior5 implements BehaviorGetBehavior {
 * 
 * int x = this.mobile.getX(); int y = this.mobile.getY(); Mobile mobile;
 * Direction direction; Physics boulder; Player player; private boolean
 * rightDetection = false; private boolean leftDetection = false;
 * 
 * public Behavior5(Physics boulder) { this.boulder = boulder;
 * 
 * }
 * 
 * @Override public void getBehavior() {
 * 
 * }
 * 
 * public void PushingRightDetection() { if (this.boulder.getY() ==
 * this.player.getY()) { if ((this.boulder.getX() - 1) == this.player.getX()) {
 * this.rightDetection = true; } }
 * 
 * }
 * 
 * public void PushingLeftDetection() { if (this.boulder.getY() ==
 * this.player.getY()) { if ((this.boulder.getX() + 1) == this.player.getX()) {
 * this.leftDetection = true; } } }
 * 
 * public void PushingRight() {
 * 
 * if ((this.rightDetection == true) && (this.direction == this.direction.UP)) {
 * 
 * boulder.getMap().getOnTheMapXY(x + 1, y) = new EmptyDirt();
 * this.boulder.moveRight();
 * 
 * }
 * 
 * }
 * 
 * public void PushingLeft() {
 * 
 * }
 * 
 * public void isFalling() {
 * 
 * if (this.mobile.getMap().getOnTheMapXY(this.x, this.y + 1).getCollision() ==
 * Collision.PUSHABLE) { this.boulder.moveDown(); } } }
 */
