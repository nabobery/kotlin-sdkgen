package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * When the mandate is revoked on the Bacs network this field displays the reason for the revocation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_bacs_debit/properties/revocation_reason
 */
@Serializable(with = InlineMandateBacsDebitRevocationReasonX9e329b29.Serializer::class)
public sealed class InlineMandateBacsDebitRevocationReasonX9e329b29 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account_closed`.
   */
  public data object AccountClosed : InlineMandateBacsDebitRevocationReasonX9e329b29() {
    public override val `value`: String = "account_closed"
  }

  /**
   * Documented value. Wire value: `bank_account_restricted`.
   */
  public data object BankAccountRestricted : InlineMandateBacsDebitRevocationReasonX9e329b29() {
    public override val `value`: String = "bank_account_restricted"
  }

  /**
   * Documented value. Wire value: `bank_ownership_changed`.
   */
  public data object BankOwnershipChanged : InlineMandateBacsDebitRevocationReasonX9e329b29() {
    public override val `value`: String = "bank_ownership_changed"
  }

  /**
   * Documented value. Wire value: `could_not_process`.
   */
  public data object CouldNotProcess : InlineMandateBacsDebitRevocationReasonX9e329b29() {
    public override val `value`: String = "could_not_process"
  }

  /**
   * Documented value. Wire value: `debit_not_authorized`.
   */
  public data object DebitNotAuthorized : InlineMandateBacsDebitRevocationReasonX9e329b29() {
    public override val `value`: String = "debit_not_authorized"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMandateBacsDebitRevocationReasonX9e329b29()

  public companion object {
    public fun fromValue(`value`: String): InlineMandateBacsDebitRevocationReasonX9e329b29 = when (value) {
      AccountClosed.value -> AccountClosed
      BankAccountRestricted.value -> BankAccountRestricted
      BankOwnershipChanged.value -> BankOwnershipChanged
      CouldNotProcess.value -> CouldNotProcess
      DebitNotAuthorized.value -> DebitNotAuthorized
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMandateBacsDebitRevocationReasonX9e329b29> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineMandateBacsDebitRevocationReasonX9e329b29", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMandateBacsDebitRevocationReasonX9e329b29 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMandateBacsDebitRevocationReasonX9e329b29) {
      encoder.encodeString(value.value)
    }
  }
}
