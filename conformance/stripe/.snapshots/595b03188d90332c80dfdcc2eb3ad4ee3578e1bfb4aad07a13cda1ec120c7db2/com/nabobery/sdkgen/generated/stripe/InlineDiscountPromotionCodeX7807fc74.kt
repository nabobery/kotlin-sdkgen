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

public enum class InlineDiscountPromotionCodeX7807fc74Branch {
    Branch1,
    PromotionCode,
}

public sealed class InlineDiscountPromotionCodeX7807fc74DecodingException(
    message: String,
) : SerializationException(message)

public class InlineDiscountPromotionCodeX7807fc74NoMatchException(
    message: String,
) : InlineDiscountPromotionCodeX7807fc74DecodingException(message)

internal data class InlineDiscountPromotionCodeX7807fc74Inspection(
    public val matchesBranch1: Boolean,
    public val matchesPromotionCode: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesPromotionCode).count { it }
}

/**
 * The promotion code applied to create this discount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/discount/properties/promotion_code
 */
@Serializable(with = InlineDiscountPromotionCodeX7807fc74.Serializer::class)
public class InlineDiscountPromotionCodeX7807fc74 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineDiscountPromotionCodeX7807fc74Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val promotionCode: PromotionCode? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPromotionCode) json.decodeFromJsonElement<PromotionCode>(raw) else null
        }

    public val matchedBranches: Set<InlineDiscountPromotionCodeX7807fc74Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineDiscountPromotionCodeX7807fc74Branch.Branch1)
                if (inspection.matchesPromotionCode) add(InlineDiscountPromotionCodeX7807fc74Branch.PromotionCode)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineDiscountPromotionCodeX7807fc74 {
            val inspection = inspectInlineDiscountPromotionCodeX7807fc74(raw)
            if (inspection.matchCount == 0) {
                throw InlineDiscountPromotionCodeX7807fc74NoMatchException(
                    "InlineDiscountPromotionCodeX7807fc74 matched 0 branches: " +
                        inspection.failures.joinToString(
                            "; ",
                        ),
                )
            }
            return InlineDiscountPromotionCodeX7807fc74(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineDiscountPromotionCodeX7807fc74> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineDiscountPromotionCodeX7807fc74 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineDiscountPromotionCodeX7807fc74")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineDiscountPromotionCodeX7807fc74,
        ) {
            encoder.requireJsonEncoder("InlineDiscountPromotionCodeX7807fc74").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineDiscountPromotionCodeX7807fc74(
    element: JsonElement,
): InlineDiscountPromotionCodeX7807fc74Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesPromotionCode = element.isJsonDecodable<PromotionCode>()
    return InlineDiscountPromotionCodeX7807fc74Inspection(
        matchesBranch1 = matchesBranch1,
        matchesPromotionCode = matchesPromotionCode,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesPromotionCode) add("PromotionCode: value does not match PromotionCode")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
