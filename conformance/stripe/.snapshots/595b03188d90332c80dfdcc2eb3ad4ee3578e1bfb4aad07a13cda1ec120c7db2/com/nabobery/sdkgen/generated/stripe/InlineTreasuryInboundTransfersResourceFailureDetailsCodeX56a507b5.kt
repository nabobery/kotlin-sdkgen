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
 * Reason for the failure.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_inbound_transfers_resource_failure_details/properties/code
 */
@Serializable(with = InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5.Serializer::class)
public sealed class InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `account_closed`.
     */
    public data object AccountClosed : InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5() {
        public override val `value`: String = "account_closed"
    }

    /**
     * Documented value. Wire value: `account_frozen`.
     */
    public data object AccountFrozen : InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5() {
        public override val `value`: String = "account_frozen"
    }

    /**
     * Documented value. Wire value: `bank_account_restricted`.
     */
    public data object BankAccountRestricted : InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5() {
        public override val `value`: String = "bank_account_restricted"
    }

    /**
     * Documented value. Wire value: `bank_ownership_changed`.
     */
    public data object BankOwnershipChanged : InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5() {
        public override val `value`: String = "bank_ownership_changed"
    }

    /**
     * Documented value. Wire value: `debit_not_authorized`.
     */
    public data object DebitNotAuthorized : InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5() {
        public override val `value`: String = "debit_not_authorized"
    }

    /**
     * Documented value. Wire value: `incorrect_account_holder_address`.
     */
    public data object IncorrectAccountHolderAddress : InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5() {
        public override val `value`: String = "incorrect_account_holder_address"
    }

    /**
     * Documented value. Wire value: `incorrect_account_holder_name`.
     */
    public data object IncorrectAccountHolderName : InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5() {
        public override val `value`: String = "incorrect_account_holder_name"
    }

    /**
     * Documented value. Wire value: `incorrect_account_holder_tax_id`.
     */
    public data object IncorrectAccountHolderTaxId : InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5() {
        public override val `value`: String = "incorrect_account_holder_tax_id"
    }

    /**
     * Documented value. Wire value: `insufficient_funds`.
     */
    public data object InsufficientFunds : InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5() {
        public override val `value`: String = "insufficient_funds"
    }

    /**
     * Documented value. Wire value: `invalid_account_number`.
     */
    public data object InvalidAccountNumber : InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5() {
        public override val `value`: String = "invalid_account_number"
    }

    /**
     * Documented value. Wire value: `invalid_currency`.
     */
    public data object InvalidCurrency : InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5() {
        public override val `value`: String = "invalid_currency"
    }

    /**
     * Documented value. Wire value: `no_account`.
     */
    public data object NoAccount : InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5() {
        public override val `value`: String = "no_account"
    }

    /**
     * Documented value. Wire value: `other`.
     */
    public data object Other : InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5() {
        public override val `value`: String = "other"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5()

    public companion object {
        public fun fromValue(`value`: String): InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5 =
            when (value) {
                AccountClosed.value -> AccountClosed
                AccountFrozen.value -> AccountFrozen
                BankAccountRestricted.value -> BankAccountRestricted
                BankOwnershipChanged.value -> BankOwnershipChanged
                DebitNotAuthorized.value -> DebitNotAuthorized
                IncorrectAccountHolderAddress.value -> IncorrectAccountHolderAddress
                IncorrectAccountHolderName.value -> IncorrectAccountHolderName
                IncorrectAccountHolderTaxId.value -> IncorrectAccountHolderTaxId
                InsufficientFunds.value -> InsufficientFunds
                InvalidAccountNumber.value -> InvalidAccountNumber
                InvalidCurrency.value -> InvalidCurrency
                NoAccount.value -> NoAccount
                Other.value -> Other
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
