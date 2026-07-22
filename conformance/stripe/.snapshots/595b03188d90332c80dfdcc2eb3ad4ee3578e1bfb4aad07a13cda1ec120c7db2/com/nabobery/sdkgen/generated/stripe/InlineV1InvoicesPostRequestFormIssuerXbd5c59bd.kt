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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/issuer
 */
@Serializable(with = InlineV1InvoicesPostRequestFormIssuerXbd5c59bd.Serializer::class)
public class InlineV1InvoicesPostRequestFormIssuerXbd5c59bd(
    public val type: InlineV1InvoicesPostRequestFormIssuerTypeXb6b5b1e6,
    public val account: String? = null,
) {
    public class Builder {
        private var typeValue: InlineV1InvoicesPostRequestFormIssuerTypeXb6b5b1e6? = null

        public var type: InlineV1InvoicesPostRequestFormIssuerTypeXb6b5b1e6
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var account: String? = null

        public fun build(): InlineV1InvoicesPostRequestFormIssuerXbd5c59bd {
            check(typeValue != null) { "type is required" }
            return InlineV1InvoicesPostRequestFormIssuerXbd5c59bd(
                type = type,
                account = account,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormIssuerXbd5c59bd =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormIssuerXbd5c59bd> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormIssuerXbd5c59bd {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormIssuerXbd5c59bd")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesPostRequestFormIssuerXbd5c59bd must be a JSON object",
                    )
            val type = json.decodeRequired<InlineV1InvoicesPostRequestFormIssuerTypeXb6b5b1e6>(rawObject, "type")
            return InlineV1InvoicesPostRequestFormIssuerXbd5c59bd(
                type = type,
                account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormIssuerXbd5c59bd,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormIssuerXbd5c59bd")
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

public fun inlineV1InvoicesPostRequestFormIssuerXbd5c59bd(
    block: InlineV1InvoicesPostRequestFormIssuerXbd5c59bd.Builder.() -> Unit,
): InlineV1InvoicesPostRequestFormIssuerXbd5c59bd = InlineV1InvoicesPostRequestFormIssuerXbd5c59bd.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1InvoicesPostRequestFormIssuerXbd5c59bd is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
