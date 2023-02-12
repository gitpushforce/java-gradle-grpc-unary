package com.study.client;

import com.study.models.Balance;
import com.study.models.BalanceCheckRequest;
import com.study.models.BankServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankClientTest {

    private BankServiceGrpc.BankServiceBlockingStub blockingStub;

    @BeforeAll
    public void setup() {
        ManagedChannel managedChannel = NettyChannelBuilder.forAddress("localhost", 8089)
                .usePlaintext()
                .build();

         this.blockingStub = BankServiceGrpc.newBlockingStub(managedChannel);
    }

    @Test
    public void balanceTest() {
        BalanceCheckRequest balanceCheckRequest = BalanceCheckRequest.newBuilder()
                .setAccountNumber(5)
                .build();
        Balance balance = this.blockingStub.getBalance(balanceCheckRequest);
        System.out.println("Received: " + balance.getAmount());
    }

}
