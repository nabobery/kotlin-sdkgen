package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/capabilities/properties/us_bank_account_ach_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/capabilities/properties/us_bank_account_ach_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d(
    public val requested: Boolean? = null,
) {
    public class Builder {
        public var requested: Boolean? = null

        public fun build(): InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d =
            InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d(
                requested = requested,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d(
                requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d(
    block: InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d =
    InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d.build(block)
