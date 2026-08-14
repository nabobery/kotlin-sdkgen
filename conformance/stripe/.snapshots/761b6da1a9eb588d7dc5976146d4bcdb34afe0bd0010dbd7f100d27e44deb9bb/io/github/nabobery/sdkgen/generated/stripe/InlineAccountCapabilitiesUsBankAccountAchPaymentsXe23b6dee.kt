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
 * The status of the US bank account ACH payments capability of the account, or whether the account can directly process
 * US bank account charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/us_bank_account_ach_payments
 */
@Serializable(with = InlineAccountCapabilitiesUsBankAccountAchPaymentsXe23b6dee.Serializer::class)
public sealed class InlineAccountCapabilitiesUsBankAccountAchPaymentsXe23b6dee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesUsBankAccountAchPaymentsXe23b6dee() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesUsBankAccountAchPaymentsXe23b6dee() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesUsBankAccountAchPaymentsXe23b6dee() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesUsBankAccountAchPaymentsXe23b6dee()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesUsBankAccountAchPaymentsXe23b6dee = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesUsBankAccountAchPaymentsXe23b6dee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesUsBankAccountAchPaymentsXe23b6dee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesUsBankAccountAchPaymentsXe23b6dee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesUsBankAccountAchPaymentsXe23b6dee) {
      encoder.encodeString(value.value)
    }
  }
}
