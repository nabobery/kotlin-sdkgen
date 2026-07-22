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
import kotlin.Int
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/lodging.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/lodging
 */
@Serializable(with = InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8.Serializer::class)
public class InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8(
    public val checkInAt: Int? = null,
    public val nights: Int? = null,
) {
    public class Builder {
        public var checkInAt: Int? = null

        public var nights: Int? = null

        public fun build(): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8 =
            InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8(
                checkInAt = checkInAt,
                nights = nights,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8 must be a JSON object",
                    )
            return InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8(
                checkInAt = rawObject["check_in_at"]?.let { json.decodeFromJsonElement<Int>(it) },
                nights = rawObject["nights"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.checkInAt?.let { put("check_in_at", json.encodeToJsonElement(it)) }
                    value.nights?.let { put("nights", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8(
    block: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8.Builder.() -> Unit,
): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8 =
    InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8.build(block)
