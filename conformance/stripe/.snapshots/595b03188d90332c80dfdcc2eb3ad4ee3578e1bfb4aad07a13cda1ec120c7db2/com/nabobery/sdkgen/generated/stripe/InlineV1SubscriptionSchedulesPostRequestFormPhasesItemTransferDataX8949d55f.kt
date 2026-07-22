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
import kotlin.Double
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/transfer_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/transfer_data
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f(
    public val destination: String,
    public val amountPercent: Double? = null,
) {
    public class Builder {
        private var destinationValue: String? = null

        public var destination: String
            get() = requireNotNull(destinationValue) { "destination is required" }
            set(`value`) {
                destinationValue = value
            }

        public var amountPercent: Double? = null

        public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f {
            check(destinationValue != null) { "destination is required" }
            return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f(
                destination = destination,
                amountPercent = amountPercent,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f must be a JSON object",
                    )
            val destination = json.decodeRequired<String>(rawObject, "destination")
            return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f(
                destination = destination,
                amountPercent = rawObject["amount_percent"]?.let { json.decodeFromJsonElement<Double>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("destination", value.destination)
                    value.amountPercent?.let { put("amount_percent", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f(
    block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f.Builder.() -> Unit,
): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f =
    InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
