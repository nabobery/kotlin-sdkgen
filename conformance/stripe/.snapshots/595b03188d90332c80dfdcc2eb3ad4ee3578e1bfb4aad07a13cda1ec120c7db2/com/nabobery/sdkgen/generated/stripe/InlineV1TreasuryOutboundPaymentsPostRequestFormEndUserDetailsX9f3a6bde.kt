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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * End user details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/end_user_details
 */
@Serializable(with = InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde.Serializer::class)
public class InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde(
    public val present: Boolean,
    public val ipAddress: String? = null,
) {
    public class Builder {
        private var presentValue: Boolean? = null

        public var present: Boolean
            get() = requireNotNull(presentValue) { "present is required" }
            set(`value`) {
                presentValue = value
            }

        public var ipAddress: String? = null

        public fun build(): InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde {
            check(presentValue != null) { "present is required" }
            return InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde(
                present = present,
                ipAddress = ipAddress,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde must be a JSON object",
                    )
            val present = json.decodeRequired<Boolean>(rawObject, "present")
            return InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde(
                present = present,
                ipAddress = rawObject["ip_address"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("present", json.encodeToJsonElement(value.present))
                    value.ipAddress?.let { put("ip_address", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde(
    block: InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde.Builder.() -> Unit,
): InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde =
    InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
