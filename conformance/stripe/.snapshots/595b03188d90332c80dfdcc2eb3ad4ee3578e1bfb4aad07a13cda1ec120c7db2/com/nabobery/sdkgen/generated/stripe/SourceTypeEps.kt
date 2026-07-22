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
 * Generated model for sdkgen://source/openapi.json#/components/schemas/source_type_eps.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_type_eps
 */
@Serializable(with = SourceTypeEps.Serializer::class)
public class SourceTypeEps(
    public val reference: String? = null,
    public val statementDescriptor: String? = null,
) {
    public class Builder {
        public var reference: String? = null

        public var statementDescriptor: String? = null

        public fun build(): SourceTypeEps =
            SourceTypeEps(
                reference = reference,
                statementDescriptor = statementDescriptor,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SourceTypeEps = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SourceTypeEps> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SourceTypeEps {
            val jsonDecoder = decoder.requireJsonDecoder("SourceTypeEps")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SourceTypeEps must be a JSON object")
            return SourceTypeEps(
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
                statementDescriptor =
                    rawObject["statement_descriptor"]?.let { element ->
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
            `value`: SourceTypeEps,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SourceTypeEps")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.reference?.let { put("reference", it) }
                    value.statementDescriptor?.let { put("statement_descriptor", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun sourceTypeEps(block: SourceTypeEps.Builder.() -> Unit): SourceTypeEps = SourceTypeEps.build(block)
