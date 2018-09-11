package be.tvh.courses.testing;

public class SpaceShip {

    private TacticalStation tacticalStation;
    private OperationsStation operationsStation;

    public SpaceShip(TacticalStation tacticalStation, OperationsStation operationsStation) {
        this.tacticalStation = tacticalStation;
        this.operationsStation = operationsStation;
    }

    public TacticalStation getTacticalStation() {
        return tacticalStation;
    }

    public OperationsStation getOperationsStation() {
        return operationsStation;
    }

    public void doSelfCheck() {

    }
}
