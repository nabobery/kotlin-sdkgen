package com.nabobery.sdkgen.runtime.resilience

import kotlinx.coroutines.runBlocking
import kotlin.test.Test

class CoroutineSdkDelayerJvmTest {
    /**
     * Regression: the default delayer once resolved its unqualified `delay(...)` call to itself
     * instead of `kotlinx.coroutines.delay`, overflowing the stack on the first real retry pause.
     * Every retry test injects a fake delayer, so only a direct call exercises the default path;
     * it needs a real event loop, hence a JVM test (the object under test is common code).
     */
    @Test
    fun defaultDelayerSuspendsInsteadOfRecursing() {
        runBlocking {
            CoroutineSdkDelayer.delay(delayMillis = 10L)
            CoroutineSdkDelayer.delay(delayMillis = 0L)
        }
    }
}
