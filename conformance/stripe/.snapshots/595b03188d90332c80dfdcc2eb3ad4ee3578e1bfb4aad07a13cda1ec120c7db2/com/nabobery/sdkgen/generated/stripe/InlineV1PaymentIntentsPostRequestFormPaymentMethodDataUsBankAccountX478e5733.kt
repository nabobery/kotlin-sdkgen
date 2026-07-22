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
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/us_bank_account
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountX478e5733.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountX478e5733(
    public val accountHolderType:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAccountHolderTypeXc810c56c? = null,
    public val accountNumber: String? = null,
    public val accountType: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAccountTypeXc61e4aca? = null,
    public val financialConnectionsAccount: String? = null,
    public val routingNumber: String? = null,
) {
    public class Builder {
        public var accountHolderType:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAccountHolderTypeXc810c56c? = null

        public var accountNumber: String? = null

        public var accountType:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAccountTypeXc61e4aca? = null

        public var financialConnectionsAccount: String? = null

        public var routingNumber: String? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountX478e5733 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountX478e5733(
                accountHolderType = accountHolderType,
                accountNumber = accountNumber,
                accountType = accountType,
                financialConnectionsAccount = financialConnectionsAccount,
                routingNumber = routingNumber,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountX478e5733 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountX478e5733> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountX478e5733 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountX478e5733",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountX478e5733 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountX478e5733(
                accountHolderType =
                    rawObject["account_holder_type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAccountHolderTypeXc810c56c>(
                                it,
                            )
                    },
                accountNumber = rawObject["account_number"]?.let { json.decodeFromJsonElement<String>(it) },
                accountType =
                    rawObject["account_type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAccountTypeXc61e4aca>(
                                it,
                            )
                    },
                financialConnectionsAccount =
                    rawObject["financial_connections_account"]?.let {
                        json.decodeFromJsonElement<String>(it)
                    },
                routingNumber = rawObject["routing_number"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountX478e5733,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountX478e5733",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.accountHolderType?.let { put("account_holder_type", json.encodeToJsonElement(it)) }
                    value.accountNumber?.let { put("account_number", it) }
                    value.accountType?.let { put("account_type", json.encodeToJsonElement(it)) }
                    value.financialConnectionsAccount?.let { put("financial_connections_account", it) }
                    value.routingNumber?.let { put("routing_number", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountX478e5733(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountX478e5733.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountX478e5733 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountX478e5733.build(block)
