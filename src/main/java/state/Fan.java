package state;

public class Fan {

    //If you find yourself copying and pasting
//        final static int OFF = 0;
//        final static int LOW = 1;
//        final static int MED = 2;

        State fanOffState;
        State fanLowState;
        State fanMedState;
        State fanHighState;
//        int state = OFF;
         State state;

        public Fan(){
            fanOffState = new FanOffState(this);
            fanLowState = new FanLowState(this);
            fanMedState = new FanMedState(this);
            fanHighState = new FanHighState(this);

            state = fanOffState;
        }

    public void pullChain(){
        state.handleRequest();
    }

    public State getFanLowState(){
        return fanLowState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getFanHighState() {
        return fanHighState;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public void setState(State state){
            this.state = state;
        }



    public String toString() {
        return state.toString();
    }
}
