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
 * Configuration for automatic tax collection.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/automatic_tax
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661(
    public val enabled: Boolean,
    public val liability: InlineV1PaymentLinksPostRequestFormAutomaticTaxLiabilityX9b960969? = null,
) {
    public class Builder {
        private var enabledValue: Boolean? = null

        public var enabled: Boolean
            get() = requireNotNull(enabledValue) { "enabled is required" }
            set(`value`) {
                enabledValue = value
            }

        public var liability: InlineV1PaymentLinksPostRequestFormAutomaticTaxLiabilityX9b960969? = null

        public fun build(): InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661 {
            check(enabledValue != null) { "enabled is required" }
            return InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661(
                enabled = enabled,
                liability = liability,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661 must be a JSON object",
                    )
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            return InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661(
                enabled = enabled,
                liability =
                    rawObject["liability"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormAutomaticTaxLiabilityX9b960969>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661")
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

public fun inlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661(
    block: InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661.Builder.() -> Unit,
): InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661 =
    InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
