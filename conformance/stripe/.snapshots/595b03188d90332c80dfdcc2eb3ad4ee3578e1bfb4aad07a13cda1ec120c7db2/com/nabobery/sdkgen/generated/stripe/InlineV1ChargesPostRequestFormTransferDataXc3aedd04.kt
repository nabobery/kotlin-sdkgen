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
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * An optional dictionary including the account to automatically transfer to as part of a destination charge. [See the
 * Connect documentation](https://docs.stripe.com/connect/destination-charges) for details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/transfer_data
 */
@Serializable(with = InlineV1ChargesPostRequestFormTransferDataXc3aedd04.Serializer::class)
public class InlineV1ChargesPostRequestFormTransferDataXc3aedd04(
    public val destination: String,
    public val amount: Int? = null,
    public val description: String? = null,
) {
    public class Builder {
        private var destinationValue: String? = null

        public var destination: String
            get() = requireNotNull(destinationValue) { "destination is required" }
            set(`value`) {
                destinationValue = value
            }

        public var amount: Int? = null

        public var description: String? = null

        public fun build(): InlineV1ChargesPostRequestFormTransferDataXc3aedd04 {
            check(destinationValue != null) { "destination is required" }
            return InlineV1ChargesPostRequestFormTransferDataXc3aedd04(
                destination = destination,
                amount = amount,
                description = description,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1ChargesPostRequestFormTransferDataXc3aedd04 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1ChargesPostRequestFormTransferDataXc3aedd04> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ChargesPostRequestFormTransferDataXc3aedd04 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesPostRequestFormTransferDataXc3aedd04")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1ChargesPostRequestFormTransferDataXc3aedd04 must be a JSON object",
                    )
            val destination = json.decodeRequired<String>(rawObject, "destination")
            return InlineV1ChargesPostRequestFormTransferDataXc3aedd04(
                destination = destination,
                amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ChargesPostRequestFormTransferDataXc3aedd04,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesPostRequestFormTransferDataXc3aedd04")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("destination", value.destination)
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1ChargesPostRequestFormTransferDataXc3aedd04(
    block: InlineV1ChargesPostRequestFormTransferDataXc3aedd04.Builder.() -> Unit,
): InlineV1ChargesPostRequestFormTransferDataXc3aedd04 =
    InlineV1ChargesPostRequestFormTransferDataXc3aedd04.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1ChargesPostRequestFormTransferDataXc3aedd04 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
