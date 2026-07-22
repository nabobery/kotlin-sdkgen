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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_au_becs_debit
 */
@Serializable(with = MandateAuBecsDebit.Serializer::class)
public class MandateAuBecsDebit(
    /**
     * The URL of the mandate. This URL generally contains sensitive information about the customer and should be shared
     * with them exclusively.
     */
    public val url: String,
) {
    public class Builder {
        private var urlValue: String? = null

        public var url: String
            get() = requireNotNull(urlValue) { "url is required" }
            set(`value`) {
                urlValue = value
            }

        public fun build(): MandateAuBecsDebit {
            check(urlValue != null) { "url is required" }
            return MandateAuBecsDebit(
                url = url,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): MandateAuBecsDebit = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<MandateAuBecsDebit> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): MandateAuBecsDebit {
            val jsonDecoder = decoder.requireJsonDecoder("MandateAuBecsDebit")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("MandateAuBecsDebit must be a JSON object")
            val url = json.decodeRequired<String>(rawObject, "url")
            return MandateAuBecsDebit(
                url = url,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: MandateAuBecsDebit,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("MandateAuBecsDebit")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("url", value.url)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun mandateAuBecsDebit(block: MandateAuBecsDebit.Builder.() -> Unit): MandateAuBecsDebit =
    MandateAuBecsDebit.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("MandateAuBecsDebit is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
