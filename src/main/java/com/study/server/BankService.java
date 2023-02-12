package com.study.server;

import com.study.models.Balance;
import com.study.models.BalanceCheckRequest;
import com.study.models.BankServiceGrpc;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceGrpc.BankServiceImplBase {
    @Override
    public void getBalance(BalanceCheckRequest request, StreamObserver<Balance> responseObserver) {

        int accountNumber = request.getAccountNumber();
        Balance balance = Balance.newBuilder()
                .setAmount(accountNumber * 10)
                .buildPartial();

        responseObserver.onNext(balance);
        responseObserver.onCompleted();
    }
}
