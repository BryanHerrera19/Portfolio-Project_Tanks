package starter;

import java.util.ArrayList;
import acm.graphics.*;

public class Level {
	private int levelNumber;
	
	private int numberOfEnemiesLight;
	private int numberOfEnemiesMedium;
	private int numberOfEnemiesHeavy;
	private int numberOfPlayers;
	
	private ArrayList<Enemy> enemies;
	private ArrayList<Shield> shields;
	private ArrayList<CharacterEntity> users;
	
	Projectile enemyProjectile = new Projectile(5);
	Projectile userProjectile = new Projectile(5);
	Hitbox userHitbox = new Hitbox(50, 70);
	CharacterEntity user = new CharacterEntity(100, 50, false, 800, 800, userProjectile, userHitbox);
	
	Hitbox enemyLightHitbox = new Hitbox(50, 70);
	EnemyType typeLight = new EnemyType(50, 10, enemyLightHitbox, EnemyTypeCode.LIGHT);
	Enemy enemyLight = new Enemy(typeLight, false, 100, 100, enemyProjectile);
	
	 
	Hitbox enemyMediumHitbox = new Hitbox(60, 80);
	EnemyType typeMedium = new EnemyType(100, 20, enemyMediumHitbox, EnemyTypeCode.MEDIUM);
	Enemy enemyMedium = new Enemy(typeMedium, false, 100, 100, enemyProjectile);
	 
	Hitbox enemyHeavyHitbox = new Hitbox(80, 100);
	EnemyType typeHeavy = new EnemyType(200, 50, enemyHeavyHitbox, EnemyTypeCode.HEAVY);
	Enemy enemyHeavy = new Enemy(typeHeavy, false, 100, 100, enemyProjectile);
	
	Shield gameShield = new Shield(100, 200, 500);
	
	
	
	public Level(int levelNumber) {
		this.setLevelNumber(levelNumber);
		setNumberOfEnemiesLight(21);
		
		if(levelNumber == 1) {
			for(int i = 0; i == 21; i++) {
				if(i < 8) { //layer one
					
				}
			}
		}
	}
	
	public void createEnemy() {
		
	}
	public GRect createUser() {
		GRect userRect = new GRect(user.getCoordX(), user.getCoordY(), user.getUserHitbox().getHeight(), user.getUserHitbox().getWidth());
		return userRect;
	}
	public void placeShield() {
		
	}
	public void placeScoreSystem() {
		
	}

	
	public int getNumberOfEnemiesLight() {
		return numberOfEnemiesLight;
	}

	public void setNumberOfEnemiesLight(int numberOfEnemiesLight) {
		this.numberOfEnemiesLight = numberOfEnemiesLight;
	}

	public int getNumberOfEnemiesMedium() {
		return numberOfEnemiesMedium;
	}

	public void setNumberOfEnemiesMedium(int numberOfEnemiesMedium) {
		this.numberOfEnemiesMedium = numberOfEnemiesMedium;
	}

	public int getNumberOfEnemiesHeavy() {
		return numberOfEnemiesHeavy;
	}

	public void setNumberOfEnemiesHeavy(int numberOfEnemiesHeavy) {
		this.numberOfEnemiesHeavy = numberOfEnemiesHeavy;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	public int getLevelNumber() {
		return levelNumber;
	}

	public void setLevelNumber(int levelNumber) {
		this.levelNumber = levelNumber;
	}
}