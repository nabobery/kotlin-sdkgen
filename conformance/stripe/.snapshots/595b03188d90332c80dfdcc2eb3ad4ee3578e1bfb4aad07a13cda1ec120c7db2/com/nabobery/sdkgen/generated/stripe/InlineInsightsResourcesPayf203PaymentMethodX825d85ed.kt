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

public enum class InlineInsightsResourcesPayf203PaymentMethodX825d85edBranch {
    Branch1,
    PaymentMethod,
}

public sealed class InlineInsightsResourcesPayf203PaymentMethodX825d85edDecodingException(
    message: String,
) : SerializationException(message)

public class InlineInsightsResourcesPayf203PaymentMethodX825d85edNoMatchException(
    message: String,
) : InlineInsightsResourcesPayf203PaymentMethodX825d85edDecodingException(message)

internal data class InlineInsightsResourcesPayf203PaymentMethodX825d85edInspection(
    public val matchesBranch1: Boolean,
    public val matchesPaymentMethod: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesPaymentMethod).count { it }
}

/**
 * The payment method used in this payment evaluation.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_payment_method_details/propert
 * ies/payment_method
 */
@Serializable(with = InlineInsightsResourcesPayf203PaymentMethodX825d85ed.Serializer::class)
public class InlineInsightsResourcesPayf203PaymentMethodX825d85ed internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineInsightsResourcesPayf203PaymentMethodX825d85edInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val paymentMethod: PaymentMethod? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentMethod) json.decodeFromJsonElement<PaymentMethod>(raw) else null
        }

    public val matchedBranches: Set<InlineInsightsResourcesPayf203PaymentMethodX825d85edBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineInsightsResourcesPayf203PaymentMethodX825d85edBranch.Branch1)
                if (inspection.matchesPaymentMethod) {
                    add(
                        InlineInsightsResourcesPayf203PaymentMethodX825d85edBranch.PaymentMethod,
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
        ): InlineInsightsResourcesPayf203PaymentMethodX825d85ed {
            val inspection = inspectInlineInsightsResourcesPayf203PaymentMethodX825d85ed(raw)
            if (inspection.matchCount == 0) {
                throw InlineInsightsResourcesPayf203PaymentMethodX825d85edNoMatchException(
                    "InlineInsightsResourcesPayf203PaymentMethodX825d85ed matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineInsightsResourcesPayf203PaymentMethodX825d85ed(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineInsightsResourcesPayf203PaymentMethodX825d85ed> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineInsightsResourcesPayf203PaymentMethodX825d85ed {
            val jsonDecoder = decoder.requireJsonDecoder("InlineInsightsResourcesPayf203PaymentMethodX825d85ed")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInsightsResourcesPayf203PaymentMethodX825d85ed,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineInsightsResourcesPayf203PaymentMethodX825d85ed",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineInsightsResourcesPayf203PaymentMethodX825d85ed(
    element: JsonElement,
): InlineInsightsResourcesPayf203PaymentMethodX825d85edInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesPaymentMethod = element.isJsonDecodable<PaymentMethod>()
    return InlineInsightsResourcesPayf203PaymentMethodX825d85edInspection(
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
