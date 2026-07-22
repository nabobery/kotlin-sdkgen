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
 * Behavior after the purchase is complete.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/after_completion
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789(
    public val type: InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXcb71b089,
    public val hostedConfirmation: InlineV1PaymentLinksPostRequestFormAfterCompletionHostedConfirmationX2570fcc6? = null,
    public val redirect: InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897? = null,
) {
    public class Builder {
        private var typeValue: InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXcb71b089? = null

        public var type: InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXcb71b089
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var hostedConfirmation:
            InlineV1PaymentLinksPostRequestFormAfterCompletionHostedConfirmationX2570fcc6? = null

        public var redirect: InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897? = null

        public fun build(): InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789 {
            check(typeValue != null) { "type is required" }
            return InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789(
                type = type,
                hostedConfirmation = hostedConfirmation,
                redirect = redirect,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789 must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXcb71b089>(
                    rawObject,
                    "type",
                )
            return InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789(
                type = type,
                hostedConfirmation =
                    rawObject["hosted_confirmation"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormAfterCompletionHostedConfirmationX2570fcc6>(
                                it,
                            )
                    },
                redirect =
                    rawObject["redirect"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.hostedConfirmation?.let { put("hosted_confirmation", json.encodeToJsonElement(it)) }
                    value.redirect?.let { put("redirect", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789(
    block: InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789.Builder.() -> Unit,
): InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789 =
    InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
