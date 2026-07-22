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

public enum class InlineReviewPaymentIntentXfa4a839eBranch {
    Branch1,
    PaymentIntent,
}

public sealed class InlineReviewPaymentIntentXfa4a839eDecodingException(
    message: String,
) : SerializationException(message)

public class InlineReviewPaymentIntentXfa4a839eNoMatchException(
    message: String,
) : InlineReviewPaymentIntentXfa4a839eDecodingException(message)

internal data class InlineReviewPaymentIntentXfa4a839eInspection(
    public val matchesBranch1: Boolean,
    public val matchesPaymentIntent: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesPaymentIntent).count { it }
}

/**
 * The PaymentIntent ID associated with this review, if one exists.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/review/properties/payment_intent
 */
@Serializable(with = InlineReviewPaymentIntentXfa4a839e.Serializer::class)
public class InlineReviewPaymentIntentXfa4a839e internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineReviewPaymentIntentXfa4a839eInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val paymentIntent: PaymentIntent? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentIntent) json.decodeFromJsonElement<PaymentIntent>(raw) else null
        }

    public val matchedBranches: Set<InlineReviewPaymentIntentXfa4a839eBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineReviewPaymentIntentXfa4a839eBranch.Branch1)
                if (inspection.matchesPaymentIntent) add(InlineReviewPaymentIntentXfa4a839eBranch.PaymentIntent)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineReviewPaymentIntentXfa4a839e {
            val inspection = inspectInlineReviewPaymentIntentXfa4a839e(raw)
            if (inspection.matchCount == 0) {
                throw InlineReviewPaymentIntentXfa4a839eNoMatchException(
                    "InlineReviewPaymentIntentXfa4a839e matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineReviewPaymentIntentXfa4a839e(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineReviewPaymentIntentXfa4a839e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineReviewPaymentIntentXfa4a839e {
            val jsonDecoder = decoder.requireJsonDecoder("InlineReviewPaymentIntentXfa4a839e")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineReviewPaymentIntentXfa4a839e,
        ) {
            encoder.requireJsonEncoder("InlineReviewPaymentIntentXfa4a839e").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineReviewPaymentIntentXfa4a839e(
    element: JsonElement,
): InlineReviewPaymentIntentXfa4a839eInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesPaymentIntent = element.isJsonDecodable<PaymentIntent>()
    return InlineReviewPaymentIntentXfa4a839eInspection(
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
