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
import kotlin.String
import kotlin.Unit

/**
 * Details of an succeeded card outcome attached to this payment evaluation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_succeeded_card
 */
@Serializable(with = InsightsResourcesPaymentEvaluationSucceededCard.Serializer::class)
public class InsightsResourcesPaymentEvaluationSucceededCard(
    /**
     * Result of the address line 1 check.
     */
    public val addressLine1Check: InlineInsightsResourcesPaymentEvaluationSucceededCardAddressLine1CheckX27330ad7,
    /**
     * Indicates whether the cardholder provided a postal code and if it matched the cardholder’s billing address.
     */
    public val addressPostalCodeCheck: InlineInsightsResourcesPayfa19AddressPostalCodeCheckX8169f88a,
    /**
     * Result of the CVC check.
     */
    public val cvcCheck: InlineInsightsResourcesPaymentEvaluationSucceededCardCvcCheckX33ac2c45,
) {
    public class Builder {
        private var addressLine1CheckValue:
            InlineInsightsResourcesPaymentEvaluationSucceededCardAddressLine1CheckX27330ad7? = null

        public var addressLine1Check:
            InlineInsightsResourcesPaymentEvaluationSucceededCardAddressLine1CheckX27330ad7
            get() = requireNotNull(addressLine1CheckValue) { "addressLine1Check is required" }
            set(`value`) {
                addressLine1CheckValue = value
            }

        private var addressPostalCodeCheckValue:
            InlineInsightsResourcesPayfa19AddressPostalCodeCheckX8169f88a? = null

        public var addressPostalCodeCheck: InlineInsightsResourcesPayfa19AddressPostalCodeCheckX8169f88a
            get() = requireNotNull(addressPostalCodeCheckValue) { "addressPostalCodeCheck is required" }
            set(`value`) {
                addressPostalCodeCheckValue = value
            }

        private var cvcCheckValue:
            InlineInsightsResourcesPaymentEvaluationSucceededCardCvcCheckX33ac2c45? = null

        public var cvcCheck: InlineInsightsResourcesPaymentEvaluationSucceededCardCvcCheckX33ac2c45
            get() = requireNotNull(cvcCheckValue) { "cvcCheck is required" }
            set(`value`) {
                cvcCheckValue = value
            }

        public fun build(): InsightsResourcesPaymentEvaluationSucceededCard {
            check(addressLine1CheckValue != null) { "addressLine1Check is required" }
            check(addressPostalCodeCheckValue != null) { "addressPostalCodeCheck is required" }
            check(cvcCheckValue != null) { "cvcCheck is required" }
            return InsightsResourcesPaymentEvaluationSucceededCard(
                addressLine1Check = addressLine1Check,
                addressPostalCodeCheck = addressPostalCodeCheck,
                cvcCheck = cvcCheck,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationSucceededCard =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InsightsResourcesPaymentEvaluationSucceededCard> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationSucceededCard {
            val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationSucceededCard")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InsightsResourcesPaymentEvaluationSucceededCard must be a JSON object",
                    )
            val addressLine1Check =
                json
                    .decodeRequired<InlineInsightsResourcesPaymentEvaluationSucceededCardAddressLine1CheckX27330ad7>(
                        rawObject,
                        "address_line1_check",
                    )
            val addressPostalCodeCheck =
                json.decodeRequired<InlineInsightsResourcesPayfa19AddressPostalCodeCheckX8169f88a>(
                    rawObject,
                    "address_postal_code_check",
                )
            val cvcCheck =
                json.decodeRequired<InlineInsightsResourcesPaymentEvaluationSucceededCardCvcCheckX33ac2c45>(
                    rawObject,
                    "cvc_check",
                )
            return InsightsResourcesPaymentEvaluationSucceededCard(
                addressLine1Check = addressLine1Check,
                addressPostalCodeCheck = addressPostalCodeCheck,
                cvcCheck = cvcCheck,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InsightsResourcesPaymentEvaluationSucceededCard,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationSucceededCard")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("address_line1_check", json.encodeToJsonElement(value.addressLine1Check))
                    put("address_postal_code_check", json.encodeToJsonElement(value.addressPostalCodeCheck))
                    put("cvc_check", json.encodeToJsonElement(value.cvcCheck))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun insightsResourcesPaymentEvaluationSucceededCard(
    block: InsightsResourcesPaymentEvaluationSucceededCard.Builder.() -> Unit,
): InsightsResourcesPaymentEvaluationSucceededCard = InsightsResourcesPaymentEvaluationSucceededCard.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InsightsResourcesPaymentEvaluationSucceededCard is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
