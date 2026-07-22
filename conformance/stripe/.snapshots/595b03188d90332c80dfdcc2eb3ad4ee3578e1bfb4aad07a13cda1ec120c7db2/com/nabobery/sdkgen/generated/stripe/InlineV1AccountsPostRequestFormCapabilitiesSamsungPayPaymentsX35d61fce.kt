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
 * oded/schema/properties/capabilities/properties/samsung_pay_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/capabilities/properties/samsung_pay_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce(
    public val requested: Boolean? = null,
) {
    public class Builder {
        public var requested: Boolean? = null

        public fun build(): InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce =
            InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce(
                requested = requested,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce(
                requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce",
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

public fun inlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce(
    block: InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce =
    InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce.build(block)
