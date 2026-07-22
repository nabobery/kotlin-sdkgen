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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/15/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/15/schema
 */
@Serializable(with = InlineV1CreditNotesPreviewLinesGetParameterXa428e854.Serializer::class)
public class InlineV1CreditNotesPreviewLinesGetParameterXa428e854(
    public val shippingRate: String? = null,
) {
    public class Builder {
        public var shippingRate: String? = null

        public fun build(): InlineV1CreditNotesPreviewLinesGetParameterXa428e854 =
            InlineV1CreditNotesPreviewLinesGetParameterXa428e854(
                shippingRate = shippingRate,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CreditNotesPreviewLinesGetParameterXa428e854 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CreditNotesPreviewLinesGetParameterXa428e854> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewLinesGetParameterXa428e854 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPreviewLinesGetParameterXa428e854")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CreditNotesPreviewLinesGetParameterXa428e854 must be a JSON object",
                    )
            return InlineV1CreditNotesPreviewLinesGetParameterXa428e854(
                shippingRate = rawObject["shipping_rate"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CreditNotesPreviewLinesGetParameterXa428e854,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1CreditNotesPreviewLinesGetParameterXa428e854")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.shippingRate?.let { put("shipping_rate", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CreditNotesPreviewLinesGetParameterXa428e854(
    block: InlineV1CreditNotesPreviewLinesGetParameterXa428e854.Builder.() -> Unit,
): InlineV1CreditNotesPreviewLinesGetParameterXa428e854 =
    InlineV1CreditNotesPreviewLinesGetParameterXa428e854.build(block)
