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
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1finalize_amount/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema/properties/fleet/properties/cardholder_prompt_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1finalize_amount/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema/properties/fleet/properties/cardholder_prompt_data
 */
@Serializable(with = InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396.Serializer::class)
public class InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396(
    public val driverId: String? = null,
    public val odometer: Int? = null,
    public val unspecifiedId: String? = null,
    public val userId: String? = null,
    public val vehicleNumber: String? = null,
) {
    public class Builder {
        public var driverId: String? = null

        public var odometer: Int? = null

        public var unspecifiedId: String? = null

        public var userId: String? = null

        public var vehicleNumber: String? = null

        public fun build(): InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396 =
            InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396(
                driverId = driverId,
                odometer = odometer,
                unspecifiedId = unspecifiedId,
                userId = userId,
                vehicleNumber = vehicleNumber,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396 must be a JSON object",
                    )
            return InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396(
                driverId = rawObject["driver_id"]?.let { json.decodeFromJsonElement<String>(it) },
                odometer = rawObject["odometer"]?.let { json.decodeFromJsonElement<Int>(it) },
                unspecifiedId = rawObject["unspecified_id"]?.let { json.decodeFromJsonElement<String>(it) },
                userId = rawObject["user_id"]?.let { json.decodeFromJsonElement<String>(it) },
                vehicleNumber = rawObject["vehicle_number"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.driverId?.let { put("driver_id", it) }
                    value.odometer?.let { put("odometer", json.encodeToJsonElement(it)) }
                    value.unspecifiedId?.let { put("unspecified_id", it) }
                    value.userId?.let { put("user_id", it) }
                    value.vehicleNumber?.let { put("vehicle_number", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396(
    block: InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396.Builder.() -> Unit,
): InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396 =
    InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396.build(block)
