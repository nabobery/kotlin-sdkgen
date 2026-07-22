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

public enum class InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176Branch {
    ConnectAccountReference,
}

public sealed class InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176NoMatchException(
    message: String,
) : InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176DecodingException(message)

internal data class InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176Inspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_automatic_tax/properties/liability
 */
@Serializable(with = InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176.Serializer::class)
public class InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176Inspection,
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

    public val matchedBranches: Set<InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176Branch>
        get() =
            buildSet {
                if (inspection.matchesConnectAccountReference) {
                    add(
                        InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176Branch.ConnectAccountReference,
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
        ): InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176 {
            val inspection = inspectInlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176NoMatchException(
                    "InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176(
    element: JsonElement,
): InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176Inspection(
            matchesConnectAccountReference = false,
            failures = listOf("ConnectAccountReference: expected JSON object"),
        )
    val matchesConnectAccountReference = raw["type"] != null
    return InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176Inspection(
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
