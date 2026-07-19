package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.bodies.TransferEvent
import com.nabobery.sdkgen.runtime.bodies.TransferObserver
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertTrue

internal class CallOptionsTest {
    @Test
    fun defaultCallOptionsInheritsEverything() {
        val options = CallOptions()

        assertEquals(PolicyOverride.Inherit, options.retry)
        assertTrue(options.headers.isEmpty())
        assertEquals(null, options.deadlines)
        assertEquals(null, options.requestHook)
    }

    @Test
    fun builderDslConfiguresHeadersDeadlinesRetryAndHook() {
        val hook = SdkRequestHook { it }
        val deadlines = SdkDeadlines(1_000, 1_000, 1_000)

        val options =
            callOptions {
                header("X-Trace-Id", "abc")
                deadlines(deadlines)
                retry(PolicyOverride.Disabled)
                requestHook(hook)
            }

        assertEquals(listOf(SdkHeader("X-Trace-Id", "abc")), options.headers)
        assertEquals(deadlines, options.deadlines)
        assertEquals(PolicyOverride.Disabled, options.retry)
        assertEquals(hook, options.requestHook)
    }

    @Test
    fun builderDslRetryReplaceCarriesValue() {
        val descriptor = RetryDescriptor(maxAttempts = 1)

        val options = callOptions { retry(PolicyOverride.Replace(descriptor)) }

        val replace = assertIs<PolicyOverride.Replace<RetryDescriptor>>(options.retry)
        assertEquals(descriptor, replace.value)
    }

    @Test
    fun builderDslConfiguresPaginationBounds() {
        val bounds = PaginationBounds(maxPages = 3, maxItems = 25, maxElapsedMillis = 5_000)

        val options = callOptions { pagination(bounds) }

        assertEquals(bounds, options.pagination)
        assertEquals(bounds, options.copy().pagination)
    }

    @Test
    fun equalityIncludesPaginationBounds() {
        val withoutBounds = CallOptions()
        val withBounds = CallOptions(pagination = PaginationBounds(maxPages = 2))

        assertTrue(withoutBounds != withBounds)
        assertTrue(withoutBounds.hashCode() != withBounds.hashCode())
        assertTrue(withBounds.toString().contains("pagination=PaginationBounds(maxPages=2"))
    }

    @Test
    fun builderDslAccumulatesMultipleHeaders() {
        val options =
            callOptions {
                header("A", "1")
                header("B", "2")
            }

        assertEquals(listOf(SdkHeader("A", "1"), SdkHeader("B", "2")), options.headers)
    }

    @Test
    fun resolveRetryInheritDefersToOperationDefault() {
        val operationDefault = RetryDescriptor(maxAttempts = 3)

        val resolved = resolveRetry(operationDefault, PolicyOverride.Inherit)

        assertEquals(operationDefault, resolved)
    }

    @Test
    fun resolveRetryDisabledTurnsOffRetryRegardlessOfOperationDefault() {
        val operationDefault = RetryDescriptor(maxAttempts = 3)

        val resolved = resolveRetry(operationDefault, PolicyOverride.Disabled)

        assertEquals(null, resolved)
    }

    @Test
    fun resolveRetryReplaceOverridesOperationDefault() {
        val operationDefault = RetryDescriptor(maxAttempts = 3)
        val override = RetryDescriptor(maxAttempts = 1)

        val resolved = resolveRetry(operationDefault, PolicyOverride.Replace(override))

        assertEquals(override, resolved)
    }

    @Test
    fun resolveRetryInheritWithNoOperationDefaultYieldsNull() {
        assertEquals(null, resolveRetry(null, PolicyOverride.Inherit))
    }

    @Test
    fun resolveRetryResolvedDefaultFlowsThroughWhenCallLayerIsInherit() {
        // resolvedDefault stands in for whatever the lower layers (contract facts -> SDK-author defaults ->
        // client config -> operation defaults) already resolved to; Inherit at the call layer must pass it
        // through unchanged, by name, to make the parameter's contract explicit rather than implicit positioning.
        val resolvedDefault = RetryDescriptor(maxAttempts = 5, retryConnectionErrors = true)

        val resolved = resolveRetry(resolvedDefault = resolvedDefault, callOverride = PolicyOverride.Inherit)

        assertEquals(resolvedDefault, resolved)
    }

    @Test
    fun resolveDeadlinesResolvedDefaultFlowsThroughWhenCallOverrideIsNull() {
        val resolvedDefault = SdkDeadlines(60_000, 30_000, 10_000)

        val resolved = resolveDeadlines(resolvedDefault = resolvedDefault, callDeadlines = null)

        assertEquals(resolvedDefault, resolved)
    }

    @Test
    fun resolveDeadlinesNullCallOverrideDefersToOperationDeadlines() {
        val operationDeadlines = SdkDeadlines(60_000, 30_000, 10_000)

        val resolved = resolveDeadlines(operationDeadlines, null)

        assertEquals(operationDeadlines, resolved)
    }

    @Test
    fun resolveDeadlinesNonNullCallOverrideReplacesOperationDeadlines() {
        val operationDeadlines = SdkDeadlines(60_000, 30_000, 10_000)
        val callDeadlines = SdkDeadlines(5_000, 5_000, 5_000)

        val resolved = resolveDeadlines(operationDeadlines, callDeadlines)

        assertEquals(callDeadlines, resolved)
    }

    @Test
    fun builderDslConfiguresTransferObserver() {
        val observer = NoOpTransferObserver

        val options = callOptions { transferObserver(observer) }

        assertEquals(observer, options.transferObserver)
        assertEquals(observer, options.copy().transferObserver)
    }

    @Test
    fun callOptionsDefensivelyCopiesHeaders() {
        val source = mutableListOf(SdkHeader("X-Trace-Id", "abc"))
        val options = CallOptions(headers = source)

        source.add(SdkHeader("X-Extra", "1"))

        assertEquals(listOf(SdkHeader("X-Trace-Id", "abc")), options.headers)
    }
}

private object NoOpTransferObserver : TransferObserver {
    override fun onStart(event: TransferEvent) = Unit

    override fun onProgress(event: TransferEvent) = Unit

    override fun onCompletion(event: TransferEvent) = Unit

    override fun onFailure(
        event: TransferEvent,
        failure: Throwable,
    ) = Unit
}
