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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/controller/properties/fees.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/controller/properties/fees
 */
@Serializable(with = InlineV1AccountsPostRequestFormControllerFeesXd56bd08a.Serializer::class)
public class InlineV1AccountsPostRequestFormControllerFeesXd56bd08a(
    public val payer: InlineV1AccountsPostRequestFormControllerFeesPayerXa7287fe0? = null,
) {
    public class Builder {
        public var payer: InlineV1AccountsPostRequestFormControllerFeesPayerXa7287fe0? = null

        public fun build(): InlineV1AccountsPostRequestFormControllerFeesXd56bd08a =
            InlineV1AccountsPostRequestFormControllerFeesXd56bd08a(
                payer = payer,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormControllerFeesXd56bd08a =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormControllerFeesXd56bd08a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormControllerFeesXd56bd08a {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormControllerFeesXd56bd08a")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormControllerFeesXd56bd08a must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormControllerFeesXd56bd08a(
                payer =
                    rawObject["payer"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormControllerFeesPayerXa7287fe0>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormControllerFeesXd56bd08a,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormControllerFeesXd56bd08a")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.payer?.let { put("payer", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPostRequestFormControllerFeesXd56bd08a(
    block: InlineV1AccountsPostRequestFormControllerFeesXd56bd08a.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormControllerFeesXd56bd08a =
    InlineV1AccountsPostRequestFormControllerFeesXd56bd08a.build(block)
