package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class InvoicesResourceConfirmationSecretView(
    @SerialName("client_secret")
    public val clientSecret: String,
    public val type: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_resource_confirmation_secret
 */
@Serializable(with = InvoicesResourceConfirmationSecret.Serializer::class)
public class InvoicesResourceConfirmationSecret(
    /**
     * The client_secret of the payment that Stripe creates for the invoice after finalization.
     */
    public val clientSecret: String,
    /**
     * The type of client_secret. Currently this is always payment_intent, referencing the default payment_intent that
     * Stripe creates during invoice finalization
     */
    public val type: String,
) {
    public class Builder {
        private var clientSecretValue: String? = null

        public var clientSecret: String
            get() = requireNotNull(clientSecretValue) { "clientSecret is required" }
            set(`value`) {
                clientSecretValue = value
            }

        private var typeValue: String? = null

        public var type: String
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public fun build(): InvoicesResourceConfirmationSecret {
            check(clientSecretValue != null) { "clientSecret is required" }
            check(typeValue != null) { "type is required" }
            return InvoicesResourceConfirmationSecret(
                clientSecret = clientSecret,
                type = type,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InvoicesResourceConfirmationSecret = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InvoicesResourceConfirmationSecret> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InvoicesResourceConfirmationSecret {
            val jsonDecoder = decoder.requireJsonDecoder("InvoicesResourceConfirmationSecret")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InvoicesResourceConfirmationSecret must be a JSON object")
            val clientSecret = json.decodeRequired<String>(rawObject, "client_secret")
            val type = json.decodeRequired<String>(rawObject, "type")
            return InvoicesResourceConfirmationSecret(
                clientSecret = clientSecret,
                type = type,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InvoicesResourceConfirmationSecret,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InvoicesResourceConfirmationSecret")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("client_secret", value.clientSecret)
                    put("type", value.type)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun invoicesResourceConfirmationSecret(
    block: InvoicesResourceConfirmationSecret.Builder.() -> Unit,
): InvoicesResourceConfirmationSecret = InvoicesResourceConfirmationSecret.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InvoicesResourceConfirmationSecret is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
