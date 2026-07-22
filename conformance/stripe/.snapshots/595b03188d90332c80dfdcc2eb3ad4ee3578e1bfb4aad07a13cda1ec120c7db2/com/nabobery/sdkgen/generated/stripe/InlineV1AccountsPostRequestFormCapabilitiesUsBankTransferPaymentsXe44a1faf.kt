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
 * /properties/capabilities/properties/us_bank_transfer_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/capabilities/properties/us_bank_transfer_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf(
    public val requested: Boolean? = null,
) {
    public class Builder {
        public var requested: Boolean? = null

        public fun build(): InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf =
            InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf(
                requested = requested,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf(
                requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf",
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

public fun inlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf(
    block: InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf =
    InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf.build(block)
