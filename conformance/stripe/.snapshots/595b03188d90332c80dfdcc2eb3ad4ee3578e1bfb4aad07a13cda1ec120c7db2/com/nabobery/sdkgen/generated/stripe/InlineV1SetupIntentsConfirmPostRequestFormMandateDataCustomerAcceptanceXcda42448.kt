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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/mandate_data/anyOf/2/properties/customer_acceptance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/mandate_data/anyOf/2/properties/customer_acceptance
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448(
    public val online: InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86,
    public val type: InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3TypeXba61096f,
) {
    public class Builder {
        private var onlineValue:
            InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86? = null

        public var online: InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86
            get() = requireNotNull(onlineValue) { "online is required" }
            set(`value`) {
                onlineValue = value
            }

        private var typeValue: InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3TypeXba61096f? =
            null

        public var type: InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3TypeXba61096f
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public fun build(): InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448 {
            check(onlineValue != null) { "online is required" }
            check(typeValue != null) { "type is required" }
            return InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448(
                online = online,
                type = type,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448 must be a JSON object",
                    )
            val online =
                json.decodeRequired<InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86>(
                    rawObject,
                    "online",
                )
            val type =
                json.decodeRequired<InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3TypeXba61096f>(
                    rawObject,
                    "type",
                )
            return InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448(
                online = online,
                type = type,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("online", json.encodeToJsonElement(value.online))
                    put("type", json.encodeToJsonElement(value.type))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448(
    block: InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448.Builder.() -> Unit,
): InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448 =
    InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
