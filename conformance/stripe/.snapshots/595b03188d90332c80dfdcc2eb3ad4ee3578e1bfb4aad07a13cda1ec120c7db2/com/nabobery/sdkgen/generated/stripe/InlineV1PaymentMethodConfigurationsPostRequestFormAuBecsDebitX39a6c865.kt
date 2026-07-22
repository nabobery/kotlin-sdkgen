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
 * Stripe users in Australia can accept Bulk Electronic Clearing System (BECS) direct debit payments from customers with
 * an Australian bank account. Check this [page](https://docs.stripe.com/payments/au-becs-debit) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/au_becs_debit
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX39a6c865.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX39a6c865(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX0f56f24f? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX0f56f24f? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX39a6c865 =
            InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX39a6c865(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX39a6c865 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX39a6c865> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX39a6c865 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX39a6c865",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX39a6c865 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX39a6c865(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX0f56f24f>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX39a6c865,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX39a6c865",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX39a6c865(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX39a6c865.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX39a6c865 =
    InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX39a6c865.build(block)
