package com.nabobery.sdkgen.transport.javahttp

import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.testing.ChunkGate
import com.nabobery.sdkgen.testing.ContractRequestVerification
import com.nabobery.sdkgen.testing.ContractServer
import com.nabobery.sdkgen.testing.ResponseBodyScript
import com.nabobery.sdkgen.testing.ScriptedExchange
import com.sun.net.httpserver.HttpExchange
import com.sun.net.httpserver.HttpServer
import kotlinx.coroutines.runBlocking
import java.net.InetSocketAddress
import java.net.ServerSocket
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean

private const val CHUNK_DELIVERY_SETTLE_MILLIS: Long = 25

internal class JdkContractServer : ContractServer {
    private val refusingPort = ServerSocket(0).use { it.localPort }
    private val script = ConcurrentLinkedQueue<ScriptedExchange>()
    private val responses = mutableListOf<ResponseState>()
    private val executor = Executors.newCachedThreadPool()
    private val server =
        HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0).apply {
            createContext("/", ::handle)
            setExecutor(executor)
            start()
        }

    override fun url(path: String): String {
        val normalized = "/${path.trimStart('/')}"
        val port = if (normalized == "/connect-failure") refusingPort else server.address.port
        return "http://127.0.0.1:$port$normalized"
    }

    override fun enqueue(exchange: ScriptedExchange) {
        script += exchange
    }

    override fun assertResponseClosed(
        exchangeIndex: Int,
        cause: Throwable?,
    ) {
        val state = synchronized(responses) { responses[exchangeIndex] }
        state.releaseAll()
        check(state.terminal.await(5, TimeUnit.SECONDS)) { "Response $exchangeIndex did not terminate" }
        check(state.finished.get() || state.writeFailed.get()) { "Response $exchangeIndex remained open" }
    }

    override fun close() {
        synchronized(responses) { responses.forEach(ResponseState::releaseAll) }
        server.stop(0)
        executor.shutdownNow()
        executor.awaitTermination(5, TimeUnit.SECONDS)
        script.removeIf { it.response.failure != null }
        check(script.isEmpty()) { "Expected every scripted exchange to be consumed; ${script.size} remain" }
    }

    private fun handle(exchange: HttpExchange) {
        val scripted = script.poll() ?: error("Contract server script is exhausted")
        val state = ResponseState(scripted.response.body)
        synchronized(responses) { responses += state }
        try {
            verifyRequest(scripted, exchange)
            scripted.response.headers.forEach { exchange.responseHeaders.add(it.name, it.value) }
            writeResponse(exchange, scripted, state)
            state.finished.set(true)
        } catch (failure: Throwable) {
            state.writeFailed.set(true)
            exchange.close()
        } finally {
            state.terminal.countDown()
        }
    }

    private fun verifyRequest(
        scripted: ScriptedExchange,
        exchange: HttpExchange,
    ) {
        val body = exchange.requestBody.use { it.readBytes() }
        val actualHeaders =
            scripted.request.headers.map { expected ->
                val values =
                    exchange.requestHeaders.entries
                        .first { it.key.equals(expected.name, true) }
                        .value
                        .flatMap { it.split(',').map(String::trim) }
                SdkHeader(expected.name, values.first { it == expected.value })
            }
        val actual =
            SdkRequest(
                method = exchange.requestMethod,
                uri = url(exchange.requestURI.rawPath),
                headers = actualHeaders,
                body = null,
                expectedResponseMode = SdkResponseMode.BUFFERED,
                deadlines = SdkDeadlines(null, null, null),
                operationId = "jdk-contract-server",
            )
        ContractRequestVerification.verify(
            scripted.request,
            actual,
            body.takeUnless { scripted.request.body == null && it.isEmpty() },
        )
    }

    private fun writeResponse(
        exchange: HttpExchange,
        scripted: ScriptedExchange,
        state: ResponseState,
    ) {
        when (val body = scripted.response.body) {
            ResponseBodyScript.Empty -> {
                exchange.sendResponseHeaders(scripted.response.statusCode, -1)
                exchange.close()
            }

            is ResponseBodyScript.Chunks -> {
                exchange.sendResponseHeaders(scripted.response.statusCode, 0)
                exchange.responseBody.use { output ->
                    body.chunks.forEachIndexed { index, chunk ->
                        if (body.failureAfterChunk == index) return
                        output.write(chunk)
                        output.flush()
                        body.gate?.markProduced(index)
                        body.gate?.let { gate ->
                            Thread.sleep(CHUNK_DELIVERY_SETTLE_MILLIS)
                            runBlocking { gate.awaitRelease(index) }
                        }
                    }
                    if (body.failureAfterChunk == body.chunks.size) return
                }
                state.finished.set(true)
            }
        }
    }
}

private class ResponseState(
    body: ResponseBodyScript,
) {
    private val chunks = (body as? ResponseBodyScript.Chunks)?.chunks?.size ?: 0
    private val gate: ChunkGate? = (body as? ResponseBodyScript.Chunks)?.gate
    val terminal = CountDownLatch(1)
    val finished = AtomicBoolean()
    val writeFailed = AtomicBoolean()

    fun releaseAll() {
        repeat(chunks) { gate?.release(it) }
    }
}
