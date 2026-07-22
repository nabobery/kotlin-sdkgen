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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * This hash contains whether the customer sheet is enabled and the features it supports.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_customer_sheet
 */
@Serializable(with = CustomerSessionResourceComponentsResourceCustomerSheet.Serializer::class)
public class CustomerSessionResourceComponentsResourceCustomerSheet(
    /**
     * Whether the customer sheet is enabled.
     */
    public val enabled: Boolean,
    /**
     * This hash defines whether the customer sheet supports certain features.
     */
    public val features: InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14? = null,
) {
    public class Builder {
        private var enabledValue: Boolean? = null

        public var enabled: Boolean
            get() = requireNotNull(enabledValue) { "enabled is required" }
            set(`value`) {
                enabledValue = value
            }

        /**
         * This hash defines whether the customer sheet supports certain features.
         */
        public var features:
            InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14? = null

        public fun build(): CustomerSessionResourceComponentsResourceCustomerSheet {
            check(enabledValue != null) { "enabled is required" }
            return CustomerSessionResourceComponentsResourceCustomerSheet(
                enabled = enabled,
                features = features,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): CustomerSessionResourceComponentsResourceCustomerSheet =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CustomerSessionResourceComponentsResourceCustomerSheet> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): CustomerSessionResourceComponentsResourceCustomerSheet {
            val jsonDecoder = decoder.requireJsonDecoder("CustomerSessionResourceComponentsResourceCustomerSheet")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "CustomerSessionResourceComponentsResourceCustomerSheet must be a JSON object",
                    )
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            return CustomerSessionResourceComponentsResourceCustomerSheet(
                enabled = enabled,
                features =
                    rawObject["features"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineCustomerSessionResourceComponentsResourceCustomerSheetFeaturesXf3a2bb14?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: CustomerSessionResourceComponentsResourceCustomerSheet,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("CustomerSessionResourceComponentsResourceCustomerSheet")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("enabled", json.encodeToJsonElement(value.enabled))
                    value.features?.let { put("features", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun customerSessionResourceComponentsResourceCustomerSheet(
    block: CustomerSessionResourceComponentsResourceCustomerSheet.Builder.() -> Unit,
): CustomerSessionResourceComponentsResourceCustomerSheet =
    CustomerSessionResourceComponentsResourceCustomerSheet.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "CustomerSessionResourceComponentsResourceCustomerSheet is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
