package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

@Serializable
public data class BillingMeterResourceBillingMeterEventAdjustmentCancelView(
    public val identifier: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_meter_resource_billing_meter_event_adjustment_cancel
 */
@Serializable(with = BillingMeterResourceBillingMeterEventAdjustmentCancel.Serializer::class)
public class BillingMeterResourceBillingMeterEventAdjustmentCancel(
    /**
     * Unique identifier for the event.
     */
    public val identifier: String? = null,
) {
    public class Builder {
        /**
         * Unique identifier for the event.
         */
        public var identifier: String? = null

        public fun build(): BillingMeterResourceBillingMeterEventAdjustmentCancel =
            BillingMeterResourceBillingMeterEventAdjustmentCancel(
                identifier = identifier,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BillingMeterResourceBillingMeterEventAdjustmentCancel =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BillingMeterResourceBillingMeterEventAdjustmentCancel> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BillingMeterResourceBillingMeterEventAdjustmentCancel {
            val jsonDecoder = decoder.requireJsonDecoder("BillingMeterResourceBillingMeterEventAdjustmentCancel")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "BillingMeterResourceBillingMeterEventAdjustmentCancel must be a JSON object",
                    )
            return BillingMeterResourceBillingMeterEventAdjustmentCancel(
                identifier =
                    rawObject["identifier"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BillingMeterResourceBillingMeterEventAdjustmentCancel,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BillingMeterResourceBillingMeterEventAdjustmentCancel")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.identifier?.let { put("identifier", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun billingMeterResourceBillingMeterEventAdjustmentCancel(
    block: BillingMeterResourceBillingMeterEventAdjustmentCancel.Builder.() -> Unit,
): BillingMeterResourceBillingMeterEventAdjustmentCancel =
    BillingMeterResourceBillingMeterEventAdjustmentCancel.build(block)
