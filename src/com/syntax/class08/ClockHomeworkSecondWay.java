package com.syntax.class08;

public class ClockHomeworkSecondWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String time=null;

        for (int h=0; h<=23; h++) {

            for (int m=0; m<=59; m++) {

                if(h<10  && m<10) {

                    time="0"+h+":"+"0"+m;

                } else if (h<10 && m>=10) {
                    time="0"+h+":"+m;

                } else if(h>=10 && m<10) {
                    time=h+":"+"0"+m;

                } else {
                    time=h+":"+m;
                }

                System.out.println(time);
            }
	}
        
        
        
        for (int h = 0; h < 24; h++) {

            for (int m1 = 0; m1 <= 5; m1++) {

                for (int m2 = 0; m2 <= 9; m2++) {

                    if (h < 10) {
                        System.out.println("0" + h + ":" + m1 + m2);
                    } else {
                        System.out.println(h + ":" + m1 + m2);
                    }
                }
            }

	}
        
	}}
