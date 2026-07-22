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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_p24
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordP24.Serializer::class)
public class PaymentMethodDetailsPaymentRecordP24(
    /**
     * The customer's bank. Can be one of `ing`, `citi_handlowy`, `tmobile_usbugi_bankowe`, `plus_bank`,
     * `etransfer_pocztowy24`, `banki_spbdzielcze`, `bank_nowy_bfg_sa`, `getin_bank`, `velobank`, `blik`, `noble_pay`,
     * `ideabank`, `envelobank`, `santander_przelew24`, `nest_przelew`, `mbank_mtransfer`, `inteligo`, `pbac_z_ipko`,
     * `bnp_paribas`, `credit_agricole`, `toyota_bank`, `bank_pekao_sa`, `volkswagen_bank`, `bank_millennium`,
     * `alior_bank`, or `boz`.
     */
    public val bank: InlinePaymentMethodDetailsPaymentRecordP24BankX0bf22c88? = null,
    /**
     * Unique reference for this Przelewy24 payment.
     */
    public val reference: String? = null,
    /**
     * Owner's verified full name. Values are verified or provided by Przelewy24 directly (if supported) at the time of
     * authorization or settlement. They cannot be set or mutated. Przelewy24 rarely provides this information so the
     * attribute is usually empty.
     */
    public val verifiedName: String? = null,
) {
    public class Builder {
        /**
         * The customer's bank. Can be one of `ing`, `citi_handlowy`, `tmobile_usbugi_bankowe`, `plus_bank`,
         * `etransfer_pocztowy24`, `banki_spbdzielcze`, `bank_nowy_bfg_sa`, `getin_bank`, `velobank`, `blik`, `noble_pay`,
         * `ideabank`, `envelobank`, `santander_przelew24`, `nest_przelew`, `mbank_mtransfer`, `inteligo`, `pbac_z_ipko`,
         * `bnp_paribas`, `credit_agricole`, `toyota_bank`, `bank_pekao_sa`, `volkswagen_bank`, `bank_millennium`,
         * `alior_bank`, or `boz`.
         */
        public var bank: InlinePaymentMethodDetailsPaymentRecordP24BankX0bf22c88? = null

        /**
         * Unique reference for this Przelewy24 payment.
         */
        public var reference: String? = null

        /**
         * Owner's verified full name. Values are verified or provided by Przelewy24 directly (if supported) at the time of
         * authorization or settlement. They cannot be set or mutated. Przelewy24 rarely provides this information so the
         * attribute is usually empty.
         */
        public var verifiedName: String? = null

        public fun build(): PaymentMethodDetailsPaymentRecordP24 =
            PaymentMethodDetailsPaymentRecordP24(
                bank = bank,
                reference = reference,
                verifiedName = verifiedName,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordP24 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordP24> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordP24 {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordP24")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsPaymentRecordP24 must be a JSON object")
            return PaymentMethodDetailsPaymentRecordP24(
                bank =
                    rawObject["bank"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentMethodDetailsPaymentRecordP24BankX0bf22c88?>(
                                element,
                            )
                        }
                    },
                reference =
                    rawObject["reference"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                verifiedName =
                    rawObject["verified_name"]?.let { element ->
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
            `value`: PaymentMethodDetailsPaymentRecordP24,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordP24")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
                    value.reference?.let { put("reference", it) }
                    value.verifiedName?.let { put("verified_name", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsPaymentRecordP24(
    block: PaymentMethodDetailsPaymentRecordP24.Builder.() -> Unit,
): PaymentMethodDetailsPaymentRecordP24 = PaymentMethodDetailsPaymentRecordP24.build(block)
