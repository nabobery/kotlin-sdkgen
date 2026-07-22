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

public enum class InlineChargeTransferDataX5f87055eBranch {
    ChargeTransferData,
}

public sealed class InlineChargeTransferDataX5f87055eDecodingException(
    message: String,
) : SerializationException(message)

public class InlineChargeTransferDataX5f87055eNoMatchException(
    message: String,
) : InlineChargeTransferDataX5f87055eDecodingException(message)

internal data class InlineChargeTransferDataX5f87055eInspection(
    public val matchesChargeTransferData: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesChargeTransferData).count { it }
}

/**
 * An optional dictionary including the account to automatically transfer to as part of a destination charge. [See the
 * Connect documentation](https://docs.stripe.com/connect/destination-charges) for details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/transfer_data
 */
@Serializable(with = InlineChargeTransferDataX5f87055e.Serializer::class)
public class InlineChargeTransferDataX5f87055e internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineChargeTransferDataX5f87055eInspection,
) {
    public val chargeTransferData: ChargeTransferDataView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesChargeTransferData) json.decodeFromJsonElement<ChargeTransferDataView>(raw) else null
        }

    public val matchedBranches: Set<InlineChargeTransferDataX5f87055eBranch>
        get() =
            buildSet {
                if (inspection.matchesChargeTransferData) {
                    add(
                        InlineChargeTransferDataX5f87055eBranch.ChargeTransferData,
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
        ): InlineChargeTransferDataX5f87055e {
            val inspection = inspectInlineChargeTransferDataX5f87055e(raw)
            if (inspection.matchCount == 0) {
                throw InlineChargeTransferDataX5f87055eNoMatchException(
                    "InlineChargeTransferDataX5f87055e matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineChargeTransferDataX5f87055e(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineChargeTransferDataX5f87055e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineChargeTransferDataX5f87055e {
            val jsonDecoder = decoder.requireJsonDecoder("InlineChargeTransferDataX5f87055e")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineChargeTransferDataX5f87055e,
        ) {
            encoder.requireJsonEncoder("InlineChargeTransferDataX5f87055e").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineChargeTransferDataX5f87055e(
    element: JsonElement,
): InlineChargeTransferDataX5f87055eInspection {
    val raw =
        element as? JsonObject ?: return InlineChargeTransferDataX5f87055eInspection(
            matchesChargeTransferData = false,
            failures = listOf("ChargeTransferData: expected JSON object"),
        )
    val matchesChargeTransferData = raw["destination"] != null
    return InlineChargeTransferDataX5f87055eInspection(
        matchesChargeTransferData = matchesChargeTransferData,
        failures =
            buildList {
                if (!matchesChargeTransferData) {
                    add(
                        "ChargeTransferData: required properties 'destination' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
