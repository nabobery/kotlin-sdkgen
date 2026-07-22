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
 * /properties/capabilities/properties/india_international_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/capabilities/properties/india_international_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930(
    public val requested: Boolean? = null,
) {
    public class Builder {
        public var requested: Boolean? = null

        public fun build(): InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930 =
            InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930(
                requested = requested,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930 must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930(
                requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930",
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

public fun inlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930(
    block: InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930 =
    InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930.build(block)
