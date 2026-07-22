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
 * When an authorization is approved or declined by you or by Stripe, this field provides additional detail on the
 * reason for the outcome.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_request/properties/reason
 */
@Serializable(with = InlineIssuingAuthorizationRequestReasonXba35a429.Serializer::class)
public sealed class InlineIssuingAuthorizationRequestReasonXba35a429 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `account_disabled`.
     */
    public data object AccountDisabled : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "account_disabled"
    }

    /**
     * Documented value. Wire value: `card_active`.
     */
    public data object CardActive : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "card_active"
    }

    /**
     * Documented value. Wire value: `card_canceled`.
     */
    public data object CardCanceled : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "card_canceled"
    }

    /**
     * Documented value. Wire value: `card_expired`.
     */
    public data object CardExpired : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "card_expired"
    }

    /**
     * Documented value. Wire value: `card_inactive`.
     */
    public data object CardInactive : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "card_inactive"
    }

    /**
     * Documented value. Wire value: `cardholder_blocked`.
     */
    public data object CardholderBlocked : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "cardholder_blocked"
    }

    /**
     * Documented value. Wire value: `cardholder_inactive`.
     */
    public data object CardholderInactive : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "cardholder_inactive"
    }

    /**
     * Documented value. Wire value: `cardholder_verification_required`.
     */
    public data object CardholderVerificationRequired : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "cardholder_verification_required"
    }

    /**
     * Documented value. Wire value: `insecure_authorization_method`.
     */
    public data object InsecureAuthorizationMethod : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "insecure_authorization_method"
    }

    /**
     * Documented value. Wire value: `insufficient_funds`.
     */
    public data object InsufficientFunds : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "insufficient_funds"
    }

    /**
     * Documented value. Wire value: `network_fallback`.
     */
    public data object NetworkFallback : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "network_fallback"
    }

    /**
     * Documented value. Wire value: `not_allowed`.
     */
    public data object NotAllowed : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "not_allowed"
    }

    /**
     * Documented value. Wire value: `pin_blocked`.
     */
    public data object PinBlocked : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "pin_blocked"
    }

    /**
     * Documented value. Wire value: `spending_controls`.
     */
    public data object SpendingControls : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "spending_controls"
    }

    /**
     * Documented value. Wire value: `suspected_fraud`.
     */
    public data object SuspectedFraud : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "suspected_fraud"
    }

    /**
     * Documented value. Wire value: `verification_failed`.
     */
    public data object VerificationFailed : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "verification_failed"
    }

    /**
     * Documented value. Wire value: `webhook_approved`.
     */
    public data object WebhookApproved : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "webhook_approved"
    }

    /**
     * Documented value. Wire value: `webhook_declined`.
     */
    public data object WebhookDeclined : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "webhook_declined"
    }

    /**
     * Documented value. Wire value: `webhook_error`.
     */
    public data object WebhookError : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "webhook_error"
    }

    /**
     * Documented value. Wire value: `webhook_timeout`.
     */
    public data object WebhookTimeout : InlineIssuingAuthorizationRequestReasonXba35a429() {
        public override val `value`: String = "webhook_timeout"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIssuingAuthorizationRequestReasonXba35a429()

    public companion object {
        public fun fromValue(`value`: String): InlineIssuingAuthorizationRequestReasonXba35a429 =
            when (value) {
                AccountDisabled.value -> AccountDisabled
                CardActive.value -> CardActive
                CardCanceled.value -> CardCanceled
                CardExpired.value -> CardExpired
                CardInactive.value -> CardInactive
                CardholderBlocked.value -> CardholderBlocked
                CardholderInactive.value -> CardholderInactive
                CardholderVerificationRequired.value -> CardholderVerificationRequired
                InsecureAuthorizationMethod.value -> InsecureAuthorizationMethod
                InsufficientFunds.value -> InsufficientFunds
                NetworkFallback.value -> NetworkFallback
                NotAllowed.value -> NotAllowed
                PinBlocked.value -> PinBlocked
                SpendingControls.value -> SpendingControls
                SuspectedFraud.value -> SuspectedFraud
                VerificationFailed.value -> VerificationFailed
                WebhookApproved.value -> WebhookApproved
                WebhookDeclined.value -> WebhookDeclined
                WebhookError.value -> WebhookError
                WebhookTimeout.value -> WebhookTimeout
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIssuingAuthorizationRequestReasonXba35a429> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationRequestReasonXba35a429",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationRequestReasonXba35a429 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingAuthorizationRequestReasonXba35a429,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
