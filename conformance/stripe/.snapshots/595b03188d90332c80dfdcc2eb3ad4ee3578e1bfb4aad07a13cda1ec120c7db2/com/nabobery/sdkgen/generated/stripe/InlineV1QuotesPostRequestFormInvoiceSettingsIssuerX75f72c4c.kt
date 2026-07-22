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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/invoice_settings/properties/issuer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/invoice_settings/properties/issuer
 */
@Serializable(with = InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c.Serializer::class)
public class InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c(
    public val type: InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX61c3643b,
    public val account: String? = null,
) {
    public class Builder {
        private var typeValue: InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX61c3643b? = null

        public var type: InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX61c3643b
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var account: String? = null

        public fun build(): InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c {
            check(typeValue != null) { "type is required" }
            return InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c(
                type = type,
                account = account,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX61c3643b>(
                    rawObject,
                    "type",
                )
            return InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c(
                type = type,
                account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c")
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

public fun inlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c(
    block: InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c.Builder.() -> Unit,
): InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c =
    InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
