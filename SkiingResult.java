
class SkiingResult implements IEvent {
	double laptime1;
	double laptime2;
	double laptime3;
	double laptime4;
	double laptime5;
	int position;

	SkiingResult(int position, double laptime1, double laptime2, double laptime3, double laptime4, double laptime5){
		this.position = position;
		this.laptime1 = laptime1;
		this.laptime2 = laptime2;
		this.laptime3 = laptime3;
		this.laptime4 = laptime4;
		this.laptime5 = laptime5;
	}

	@Override
	//finds the amount of points earned in skiing event by adding the five lap times together
	public double pointsEarned() {
		return (this.laptime1 + this.laptime2 + this.laptime3 + this.laptime4 + this.laptime5);
	}
}
