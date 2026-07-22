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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_payments~1{id}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/tracking_details/properties/us_domestic_wire.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_payments~1{id}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/tracking_details/properties/us_domestic_wire
 */
@Serializable(with = InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c.Serializer::class)
public class InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c(
    public val chips: String? = null,
    public val imad: String? = null,
    public val omad: String? = null,
) {
    public class Builder {
        public var chips: String? = null

        public var imad: String? = null

        public var omad: String? = null

        public fun build(): InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c =
            InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c(
                chips = chips,
                imad = imad,
                omad = omad,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c must be a JSON object",
                    )
            return InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c(
                chips = rawObject["chips"]?.let { json.decodeFromJsonElement<String>(it) },
                imad = rawObject["imad"]?.let { json.decodeFromJsonElement<String>(it) },
                omad = rawObject["omad"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.chips?.let { put("chips", it) }
                    value.imad?.let { put("imad", it) }
                    value.omad?.let { put("omad", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c(
    block: InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c.Builder.() -> Unit,
): InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c =
    InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c.build(block)
