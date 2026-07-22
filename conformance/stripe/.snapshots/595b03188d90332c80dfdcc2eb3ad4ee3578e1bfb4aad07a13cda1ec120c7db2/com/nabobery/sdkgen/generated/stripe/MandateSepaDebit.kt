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
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_sepa_debit
 */
@Serializable(with = MandateSepaDebit.Serializer::class)
public class MandateSepaDebit(
    /**
     * The unique reference of the mandate.
     */
    public val reference: String,
    /**
     * The URL of the mandate. This URL generally contains sensitive information about the customer and should be shared
     * with them exclusively.
     */
    public val url: String,
) {
    public class Builder {
        private var referenceValue: String? = null

        public var reference: String
            get() = requireNotNull(referenceValue) { "reference is required" }
            set(`value`) {
                referenceValue = value
            }

        private var urlValue: String? = null

        public var url: String
            get() = requireNotNull(urlValue) { "url is required" }
            set(`value`) {
                urlValue = value
            }

        public fun build(): MandateSepaDebit {
            check(referenceValue != null) { "reference is required" }
            check(urlValue != null) { "url is required" }
            return MandateSepaDebit(
                reference = reference,
                url = url,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): MandateSepaDebit = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<MandateSepaDebit> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): MandateSepaDebit {
            val jsonDecoder = decoder.requireJsonDecoder("MandateSepaDebit")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("MandateSepaDebit must be a JSON object")
            val reference = json.decodeRequired<String>(rawObject, "reference")
            val url = json.decodeRequired<String>(rawObject, "url")
            return MandateSepaDebit(
                reference = reference,
                url = url,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: MandateSepaDebit,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("MandateSepaDebit")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("reference", value.reference)
                    put("url", value.url)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun mandateSepaDebit(block: MandateSepaDebit.Builder.() -> Unit): MandateSepaDebit =
    MandateSepaDebit.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("MandateSepaDebit is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
