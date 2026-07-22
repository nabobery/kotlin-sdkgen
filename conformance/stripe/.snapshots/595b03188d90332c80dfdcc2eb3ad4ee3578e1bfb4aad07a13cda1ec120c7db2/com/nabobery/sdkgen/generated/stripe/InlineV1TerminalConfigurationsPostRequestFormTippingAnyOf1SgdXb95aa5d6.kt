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
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/tipping/anyOf/0/properties/sgd.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/tipping/anyOf/0/properties/sgd
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6(
    public val fixedAmounts: List<Int>? = null,
    public val percentages: List<Int>? = null,
    public val smartTipThreshold: Int? = null,
) {
    public class Builder {
        public var fixedAmounts: List<Int>? = null

        public var percentages: List<Int>? = null

        public var smartTipThreshold: Int? = null

        public fun build(): InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6 =
            InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6(
                fixedAmounts = fixedAmounts,
                percentages = percentages,
                smartTipThreshold = smartTipThreshold,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6 must be a JSON object",
                    )
            return InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6(
                fixedAmounts = rawObject["fixed_amounts"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
                percentages = rawObject["percentages"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
                smartTipThreshold = rawObject["smart_tip_threshold"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.fixedAmounts?.let { put("fixed_amounts", json.encodeToJsonElement(it)) }
                    value.percentages?.let { put("percentages", json.encodeToJsonElement(it)) }
                    value.smartTipThreshold?.let { put("smart_tip_threshold", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6(
    block: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6.Builder.() -> Unit,
): InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6 =
    InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6.build(block)
