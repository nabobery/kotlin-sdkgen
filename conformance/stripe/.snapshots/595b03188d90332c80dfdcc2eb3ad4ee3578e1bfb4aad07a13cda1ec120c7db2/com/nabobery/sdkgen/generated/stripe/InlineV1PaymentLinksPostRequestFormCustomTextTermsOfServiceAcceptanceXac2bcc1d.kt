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

public enum class InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1dBranch {
    InlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c,
    InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07,
}

public sealed class InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1dDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1dNoMatchException(
    message: String,
) : InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1dDecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1dInspection(
    public val matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c: Boolean,
    public val matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c,
                matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_text/properties/terms_of_service_acceptance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_text/properties/terms_of_service_acceptance
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1d.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1dInspection,
) {
    public val inlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c:
        InlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07:
        InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1dBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c) {
                    add(
                        InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1dBranch.InlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c,
                    )
                }
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07) {
                    add(
                        InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1dBranch.InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07,
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
        ): InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1d {
            val inspection = inspectInlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1d(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1dNoMatchException(
                    "InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1d matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1d(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1d",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1d,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1d",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1d(
    element: JsonElement,
): InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1dInspection {
    val matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c>()
    val matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07 =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07>()
    return InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1dInspection(
        matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c = matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c,
        matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07 = matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07,
        failures =
            buildList {
                if (!matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c: value does not match InlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c",
                    )
                }
                if (!matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07: value does not match InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
