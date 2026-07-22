package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/collected_information/properties/shipping_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/collected_information/properties/shipping_details
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f(
    public val address: InlineV1CheckoutSessionsPostRequestFormCollectedInformationAddressX848524ce,
    public val name: String,
) {
    public class Builder {
        private var addressValue:
            InlineV1CheckoutSessionsPostRequestFormCollectedInformationAddressX848524ce? = null

        public var address: InlineV1CheckoutSessionsPostRequestFormCollectedInformationAddressX848524ce
            get() = requireNotNull(addressValue) { "address is required" }
            set(`value`) {
                addressValue = value
            }

        private var nameValue: String? = null

        public var name: String
            get() = requireNotNull(nameValue) { "name is required" }
            set(`value`) {
                nameValue = value
            }

        public fun build(): InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f {
            check(addressValue != null) { "address is required" }
            check(nameValue != null) { "name is required" }
            return InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f(
                address = address,
                name = name,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f must be a JSON object",
                    )
            val address =
                json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormCollectedInformationAddressX848524ce>(
                    rawObject,
                    "address",
                )
            val name = json.decodeRequired<String>(rawObject, "name")
            return InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f(
                address = address,
                name = name,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("address", json.encodeToJsonElement(value.address))
                    put("name", value.name)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f(
    block: InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f =
    InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
