
class ShootingResult implements IEvent{
	ShootingRound round1;
	ShootingRound round2;
	ShootingRound round3;
	ShootingRound round4;

	ShootingResult (ShootingRound round1, ShootingRound round2,ShootingRound round3, ShootingRound round4){
		this.round1 = round1;
		this.round2 = round2;
		this.round3 = round3;
		this.round4 = round4;
	}

	@Override
	//finds the amount of point in shooting event earned by adding all the targets (out of five) that were hit for 
	//each of the four rounds
	public double pointsEarned() {
		return (this.round1.targhit + this.round2.targhit + this.round3.targhit + this.round4.targhit);
	}
}
