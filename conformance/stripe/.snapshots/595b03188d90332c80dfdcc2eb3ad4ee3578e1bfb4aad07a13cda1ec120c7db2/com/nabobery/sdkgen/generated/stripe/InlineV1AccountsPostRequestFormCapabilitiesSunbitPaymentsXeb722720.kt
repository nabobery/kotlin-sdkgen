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
 * oded/schema/properties/capabilities/properties/sunbit_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/capabilities/properties/sunbit_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720(
    public val requested: Boolean? = null,
) {
    public class Builder {
        public var requested: Boolean? = null

        public fun build(): InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720 =
            InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720(
                requested = requested,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720 must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720(
                requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720",
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

public fun inlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720(
    block: InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720 =
    InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720.build(block)
