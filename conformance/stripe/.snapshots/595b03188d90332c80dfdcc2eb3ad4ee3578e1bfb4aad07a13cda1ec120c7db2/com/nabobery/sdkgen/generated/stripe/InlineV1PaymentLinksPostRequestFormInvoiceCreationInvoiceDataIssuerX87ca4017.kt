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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/issuer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/issuer
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017(
    public val type: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerTypeX71d52446,
    public val account: String? = null,
) {
    public class Builder {
        private var typeValue:
            InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerTypeX71d52446? = null

        public var type:
            InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerTypeX71d52446
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var account: String? = null

        public fun build(): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017 {
            check(typeValue != null) { "type is required" }
            return InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017(
                type = type,
                account = account,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017 must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerTypeX71d52446>(
                    rawObject,
                    "type",
                )
            return InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017(
                type = type,
                account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017",
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

public fun inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017(
    block: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017.Builder.() -> Unit,
): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017 =
    InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
