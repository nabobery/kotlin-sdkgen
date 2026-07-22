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
 * The connected account that issues the invoice. The invoice is presented with the branding and support information of
 * the specified account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/issuer
 */
@Serializable(with = InlineV1InvoicesPostRequestFormIssuerX2300e4e9.Serializer::class)
public class InlineV1InvoicesPostRequestFormIssuerX2300e4e9(
    public val type: InlineV1InvoicesPostRequestFormIssuerTypeX44e4ad53,
    public val account: String? = null,
) {
    public class Builder {
        private var typeValue: InlineV1InvoicesPostRequestFormIssuerTypeX44e4ad53? = null

        public var type: InlineV1InvoicesPostRequestFormIssuerTypeX44e4ad53
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var account: String? = null

        public fun build(): InlineV1InvoicesPostRequestFormIssuerX2300e4e9 {
            check(typeValue != null) { "type is required" }
            return InlineV1InvoicesPostRequestFormIssuerX2300e4e9(
                type = type,
                account = account,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormIssuerX2300e4e9 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormIssuerX2300e4e9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormIssuerX2300e4e9 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormIssuerX2300e4e9")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesPostRequestFormIssuerX2300e4e9 must be a JSON object",
                    )
            val type = json.decodeRequired<InlineV1InvoicesPostRequestFormIssuerTypeX44e4ad53>(rawObject, "type")
            return InlineV1InvoicesPostRequestFormIssuerX2300e4e9(
                type = type,
                account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormIssuerX2300e4e9,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormIssuerX2300e4e9")
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

public fun inlineV1InvoicesPostRequestFormIssuerX2300e4e9(
    block: InlineV1InvoicesPostRequestFormIssuerX2300e4e9.Builder.() -> Unit,
): InlineV1InvoicesPostRequestFormIssuerX2300e4e9 = InlineV1InvoicesPostRequestFormIssuerX2300e4e9.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1InvoicesPostRequestFormIssuerX2300e4e9 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
