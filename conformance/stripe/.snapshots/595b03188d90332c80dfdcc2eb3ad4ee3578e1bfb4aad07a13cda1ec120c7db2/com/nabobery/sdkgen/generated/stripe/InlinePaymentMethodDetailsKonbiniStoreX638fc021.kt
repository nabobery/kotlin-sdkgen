package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlinePaymentMethodDetailsKonbiniStoreX638fc021Branch {
    PaymentMethodDetailsKonbiniStore,
}

public sealed class InlinePaymentMethodDetailsKonbiniStoreX638fc021DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsKonbiniStoreX638fc021NoMatchException(
    message: String,
) : InlinePaymentMethodDetailsKonbiniStoreX638fc021DecodingException(message)

internal data class InlinePaymentMethodDetailsKonbiniStoreX638fc021Inspection(
    public val matchesPaymentMethodDetailsKonbiniStore: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPaymentMethodDetailsKonbiniStore).count { it }
}

/**
 * If the payment succeeded, this contains the details of the convenience store where the payment was completed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_konbini/properties/store
 */
@Serializable(with = InlinePaymentMethodDetailsKonbiniStoreX638fc021.Serializer::class)
public class InlinePaymentMethodDetailsKonbiniStoreX638fc021 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentMethodDetailsKonbiniStoreX638fc021Inspection,
) {
    public val paymentMethodDetailsKonbiniStore: PaymentMethodDetailsKonbiniStoreView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentMethodDetailsKonbiniStore) {
                json
                    .decodeFromJsonElement<PaymentMethodDetailsKonbiniStoreView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlinePaymentMethodDetailsKonbiniStoreX638fc021Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentMethodDetailsKonbiniStore) {
                    add(
                        InlinePaymentMethodDetailsKonbiniStoreX638fc021Branch.PaymentMethodDetailsKonbiniStore,
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
        ): InlinePaymentMethodDetailsKonbiniStoreX638fc021 {
            val inspection = inspectInlinePaymentMethodDetailsKonbiniStoreX638fc021(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentMethodDetailsKonbiniStoreX638fc021NoMatchException(
                    "InlinePaymentMethodDetailsKonbiniStoreX638fc021 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentMethodDetailsKonbiniStoreX638fc021(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentMethodDetailsKonbiniStoreX638fc021> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsKonbiniStoreX638fc021 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsKonbiniStoreX638fc021")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodDetailsKonbiniStoreX638fc021,
        ) {
            encoder.requireJsonEncoder("InlinePaymentMethodDetailsKonbiniStoreX638fc021").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentMethodDetailsKonbiniStoreX638fc021(
    element: JsonElement,
): InlinePaymentMethodDetailsKonbiniStoreX638fc021Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentMethodDetailsKonbiniStoreX638fc021Inspection(
            matchesPaymentMethodDetailsKonbiniStore = false,
            failures = listOf("PaymentMethodDetailsKonbiniStore: expected JSON object"),
        )
    val matchesPaymentMethodDetailsKonbiniStore = true
    return InlinePaymentMethodDetailsKonbiniStoreX638fc021Inspection(
        matchesPaymentMethodDetailsKonbiniStore = matchesPaymentMethodDetailsKonbiniStore,
        failures =
            buildList {
                if (!matchesPaymentMethodDetailsKonbiniStore) {
                    add(
                        "PaymentMethodDetailsKonbiniStore: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
