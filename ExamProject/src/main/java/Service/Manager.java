package Service;

import Models.Route;
import java.util.Timer;
import java.util.TimerTask;

public class Manager {

    Mediator mediator;
    private Route route;
    private Timer timer;
    private boolean isManual = true;
    private boolean runningAutomatically;

    public Manager() {
        this.route = new Route();
    }

    public void toggleRunning() {
        if (isManual) {
            return;
        }
        runningAutomatically = !runningAutomatically;
        if (runningAutomatically) {
            startTimer();
        } else {
            stopTimer();
        }
    }

    private void startTimer() {
        timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                nextTact();
            }
        };
        timer.scheduleAtFixedRate(task, 0, 150);
    }

    private void stopTimer() {
        if (timer != null) {
            timer.cancel();
        }
    }

    public void nextTact() {
        boolean end = route.nextTact();
        mediator.updateGui(route);
        if (end) {
            stopTimer();
            mediator.EndMessege(route.getTotalTacts());
            reset();
        }
    }

    public void reset() {
        route.reset();
        mediator.updateGui(route);
        runningAutomatically = false;
        stopTimer();
    }

    public void setTypeOfWork(boolean isManual) {
        if(isManual){
            stopTimer();
        }
        runningAutomatically = false;
        this.isManual = isManual;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
        mediator.updateGui(route);
    }

    public boolean isIsManual() {
        return isManual;
    }

}
