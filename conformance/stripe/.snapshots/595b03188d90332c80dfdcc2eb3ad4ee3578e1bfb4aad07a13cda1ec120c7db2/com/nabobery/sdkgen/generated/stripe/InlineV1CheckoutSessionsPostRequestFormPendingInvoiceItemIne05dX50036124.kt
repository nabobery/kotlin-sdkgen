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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/pending_invoice_item_interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/pending_invoice_item_interval
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124(
    public val interval: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataIntervalX50c9dca1,
    public val intervalCount: Int? = null,
) {
    public class Builder {
        private var intervalValue:
            InlineV1CheckoutSessionsPostRequestFormSubscriptionDataIntervalX50c9dca1? = null

        public var interval: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataIntervalX50c9dca1
            get() = requireNotNull(intervalValue) { "interval is required" }
            set(`value`) {
                intervalValue = value
            }

        public var intervalCount: Int? = null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124 {
            check(intervalValue != null) { "interval is required" }
            return InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124(
                interval = interval,
                intervalCount = intervalCount,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124 must be a JSON object",
                    )
            val interval =
                json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataIntervalX50c9dca1>(
                    rawObject,
                    "interval",
                )
            return InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124(
                interval = interval,
                intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("interval", json.encodeToJsonElement(value.interval))
                    value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124(
    block: InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124 =
    InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
