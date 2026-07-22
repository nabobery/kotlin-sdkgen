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
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8(
    public val acssDebit: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7? = null,
    public val bancontact: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2b? = null,
    public val card: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5? = null,
    public val customerBalance: InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61? = null,
    public val konbini: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930? = null,
    public val payto: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652b? = null,
    public val pix: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37a? = null,
    public val sepaDebit: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitX199f16b6? = null,
    public val upi: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5d? = null,
    public val usBankAccount: InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814? = null,
) {
    public class Builder {
        public var acssDebit:
            InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7? = null

        public var bancontact:
            InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2b? = null

        public var card: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5? =
            null

        public var customerBalance:
            InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61? = null

        public var konbini:
            InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930? = null

        public var payto: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652b? =
            null

        public var pix: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37a? = null

        public var sepaDebit:
            InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitX199f16b6? = null

        public var upi: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5d? = null

        public var usBankAccount: InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814? =
            null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8 =
            InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8(
                acssDebit = acssDebit,
                bancontact = bancontact,
                card = card,
                customerBalance = customerBalance,
                konbini = konbini,
                payto = payto,
                pix = pix,
                sepaDebit = sepaDebit,
                upi = upi,
                usBankAccount = usBankAccount,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8 must be a JSON object",
                    )
            return InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8(
                acssDebit =
                    rawObject["acss_debit"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7>(
                                it,
                            )
                    },
                bancontact =
                    rawObject["bancontact"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2b>(
                                it,
                            )
                    },
                card =
                    rawObject["card"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5>(
                                it,
                            )
                    },
                customerBalance =
                    rawObject["customer_balance"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61>(
                                it,
                            )
                    },
                konbini =
                    rawObject["konbini"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930>(
                                it,
                            )
                    },
                payto =
                    rawObject["payto"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652b>(
                                it,
                            )
                    },
                pix =
                    rawObject["pix"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37a>(
                                it,
                            )
                    },
                sepaDebit =
                    rawObject["sepa_debit"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitX199f16b6>(
                                it,
                            )
                    },
                upi =
                    rawObject["upi"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5d>(
                                it,
                            )
                    },
                usBankAccount =
                    rawObject["us_bank_account"]?.let {
                        json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.acssDebit?.let { put("acss_debit", json.encodeToJsonElement(it)) }
                    value.bancontact?.let { put("bancontact", json.encodeToJsonElement(it)) }
                    value.card?.let { put("card", json.encodeToJsonElement(it)) }
                    value.customerBalance?.let { put("customer_balance", json.encodeToJsonElement(it)) }
                    value.konbini?.let { put("konbini", json.encodeToJsonElement(it)) }
                    value.payto?.let { put("payto", json.encodeToJsonElement(it)) }
                    value.pix?.let { put("pix", json.encodeToJsonElement(it)) }
                    value.sepaDebit?.let { put("sepa_debit", json.encodeToJsonElement(it)) }
                    value.upi?.let { put("upi", json.encodeToJsonElement(it)) }
                    value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8(
    block: InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8 =
    InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8.build(block)
