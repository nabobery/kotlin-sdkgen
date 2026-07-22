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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_update/properties/products/anyOf/
 * 0/items/properties/adjustable_quantity.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_update/properties/products/anyOf/
 * 0/items/properties/adjustable_quantity
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e(
    public val enabled: Boolean,
    public val maximum: Int? = null,
    public val minimum: Int? = null,
) {
    public class Builder {
        private var enabledValue: Boolean? = null

        public var enabled: Boolean
            get() = requireNotNull(enabledValue) { "enabled is required" }
            set(`value`) {
                enabledValue = value
            }

        public var maximum: Int? = null

        public var minimum: Int? = null

        public fun build(): InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e {
            check(enabledValue != null) { "enabled is required" }
            return InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e(
                enabled = enabled,
                maximum = maximum,
                minimum = minimum,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e must be a JSON object",
                    )
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            return InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e(
                enabled = enabled,
                maximum = rawObject["maximum"]?.let { json.decodeFromJsonElement<Int>(it) },
                minimum = rawObject["minimum"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("enabled", json.encodeToJsonElement(value.enabled))
                    value.maximum?.let { put("maximum", json.encodeToJsonElement(it)) }
                    value.minimum?.let { put("minimum", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e(
    block: InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e.Builder.() -> Unit,
): InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e =
    InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityXeaa36e7e is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
