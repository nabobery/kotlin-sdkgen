package com.nabobery.sdkgen.runtime.resilience

import com.nabobery.sdkgen.runtime.AttemptClassification
import com.nabobery.sdkgen.runtime.AttemptOutcome
import com.nabobery.sdkgen.runtime.BackoffHints
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.RetryDescriptor
import com.nabobery.sdkgen.runtime.SdkApiException
import com.nabobery.sdkgen.runtime.SdkAuthenticationException
import com.nabobery.sdkgen.runtime.SdkCapabilityException
import com.nabobery.sdkgen.runtime.SdkConfigurationException
import com.nabobery.sdkgen.runtime.SdkException
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkSerializationException
import com.nabobery.sdkgen.runtime.SdkStreamingException
import com.nabobery.sdkgen.runtime.SdkTimeoutException
import com.nabobery.sdkgen.runtime.SdkTransportException
import com.nabobery.sdkgen.runtime.TimeoutPhase
import com.nabobery.sdkgen.runtime.firstValue
import kotlin.math.pow

internal data class RetryDecision(
    val retry: Boolean,
    val classification: AttemptClassification,
    val delayMillis: Long? = null,
    val totalDeadlineExceeded: Boolean = false,
)

internal class RetryPolicy(
    private val clock: SdkClock,
    private val wallClock: SdkWallClock,
    private val random: SdkRandom,
    private val budget: RetryBudget,
) {
    suspend fun decide(
        metadata: OperationMetadata,
        descriptor: RetryDescriptor,
        body: SdkRequestBody?,
        failure: SdkException,
        responseHeaders: List<SdkHeader>,
        attemptNumber: Int,
        startedAtMillis: Long,
        totalDeadlineMillis: Long?,
        idempotencyKeyPresent: Boolean,
    ): RetryDecision {
        if (attemptNumber >= (descriptor.maxAttempts ?: DEFAULT_MAX_ATTEMPTS)) return exhausted()
        if (totalDeadlineMillis != null && clock.monotonicMillis() - startedAtMillis >= totalDeadlineMillis) {
            return RetryDecision(false, AttemptClassification.EXHAUSTED, totalDeadlineExceeded = true)
        }
        if (neverRetry(failure)) return notRetryable()

        val beforeSend = failure is SdkTransportException && !failure.requestMayHaveReachedServer
        if (beforeSend && !descriptor.retryConnectionErrors) return notRetryable()

        val statusCode = (failure as? SdkApiException)?.statusCode
        val explicitlyAllowed = statusCode != null && retryableSelectors(descriptor).any { it.matches(statusCode) }
        val connectionCandidate = failure is SdkTransportException && descriptor.retryConnectionErrors
        val attemptTimeoutCandidate = failure is SdkTimeoutException && failure.phase == TimeoutPhase.ATTEMPT
        if (!explicitlyAllowed && !connectionCandidate && !attemptTimeoutCandidate) return notRetryable()
        if (!budget.hasCapacity()) return exhausted()

        if (!beforeSend) {
            val safe =
                metadata.safety.safe ||
                    metadata.safety.idempotent ||
                    idempotencyKeyPresent ||
                    explicitlyAllowed
            if (!safe) return notRetryable()
            if (body is SdkRequestBody.OneShot) return notRetryable()
        }

        val delayMillis = retryDelay(responseHeaders, descriptor.backoff, attemptNumber)
        if (totalDeadlineMillis != null &&
            clock.monotonicMillis() - startedAtMillis + delayMillis >= totalDeadlineMillis
        ) {
            return RetryDecision(false, AttemptClassification.EXHAUSTED, totalDeadlineExceeded = true)
        }
        if (!budget.tryConsumeRetry()) return exhausted()
        return RetryDecision(true, AttemptClassification.RETRIED, delayMillis)
    }

    fun outcome(
        attemptNumber: Int,
        decision: RetryDecision,
        failure: SdkException,
    ): AttemptOutcome =
        AttemptOutcome(
            attemptNumber = attemptNumber,
            classification = decision.classification,
            delayMillis = decision.delayMillis,
            summary = summarize(failure),
        )

    private fun retryDelay(
        headers: List<SdkHeader>,
        hints: BackoffHints?,
        attemptNumber: Int,
    ): Long {
        parseRetryAfter(headers.firstValue("Retry-After"))?.let { return it }
        val backoff = hints ?: DEFAULT_BACKOFF
        val exponential =
            (backoff.baseDelayMillis.toDouble() * backoff.multiplier.pow((attemptNumber - 1).toDouble()))
                .coerceAtMost(backoff.maxDelayMillis.toDouble())
        return (random.nextDouble().coerceIn(0.0, 0.999999999999) * exponential).toLong()
    }

    private fun parseRetryAfter(value: String?): Long? {
        val trimmed = value?.trim()?.takeIf(String::isNotEmpty) ?: return null
        val delayMillis =
            trimmed.toLongOrNull()?.let { seconds ->
                if (seconds <= 0 || seconds > RETRY_AFTER_CAP_SECONDS) return null
                seconds * 1_000
            } ?: parseHttpDateMillis(trimmed)?.minus(wallClock.epochMillis())
        return delayMillis?.takeIf { it in 1..RETRY_AFTER_CAP_MILLIS }
    }

    private fun retryableSelectors(descriptor: RetryDescriptor): List<ResponseSelector> =
        descriptor.retryableStatusCodes

    private fun neverRetry(failure: SdkException): Boolean =
        failure is SdkConfigurationException ||
            failure is SdkAuthenticationException ||
            failure is SdkSerializationException ||
            failure is SdkCapabilityException ||
            failure is SdkStreamingException ||
            (failure is SdkTimeoutException && failure.phase != TimeoutPhase.ATTEMPT)

    private fun summarize(failure: SdkException): String =
        when (failure) {
            is SdkApiException -> "HTTP ${failure.statusCode}"
            is SdkTransportException -> failure.message ?: "transport failure"
            else -> failure::class.simpleName ?: "SDK failure"
        }

    private fun exhausted(): RetryDecision = RetryDecision(false, AttemptClassification.EXHAUSTED)

    private fun notRetryable(): RetryDecision = RetryDecision(false, AttemptClassification.NOT_RETRYABLE)

    private companion object {
        const val DEFAULT_MAX_ATTEMPTS = 3
        const val RETRY_AFTER_CAP_SECONDS = 60L
        const val RETRY_AFTER_CAP_MILLIS = RETRY_AFTER_CAP_SECONDS * 1_000
        val DEFAULT_BACKOFF = BackoffHints(500, 2.0, RETRY_AFTER_CAP_MILLIS)
    }
}

