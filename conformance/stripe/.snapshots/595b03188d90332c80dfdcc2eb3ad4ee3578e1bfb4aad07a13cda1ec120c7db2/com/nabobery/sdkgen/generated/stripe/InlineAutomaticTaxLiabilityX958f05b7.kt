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

public enum class InlineAutomaticTaxLiabilityX958f05b7Branch {
    ConnectAccountReference,
}

public sealed class InlineAutomaticTaxLiabilityX958f05b7DecodingException(
    message: String,
) : SerializationException(message)

public class InlineAutomaticTaxLiabilityX958f05b7NoMatchException(
    message: String,
) : InlineAutomaticTaxLiabilityX958f05b7DecodingException(message)

internal data class InlineAutomaticTaxLiabilityX958f05b7Inspection(
    public val matchesConnectAccountReference: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesConnectAccountReference).count { it }
}

/**
 * The account that's liable for tax. If set, the business address and tax registrations required to perform the tax
 * calculation are loaded from this account. The tax transaction is returned in the report of the connected account.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/automatic_tax/properties/liability
 */
@Serializable(with = InlineAutomaticTaxLiabilityX958f05b7.Serializer::class)
public class InlineAutomaticTaxLiabilityX958f05b7 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineAutomaticTaxLiabilityX958f05b7Inspection,
) {
    public val connectAccountReference: ConnectAccountReferenceView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesConnectAccountReference) {
                json.decodeFromJsonElement<ConnectAccountReferenceView>(
                    raw,
                )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineAutomaticTaxLiabilityX958f05b7Branch>
        get() =
            buildSet {
                if (inspection.matchesConnectAccountReference) {
                    add(
                        InlineAutomaticTaxLiabilityX958f05b7Branch.ConnectAccountReference,
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
        ): InlineAutomaticTaxLiabilityX958f05b7 {
            val inspection = inspectInlineAutomaticTaxLiabilityX958f05b7(raw)
            if (inspection.matchCount == 0) {
                throw InlineAutomaticTaxLiabilityX958f05b7NoMatchException(
                    "InlineAutomaticTaxLiabilityX958f05b7 matched 0 branches: " +
                        inspection.failures.joinToString(
                            "; ",
                        ),
                )
            }
            return InlineAutomaticTaxLiabilityX958f05b7(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineAutomaticTaxLiabilityX958f05b7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineAutomaticTaxLiabilityX958f05b7 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineAutomaticTaxLiabilityX958f05b7")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAutomaticTaxLiabilityX958f05b7,
        ) {
            encoder.requireJsonEncoder("InlineAutomaticTaxLiabilityX958f05b7").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineAutomaticTaxLiabilityX958f05b7(
    element: JsonElement,
): InlineAutomaticTaxLiabilityX958f05b7Inspection {
    val raw =
        element as? JsonObject ?: return InlineAutomaticTaxLiabilityX958f05b7Inspection(
            matchesConnectAccountReference = false,
            failures = listOf("ConnectAccountReference: expected JSON object"),
        )
    val matchesConnectAccountReference = raw["type"] != null
    return InlineAutomaticTaxLiabilityX958f05b7Inspection(
        matchesConnectAccountReference = matchesConnectAccountReference,
        failures =
            buildList {
                if (!matchesConnectAccountReference) {
                    add(
                        "ConnectAccountReference: required properties 'type' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
