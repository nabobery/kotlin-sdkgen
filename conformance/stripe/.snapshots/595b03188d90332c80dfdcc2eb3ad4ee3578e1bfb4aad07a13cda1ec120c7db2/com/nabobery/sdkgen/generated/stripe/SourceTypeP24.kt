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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for sdkgen://source/openapi.json#/components/schemas/source_type_p24.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_type_p24
 */
@Serializable(with = SourceTypeP24.Serializer::class)
public class SourceTypeP24(
    public val reference: String? = null,
) {
    public class Builder {
        public var reference: String? = null

        public fun build(): SourceTypeP24 =
            SourceTypeP24(
                reference = reference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SourceTypeP24 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SourceTypeP24> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SourceTypeP24 {
            val jsonDecoder = decoder.requireJsonDecoder("SourceTypeP24")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SourceTypeP24 must be a JSON object")
            return SourceTypeP24(
                reference =
                    rawObject["reference"]?.let { element ->
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
            `value`: SourceTypeP24,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SourceTypeP24")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.reference?.let { put("reference", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun sourceTypeP24(block: SourceTypeP24.Builder.() -> Unit): SourceTypeP24 = SourceTypeP24.build(block)
