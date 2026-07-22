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
 * Payment method-specific configuration for this SetupIntent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09(
    public val acssDebit: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX2e5c5e86? = null,
    public val amazonPay: JsonObject? = null,
    public val bacsDebit: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c? = null,
    public val bizum: JsonObject? = null,
    public val card: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d? = null,
    public val cardPresent: JsonObject? = null,
    public val klarna: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe? = null,
    public val link: JsonObject? = null,
    public val paypal: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4? = null,
    public val payto: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoXd18fa833? = null,
    public val pix: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062? = null,
    public val sepaDebit: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf? = null,
    public val upi: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8? = null,
    public val usBankAccount: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a? = null,
) {
    public class Builder {
        public var acssDebit: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX2e5c5e86? =
            null

        public var amazonPay: JsonObject? = null

        public var bacsDebit: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c? =
            null

        public var bizum: JsonObject? = null

        public var card: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d? = null

        public var cardPresent: JsonObject? = null

        public var klarna: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe? =
            null

        public var link: JsonObject? = null

        public var paypal: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4? =
            null

        public var payto: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoXd18fa833? = null

        public var pix: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062? = null

        public var sepaDebit: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf? =
            null

        public var upi: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8? = null

        public var usBankAccount:
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a? = null

        public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09 =
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09(
                acssDebit = acssDebit,
                amazonPay = amazonPay,
                bacsDebit = bacsDebit,
                bizum = bizum,
                card = card,
                cardPresent = cardPresent,
                klarna = klarna,
                link = link,
                paypal = paypal,
                payto = payto,
                pix = pix,
                sepaDebit = sepaDebit,
                upi = upi,
                usBankAccount = usBankAccount,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09 must be a JSON object",
                    )
            return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09(
                acssDebit =
                    rawObject["acss_debit"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX2e5c5e86>(
                                it,
                            )
                    },
                amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
                bacsDebit =
                    rawObject["bacs_debit"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c>(
                                it,
                            )
                    },
                bizum = rawObject["bizum"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
                card =
                    rawObject["card"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d>(
                                it,
                            )
                    },
                cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
                klarna =
                    rawObject["klarna"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe>(
                                it,
                            )
                    },
                link = rawObject["link"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
                paypal =
                    rawObject["paypal"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4>(
                                it,
                            )
                    },
                payto =
                    rawObject["payto"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoXd18fa833>(
                                it,
                            )
                    },
                pix =
                    rawObject["pix"]?.let {
                        json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062>(
                            it,
                        )
                    },
                sepaDebit =
                    rawObject["sepa_debit"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf>(
                                it,
                            )
                    },
                upi =
                    rawObject["upi"]?.let {
                        json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8>(
                            it,
                        )
                    },
                usBankAccount =
                    rawObject["us_bank_account"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.acssDebit?.let { put("acss_debit", json.encodeToJsonElement(it)) }
                    value.amazonPay?.let { put("amazon_pay", json.encodeToJsonElement(it)) }
                    value.bacsDebit?.let { put("bacs_debit", json.encodeToJsonElement(it)) }
                    value.bizum?.let { put("bizum", json.encodeToJsonElement(it)) }
                    value.card?.let { put("card", json.encodeToJsonElement(it)) }
                    value.cardPresent?.let { put("card_present", json.encodeToJsonElement(it)) }
                    value.klarna?.let { put("klarna", json.encodeToJsonElement(it)) }
                    value.link?.let { put("link", json.encodeToJsonElement(it)) }
                    value.paypal?.let { put("paypal", json.encodeToJsonElement(it)) }
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09(
    block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09.Builder.() -> Unit,
): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09 =
    InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09.build(block)
