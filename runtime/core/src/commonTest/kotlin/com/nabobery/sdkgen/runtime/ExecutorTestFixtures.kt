package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.resilience.SdkClock
import com.nabobery.sdkgen.runtime.resilience.SdkDelayer
import com.nabobery.sdkgen.runtime.resilience.SdkRandom
import com.nabobery.sdkgen.runtime.resilience.SdkWallClock
import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine

internal class DeterministicTime(
    private var monotonic: Long = 0,
    private var epoch: Long = 0,
    private val randomValue: Double = 0.5,
    private val delayFailure: Throwable? = null,
) : SdkClock,
    SdkWallClock,
    SdkDelayer,
    SdkRandom {
    val delays = mutableListOf<Long>()

    override fun monotonicMillis(): Long = monotonic

    override fun epochMillis(): Long = epoch

    override suspend fun delay(delayMillis: Long) {
        delayFailure?.let { throw it }
        delays += delayMillis
        advanceBy(delayMillis)
    }

    override fun nextDouble(): Double = randomValue

    fun advanceBy(millis: Long) {
        monotonic += millis
        epoch += millis
    }
}

internal class ScriptedTransport(
    private val onExecute: () -> Unit = {},
) : SdkTransport {
    private val steps = mutableListOf<suspend () -> SdkResponse>()
    val requests = mutableListOf<SdkRequest>()

    fun response(
        status: Int,
        body: String = "ok",
        headers: List<SdkHeader> = emptyList(),
    ): ScriptedTransport =
        apply {
            steps += { SdkResponse(status, headers, StringStream(body)) }
        }

    fun failure(failure: Throwable): ScriptedTransport =
        apply {
            steps += { throw failure }
        }

    override fun capabilities(): TransportCapabilities = TransportCapabilities(supportsStreaming = true)

    override suspend fun execute(request: SdkRequest): SdkResponse {
        requests += request
        onExecute()
        return steps.removeFirst().invoke()
    }
}

internal class StringStream(
    value: String,
) : SdkByteStream {
    private var bytes: ByteArray? = value.encodeToByteArray()

    override suspend fun readChunk(maxBytes: Int): ByteArray? = bytes.also { bytes = null }

    override fun close(cause: Throwable?) {}
}

internal fun <T> runTestSuspend(block: suspend () -> T): T {
    var outcome: Result<T>? = null
    block.startCoroutine(
        object : Continuation<T> {
            override val context = EmptyCoroutineContext

            override fun resumeWith(result: Result<T>) {
                outcome = result
            }
        },
    )
    return requireNotNull(outcome).getOrThrow()
}
