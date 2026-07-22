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
import kotlin.String
import kotlin.Unit

/**
 * Generated model for sdkgen://source/openapi.json#/paths/~1v1~1prices/get/parameters/8/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1prices/get/parameters/8/schema
 */
@Serializable(with = InlineV1PricesGetParameterX3bd64ecd.Serializer::class)
public class InlineV1PricesGetParameterX3bd64ecd(
    public val interval: InlineV1PricesGetParameterIntervalX75e88b2e? = null,
    public val meter: String? = null,
    public val usageType: InlineV1PricesGetParameterUsageTypeX4f7514a1? = null,
) {
    public class Builder {
        public var interval: InlineV1PricesGetParameterIntervalX75e88b2e? = null

        public var meter: String? = null

        public var usageType: InlineV1PricesGetParameterUsageTypeX4f7514a1? = null

        public fun build(): InlineV1PricesGetParameterX3bd64ecd =
            InlineV1PricesGetParameterX3bd64ecd(
                interval = interval,
                meter = meter,
                usageType = usageType,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PricesGetParameterX3bd64ecd =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PricesGetParameterX3bd64ecd> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PricesGetParameterX3bd64ecd {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PricesGetParameterX3bd64ecd")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InlineV1PricesGetParameterX3bd64ecd must be a JSON object")
            return InlineV1PricesGetParameterX3bd64ecd(
                interval =
                    rawObject["interval"]?.let {
                        json.decodeFromJsonElement<InlineV1PricesGetParameterIntervalX75e88b2e>(
                            it,
                        )
                    },
                meter = rawObject["meter"]?.let { json.decodeFromJsonElement<String>(it) },
                usageType =
                    rawObject["usage_type"]?.let {
                        json.decodeFromJsonElement<InlineV1PricesGetParameterUsageTypeX4f7514a1>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PricesGetParameterX3bd64ecd,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PricesGetParameterX3bd64ecd")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.interval?.let { put("interval", json.encodeToJsonElement(it)) }
                    value.meter?.let { put("meter", it) }
                    value.usageType?.let { put("usage_type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PricesGetParameterX3bd64ecd(
    block: InlineV1PricesGetParameterX3bd64ecd.Builder.() -> Unit,
): InlineV1PricesGetParameterX3bd64ecd = InlineV1PricesGetParameterX3bd64ecd.build(block)
