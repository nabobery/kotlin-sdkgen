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

public enum class InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeeceBranch {
    InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7,
    InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e,
}

public sealed class InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeeceDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeeceNoMatchException(
    message: String,
) : InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeeceDecodingException(message)

internal data class InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeeceInspection(
    public val matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7: Boolean,
    public val matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7,
                matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_options/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_options/properties/us_bank_account
 */
@Serializable(with = InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeece.Serializer::class)
public class InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeece internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeeceInspection,
) {
    public val inlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7:
        InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7) {
                json
                    .decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e:
        InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e) {
                json
                    .decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeeceBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7) {
                    add(
                        InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeeceBranch.InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7,
                    )
                }
                if (inspection.matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e) {
                    add(
                        InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeeceBranch.InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e,
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
        ): InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeece {
            val inspection = inspectInlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeece(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeeceNoMatchException(
                    "InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeece matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeece(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeece> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeece {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeece",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeece,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeece",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeece(
    element: JsonElement,
): InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeeceInspection {
    val matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7 =
        element
            .isJsonDecodable<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7>()
    val matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e =
        element
            .isJsonDecodable<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e>()
    return InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeeceInspection(
        matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7 = matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7,
        matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e = matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e,
        failures =
            buildList {
                if (!matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7) {
                    add(
                        "InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7: value does not match InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7",
                    )
                }
                if (!matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e) {
                    add(
                        "InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e: value does not match InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
