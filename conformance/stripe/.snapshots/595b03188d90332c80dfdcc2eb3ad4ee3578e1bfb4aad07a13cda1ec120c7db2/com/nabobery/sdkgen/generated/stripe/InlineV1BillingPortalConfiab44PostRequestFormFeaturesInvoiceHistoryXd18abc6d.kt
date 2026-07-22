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
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/invoice_history.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/invoice_history
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d(
    public val enabled: Boolean,
) {
    public class Builder {
        private var enabledValue: Boolean? = null

        public var enabled: Boolean
            get() = requireNotNull(enabledValue) { "enabled is required" }
            set(`value`) {
                enabledValue = value
            }

        public fun build(): InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d {
            check(enabledValue != null) { "enabled is required" }
            return InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d(
                enabled = enabled,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d must be a JSON object",
                    )
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            return InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d(
                enabled = enabled,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("enabled", json.encodeToJsonElement(value.enabled))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d(
    block: InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d.Builder.() -> Unit,
): InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d =
    InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
