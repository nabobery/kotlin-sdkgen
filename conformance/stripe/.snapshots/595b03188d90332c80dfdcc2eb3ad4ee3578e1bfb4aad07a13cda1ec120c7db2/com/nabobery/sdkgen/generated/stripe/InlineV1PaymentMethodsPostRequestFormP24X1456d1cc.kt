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
import kotlin.Unit

/**
 * If this is a `p24` PaymentMethod, this hash contains details about the P24 payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/p24
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormP24X1456d1cc.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormP24X1456d1cc(
    public val bank: InlineV1PaymentMethodsPostRequestFormP24BankXc67799a3? = null,
) {
    public class Builder {
        public var bank: InlineV1PaymentMethodsPostRequestFormP24BankXc67799a3? = null

        public fun build(): InlineV1PaymentMethodsPostRequestFormP24X1456d1cc =
            InlineV1PaymentMethodsPostRequestFormP24X1456d1cc(
                bank = bank,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormP24X1456d1cc =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormP24X1456d1cc> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormP24X1456d1cc {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormP24X1456d1cc")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodsPostRequestFormP24X1456d1cc must be a JSON object",
                    )
            return InlineV1PaymentMethodsPostRequestFormP24X1456d1cc(
                bank =
                    rawObject["bank"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormP24BankXc67799a3>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodsPostRequestFormP24X1456d1cc,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormP24X1456d1cc")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentMethodsPostRequestFormP24X1456d1cc(
    block: InlineV1PaymentMethodsPostRequestFormP24X1456d1cc.Builder.() -> Unit,
): InlineV1PaymentMethodsPostRequestFormP24X1456d1cc = InlineV1PaymentMethodsPostRequestFormP24X1456d1cc.build(block)
