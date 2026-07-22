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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22(
    public val acssDebit: InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9? = null,
    public val bancontact: InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2? = null,
    public val card: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX91008881? = null,
    public val customerBalance: InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5? = null,
    public val konbini: InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX6448d5f3? = null,
    public val payto: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2? = null,
    public val pix: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1? = null,
    public val sepaDebit: InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08? = null,
    public val upi: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94? = null,
    public val usBankAccount: InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759? = null,
) {
    public class Builder {
        public var acssDebit: InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9? = null

        public var bancontact: InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2? = null

        public var card:
            InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX91008881? = null

        public var customerBalance:
            InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5? = null

        public var konbini: InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX6448d5f3? = null

        public var payto:
            InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2? = null

        public var pix: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1? =
            null

        public var sepaDebit: InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08? = null

        public var upi: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94? =
            null

        public var usBankAccount: InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759? =
            null

        public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22 =
            InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22(
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
        ): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22 must be a JSON object",
                    )
            return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22(
                acssDebit =
                    rawObject["acss_debit"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9>(it)
                    },
                bancontact =
                    rawObject["bancontact"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2>(
                            it,
                        )
                    },
                card =
                    rawObject["card"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX91008881>(
                                it,
                            )
                    },
                customerBalance =
                    rawObject["customer_balance"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5>(
                                it,
                            )
                    },
                konbini =
                    rawObject["konbini"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX6448d5f3>(it)
                    },
                payto =
                    rawObject["payto"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2>(
                                it,
                            )
                    },
                pix =
                    rawObject["pix"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1>(
                                it,
                            )
                    },
                sepaDebit =
                    rawObject["sepa_debit"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08>(it)
                    },
                upi =
                    rawObject["upi"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94>(
                                it,
                            )
                    },
                usBankAccount =
                    rawObject["us_bank_account"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22",
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

public fun inlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22(
    block: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22.Builder.() -> Unit,
): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22 =
    InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22.build(block)
