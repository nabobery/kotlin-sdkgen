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

public enum class InlineV1ProductsPostRequestFormUnitLabelX6c533a49Branch {
    Branch1,
    InlineV1ProductsPostRequestFormUnitLabelAnyOf2Xca6a9353,
}

public sealed class InlineV1ProductsPostRequestFormUnitLabelX6c533a49DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1ProductsPostRequestFormUnitLabelX6c533a49NoMatchException(
    message: String,
) : InlineV1ProductsPostRequestFormUnitLabelX6c533a49DecodingException(message)

internal data class InlineV1ProductsPostRequestFormUnitLabelX6c533a49Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1ProductsPostRequestFormUnitLabelAnyOf2Xca6a9353: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1ProductsPostRequestFormUnitLabelAnyOf2Xca6a9353).count { it }
}

/**
 * A label that represents units of this product. When set, this will be included in customers' receipts, invoices,
 * Checkout, and the customer portal. May only be set if `type=service`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{id}/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/unit_label
 */
@Serializable(with = InlineV1ProductsPostRequestFormUnitLabelX6c533a49.Serializer::class)
public class InlineV1ProductsPostRequestFormUnitLabelX6c533a49 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1ProductsPostRequestFormUnitLabelX6c533a49Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1ProductsPostRequestFormUnitLabelAnyOf2Xca6a9353:
        InlineV1ProductsPostRequestFormUnitLabelAnyOf2Xca6a9353? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1ProductsPostRequestFormUnitLabelAnyOf2Xca6a9353) {
                json
                    .decodeFromJsonElement<InlineV1ProductsPostRequestFormUnitLabelAnyOf2Xca6a9353>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1ProductsPostRequestFormUnitLabelX6c533a49Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1ProductsPostRequestFormUnitLabelX6c533a49Branch.Branch1)
                if (inspection.matchesInlineV1ProductsPostRequestFormUnitLabelAnyOf2Xca6a9353) {
                    add(
                        InlineV1ProductsPostRequestFormUnitLabelX6c533a49Branch.InlineV1ProductsPostRequestFormUnitLabelAnyOf2Xca6a9353,
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
        ): InlineV1ProductsPostRequestFormUnitLabelX6c533a49 {
            val inspection = inspectInlineV1ProductsPostRequestFormUnitLabelX6c533a49(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1ProductsPostRequestFormUnitLabelX6c533a49NoMatchException(
                    "InlineV1ProductsPostRequestFormUnitLabelX6c533a49 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1ProductsPostRequestFormUnitLabelX6c533a49(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1ProductsPostRequestFormUnitLabelX6c533a49> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormUnitLabelX6c533a49 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ProductsPostRequestFormUnitLabelX6c533a49")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ProductsPostRequestFormUnitLabelX6c533a49,
        ) {
            encoder.requireJsonEncoder("InlineV1ProductsPostRequestFormUnitLabelX6c533a49").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1ProductsPostRequestFormUnitLabelX6c533a49(
    element: JsonElement,
): InlineV1ProductsPostRequestFormUnitLabelX6c533a49Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1ProductsPostRequestFormUnitLabelAnyOf2Xca6a9353 =
        element
            .isJsonDecodable<InlineV1ProductsPostRequestFormUnitLabelAnyOf2Xca6a9353>()
    return InlineV1ProductsPostRequestFormUnitLabelX6c533a49Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1ProductsPostRequestFormUnitLabelAnyOf2Xca6a9353 = matchesInlineV1ProductsPostRequestFormUnitLabelAnyOf2Xca6a9353,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1ProductsPostRequestFormUnitLabelAnyOf2Xca6a9353) {
                    add(
                        "InlineV1ProductsPostRequestFormUnitLabelAnyOf2Xca6a9353: value does not match InlineV1ProductsPostRequestFormUnitLabelAnyOf2Xca6a9353",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
