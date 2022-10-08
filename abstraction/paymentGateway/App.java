package paymentGateway;

public class App {
    public static void main() {
        GatewayRules gateway = new StripeGateway();

        System.out.print(gateway.customerCreate());
    }
}
