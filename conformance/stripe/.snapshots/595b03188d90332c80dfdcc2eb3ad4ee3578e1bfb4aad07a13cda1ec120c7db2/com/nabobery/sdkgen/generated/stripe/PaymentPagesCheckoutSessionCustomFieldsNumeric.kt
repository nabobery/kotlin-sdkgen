package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_custom_fields_numeric
 */
@Serializable(with = PaymentPagesCheckoutSessionCustomFieldsNumeric.Serializer::class)
public class PaymentPagesCheckoutSessionCustomFieldsNumeric(
    /**
     * The value that pre-fills the field on the payment page.
     */
    public val defaultValue: String? = null,
    /**
     * The maximum character length constraint for the customer's input.
     */
    public val maximumLength: Int? = null,
    /**
     * The minimum character length requirement for the customer's input.
     */
    public val minimumLength: Int? = null,
    /**
     * The value entered by the customer, containing only digits.
     */
    public val `value`: String? = null,
) {
    public class Builder {
        /**
         * The value that pre-fills the field on the payment page.
         */
        public var defaultValue: String? = null

        /**
         * The maximum character length constraint for the customer's input.
         */
        public var maximumLength: Int? = null

        /**
         * The minimum character length requirement for the customer's input.
         */
        public var minimumLength: Int? = null

        /**
         * The value entered by the customer, containing only digits.
         */
        public var `value`: String? = null

        public fun build(): PaymentPagesCheckoutSessionCustomFieldsNumeric =
            PaymentPagesCheckoutSessionCustomFieldsNumeric(
                defaultValue = defaultValue,
                maximumLength = maximumLength,
                minimumLength = minimumLength,
                value = value,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionCustomFieldsNumeric =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentPagesCheckoutSessionCustomFieldsNumeric> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionCustomFieldsNumeric {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionCustomFieldsNumeric")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "PaymentPagesCheckoutSessionCustomFieldsNumeric must be a JSON object",
                    )
            return PaymentPagesCheckoutSessionCustomFieldsNumeric(
                defaultValue =
                    rawObject["default_value"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                maximumLength =
                    rawObject["maximum_length"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                minimumLength =
                    rawObject["minimum_length"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                value =
                    rawObject["value"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentPagesCheckoutSessionCustomFieldsNumeric,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionCustomFieldsNumeric")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.defaultValue?.let { put("default_value", it) }
                    value.maximumLength?.let { put("maximum_length", json.encodeToJsonElement(it)) }
                    value.minimumLength?.let { put("minimum_length", json.encodeToJsonElement(it)) }
                    value.value?.let { put("value", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentPagesCheckoutSessionCustomFieldsNumeric(
    block: PaymentPagesCheckoutSessionCustomFieldsNumeric.Builder.() -> Unit,
): PaymentPagesCheckoutSessionCustomFieldsNumeric = PaymentPagesCheckoutSessionCustomFieldsNumeric.build(block)
