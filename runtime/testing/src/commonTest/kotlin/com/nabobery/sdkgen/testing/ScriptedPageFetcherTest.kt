package com.nabobery.sdkgen.testing

import com.nabobery.sdkgen.runtime.pagination.PageEnvelope
import com.nabobery.sdkgen.runtime.pagination.PageRequest
import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertSame

internal class ScriptedPageFetcherTest {
    @Test
    fun deliversQueuedEnvelopesInOrderAndRecordsRequests() =
        runFetcherSuspend {
            val fetcher = ScriptedPageFetcher<String, Int>()
            fetcher.enqueueEnvelope(PageEnvelope("first", items = listOf(1, 2)))
            fetcher.enqueueEnvelope(PageEnvelope("second", items = listOf(3)))

            val first = fetcher.fetch(PageRequest.First)
            val second = fetcher.fetch(PageRequest.NextOffset(2))

            assertEquals("first", first.value)
            assertEquals("second", second.value)
            assertEquals(listOf(PageRequest.First, PageRequest.NextOffset(2)), fetcher.requests)
        }

    @Test
    fun queuedFailurePropagatesByIdentity() =
        runFetcherSuspend {
            val fetcher = ScriptedPageFetcher<String, Int>()
            val failure = IllegalStateException("boom")
            fetcher.enqueueFailure(failure)

            val thrown = assertFailsWith<IllegalStateException> { fetcher.fetch(PageRequest.First) }

            assertSame(failure, thrown)
        }

    @Test
    fun exhaustedScriptFailsLoudly() =
        runFetcherSuspend {
            val fetcher = ScriptedPageFetcher<String, Int>()

            assertFailsWith<IllegalStateException> { fetcher.fetch(PageRequest.First) }
            Unit
        }

    @Test
    fun reentrantFetchDuringAnInFlightCallIsRejected() =
        runFetcherSuspend {
            val fetcher = ScriptedPageFetcher<String, Int>()
            var innerFailure: Throwable? = null
            // The queued step itself calls back into fetch() before returning, simulating a caller that (buggily)
            // starts a second page fetch before the first one has completed.
            fetcher.enqueueSuspending {
                innerFailure = runCatching { fetcher.fetch(PageRequest.NextOffset(1)) }.exceptionOrNull()
                PageEnvelope("outer")
            }

            val outer = fetcher.fetch(PageRequest.First)

            assertEquals("outer", outer.value)
            val thrown = assertFailsWith<IllegalStateException> { throw requireNotNull(innerFailure) }
            assertEquals(
                "Reentrant page fetch detected: only one page fetch may be in flight at a time",
                thrown.message,
            )
            // The reentrant call never reached the script, so only the outer request was recorded.
            assertEquals(listOf(PageRequest.First), fetcher.requests)
        }
}

private fun <T> runFetcherSuspend(block: suspend () -> T): T {
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
