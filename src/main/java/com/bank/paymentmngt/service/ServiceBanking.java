package com.bank.paymentmngt;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService(serviceName = "BankingEndPoint")
public class ServiceBanking  {

    @WebMethod(operationName = "paymentOperation")
   @WebResult(name = "acceptedPayment")
    public Boolean CreatePayment(@WebParam(name = "cardNumber") String ccNumber, @WebParam(name = "amountPaid") Double amount) {
        if(ccNumber.length()== 10 ){
            System.out.println("Montant payé : "+amount +" €");
            return true;
        } else {
            return false;
        }
    }
}