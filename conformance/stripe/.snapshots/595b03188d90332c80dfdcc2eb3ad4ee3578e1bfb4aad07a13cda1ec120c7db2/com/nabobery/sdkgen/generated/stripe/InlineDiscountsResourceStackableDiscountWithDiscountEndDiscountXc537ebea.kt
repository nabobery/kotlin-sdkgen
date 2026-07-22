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

public enum class InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebeaBranch {
    Branch1,
    Discount,
}

public sealed class InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebeaDecodingException(
    message: String,
) : SerializationException(message)

public class InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebeaNoMatchException(
    message: String,
) : InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebeaDecodingException(message)

internal data class InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebeaInspection(
    public val matchesBranch1: Boolean,
    public val matchesDiscount: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesDiscount).count { it }
}

/**
 * ID of an existing discount on the object (or one of its ancestors) to reuse.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/discounts_resource_stackable_discount_with_discount_end/properties/d
 * iscount
 */
@Serializable(with = InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebea.Serializer::class)
public class InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebea internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebeaInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val discount: Discount? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesDiscount) json.decodeFromJsonElement<Discount>(raw) else null }

    public val matchedBranches:
        Set<InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebeaBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebeaBranch.Branch1,
                    )
                }
                if (inspection.matchesDiscount) {
                    add(
                        InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebeaBranch.Discount,
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
        ): InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebea {
            val inspection = inspectInlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebea(raw)
            if (inspection.matchCount == 0) {
                throw InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebeaNoMatchException(
                    "InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebea matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebea(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebea> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebea {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebea",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebea,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebea",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebea(
    element: JsonElement,
): InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebeaInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesDiscount = element.isJsonDecodable<Discount>()
    return InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebeaInspection(
        matchesBranch1 = matchesBranch1,
        matchesDiscount = matchesDiscount,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesDiscount) add("Discount: value does not match Discount")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
