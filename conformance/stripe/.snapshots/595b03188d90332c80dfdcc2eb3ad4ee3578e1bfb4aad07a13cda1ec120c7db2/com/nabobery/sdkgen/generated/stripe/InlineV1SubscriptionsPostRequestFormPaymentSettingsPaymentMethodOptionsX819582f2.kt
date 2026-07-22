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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2(
    public val acssDebit: InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1? = null,
    public val bancontact: InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38? = null,
    public val card: InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168f? = null,
    public val customerBalance: InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceXc0fcc808? = null,
    public val konbini: InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211a? = null,
    public val payto: InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3? = null,
    public val pix: InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6? = null,
    public val sepaDebit: InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3? = null,
    public val upi: InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56f? = null,
    public val usBankAccount: InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aa? = null,
) {
    public class Builder {
        public var acssDebit: InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1? =
            null

        public var bancontact: InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38? =
            null

        public var card: InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168f? = null

        public var customerBalance:
            InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceXc0fcc808? = null

        public var konbini: InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211a? = null

        public var payto: InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3? = null

        public var pix: InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6? = null

        public var sepaDebit: InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3? =
            null

        public var upi: InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56f? = null

        public var usBankAccount:
            InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aa? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2 =
            InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2(
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
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2 must be a JSON object",
                    )
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2(
                acssDebit =
                    rawObject["acss_debit"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1>(
                                it,
                            )
                    },
                bancontact =
                    rawObject["bancontact"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38>(
                                it,
                            )
                    },
                card =
                    rawObject["card"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168f>(it)
                    },
                customerBalance =
                    rawObject["customer_balance"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceXc0fcc808>(
                                it,
                            )
                    },
                konbini =
                    rawObject["konbini"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211a>(
                            it,
                        )
                    },
                payto =
                    rawObject["payto"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3>(
                            it,
                        )
                    },
                pix =
                    rawObject["pix"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6>(it)
                    },
                sepaDebit =
                    rawObject["sepa_debit"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3>(
                                it,
                            )
                    },
                upi =
                    rawObject["upi"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56f>(it)
                    },
                usBankAccount =
                    rawObject["us_bank_account"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aa>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2",
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

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2(
    block: InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2 =
    InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2.build(block)
