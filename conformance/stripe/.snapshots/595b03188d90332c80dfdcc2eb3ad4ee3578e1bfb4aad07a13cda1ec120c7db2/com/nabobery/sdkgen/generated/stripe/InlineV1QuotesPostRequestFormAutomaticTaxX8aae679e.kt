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
 * Settings for automatic tax lookup for this quote and resulting invoices and subscriptions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/automatic_tax
 */
@Serializable(with = InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e.Serializer::class)
public class InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e(
    public val enabled: Boolean,
    public val liability: InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108? = null,
) {
    public class Builder {
        private var enabledValue: Boolean? = null

        public var enabled: Boolean
            get() = requireNotNull(enabledValue) { "enabled is required" }
            set(`value`) {
                enabledValue = value
            }

        public var liability: InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108? = null

        public fun build(): InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e {
            check(enabledValue != null) { "enabled is required" }
            return InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e(
                enabled = enabled,
                liability = liability,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e must be a JSON object",
                    )
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            return InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e(
                enabled = enabled,
                liability =
                    rawObject["liability"]?.let {
                        json.decodeFromJsonElement<InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("enabled", json.encodeToJsonElement(value.enabled))
                    value.liability?.let { put("liability", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1QuotesPostRequestFormAutomaticTaxX8aae679e(
    block: InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e.Builder.() -> Unit,
): InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e = InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
