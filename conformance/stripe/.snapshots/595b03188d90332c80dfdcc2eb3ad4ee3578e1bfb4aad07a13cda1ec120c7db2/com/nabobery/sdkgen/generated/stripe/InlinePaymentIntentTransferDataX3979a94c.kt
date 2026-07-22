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

public enum class InlinePaymentIntentTransferDataX3979a94cBranch {
    TransferData,
}

public sealed class InlinePaymentIntentTransferDataX3979a94cDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentIntentTransferDataX3979a94cNoMatchException(
    message: String,
) : InlinePaymentIntentTransferDataX3979a94cDecodingException(message)

internal data class InlinePaymentIntentTransferDataX3979a94cInspection(
    public val matchesTransferData: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesTransferData).count { it }
}

/**
 * The data that automatically creates a Transfer after the payment finalizes. Learn more about the [use case for
 * connected accounts](https://docs.stripe.com/payments/connected-accounts).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/transfer_data
 */
@Serializable(with = InlinePaymentIntentTransferDataX3979a94c.Serializer::class)
public class InlinePaymentIntentTransferDataX3979a94c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentIntentTransferDataX3979a94cInspection,
) {
    public val transferData: TransferDataView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTransferData) json.decodeFromJsonElement<TransferDataView>(raw) else null
        }

    public val matchedBranches: Set<InlinePaymentIntentTransferDataX3979a94cBranch>
        get() =
            buildSet {
                if (inspection.matchesTransferData) add(InlinePaymentIntentTransferDataX3979a94cBranch.TransferData)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlinePaymentIntentTransferDataX3979a94c {
            val inspection = inspectInlinePaymentIntentTransferDataX3979a94c(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentIntentTransferDataX3979a94cNoMatchException(
                    "InlinePaymentIntentTransferDataX3979a94c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentIntentTransferDataX3979a94c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentIntentTransferDataX3979a94c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentIntentTransferDataX3979a94c {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentTransferDataX3979a94c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentTransferDataX3979a94c,
        ) {
            encoder.requireJsonEncoder("InlinePaymentIntentTransferDataX3979a94c").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentIntentTransferDataX3979a94c(
    element: JsonElement,
): InlinePaymentIntentTransferDataX3979a94cInspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentIntentTransferDataX3979a94cInspection(
            matchesTransferData = false,
            failures = listOf("TransferData: expected JSON object"),
        )
    val matchesTransferData = raw["destination"] != null
    return InlinePaymentIntentTransferDataX3979a94cInspection(
        matchesTransferData = matchesTransferData,
        failures =
            buildList {
                if (!matchesTransferData) {
                    add(
                        "TransferData: required properties 'destination' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
