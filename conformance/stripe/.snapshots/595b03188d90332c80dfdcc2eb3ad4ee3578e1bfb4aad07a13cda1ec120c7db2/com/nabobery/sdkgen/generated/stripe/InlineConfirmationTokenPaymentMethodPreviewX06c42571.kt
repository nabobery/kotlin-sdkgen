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

public enum class InlineConfirmationTokenPaymentMethodPreviewX06c42571Branch {
    ConfirmationTokensResourcePaymentMethodPreview,
}

public sealed class InlineConfirmationTokenPaymentMethodPreviewX06c42571DecodingException(
    message: String,
) : SerializationException(message)

public class InlineConfirmationTokenPaymentMethodPreviewX06c42571NoMatchException(
    message: String,
) : InlineConfirmationTokenPaymentMethodPreviewX06c42571DecodingException(message)

internal data class InlineConfirmationTokenPaymentMethodPreviewX06c42571Inspection(
    public val matchesConfirmationTokensResourcePaymentMethodPreview: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesConfirmationTokensResourcePaymentMethodPreview).count { it }
}

/**
 * Payment details collected by the Payment Element, used to create a PaymentMethod when a PaymentIntent or SetupIntent
 * is confirmed with this ConfirmationToken.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/confirmation_token/properties/payment_method_preview
 */
@Serializable(with = InlineConfirmationTokenPaymentMethodPreviewX06c42571.Serializer::class)
public class InlineConfirmationTokenPaymentMethodPreviewX06c42571 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineConfirmationTokenPaymentMethodPreviewX06c42571Inspection,
) {
    public val confirmationTokensResourcePaymentMethodPreview:
        ConfirmationTokensResourcePaymentMethodPreviewView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesConfirmationTokensResourcePaymentMethodPreview) {
                json
                    .decodeFromJsonElement<ConfirmationTokensResourcePaymentMethodPreviewView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineConfirmationTokenPaymentMethodPreviewX06c42571Branch>
        get() =
            buildSet {
                if (inspection.matchesConfirmationTokensResourcePaymentMethodPreview) {
                    add(
                        InlineConfirmationTokenPaymentMethodPreviewX06c42571Branch.ConfirmationTokensResourcePaymentMethodPreview,
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
        ): InlineConfirmationTokenPaymentMethodPreviewX06c42571 {
            val inspection = inspectInlineConfirmationTokenPaymentMethodPreviewX06c42571(raw)
            if (inspection.matchCount == 0) {
                throw InlineConfirmationTokenPaymentMethodPreviewX06c42571NoMatchException(
                    "InlineConfirmationTokenPaymentMethodPreviewX06c42571 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineConfirmationTokenPaymentMethodPreviewX06c42571(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineConfirmationTokenPaymentMethodPreviewX06c42571> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineConfirmationTokenPaymentMethodPreviewX06c42571 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineConfirmationTokenPaymentMethodPreviewX06c42571")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineConfirmationTokenPaymentMethodPreviewX06c42571,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineConfirmationTokenPaymentMethodPreviewX06c42571",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineConfirmationTokenPaymentMethodPreviewX06c42571(
    element: JsonElement,
): InlineConfirmationTokenPaymentMethodPreviewX06c42571Inspection {
    val raw =
        element as? JsonObject ?: return InlineConfirmationTokenPaymentMethodPreviewX06c42571Inspection(
            matchesConfirmationTokensResourcePaymentMethodPreview = false,
            failures = listOf("ConfirmationTokensResourcePaymentMethodPreview: expected JSON object"),
        )
    val matchesConfirmationTokensResourcePaymentMethodPreview = raw["billing_details"] != null && raw["type"] != null
    return InlineConfirmationTokenPaymentMethodPreviewX06c42571Inspection(
        matchesConfirmationTokensResourcePaymentMethodPreview = matchesConfirmationTokensResourcePaymentMethodPreview,
        failures =
            buildList {
                if (!matchesConfirmationTokensResourcePaymentMethodPreview) {
                    add(
                        "ConfirmationTokensResourcePaymentMethodPreview: required properties 'billing_details', 'type' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
