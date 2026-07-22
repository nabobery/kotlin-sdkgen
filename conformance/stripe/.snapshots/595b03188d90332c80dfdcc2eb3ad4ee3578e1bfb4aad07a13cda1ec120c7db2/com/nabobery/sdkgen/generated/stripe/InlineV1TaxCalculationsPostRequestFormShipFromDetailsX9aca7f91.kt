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
 * Details about the address from which the goods are being shipped.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91(
    public val address: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e,
) {
    public class Builder {
        private var addressValue: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e? =
            null

        public var address: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e
            get() = requireNotNull(addressValue) { "address is required" }
            set(`value`) {
                addressValue = value
            }

        public fun build(): InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91 {
            check(addressValue != null) { "address is required" }
            return InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91(
                address = address,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91 must be a JSON object",
                    )
            val address =
                json.decodeRequired<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e>(
                    rawObject,
                    "address",
                )
            return InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91(
                address = address,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("address", json.encodeToJsonElement(value.address))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91(
    block: InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91.Builder.() -> Unit,
): InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91 =
    InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
