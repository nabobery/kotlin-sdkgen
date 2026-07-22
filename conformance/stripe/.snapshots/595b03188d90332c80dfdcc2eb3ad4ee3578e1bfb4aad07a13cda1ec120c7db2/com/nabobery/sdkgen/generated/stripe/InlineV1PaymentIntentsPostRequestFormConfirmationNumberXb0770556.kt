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

public enum class InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556Branch {
    Branch1,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X21b8a316,
}

public sealed class InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X21b8a316: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X21b8a316,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/konbini/anyOf/0/properties/confirmation_number.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/konbini/anyOf/0/properties/confirmation_number
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X21b8a316:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X21b8a316? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X21b8a316) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X21b8a316>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X21b8a316) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X21b8a316,
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
        ): InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X21b8a316 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X21b8a316>()
    return InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X21b8a316 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X21b8a316,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X21b8a316) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X21b8a316: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X21b8a316",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
