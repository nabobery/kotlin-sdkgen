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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bbBranch {
    Branch1,
    InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailAnyOf2Xb5d586b2,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bbDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bbNoMatchException(
    message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bbDecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bbInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailAnyOf2Xb5d586b2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailAnyOf2Xb5d586b2,
            ).count {
                it
            }
}

/**
 * Email address that the receipt for the resulting payment will be sent to. If `receipt_email` is specified for a
 * payment in live mode, a receipt will be sent regardless of your [email
 * settings](https://dashboard.stripe.com/account/emails).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/receipt_email
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bb.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bb internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bbInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailAnyOf2Xb5d586b2:
        InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailAnyOf2Xb5d586b2? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailAnyOf2Xb5d586b2) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailAnyOf2Xb5d586b2>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bbBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bbBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailAnyOf2Xb5d586b2) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bbBranch.InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailAnyOf2Xb5d586b2,
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
        ): InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bb {
            val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bb(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bbNoMatchException(
                    "InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bb matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bb(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bb {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bb",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bb,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bb",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bb(
    element: JsonElement,
): InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bbInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailAnyOf2Xb5d586b2 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailAnyOf2Xb5d586b2>()
    return InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bbInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailAnyOf2Xb5d586b2 = matchesInlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailAnyOf2Xb5d586b2,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailAnyOf2Xb5d586b2) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailAnyOf2Xb5d586b2: value does not match InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailAnyOf2Xb5d586b2",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
