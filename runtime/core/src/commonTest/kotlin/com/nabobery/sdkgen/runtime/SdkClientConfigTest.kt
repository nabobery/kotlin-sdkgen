package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.middleware.AttemptCallContext
import com.nabobery.sdkgen.runtime.middleware.AttemptMiddleware
import com.nabobery.sdkgen.runtime.middleware.AttemptResult
import com.nabobery.sdkgen.runtime.middleware.LogicalCallContext
import com.nabobery.sdkgen.runtime.middleware.LogicalMiddleware
import com.nabobery.sdkgen.runtime.middleware.LogicalOutcome
import com.nabobery.sdkgen.runtime.observation.SdkLifecycleObserver
import com.nabobery.sdkgen.runtime.resilience.RetryBudget
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull
import kotlin.test.assertSame

internal class SdkClientConfigTest {
    private val clientRetry = RetryDescriptor(maxAttempts = 3)
    private val clientDeadlines = SdkDeadlines(30_000, 10_000, 5_000)

    @Test
    fun defaultConfigContributesNothing() {
        val config = SdkClientConfig()

        assertEquals(PolicyOverride.Inherit, config.retry)
        assertNull(config.deadlines)
        assertNull(config.requestHook)
        assertEquals(emptyList(), config.logicalMiddleware)
        assertEquals(emptyList(), config.attemptMiddleware)
        assertEquals(emptyList(), config.observers)
        assertNull(config.productToken)
    }

    @Test
    fun defensivelyCopiesLogicalMiddleware() {
        val source = mutableListOf<LogicalMiddleware>(PassThroughLogicalMiddleware())
        val config = SdkClientConfig(logicalMiddleware = source)

        source += PassThroughLogicalMiddleware()

        assertEquals(1, config.logicalMiddleware.size)
    }

    @Test
    fun defensivelyCopiesAttemptMiddleware() {
        val source = mutableListOf<AttemptMiddleware>(PassThroughAttemptMiddleware())
        val config = SdkClientConfig(attemptMiddleware = source)

        source += PassThroughAttemptMiddleware()

        assertEquals(1, config.attemptMiddleware.size)
    }

    @Test
    fun defensivelyCopiesObservers() {
        val source = mutableListOf<SdkLifecycleObserver>(NoOpObserver())
        val config = SdkClientConfig(observers = source)

        source += NoOpObserver()

        assertEquals(1, config.observers.size)
    }

    @Test
    fun resolveCallOptionsReturnsSameInstanceWhenClientContributesNoRetryOrDeadlines() {
        val config =
            SdkClientConfig(
                requestHook = SdkRequestHook { it },
                observers = listOf(NoOpObserver()),
                productToken = "acme-sdk/1.0",
            )
        val options = callOptions { header("X-Trace-Id", "abc") }

        assertSame(options, config.resolveCallOptions(options))
    }

    @Test
    fun clientInheritRetryLeavesCallRetryInherit() {
        val config = SdkClientConfig(retry = PolicyOverride.Inherit)

        val resolved = config.resolveCallOptions(CallOptions())

        assertEquals(PolicyOverride.Inherit, resolved.retry)
    }

    @Test
    fun clientDisabledRetryFoldsIntoInheritingCall() {
        val config = SdkClientConfig(retry = PolicyOverride.Disabled)

        val resolved = config.resolveCallOptions(CallOptions())

        assertEquals(PolicyOverride.Disabled, resolved.retry)
    }

    @Test
    fun clientReplaceRetryFoldsIntoInheritingCall() {
        val config = SdkClientConfig(retry = PolicyOverride.Replace(clientRetry))

        val resolved = config.resolveCallOptions(CallOptions())

        assertEquals(PolicyOverride.Replace(clientRetry), resolved.retry)
    }

    @Test
    fun perCallDisabledRetryWinsOverClientReplace() {
        val config = SdkClientConfig(retry = PolicyOverride.Replace(clientRetry))

        val resolved = config.resolveCallOptions(CallOptions(retry = PolicyOverride.Disabled))

        assertEquals(PolicyOverride.Disabled, resolved.retry)
    }

    @Test
    fun perCallReplaceRetryWinsOverClientReplace() {
        val callRetry = RetryDescriptor(maxAttempts = 1)
        val config = SdkClientConfig(retry = PolicyOverride.Replace(clientRetry))

        val resolved = config.resolveCallOptions(CallOptions(retry = PolicyOverride.Replace(callRetry)))

        assertEquals(PolicyOverride.Replace(callRetry), resolved.retry)
    }

