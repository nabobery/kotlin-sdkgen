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
import kotlin.Unit

@Serializable
public data class CustomUnitAmountView(
    public val maximum: Int? = null,
    public val minimum: Int? = null,
    public val preset: Int? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/custom_unit_amount
 */
@Serializable(with = CustomUnitAmount.Serializer::class)
public class CustomUnitAmount(
    /**
     * The maximum unit amount the customer can specify for this item.
     */
    public val maximum: Int? = null,
    /**
     * The minimum unit amount the customer can specify for this item. Must be at least the minimum charge amount.
     */
    public val minimum: Int? = null,
    /**
     * The starting unit amount which can be updated by the customer.
     */
    public val preset: Int? = null,
) {
    public class Builder {
        /**
         * The maximum unit amount the customer can specify for this item.
         */
        public var maximum: Int? = null

        /**
         * The minimum unit amount the customer can specify for this item. Must be at least the minimum charge amount.
         */
        public var minimum: Int? = null

        /**
         * The starting unit amount which can be updated by the customer.
         */
        public var preset: Int? = null

        public fun build(): CustomUnitAmount =
            CustomUnitAmount(
                maximum = maximum,
                minimum = minimum,
                preset = preset,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): CustomUnitAmount = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CustomUnitAmount> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): CustomUnitAmount {
            val jsonDecoder = decoder.requireJsonDecoder("CustomUnitAmount")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("CustomUnitAmount must be a JSON object")
            return CustomUnitAmount(
                maximum =
                    rawObject["maximum"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                minimum =
                    rawObject["minimum"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                preset =
                    rawObject["preset"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: CustomUnitAmount,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("CustomUnitAmount")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.maximum?.let { put("maximum", json.encodeToJsonElement(it)) }
                    value.minimum?.let { put("minimum", json.encodeToJsonElement(it)) }
                    value.preset?.let { put("preset", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun customUnitAmount(block: CustomUnitAmount.Builder.() -> Unit): CustomUnitAmount =
    CustomUnitAmount.build(block)
