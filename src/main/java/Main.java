import services.InputService;
import services.OutputService;


public class Main {
    public static void main(String[] args) {
        OutputService.RequestParam();
        InputService inputService = new InputService();
        inputService.CheckValue();
        OutputService.RequestString();
        inputService.SearchAirports();
        OutputService.PrintAirports();
        OutputService.PrintFinds();
        OutputService.PrintTime();
    }
}