    @Test
    fun clientDeadlinesFoldIntoCallWithoutDeadlines() {
        val config = SdkClientConfig(deadlines = clientDeadlines)

        val resolved = config.resolveCallOptions(CallOptions())

        assertEquals(clientDeadlines, resolved.deadlines)
    }

    @Test
    fun perCallDeadlinesWinOverClientDeadlines() {
        val callDeadlines = SdkDeadlines(1_000, 1_000, 1_000)
        val config = SdkClientConfig(deadlines = clientDeadlines)

        val resolved = config.resolveCallOptions(CallOptions(deadlines = callDeadlines))

        assertEquals(callDeadlines, resolved.deadlines)
    }

    @Test
    fun resolutionPreservesEveryOtherCallOptionsField() {
        val hook = SdkRequestHook { it }
        val logical = PassThroughLogicalMiddleware()
        val attempt = PassThroughAttemptMiddleware()
        val observer = NoOpObserver()
        val bounds = PaginationBounds(maxPages = 2)
        val options =
            CallOptions(
                headers = listOf(SdkHeader("X-Trace-Id", "abc")),
                requestHook = hook,
                logicalMiddleware = listOf(logical),
                attemptMiddleware = listOf(attempt),
                observers = listOf(observer),
                pagination = bounds,
            )
        val config = SdkClientConfig(retry = PolicyOverride.Replace(clientRetry), deadlines = clientDeadlines)

        val resolved = config.resolveCallOptions(options)

        assertEquals(listOf(SdkHeader("X-Trace-Id", "abc")), resolved.headers)
        assertSame(hook, resolved.requestHook)
        assertEquals(listOf<LogicalMiddleware>(logical), resolved.logicalMiddleware)
        assertEquals(listOf<AttemptMiddleware>(attempt), resolved.attemptMiddleware)
        assertEquals(listOf<SdkLifecycleObserver>(observer), resolved.observers)
        assertEquals(bounds, resolved.pagination)
        assertNull(resolved.transferObserver)
    }

    @Test
    fun resolutionDoesNotCopyClientHooksMiddlewareOrObserversIntoCallOptions() {
        // Those are handed to the executor once at construction; copying them into every CallOptions would
        // register them twice and duplicate lifecycle notifications.
        val config =
            SdkClientConfig(
                retry = PolicyOverride.Replace(clientRetry),
                requestHook = SdkRequestHook { it },
                logicalMiddleware = listOf(PassThroughLogicalMiddleware()),
                attemptMiddleware = listOf(PassThroughAttemptMiddleware()),
                observers = listOf(NoOpObserver()),
            )

        val resolved = config.resolveCallOptions(CallOptions())

        assertNull(resolved.requestHook)
        assertEquals(emptyList(), resolved.logicalMiddleware)
        assertEquals(emptyList(), resolved.attemptMiddleware)
        assertEquals(emptyList(), resolved.observers)
    }

    @Test
    fun retainsTheExactRetryBudgetInstance() {
        val budget = RetryBudget(capacity = 3)

        val config = SdkClientConfig(retryBudget = budget)

        assertSame(budget, config.retryBudget)
    }

    @Test
    fun nullProductTokenMeansUseGeneratedFallback() {
        assertNull(SdkClientConfig(productToken = null).productToken)
    }

    @Test
    fun acceptsWellFormedProductToken() {
        assertEquals("acme-sdk/1.2.3", SdkClientConfig(productToken = "acme-sdk/1.2.3").productToken)
    }

    @Test
    fun rejectsBlankProductToken() {
        assertFailsWith<IllegalArgumentException> { SdkClientConfig(productToken = "   ") }
    }

    @Test
    fun rejectsEmptyProductToken() {
        assertFailsWith<IllegalArgumentException> { SdkClientConfig(productToken = "") }
    }

    @Test
    fun rejectsProductTokenContainingCarriageReturn() {
        assertFailsWith<IllegalArgumentException> { SdkClientConfig(productToken = "acme\rX-Injected: 1") }
    }

    @Test
    fun rejectsProductTokenContainingLineFeed() {
        assertFailsWith<IllegalArgumentException> { SdkClientConfig(productToken = "acme\nX-Injected: 1") }
    }
}

private class PassThroughLogicalMiddleware : LogicalMiddleware {
    override suspend fun <T> intercept(
        call: LogicalCallContext,
        proceed: suspend (LogicalCallContext) -> LogicalOutcome<T>,
    ): LogicalOutcome<T> = proceed(call)
}

private class PassThroughAttemptMiddleware : AttemptMiddleware {
    override suspend fun intercept(
        call: AttemptCallContext,
        proceed: suspend (AttemptCallContext) -> AttemptResult,
    ): AttemptResult = proceed(call)
}

private class NoOpObserver : SdkLifecycleObserver
