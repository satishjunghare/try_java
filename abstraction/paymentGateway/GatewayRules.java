package paymentGateway;

import paymentGateway.Contacts.CustomerContract;
import paymentGateway.Contacts.TransactionContract;

abstract class GatewayRules implements CustomerContract, TransactionContract{

    String[] errors;


}
