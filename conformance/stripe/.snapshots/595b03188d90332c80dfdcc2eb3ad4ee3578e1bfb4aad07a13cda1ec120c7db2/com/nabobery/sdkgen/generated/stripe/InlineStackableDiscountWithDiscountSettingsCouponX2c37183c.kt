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

public enum class InlineStackableDiscountWithDiscountSettingsCouponX2c37183cBranch {
    Branch1,
    Coupon,
}

public sealed class InlineStackableDiscountWithDiscountSettingsCouponX2c37183cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineStackableDiscountWithDiscountSettingsCouponX2c37183cNoMatchException(
    message: String,
) : InlineStackableDiscountWithDiscountSettingsCouponX2c37183cDecodingException(message)

internal data class InlineStackableDiscountWithDiscountSettingsCouponX2c37183cInspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/stackable_discount_with_discount_settings/properties/coupon
 */
@Serializable(with = InlineStackableDiscountWithDiscountSettingsCouponX2c37183c.Serializer::class)
public class InlineStackableDiscountWithDiscountSettingsCouponX2c37183c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineStackableDiscountWithDiscountSettingsCouponX2c37183cInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val coupon: Coupon? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesCoupon) json.decodeFromJsonElement<Coupon>(raw) else null }

    public val matchedBranches: Set<InlineStackableDiscountWithDiscountSettingsCouponX2c37183cBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineStackableDiscountWithDiscountSettingsCouponX2c37183cBranch.Branch1,
                    )
                }
                if (inspection.matchesCoupon) {
                    add(
                        InlineStackableDiscountWithDiscountSettingsCouponX2c37183cBranch.Coupon,
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
        ): InlineStackableDiscountWithDiscountSettingsCouponX2c37183c {
            val inspection = inspectInlineStackableDiscountWithDiscountSettingsCouponX2c37183c(raw)
            if (inspection.matchCount == 0) {
                throw InlineStackableDiscountWithDiscountSettingsCouponX2c37183cNoMatchException(
                    "InlineStackableDiscountWithDiscountSettingsCouponX2c37183c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineStackableDiscountWithDiscountSettingsCouponX2c37183c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineStackableDiscountWithDiscountSettingsCouponX2c37183c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineStackableDiscountWithDiscountSettingsCouponX2c37183c {
            val jsonDecoder = decoder.requireJsonDecoder("InlineStackableDiscountWithDiscountSettingsCouponX2c37183c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineStackableDiscountWithDiscountSettingsCouponX2c37183c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineStackableDiscountWithDiscountSettingsCouponX2c37183c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineStackableDiscountWithDiscountSettingsCouponX2c37183c(
    element: JsonElement,
): InlineStackableDiscountWithDiscountSettingsCouponX2c37183cInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesCoupon = element.isJsonDecodable<Coupon>()
    return InlineStackableDiscountWithDiscountSettingsCouponX2c37183cInspection(
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
