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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96Branch {
    Branch1,
    InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X1934ac75,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96NoMatchException(
    message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X1934ac75: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X1934ac75,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/default_mandate.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/default_mandate
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X1934ac75:
        InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X1934ac75? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X1934ac75) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X1934ac75>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X1934ac75) {
                    add(
                        InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96Branch.InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X1934ac75,
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
        ): InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96 {
            val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96NoMatchException(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96(
    element: JsonElement,
): InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X1934ac75 =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X1934ac75>()
    return InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X1934ac75 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X1934ac75,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X1934ac75) {
                    add(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X1934ac75: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X1934ac75",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
