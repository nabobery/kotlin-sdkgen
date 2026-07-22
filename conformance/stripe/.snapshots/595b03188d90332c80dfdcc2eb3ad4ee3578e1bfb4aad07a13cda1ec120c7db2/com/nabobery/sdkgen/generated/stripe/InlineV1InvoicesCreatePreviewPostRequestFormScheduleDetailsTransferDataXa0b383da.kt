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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/transfer_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/transfer_data
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da(
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

        public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da {
            check(destinationValue != null) { "destination is required" }
            return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da(
                destination = destination,
                amountPercent = amountPercent,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da must be a JSON object",
                    )
            val destination = json.decodeRequired<String>(rawObject, "destination")
            return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da(
                destination = destination,
                amountPercent = rawObject["amount_percent"]?.let { json.decodeFromJsonElement<Double>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da",
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

public fun inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da(
    block: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da.Builder.() -> Unit,
): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da =
    InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