private fun parseHttpDateMillis(value: String): Long? {
    val match =
        Regex("^[A-Za-z]{3}, (\\d{2}) ([A-Za-z]{3}) (\\d{4}) (\\d{2}):(\\d{2}):(\\d{2}) GMT$")
            .matchEntire(value) ?: return null
    val (dayText, monthText, yearText, hourText, minuteText, secondText) = match.destructured
    val month =
        listOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
            .indexOf(monthText)
            .plus(1)
            .takeIf { it > 0 } ?: return null
    val year = yearText.toInt()
    val day = dayText.toInt()
    val hour = hourText.toInt()
    val minute = minuteText.toInt()
    val second = secondText.toInt()
    if (day !in 1..daysInMonth(year, month) || hour !in 0..23 || minute !in 0..59 || second !in 0..59) return null
    val days = daysFromCivil(year, month, day)
    return (days * 86_400L + hour * 3_600L + minute * 60L + second) * 1_000L
}

private fun daysInMonth(
    year: Int,
    month: Int,
): Int =
    when (month) {
        2 -> if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 29 else 28
        4, 6, 9, 11 -> 30
        else -> 31
    }

private fun daysFromCivil(
    yearValue: Int,
    monthValue: Int,
    day: Int,
): Long {
    val year = yearValue - if (monthValue <= 2) 1 else 0
    val era = if (year >= 0) year / 400 else (year - 399) / 400
    val yearOfEra = year - era * 400
    val month = monthValue + if (monthValue > 2) -3 else 9
    val dayOfYear = (153 * month + 2) / 5 + day - 1
    val dayOfEra = yearOfEra * 365 + yearOfEra / 4 - yearOfEra / 100 + dayOfYear
    return era * 146_097L + dayOfEra - 719_468L
}
