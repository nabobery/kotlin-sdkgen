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

public enum class InlineMandatePaymentMethodX5006e80bBranch {
    Branch1,
    PaymentMethod,
}

public sealed class InlineMandatePaymentMethodX5006e80bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineMandatePaymentMethodX5006e80bNoMatchException(
    message: String,
) : InlineMandatePaymentMethodX5006e80bDecodingException(message)

internal data class InlineMandatePaymentMethodX5006e80bInspection(
    public val matchesBranch1: Boolean,
    public val matchesPaymentMethod: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesPaymentMethod).count { it }
}

/**
 * ID of the payment method associated with this mandate.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate/properties/payment_method
 */
@Serializable(with = InlineMandatePaymentMethodX5006e80b.Serializer::class)
public class InlineMandatePaymentMethodX5006e80b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineMandatePaymentMethodX5006e80bInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val paymentMethod: PaymentMethod? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentMethod) json.decodeFromJsonElement<PaymentMethod>(raw) else null
        }

    public val matchedBranches: Set<InlineMandatePaymentMethodX5006e80bBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineMandatePaymentMethodX5006e80bBranch.Branch1)
                if (inspection.matchesPaymentMethod) add(InlineMandatePaymentMethodX5006e80bBranch.PaymentMethod)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineMandatePaymentMethodX5006e80b {
            val inspection = inspectInlineMandatePaymentMethodX5006e80b(raw)
            if (inspection.matchCount == 0) {
                throw InlineMandatePaymentMethodX5006e80bNoMatchException(
                    "InlineMandatePaymentMethodX5006e80b matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineMandatePaymentMethodX5006e80b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineMandatePaymentMethodX5006e80b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineMandatePaymentMethodX5006e80b {
            val jsonDecoder = decoder.requireJsonDecoder("InlineMandatePaymentMethodX5006e80b")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineMandatePaymentMethodX5006e80b,
        ) {
            encoder.requireJsonEncoder("InlineMandatePaymentMethodX5006e80b").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineMandatePaymentMethodX5006e80b(
    element: JsonElement,
): InlineMandatePaymentMethodX5006e80bInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesPaymentMethod = element.isJsonDecodable<PaymentMethod>()
    return InlineMandatePaymentMethodX5006e80bInspection(
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
