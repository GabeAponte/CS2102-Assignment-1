
class FinalResult {
	ShootingResult shootRes;
	SkiingResult skiiRes;

	FinalResult (ShootingResult shootRes, SkiingResult skiiRes){
		this.shootRes = shootRes;
		this.skiiRes = skiiRes;
	}

	//takes a ShootingResult as an input and adds 60 seconds to the points earned 
	//from skiing for each target (out of five) missed during each round. 
	public double getShootingPenalties(ShootingResult shootRes){
		return (60 * (20 - shootRes.pointsEarned()));
	}

	//sets the time equal to a new time which takes into account penalties, and then edits the 
	//time based on which position the athlete came in for skiing and therefore produces the final score 
	public double finalScore() {
		double time = (this.skiiRes.pointsEarned() + this.getShootingPenalties(this.shootRes));
		if(this.skiiRes.position == 1) {
			time = time-10;
		}
		if(this.skiiRes.position == 2) {
			time = time-7;
		}
		if(this.skiiRes.position == 3) {
			time = time-3;
		}
		return time;
	}
}
