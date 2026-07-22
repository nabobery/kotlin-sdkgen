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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/automatic_tax/properties/liability.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/automatic_tax/properties/liability
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610(
    public val type: InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityTypeXa6a681e8,
    public val account: String? = null,
) {
    public class Builder {
        private var typeValue:
            InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityTypeXa6a681e8? = null

        public var type: InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityTypeXa6a681e8
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var account: String? = null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610 {
            check(typeValue != null) { "type is required" }
            return InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610(
                type = type,
                account = account,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610 must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityTypeXa6a681e8>(
                    rawObject,
                    "type",
                )
            return InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610(
                type = type,
                account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.account?.let { put("account", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610(
    block: InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610 =
    InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX0ba4b610 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
