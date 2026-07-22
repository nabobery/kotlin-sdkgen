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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_enhanced_evidence_mastercard_compliance
 */
@Serializable(with = DisputeEnhancedEvidenceMastercardCompliance.Serializer::class)
public class DisputeEnhancedEvidenceMastercardCompliance(
    /**
     * A field acknowledging the fee incurred when countering a Mastercard compliance dispute. If this field is set to
     * true, evidence can be submitted for the compliance dispute.
     */
    public val feeAcknowledged: Boolean,
) {
    public class Builder {
        private var feeAcknowledgedValue: Boolean? = null

        public var feeAcknowledged: Boolean
            get() = requireNotNull(feeAcknowledgedValue) { "feeAcknowledged is required" }
            set(`value`) {
                feeAcknowledgedValue = value
            }

        public fun build(): DisputeEnhancedEvidenceMastercardCompliance {
            check(feeAcknowledgedValue != null) { "feeAcknowledged is required" }
            return DisputeEnhancedEvidenceMastercardCompliance(
                feeAcknowledged = feeAcknowledged,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): DisputeEnhancedEvidenceMastercardCompliance =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<DisputeEnhancedEvidenceMastercardCompliance> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): DisputeEnhancedEvidenceMastercardCompliance {
            val jsonDecoder = decoder.requireJsonDecoder("DisputeEnhancedEvidenceMastercardCompliance")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("DisputeEnhancedEvidenceMastercardCompliance must be a JSON object")
            val feeAcknowledged = json.decodeRequired<Boolean>(rawObject, "fee_acknowledged")
            return DisputeEnhancedEvidenceMastercardCompliance(
                feeAcknowledged = feeAcknowledged,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: DisputeEnhancedEvidenceMastercardCompliance,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("DisputeEnhancedEvidenceMastercardCompliance")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("fee_acknowledged", json.encodeToJsonElement(value.feeAcknowledged))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun disputeEnhancedEvidenceMastercardCompliance(
    block: DisputeEnhancedEvidenceMastercardCompliance.Builder.() -> Unit,
): DisputeEnhancedEvidenceMastercardCompliance = DisputeEnhancedEvidenceMastercardCompliance.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "DisputeEnhancedEvidenceMastercardCompliance is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
