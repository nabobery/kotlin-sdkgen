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

public enum class InlinePaymentIntentPaymentMethodX9670d419Branch {
    Branch1,
    PaymentMethod,
}

public sealed class InlinePaymentIntentPaymentMethodX9670d419DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodX9670d419NoMatchException(
    message: String,
) : InlinePaymentIntentPaymentMethodX9670d419DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodX9670d419Inspection(
    public val matchesBranch1: Boolean,
    public val matchesPaymentMethod: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesPaymentMethod).count { it }
}

/**
 * ID of the payment method used in this PaymentIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/payment_method
 */
@Serializable(with = InlinePaymentIntentPaymentMethodX9670d419.Serializer::class)
public class InlinePaymentIntentPaymentMethodX9670d419 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentIntentPaymentMethodX9670d419Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val paymentMethod: PaymentMethod? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentMethod) json.decodeFromJsonElement<PaymentMethod>(raw) else null
        }

    public val matchedBranches: Set<InlinePaymentIntentPaymentMethodX9670d419Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlinePaymentIntentPaymentMethodX9670d419Branch.Branch1)
                if (inspection.matchesPaymentMethod) add(InlinePaymentIntentPaymentMethodX9670d419Branch.PaymentMethod)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlinePaymentIntentPaymentMethodX9670d419 {
            val inspection = inspectInlinePaymentIntentPaymentMethodX9670d419(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentIntentPaymentMethodX9670d419NoMatchException(
                    "InlinePaymentIntentPaymentMethodX9670d419 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentIntentPaymentMethodX9670d419(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodX9670d419> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodX9670d419 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodX9670d419")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPaymentMethodX9670d419,
        ) {
            encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodX9670d419").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentIntentPaymentMethodX9670d419(
    element: JsonElement,
): InlinePaymentIntentPaymentMethodX9670d419Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesPaymentMethod = element.isJsonDecodable<PaymentMethod>()
    return InlinePaymentIntentPaymentMethodX9670d419Inspection(
        matchesBranch1 = matchesBranch1,
        matchesPaymentMethod = matchesPaymentMethod,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesPaymentMethod) add("PaymentMethod: value does not match PaymentMethod")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
