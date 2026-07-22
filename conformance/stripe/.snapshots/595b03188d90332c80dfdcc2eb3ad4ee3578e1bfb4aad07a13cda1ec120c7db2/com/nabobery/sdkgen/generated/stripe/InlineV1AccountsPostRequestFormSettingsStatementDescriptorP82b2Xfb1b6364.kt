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

public enum class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364Branch {
    Branch1,
    InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab,
}

public sealed class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364NoMatchException(
    message: String,
) : InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364DecodingException(message)

internal data class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/card_payments/properties/statement_descriptor_prefix_kana.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/card_payments/properties/statement_descriptor_prefix_kana
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab:
        InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab) {
                    add(
                        InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364Branch.InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab,
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
        ): InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364 {
            val inspection = inspectInlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364NoMatchException(
                    "InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364(
    element: JsonElement,
): InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab =
        element
            .isJsonDecodable<InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab>()
    return InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab = matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab) {
                    add(
                        "InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab: value does not match InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
