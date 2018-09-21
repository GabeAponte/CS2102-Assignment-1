
class Athlete {
	FinalResult finalRes;

	Athlete (FinalResult finalRes){ 
		this.finalRes = finalRes;
	}

	//consumes an athlete and compares it to the other athlete, producing which athlete has a lower skiing score
	Athlete betterSkiier(Athlete aAth) {
		if(this.finalRes.skiiRes.pointsEarned() < aAth.finalRes.skiiRes.pointsEarned()) {
			return this;
		} else {
			return aAth;
		}
	}

	//produces true if (this) athlete has either a lower skiing score than the other athlete, or a higher shooting score than the other athlete
	boolean hasBeaten (Athlete anothAth) {
		return (this.finalRes.skiiRes.pointsEarned() < anothAth.finalRes.skiiRes.pointsEarned() || 
				this.finalRes.shootRes.pointsEarned() > anothAth.finalRes.shootRes.pointsEarned());
	}
}
