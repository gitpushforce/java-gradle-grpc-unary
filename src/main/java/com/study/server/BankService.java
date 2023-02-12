package com.study.server;

import com.study.models.Balance;
import com.study.models.BalanceCheckRequest;
import com.study.models.BankServiceGrpc;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceGrpc.BankServiceImplBase {
    @Override
    public void getBalance(BalanceCheckRequest request, StreamObserver<Balance> responseObserver) {
        super.getBalance(request, responseObserver);
    }
}
