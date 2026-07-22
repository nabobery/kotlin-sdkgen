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
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/transfer_data/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/transfer_data/anyOf/0
 */
@Serializable(with = InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba.Serializer::class)
public class InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba(
    public val destination: String,
    public val amount: Int? = null,
    public val amountPercent: Double? = null,
) {
    public class Builder {
        private var destinationValue: String? = null

        public var destination: String
            get() = requireNotNull(destinationValue) { "destination is required" }
            set(`value`) {
                destinationValue = value
            }

        public var amount: Int? = null

        public var amountPercent: Double? = null

        public fun build(): InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba {
            check(destinationValue != null) { "destination is required" }
            return InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba(
                destination = destination,
                amount = amount,
                amountPercent = amountPercent,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba must be a JSON object",
                    )
            val destination = json.decodeRequired<String>(rawObject, "destination")
            return InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba(
                destination = destination,
                amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                amountPercent = rawObject["amount_percent"]?.let { json.decodeFromJsonElement<Double>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("destination", value.destination)
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.amountPercent?.let { put("amount_percent", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba(
    block: InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba.Builder.() -> Unit,
): InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba =
    InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
