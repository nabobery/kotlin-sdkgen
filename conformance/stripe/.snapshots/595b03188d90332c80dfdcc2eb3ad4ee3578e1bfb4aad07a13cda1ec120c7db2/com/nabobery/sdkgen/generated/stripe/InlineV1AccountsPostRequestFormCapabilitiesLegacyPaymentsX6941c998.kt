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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/capabilities/properties/legacy_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/capabilities/properties/legacy_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998(
    public val requested: Boolean? = null,
) {
    public class Builder {
        public var requested: Boolean? = null

        public fun build(): InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998 =
            InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998(
                requested = requested,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998 must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998(
                requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998",
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

public fun inlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998(
    block: InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998 =
    InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998.build(block)
