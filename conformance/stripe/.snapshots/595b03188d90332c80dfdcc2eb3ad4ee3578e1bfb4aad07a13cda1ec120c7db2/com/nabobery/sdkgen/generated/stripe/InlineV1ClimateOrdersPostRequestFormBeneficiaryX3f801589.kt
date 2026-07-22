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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Publicly sharable reference for the end beneficiary of carbon removal. Assumed to be the Stripe account if not set.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1climate~1orders/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/beneficiary
 */
@Serializable(with = InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589.Serializer::class)
public class InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589(
    public val publicName: String,
) {
    public class Builder {
        private var publicNameValue: String? = null

        public var publicName: String
            get() = requireNotNull(publicNameValue) { "publicName is required" }
            set(`value`) {
                publicNameValue = value
            }

        public fun build(): InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589 {
            check(publicNameValue != null) { "publicName is required" }
            return InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589(
                publicName = publicName,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589 must be a JSON object",
                    )
            val publicName = json.decodeRequired<String>(rawObject, "public_name")
            return InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589(
                publicName = publicName,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("public_name", value.publicName)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589(
    block: InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589.Builder.() -> Unit,
): InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589 =
    InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
