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
 * Billie is a [single-use](https://docs.stripe.com/payments/payment-methods#usage) payment method that offers
 * businesses Pay by Invoice where they offer payment terms ranging from 7-120 days. Customers are redirected from your
 * website or app, authorize the payment with Billie, then return to your website or app. You get [immediate
 * notification](/payments/payment-methods#payment-notification) of whether the payment succeeded or failed.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/billie
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceX5abd2685? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceX5abd2685? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c =
            InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceX5abd2685>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c =
    InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c.build(block)
