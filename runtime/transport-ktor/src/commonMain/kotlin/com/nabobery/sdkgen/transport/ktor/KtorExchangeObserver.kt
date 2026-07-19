package com.nabobery.sdkgen.transport.ktor

/** Internal test seam observing the adapter's retained Ktor exchange scope, not neutral stream close calls. */
internal interface KtorExchangeObserver {
    fun onResponseStarted(): Long

    fun onResponseTerminated(
        exchangeId: Long,
        cause: Throwable?,
    )
}

internal object NoOpKtorExchangeObserver : KtorExchangeObserver {
    override fun onResponseStarted(): Long = 0L

    override fun onResponseTerminated(
        exchangeId: Long,
        cause: Throwable?,
    ) {}
}
