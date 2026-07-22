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

public enum class InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215cBranch {
    InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b,
    InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493,
}

public sealed class InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215cNoMatchException(
    message: String,
) : InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215cDecodingException(message)

internal data class InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215cInspection(
    public val matchesInlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b: Boolean,
    public val matchesInlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b,
                matchesInlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/destination_payment_method_options/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/destination_payment_method_options/properties/us_bank_account
 */
@Serializable(with = InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215c.Serializer::class)
public class InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215cInspection,
) {
    public val inlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b:
        InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b) {
                json
                    .decodeFromJsonElement<InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493:
        InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493) {
                json
                    .decodeFromJsonElement<InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215cBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b) {
                    add(
                        InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215cBranch.InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b,
                    )
                }
                if (inspection.matchesInlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493) {
                    add(
                        InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215cBranch.InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493,
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
        ): InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215c {
            val inspection = inspectInlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215c(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215cNoMatchException(
                    "InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215c {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215c",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215c(
    element: JsonElement,
): InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215cInspection {
    val matchesInlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b =
        element
            .isJsonDecodable<InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b>()
    val matchesInlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493 =
        element
            .isJsonDecodable<InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493>()
    return InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215cInspection(
        matchesInlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b = matchesInlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b,
        matchesInlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493 = matchesInlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493,
        failures =
            buildList {
                if (!matchesInlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b) {
                    add(
                        "InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b: value does not match InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b",
                    )
                }
                if (!matchesInlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493) {
                    add(
                        "InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493: value does not match InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
