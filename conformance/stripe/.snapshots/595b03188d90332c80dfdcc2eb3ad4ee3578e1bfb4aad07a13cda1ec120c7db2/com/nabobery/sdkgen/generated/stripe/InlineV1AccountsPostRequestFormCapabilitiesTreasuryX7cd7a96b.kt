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
import kotlin.Boolean
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/capabilities/properties/treasury.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/capabilities/properties/treasury
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b(
    public val requested: Boolean? = null,
) {
    public class Builder {
        public var requested: Boolean? = null

        public fun build(): InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b =
            InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b(
                requested = requested,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b(
                requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b(
    block: InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b =
    InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b.build(block)
