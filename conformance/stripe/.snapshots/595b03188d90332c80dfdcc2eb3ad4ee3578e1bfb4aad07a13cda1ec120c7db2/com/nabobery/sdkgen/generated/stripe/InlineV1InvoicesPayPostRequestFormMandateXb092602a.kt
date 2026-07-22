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

public enum class InlineV1InvoicesPayPostRequestFormMandateXb092602aBranch {
    Branch1,
    InlineV1InvoicesPayPostRequestFormMandateAnyOf2Xb1439620,
}

public sealed class InlineV1InvoicesPayPostRequestFormMandateXb092602aDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesPayPostRequestFormMandateXb092602aNoMatchException(
    message: String,
) : InlineV1InvoicesPayPostRequestFormMandateXb092602aDecodingException(message)

internal data class InlineV1InvoicesPayPostRequestFormMandateXb092602aInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1InvoicesPayPostRequestFormMandateAnyOf2Xb1439620: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1InvoicesPayPostRequestFormMandateAnyOf2Xb1439620).count { it }
}

/**
 * ID of the mandate to be used for this invoice. It must correspond to the payment method used to pay the invoice,
 * including the payment_method param or the invoice's default_payment_method or default_source, if set.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1pay/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/mandate
 */
@Serializable(with = InlineV1InvoicesPayPostRequestFormMandateXb092602a.Serializer::class)
public class InlineV1InvoicesPayPostRequestFormMandateXb092602a internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesPayPostRequestFormMandateXb092602aInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1InvoicesPayPostRequestFormMandateAnyOf2Xb1439620:
        InlineV1InvoicesPayPostRequestFormMandateAnyOf2Xb1439620? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPayPostRequestFormMandateAnyOf2Xb1439620) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPayPostRequestFormMandateAnyOf2Xb1439620>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1InvoicesPayPostRequestFormMandateXb092602aBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1InvoicesPayPostRequestFormMandateXb092602aBranch.Branch1)
                if (inspection.matchesInlineV1InvoicesPayPostRequestFormMandateAnyOf2Xb1439620) {
                    add(
                        InlineV1InvoicesPayPostRequestFormMandateXb092602aBranch.InlineV1InvoicesPayPostRequestFormMandateAnyOf2Xb1439620,
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
        ): InlineV1InvoicesPayPostRequestFormMandateXb092602a {
            val inspection = inspectInlineV1InvoicesPayPostRequestFormMandateXb092602a(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesPayPostRequestFormMandateXb092602aNoMatchException(
                    "InlineV1InvoicesPayPostRequestFormMandateXb092602a matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesPayPostRequestFormMandateXb092602a(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPayPostRequestFormMandateXb092602a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPayPostRequestFormMandateXb092602a {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPayPostRequestFormMandateXb092602a")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPayPostRequestFormMandateXb092602a,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesPayPostRequestFormMandateXb092602a",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesPayPostRequestFormMandateXb092602a(
    element: JsonElement,
): InlineV1InvoicesPayPostRequestFormMandateXb092602aInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1InvoicesPayPostRequestFormMandateAnyOf2Xb1439620 =
        element
            .isJsonDecodable<InlineV1InvoicesPayPostRequestFormMandateAnyOf2Xb1439620>()
    return InlineV1InvoicesPayPostRequestFormMandateXb092602aInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1InvoicesPayPostRequestFormMandateAnyOf2Xb1439620 = matchesInlineV1InvoicesPayPostRequestFormMandateAnyOf2Xb1439620,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1InvoicesPayPostRequestFormMandateAnyOf2Xb1439620) {
                    add(
                        "InlineV1InvoicesPayPostRequestFormMandateAnyOf2Xb1439620: value does not match InlineV1InvoicesPayPostRequestFormMandateAnyOf2Xb1439620",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
