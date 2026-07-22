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

public enum class InlineDisputePaymentIntentXbb1e9cd4Branch {
    Branch1,
    PaymentIntent,
}

public sealed class InlineDisputePaymentIntentXbb1e9cd4DecodingException(
    message: String,
) : SerializationException(message)

public class InlineDisputePaymentIntentXbb1e9cd4NoMatchException(
    message: String,
) : InlineDisputePaymentIntentXbb1e9cd4DecodingException(message)

internal data class InlineDisputePaymentIntentXbb1e9cd4Inspection(
    public val matchesBranch1: Boolean,
    public val matchesPaymentIntent: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesPaymentIntent).count { it }
}

/**
 * ID of the PaymentIntent that's disputed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute/properties/payment_intent
 */
@Serializable(with = InlineDisputePaymentIntentXbb1e9cd4.Serializer::class)
public class InlineDisputePaymentIntentXbb1e9cd4 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineDisputePaymentIntentXbb1e9cd4Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val paymentIntent: PaymentIntent? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentIntent) json.decodeFromJsonElement<PaymentIntent>(raw) else null
        }

    public val matchedBranches: Set<InlineDisputePaymentIntentXbb1e9cd4Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineDisputePaymentIntentXbb1e9cd4Branch.Branch1)
                if (inspection.matchesPaymentIntent) add(InlineDisputePaymentIntentXbb1e9cd4Branch.PaymentIntent)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineDisputePaymentIntentXbb1e9cd4 {
            val inspection = inspectInlineDisputePaymentIntentXbb1e9cd4(raw)
            if (inspection.matchCount == 0) {
                throw InlineDisputePaymentIntentXbb1e9cd4NoMatchException(
                    "InlineDisputePaymentIntentXbb1e9cd4 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineDisputePaymentIntentXbb1e9cd4(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineDisputePaymentIntentXbb1e9cd4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineDisputePaymentIntentXbb1e9cd4 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineDisputePaymentIntentXbb1e9cd4")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineDisputePaymentIntentXbb1e9cd4,
        ) {
            encoder.requireJsonEncoder("InlineDisputePaymentIntentXbb1e9cd4").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineDisputePaymentIntentXbb1e9cd4(
    element: JsonElement,
): InlineDisputePaymentIntentXbb1e9cd4Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesPaymentIntent = element.isJsonDecodable<PaymentIntent>()
    return InlineDisputePaymentIntentXbb1e9cd4Inspection(
        matchesBranch1 = matchesBranch1,
        matchesPaymentIntent = matchesPaymentIntent,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesPaymentIntent) add("PaymentIntent: value does not match PaymentIntent")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
