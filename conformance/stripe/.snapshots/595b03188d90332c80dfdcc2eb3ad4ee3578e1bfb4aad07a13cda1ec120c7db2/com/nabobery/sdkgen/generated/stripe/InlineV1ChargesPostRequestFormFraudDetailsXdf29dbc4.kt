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
 * A set of key-value pairs you can attach to a charge giving information about its riskiness. If you believe a charge
 * is fraudulent, include a `user_report` key with a value of `fraudulent`. If you believe a charge is safe, include a
 * `user_report` key with a value of `safe`. Stripe will use the information you send to improve our fraud detection
 * algorithms.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/fraud_details
 */
@Serializable(with = InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4.Serializer::class)
public class InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4(
    public val userReport: InlineV1ChargesPostRequestFormFraudDetailsUserReportX9d4f72cd,
) {
    public class Builder {
        private var userReportValue: InlineV1ChargesPostRequestFormFraudDetailsUserReportX9d4f72cd? =
            null

        public var userReport: InlineV1ChargesPostRequestFormFraudDetailsUserReportX9d4f72cd
            get() = requireNotNull(userReportValue) { "userReport is required" }
            set(`value`) {
                userReportValue = value
            }

        public fun build(): InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4 {
            check(userReportValue != null) { "userReport is required" }
            return InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4(
                userReport = userReport,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4 must be a JSON object",
                    )
            val userReport =
                json.decodeRequired<InlineV1ChargesPostRequestFormFraudDetailsUserReportX9d4f72cd>(
                    rawObject,
                    "user_report",
                )
            return InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4(
                userReport = userReport,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("user_report", json.encodeToJsonElement(value.userReport))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4(
    block: InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4.Builder.() -> Unit,
): InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4 =
    InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
