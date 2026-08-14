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
 * The status of the US customer_balance payments (USD currency) capability of the account, or whether the account can
 * directly process US customer_balance charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/us_bank_transfer_payments
 */
@Serializable(with = InlineAccountCapabilitiesUsBankTransferPaymentsXbbe78834.Serializer::class)
public sealed class InlineAccountCapabilitiesUsBankTransferPaymentsXbbe78834 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesUsBankTransferPaymentsXbbe78834() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesUsBankTransferPaymentsXbbe78834() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesUsBankTransferPaymentsXbbe78834() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesUsBankTransferPaymentsXbbe78834()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesUsBankTransferPaymentsXbbe78834 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesUsBankTransferPaymentsXbbe78834> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesUsBankTransferPaymentsXbbe78834", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesUsBankTransferPaymentsXbbe78834 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesUsBankTransferPaymentsXbbe78834) {
      encoder.encodeString(value.value)
    }
  }
}
