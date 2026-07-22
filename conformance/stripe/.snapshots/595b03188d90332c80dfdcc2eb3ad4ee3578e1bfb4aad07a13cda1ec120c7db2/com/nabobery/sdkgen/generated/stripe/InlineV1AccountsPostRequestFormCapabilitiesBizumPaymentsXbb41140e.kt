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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/capabilities/properties/bizum_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/capabilities/properties/bizum_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e(
    public val requested: Boolean? = null,
) {
    public class Builder {
        public var requested: Boolean? = null

        public fun build(): InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e =
            InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e(
                requested = requested,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e(
                requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e(
    block: InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e =
    InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e.build(block)
