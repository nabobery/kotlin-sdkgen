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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Details about the Client Device Metadata to associate with the payment evaluation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/client_device_metadata_details
 */
@Serializable(with = InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348.Serializer::class)
public class InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348(
    public val radarSession: String,
) {
    public class Builder {
        private var radarSessionValue: String? = null

        public var radarSession: String
            get() = requireNotNull(radarSessionValue) { "radarSession is required" }
            set(`value`) {
                radarSessionValue = value
            }

        public fun build(): InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348 {
            check(radarSessionValue != null) { "radarSession is required" }
            return InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348(
                radarSession = radarSession,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348 must be a JSON object",
                    )
            val radarSession = json.decodeRequired<String>(rawObject, "radar_session")
            return InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348(
                radarSession = radarSession,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("radar_session", value.radarSession)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348(
    block: InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348.Builder.() -> Unit,
): InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348 =
    InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
