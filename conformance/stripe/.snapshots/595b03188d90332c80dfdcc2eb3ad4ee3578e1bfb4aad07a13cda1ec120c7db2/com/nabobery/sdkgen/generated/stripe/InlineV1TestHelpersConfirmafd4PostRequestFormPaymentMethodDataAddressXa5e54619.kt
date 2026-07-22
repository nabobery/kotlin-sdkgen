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

public enum class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619Branch {
    InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf1Xf6ad8726,
    InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X5aa943ca,
}

public sealed class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619NoMatchException(
    message: String,
) : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619DecodingException(message)

internal data class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619Inspection(
    public val matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf1Xf6ad8726: Boolean,
    public val matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X5aa943ca: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf1Xf6ad8726,
                matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X5aa943ca,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/address
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619.Serializer::class)
public class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619Inspection,
) {
    public val inlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf1Xf6ad8726:
        InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf1Xf6ad8726? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf1Xf6ad8726) {
                json
                    .decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf1Xf6ad8726>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X5aa943ca:
        InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X5aa943ca? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X5aa943ca) {
                json
                    .decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X5aa943ca>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf1Xf6ad8726) {
                    add(
                        InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619Branch.InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf1Xf6ad8726,
                    )
                }
                if (inspection.matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X5aa943ca) {
                    add(
                        InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619Branch.InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X5aa943ca,
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
        ): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619 {
            val inspection = inspectInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619NoMatchException(
                    "InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619(
    element: JsonElement,
): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619Inspection {
    val matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf1Xf6ad8726 =
        element
            .isJsonDecodable<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf1Xf6ad8726>()
    val matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X5aa943ca =
        element
            .isJsonDecodable<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X5aa943ca>()
    return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619Inspection(
        matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf1Xf6ad8726 = matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf1Xf6ad8726,
        matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X5aa943ca = matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X5aa943ca,
        failures =
            buildList {
                if (!matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf1Xf6ad8726) {
                    add(
                        "InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf1Xf6ad8726: value does not match InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf1Xf6ad8726",
                    )
                }
                if (!matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X5aa943ca) {
                    add(
                        "InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X5aa943ca: value does not match InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X5aa943ca",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
