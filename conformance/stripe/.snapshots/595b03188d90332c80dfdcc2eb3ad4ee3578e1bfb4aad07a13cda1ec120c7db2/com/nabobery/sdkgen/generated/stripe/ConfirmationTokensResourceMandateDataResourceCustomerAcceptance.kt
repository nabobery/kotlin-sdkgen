package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * This hash contains details about the customer acceptance of the Mandate.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/confirmation_tokens_resource_mandate_data_resource_customer_acceptan
 * ce
 */
@Serializable(with = ConfirmationTokensResourceMandateDataResourceCustomerAcceptance.Serializer::class)
public class ConfirmationTokensResourceMandateDataResourceCustomerAcceptance(
    /**
     * The type of customer acceptance information included with the Mandate.
     */
    public val type: String,
    /**
     * If this is a Mandate accepted online, this hash contains details about the online acceptance.
     */
    public val online: InlineConfirmationTokensRe6486OnlineXa9b18f1e? = null,
) {
    public class Builder {
        private var typeValue: String? = null

        public var type: String
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        /**
         * If this is a Mandate accepted online, this hash contains details about the online acceptance.
         */
        public var online: InlineConfirmationTokensRe6486OnlineXa9b18f1e? = null

        public fun build(): ConfirmationTokensResourceMandateDataResourceCustomerAcceptance {
            check(typeValue != null) { "type is required" }
            return ConfirmationTokensResourceMandateDataResourceCustomerAcceptance(
                type = type,
                online = online,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ConfirmationTokensResourceMandateDataResourceCustomerAcceptance =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ConfirmationTokensResourceMandateDataResourceCustomerAcceptance> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ConfirmationTokensResourceMandateDataResourceCustomerAcceptance {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "ConfirmationTokensResourceMandateDataResourceCustomerAcceptance",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "ConfirmationTokensResourceMandateDataResourceCustomerAcceptance must be a JSON object",
                    )
            val type = json.decodeRequired<String>(rawObject, "type")
            return ConfirmationTokensResourceMandateDataResourceCustomerAcceptance(
                type = type,
                online =
                    rawObject["online"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineConfirmationTokensRe6486OnlineXa9b18f1e?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: ConfirmationTokensResourceMandateDataResourceCustomerAcceptance,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "ConfirmationTokensResourceMandateDataResourceCustomerAcceptance",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", value.type)
                    value.online?.let { put("online", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun confirmationTokensResourceMandateDataResourceCustomerAcceptance(
    block: ConfirmationTokensResourceMandateDataResourceCustomerAcceptance.Builder.() -> Unit,
): ConfirmationTokensResourceMandateDataResourceCustomerAcceptance =
    ConfirmationTokensResourceMandateDataResourceCustomerAcceptance.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "ConfirmationTokensResourceMandateDataResourceCustomerAcceptance is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
