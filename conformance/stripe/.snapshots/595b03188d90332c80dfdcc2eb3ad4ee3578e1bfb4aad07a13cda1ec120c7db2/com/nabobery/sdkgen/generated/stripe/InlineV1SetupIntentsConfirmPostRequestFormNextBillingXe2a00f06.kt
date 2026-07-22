package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/klarna/properties/subscriptions/anyOf/0/items/p
 * roperties/next_billing.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/klarna/properties/subscriptions/anyOf/0/items/p
 * roperties/next_billing
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06(
    public val amount: Int,
    public val date: String,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var dateValue: String? = null

        public var date: String
            get() = requireNotNull(dateValue) { "date is required" }
            set(`value`) {
                dateValue = value
            }

        public fun build(): InlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06 {
            check(amountValue != null) { "amount is required" }
            check(dateValue != null) { "date is required" }
            return InlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06(
                amount = amount,
                date = date,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06 must be a JSON object",
                    )
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val date = json.decodeRequired<String>(rawObject, "date")
            return InlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06(
                amount = amount,
                date = date,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("date", value.date)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06(
    block: InlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06.Builder.() -> Unit,
): InlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06 =
    InlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SetupIntentsConfirmPostRequestFormNextBillingXe2a00f06 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
