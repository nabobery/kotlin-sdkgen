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
 * An early fraud warning indicates that the card issuer has notified us that a
 * charge may be fraudulent.
 *
 * Related guide: [Early fraud warnings](https://docs.stripe.com/disputes/measuring#early-fraud-warnings)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar.early_fraud_warning
 */
@Serializable(with = RadarEarlyFraudWarning.Serializer::class)
public class RadarEarlyFraudWarning(
    /**
     * An EFW is actionable if it has not received a dispute and has not been fully refunded. You may wish to proactively
     * refund a charge that receives an EFW, in order to avoid receiving a dispute later.
     */
    public val actionable: Boolean,
    /**
     * ID of the charge this early fraud warning is for, optionally expanded.
     */
    public val charge: InlineRadarEarlyFraudWarningChargeX10bc4a3d,
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
    /**
     * The type of fraud labelled by the issuer. One of `card_never_received`, `fraudulent_card_application`,
     * `made_with_counterfeit_card`, `made_with_lost_card`, `made_with_stolen_card`, `misc`, `unauthorized_use_of_card`.
     */
    public val fraudType: String,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineRadarEarlyFraudWarningObjectValueX813e1b3f,
    /**
     * ID of the Payment Intent this early fraud warning is for, optionally expanded.
     */
    public val paymentIntent: InlineRadarEarlyFraudWarningPaymentIntentX11715895? = null,
) {
    public class Builder {
        private var actionableValue: Boolean? = null

        public var actionable: Boolean
            get() = requireNotNull(actionableValue) { "actionable is required" }
            set(`value`) {
                actionableValue = value
            }

        private var chargeValue: InlineRadarEarlyFraudWarningChargeX10bc4a3d? = null

        public var charge: InlineRadarEarlyFraudWarningChargeX10bc4a3d
            get() = requireNotNull(chargeValue) { "charge is required" }
            set(`value`) {
                chargeValue = value
            }

        private var createdValue: Int? = null

        public var created: Int
            get() = requireNotNull(createdValue) { "created is required" }
            set(`value`) {
                createdValue = value
            }

        private var fraudTypeValue: String? = null

        public var fraudType: String
            get() = requireNotNull(fraudTypeValue) { "fraudType is required" }
            set(`value`) {
                fraudTypeValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var objectValueValue: InlineRadarEarlyFraudWarningObjectValueX813e1b3f? = null

        public var objectValue: InlineRadarEarlyFraudWarningObjectValueX813e1b3f
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        /**
         * ID of the Payment Intent this early fraud warning is for, optionally expanded.
         */
        public var paymentIntent: InlineRadarEarlyFraudWarningPaymentIntentX11715895? = null

        public fun build(): RadarEarlyFraudWarning {
            check(actionableValue != null) { "actionable is required" }
            check(chargeValue != null) { "charge is required" }
            check(createdValue != null) { "created is required" }
            check(fraudTypeValue != null) { "fraudType is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            return RadarEarlyFraudWarning(
                actionable = actionable,
                charge = charge,
                created = created,
                fraudType = fraudType,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                paymentIntent = paymentIntent,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): RadarEarlyFraudWarning = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<RadarEarlyFraudWarning> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): RadarEarlyFraudWarning {
            val jsonDecoder = decoder.requireJsonDecoder("RadarEarlyFraudWarning")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("RadarEarlyFraudWarning must be a JSON object")
            val actionable = json.decodeRequired<Boolean>(rawObject, "actionable")
            val charge = json.decodeRequired<InlineRadarEarlyFraudWarningChargeX10bc4a3d>(rawObject, "charge")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val fraudType = json.decodeRequired<String>(rawObject, "fraud_type")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue = json.decodeRequired<InlineRadarEarlyFraudWarningObjectValueX813e1b3f>(rawObject, "object")
            return RadarEarlyFraudWarning(
                actionable = actionable,
                charge = charge,
                created = created,
                fraudType = fraudType,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                paymentIntent =
                    rawObject["payment_intent"]?.let {
                        json.decodeFromJsonElement<InlineRadarEarlyFraudWarningPaymentIntentX11715895>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: RadarEarlyFraudWarning,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("RadarEarlyFraudWarning")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("actionable", json.encodeToJsonElement(value.actionable))
                    put("charge", json.encodeToJsonElement(value.charge))
                    put("created", json.encodeToJsonElement(value.created))
                    put("fraud_type", value.fraudType)
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    value.paymentIntent?.let { put("payment_intent", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun radarEarlyFraudWarning(block: RadarEarlyFraudWarning.Builder.() -> Unit): RadarEarlyFraudWarning =
    RadarEarlyFraudWarning.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("RadarEarlyFraudWarning is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
