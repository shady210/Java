package com.heraizen.day2.Instrument;

public class InstrumentManage {

	public static void main(String[] args) {
		
		Instrument[] instrumentArr = new Instrument[10];
		
		instrumentArr[0] = new Guitar();
		instrumentArr[1] = new Piano();
		instrumentArr[2] = new Guitar();
		instrumentArr[3] = new Fluet();
		instrumentArr[4] = new Guitar();
		instrumentArr[5] = new Fluet();
		instrumentArr[6] = new Piano();
		instrumentArr[7] = new Guitar();
		instrumentArr[8] = new Fluet();
		instrumentArr[9] = new Guitar();
		
		for(Instrument obj:instrumentArr) {
			obj.play();
		}
		
	}

}
