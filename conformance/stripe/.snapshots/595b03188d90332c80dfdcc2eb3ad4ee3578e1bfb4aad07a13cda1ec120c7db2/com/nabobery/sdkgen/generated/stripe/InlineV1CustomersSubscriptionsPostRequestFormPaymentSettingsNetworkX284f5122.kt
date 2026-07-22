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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/pr
 * operties/network.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/pr
 * operties/network
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `amex`.
     */
    public data object Amex : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122() {
        public override val `value`: String = "amex"
    }

    /**
     * Documented value. Wire value: `cartes_bancaires`.
     */
    public data object CartesBancaires : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122() {
        public override val `value`: String = "cartes_bancaires"
    }

    /**
     * Documented value. Wire value: `diners`.
     */
    public data object Diners : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122() {
        public override val `value`: String = "diners"
    }

    /**
     * Documented value. Wire value: `discover`.
     */
    public data object Discover : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122() {
        public override val `value`: String = "discover"
    }

    /**
     * Documented value. Wire value: `eftpos_au`.
     */
    public data object EftposAu : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122() {
        public override val `value`: String = "eftpos_au"
    }

    /**
     * Documented value. Wire value: `girocard`.
     */
    public data object Girocard : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122() {
        public override val `value`: String = "girocard"
    }

    /**
     * Documented value. Wire value: `interac`.
     */
    public data object Interac : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122() {
        public override val `value`: String = "interac"
    }

    /**
     * Documented value. Wire value: `jcb`.
     */
    public data object Jcb : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122() {
        public override val `value`: String = "jcb"
    }

    /**
     * Documented value. Wire value: `link`.
     */
    public data object Link : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122() {
        public override val `value`: String = "link"
    }

    /**
     * Documented value. Wire value: `mastercard`.
     */
    public data object Mastercard : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122() {
        public override val `value`: String = "mastercard"
    }

    /**
     * Documented value. Wire value: `unionpay`.
     */
    public data object Unionpay : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122() {
        public override val `value`: String = "unionpay"
    }

    /**
     * Documented value. Wire value: `unknown`.
     */
    public data object Unknown : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122() {
        public override val `value`: String = "unknown"
    }

    /**
     * Documented value. Wire value: `visa`.
     */
    public data object Visa : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122() {
        public override val `value`: String = "visa"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122 =
            when (value) {
                Amex.value -> Amex
                CartesBancaires.value -> CartesBancaires
                Diners.value -> Diners
                Discover.value -> Discover
                EftposAu.value -> EftposAu
                Girocard.value -> Girocard
                Interac.value -> Interac
                Jcb.value -> Jcb
                Link.value -> Link
                Mastercard.value -> Mastercard
                Unionpay.value -> Unionpay
                Unknown.value -> Unknown
                Visa.value -> Visa
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
