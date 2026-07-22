package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

/**
 * Meal vouchers in France, or “titres-restaurant”, is a local benefits program commonly offered by employers for their
 * employees to purchase prepared food and beverages on working days. Check this
 * [page](https://docs.stripe.com/payments/meal-vouchers/fr-meal-vouchers) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/fr_meal_voucher_conecs
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX2f246ba9.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX2f246ba9(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX39e778b9? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX39e778b9? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX2f246ba9 =
            InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX2f246ba9(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX2f246ba9 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX2f246ba9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX2f246ba9 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX2f246ba9",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX2f246ba9 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX2f246ba9(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX39e778b9>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX2f246ba9,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX2f246ba9",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX2f246ba9(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX2f246ba9.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX2f246ba9 =
    InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX2f246ba9.build(block)
