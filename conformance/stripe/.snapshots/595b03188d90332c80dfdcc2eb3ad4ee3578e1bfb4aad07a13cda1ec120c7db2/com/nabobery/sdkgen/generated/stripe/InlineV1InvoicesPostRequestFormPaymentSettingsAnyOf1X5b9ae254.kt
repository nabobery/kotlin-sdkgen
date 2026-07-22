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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/installm
 * ents/properties/plan/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/installm
 * ents/properties/plan/anyOf/0
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254(
    public val type: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsTypeXe0d5cdf9,
    public val count: Int? = null,
    public val interval: InlineV1InvoicesPostRequestFormPaymentSettingsIntervalX23f7e446? = null,
) {
    public class Builder {
        private var typeValue:
            InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsTypeXe0d5cdf9? = null

        public var type: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsTypeXe0d5cdf9
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var count: Int? = null

        public var interval: InlineV1InvoicesPostRequestFormPaymentSettingsIntervalX23f7e446? = null

        public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254 {
            check(typeValue != null) { "type is required" }
            return InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254(
                type = type,
                count = count,
                interval = interval,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254 must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsTypeXe0d5cdf9>(
                    rawObject,
                    "type",
                )
            return InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254(
                type = type,
                count = rawObject["count"]?.let { json.decodeFromJsonElement<Int>(it) },
                interval =
                    rawObject["interval"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsIntervalX23f7e446>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.count?.let { put("count", json.encodeToJsonElement(it)) }
                    value.interval?.let { put("interval", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254(
    block: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254.Builder.() -> Unit,
): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254 =
    InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
