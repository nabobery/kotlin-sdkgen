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

public enum class InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059Branch {
    Branch1,
    Coupon,
}

public sealed class InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059DecodingException(
    message: String,
) : SerializationException(message)

public class InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059NoMatchException(
    message: String,
) : InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059DecodingException(message)

internal data class InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059Inspection(
    public val matchesBranch1: Boolean,
    public val matchesCoupon: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesCoupon).count { it }
}

/**
 * ID of the coupon to create a new discount for.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/stackable_discount_with_discount_settings_and_discount_end/propertie
 * s/coupon
 */
@Serializable(with = InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059.Serializer::class)
public class InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val coupon: Coupon? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesCoupon) json.decodeFromJsonElement<Coupon>(raw) else null }

    public val matchedBranches:
        Set<InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059Branch.Branch1,
                    )
                }
                if (inspection.matchesCoupon) {
                    add(
                        InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059Branch.Coupon,
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
        ): InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059 {
            val inspection = inspectInlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059(raw)
            if (inspection.matchCount == 0) {
                throw InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059NoMatchException(
                    "InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059(
    element: JsonElement,
): InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesCoupon = element.isJsonDecodable<Coupon>()
    return InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059Inspection(
        matchesBranch1 = matchesBranch1,
        matchesCoupon = matchesCoupon,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesCoupon) add("Coupon: value does not match Coupon")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
