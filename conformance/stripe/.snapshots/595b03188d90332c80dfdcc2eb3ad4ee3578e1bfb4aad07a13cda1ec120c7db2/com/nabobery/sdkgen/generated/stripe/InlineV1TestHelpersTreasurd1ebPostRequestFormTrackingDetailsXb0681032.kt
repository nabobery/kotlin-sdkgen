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
 * Details about network-specific tracking information.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_transfers~1{outbound_transfer}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/tracking_details
 */
@Serializable(with = InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032.Serializer::class)
public class InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032(
    public val type: InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsTypeX539facf4,
    public val ach: InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0? = null,
    public val usDomesticWire: InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38? = null,
) {
    public class Builder {
        private var typeValue:
            InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsTypeX539facf4? = null

        public var type: InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsTypeX539facf4
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var ach: InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0? = null

        public var usDomesticWire: InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38? =
            null

        public fun build(): InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032 {
            check(typeValue != null) { "type is required" }
            return InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032(
                type = type,
                ach = ach,
                usDomesticWire = usDomesticWire,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032 must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsTypeX539facf4>(
                    rawObject,
                    "type",
                )
            return InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032(
                type = type,
                ach =
                    rawObject["ach"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0>(
                                it,
                            )
                    },
                usDomesticWire =
                    rawObject["us_domestic_wire"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.ach?.let { put("ach", json.encodeToJsonElement(it)) }
                    value.usDomesticWire?.let { put("us_domestic_wire", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032(
    block: InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032.Builder.() -> Unit,
): InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032 =
    InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsXb0681032 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
