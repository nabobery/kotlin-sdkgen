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
import kotlin.Int
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/payto/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/payto/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994(
    public val amount: Int? = null,
    public val purpose: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeXac5946a1? = null,
) {
    public class Builder {
        public var amount: Int? = null

        public var purpose:
            InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeXac5946a1? = null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994 =
            InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994(
                amount = amount,
                purpose = purpose,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994 must be a JSON object",
                    )
            return InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994(
                amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                purpose =
                    rawObject["purpose"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeXac5946a1>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.purpose?.let { put("purpose", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994(
    block: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994 =
    InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994.build(block)
