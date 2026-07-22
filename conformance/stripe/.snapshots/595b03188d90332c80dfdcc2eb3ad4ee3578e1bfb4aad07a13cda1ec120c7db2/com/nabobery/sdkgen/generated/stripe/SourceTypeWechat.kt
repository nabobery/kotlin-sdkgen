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
 * Generated model for sdkgen://source/openapi.json#/components/schemas/source_type_wechat.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_type_wechat
 */
@Serializable(with = SourceTypeWechat.Serializer::class)
public class SourceTypeWechat(
    public val prepayId: String? = null,
    public val qrCodeUrl: String? = null,
    public val statementDescriptor: String? = null,
) {
    public class Builder {
        public var prepayId: String? = null

        public var qrCodeUrl: String? = null

        public var statementDescriptor: String? = null

        public fun build(): SourceTypeWechat =
            SourceTypeWechat(
                prepayId = prepayId,
                qrCodeUrl = qrCodeUrl,
                statementDescriptor = statementDescriptor,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SourceTypeWechat = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SourceTypeWechat> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SourceTypeWechat {
            val jsonDecoder = decoder.requireJsonDecoder("SourceTypeWechat")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SourceTypeWechat must be a JSON object")
            return SourceTypeWechat(
                prepayId = rawObject["prepay_id"]?.let { json.decodeFromJsonElement<String>(it) },
                qrCodeUrl =
                    rawObject["qr_code_url"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SourceTypeWechat,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SourceTypeWechat")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.prepayId?.let { put("prepay_id", it) }
                    value.qrCodeUrl?.let { put("qr_code_url", it) }
                    value.statementDescriptor?.let { put("statement_descriptor", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun sourceTypeWechat(block: SourceTypeWechat.Builder.() -> Unit): SourceTypeWechat =
    SourceTypeWechat.build(block)
