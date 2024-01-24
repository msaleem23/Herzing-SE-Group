import java.util.Random;

public class WeatherFSM {
    private static final String[] STATES = {"Clear", "Cloudy", "Raining", "Snowing", "Severe Weather"};
    private static final String[] EVENTS = {"Getting Warmer", "Getting Colder", "Humidity is Increasing", "Wind is Increasing"};
    private String currentState;
    public WeatherFSM() {
        currentState = "Clear";}
    //helper method to get the index of the current state in state array
    private int getIndex() {
        for (int i = 0; i < STATES.length; i++) {
            if (STATES[i].equals(currentState)) {
                return i;}}
        return -1; }
    //helper method to transition state based on spec action
    private void transitionState(int action) {
        //perform state transition based on action
        currentState = STATES[(getIndex() + (action - 1 + STATES.length) % STATES.length) % STATES.length];}  
    //events simulated by generating random action
    private void simulateEvent(Random random) {
        int action = random.nextInt(3);//choses action randomly from 0, 1, or 2
        System.out.println("  " + EVENTS[action]);//events printed
        transitionState(action);}    
    //weather cycle simulates for the specified number of days entered.
    public void simulateWeatherCycle(int days) {
        Random random = new Random();//random nnumber generator 
      
        for (int day = 1; day <= days; day++) { //loop for each day
            System.out.println("\nDay " + day + ": " + currentState);
            for (int i = 0; i < 5; i++) {
                simulateEvent(random);//events
            }
        }
    }
}