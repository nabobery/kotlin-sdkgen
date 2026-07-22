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
 * Each customer has a [`balance`](https://docs.stripe.com/api/customers/object#customer_object-balance) that is
 * automatically applied to future invoices and payments using the `customer_balance` payment method.
 * Customers can fund this balance by initiating a bank transfer to any account in the
 * `financial_addresses` field.
 * Related guide: [Customer balance funding
 * instructions](https://docs.stripe.com/payments/customer-balance/funding-instructions)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/funding_instructions
 */
@Serializable(with = FundingInstructions.Serializer::class)
public class FundingInstructions(
    public val bankTransfer: FundingInstructionsBankTransfer,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    /**
     * The `funding_type` of the returned instructions
     */
    public val fundingType: InlineFundingInstructionsFundingTypeX8e9a652f,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineFundingInstructionsObjectValueX92154a48,
) {
    public class Builder {
        private var bankTransferValue: FundingInstructionsBankTransfer? = null

        public var bankTransfer: FundingInstructionsBankTransfer
            get() = requireNotNull(bankTransferValue) { "bankTransfer is required" }
            set(`value`) {
                bankTransferValue = value
            }

        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
            }

        private var fundingTypeValue: InlineFundingInstructionsFundingTypeX8e9a652f? = null

        public var fundingType: InlineFundingInstructionsFundingTypeX8e9a652f
            get() = requireNotNull(fundingTypeValue) { "fundingType is required" }
            set(`value`) {
                fundingTypeValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var objectValueValue: InlineFundingInstructionsObjectValueX92154a48? = null

        public var objectValue: InlineFundingInstructionsObjectValueX92154a48
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        public fun build(): FundingInstructions {
            check(bankTransferValue != null) { "bankTransfer is required" }
            check(currencyValue != null) { "currency is required" }
            check(fundingTypeValue != null) { "fundingType is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            return FundingInstructions(
                bankTransfer = bankTransfer,
                currency = currency,
                fundingType = fundingType,
                livemode = livemode,
                objectValue = objectValue,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): FundingInstructions = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<FundingInstructions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): FundingInstructions {
            val jsonDecoder = decoder.requireJsonDecoder("FundingInstructions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("FundingInstructions must be a JSON object")
            val bankTransfer = json.decodeRequired<FundingInstructionsBankTransfer>(rawObject, "bank_transfer")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val fundingType =
                json.decodeRequired<InlineFundingInstructionsFundingTypeX8e9a652f>(
                    rawObject,
                    "funding_type",
                )
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue = json.decodeRequired<InlineFundingInstructionsObjectValueX92154a48>(rawObject, "object")
            return FundingInstructions(
                bankTransfer = bankTransfer,
                currency = currency,
                fundingType = fundingType,
                livemode = livemode,
                objectValue = objectValue,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: FundingInstructions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("FundingInstructions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("bank_transfer", json.encodeToJsonElement(value.bankTransfer))
                    put("currency", value.currency)
                    put("funding_type", json.encodeToJsonElement(value.fundingType))
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun fundingInstructions(block: FundingInstructions.Builder.() -> Unit): FundingInstructions =
    FundingInstructions.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("FundingInstructions is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
