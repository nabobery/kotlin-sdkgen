package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.String

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_tran
 * sfer/properties/requested_address_types/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_tran
 * sfer/properties/requested_address_types/items
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `aba`.
     */
    public data object Aba : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce() {
        public override val `value`: String = "aba"
    }

    /**
     * Documented value. Wire value: `iban`.
     */
    public data object Iban : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce() {
        public override val `value`: String = "iban"
    }

    /**
     * Documented value. Wire value: `sepa`.
     */
    public data object Sepa : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce() {
        public override val `value`: String = "sepa"
    }

    /**
     * Documented value. Wire value: `sort_code`.
     */
    public data object SortCode : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce() {
        public override val `value`: String = "sort_code"
    }

    /**
     * Documented value. Wire value: `spei`.
     */
    public data object Spei : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce() {
        public override val `value`: String = "spei"
    }

    /**
     * Documented value. Wire value: `swift`.
     */
    public data object Swift : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce() {
        public override val `value`: String = "swift"
    }

    /**
     * Documented value. Wire value: `zengin`.
     */
    public data object Zengin : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce() {
        public override val `value`: String = "zengin"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce =
            when (value) {
                Aba.value -> Aba
                Iban.value -> Iban
                Sepa.value -> Sepa
                SortCode.value -> SortCode
                Spei.value -> Spei
                Swift.value -> Swift
                Zengin.value -> Zengin
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
