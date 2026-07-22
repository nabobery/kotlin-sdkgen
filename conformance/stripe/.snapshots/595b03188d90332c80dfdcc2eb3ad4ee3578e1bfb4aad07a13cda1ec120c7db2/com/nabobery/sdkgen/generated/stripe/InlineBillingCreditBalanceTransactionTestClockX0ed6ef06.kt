package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineBillingCreditBalanceTransactionTestClockX0ed6ef06Branch {
    Branch1,
    TestHelpersTestClock,
}

public sealed class InlineBillingCreditBalanceTransactionTestClockX0ed6ef06DecodingException(
    message: String,
) : SerializationException(message)

public class InlineBillingCreditBalanceTransactionTestClockX0ed6ef06NoMatchException(
    message: String,
) : InlineBillingCreditBalanceTransactionTestClockX0ed6ef06DecodingException(message)

internal data class InlineBillingCreditBalanceTransactionTestClockX0ed6ef06Inspection(
    public val matchesBranch1: Boolean,
    public val matchesTestHelpersTestClock: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesTestHelpersTestClock).count { it }
}

/**
 * ID of the test clock this credit balance transaction belongs to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.credit_balance_transaction/properties/test_clock
 */
@Serializable(with = InlineBillingCreditBalanceTransactionTestClockX0ed6ef06.Serializer::class)
public class InlineBillingCreditBalanceTransactionTestClockX0ed6ef06 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineBillingCreditBalanceTransactionTestClockX0ed6ef06Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val testHelpersTestClock: TestHelpersTestClock? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTestHelpersTestClock) json.decodeFromJsonElement<TestHelpersTestClock>(raw) else null
        }

    public val matchedBranches: Set<InlineBillingCreditBalanceTransactionTestClockX0ed6ef06Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineBillingCreditBalanceTransactionTestClockX0ed6ef06Branch.Branch1,
                    )
                }
                if (inspection.matchesTestHelpersTestClock) {
                    add(
                        InlineBillingCreditBalanceTransactionTestClockX0ed6ef06Branch.TestHelpersTestClock,
                    )
                }
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineBillingCreditBalanceTransactionTestClockX0ed6ef06 {
            val inspection = inspectInlineBillingCreditBalanceTransactionTestClockX0ed6ef06(raw)
            if (inspection.matchCount == 0) {
                throw InlineBillingCreditBalanceTransactionTestClockX0ed6ef06NoMatchException(
                    "InlineBillingCreditBalanceTransactionTestClockX0ed6ef06 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineBillingCreditBalanceTransactionTestClockX0ed6ef06(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineBillingCreditBalanceTransactionTestClockX0ed6ef06> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineBillingCreditBalanceTransactionTestClockX0ed6ef06 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineBillingCreditBalanceTransactionTestClockX0ed6ef06")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBillingCreditBalanceTransactionTestClockX0ed6ef06,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineBillingCreditBalanceTransactionTestClockX0ed6ef06",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineBillingCreditBalanceTransactionTestClockX0ed6ef06(
    element: JsonElement,
): InlineBillingCreditBalanceTransactionTestClockX0ed6ef06Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesTestHelpersTestClock = element.isJsonDecodable<TestHelpersTestClock>()
    return InlineBillingCreditBalanceTransactionTestClockX0ed6ef06Inspection(
        matchesBranch1 = matchesBranch1,
        matchesTestHelpersTestClock = matchesTestHelpersTestClock,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesTestHelpersTestClock) add("TestHelpersTestClock: value does not match TestHelpersTestClock")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
