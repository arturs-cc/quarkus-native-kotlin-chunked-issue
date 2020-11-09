package com.example

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import javax.inject.Inject
import javax.inject.Named

@Named("test-native-lambda")
class MyLambda @Inject constructor(
): RequestHandler<LambdaRequest, LambdaRequest> {

    override fun handleRequest(req: LambdaRequest, p1: Context?): LambdaRequest {
        generateSequence { 0 to 100 }.asSequence().chunked(2)
        return req
    }
}