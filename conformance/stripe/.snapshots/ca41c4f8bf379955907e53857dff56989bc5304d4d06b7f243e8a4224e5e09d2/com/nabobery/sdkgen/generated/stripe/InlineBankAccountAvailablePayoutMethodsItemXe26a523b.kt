package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/bank_account/properties/available_payout_methods/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_account/properties/available_payout_methods/items
 */
@Serializable(with = InlineBankAccountAvailablePayoutMethodsItemXe26a523b.Serializer::class)
public sealed class InlineBankAccountAvailablePayoutMethodsItemXe26a523b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `instant`.
   */
  public data object Instant : InlineBankAccountAvailablePayoutMethodsItemXe26a523b() {
    public override val `value`: String = "instant"
  }

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineBankAccountAvailablePayoutMethodsItemXe26a523b() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBankAccountAvailablePayoutMethodsItemXe26a523b()

  public companion object {
    public fun fromValue(`value`: String): InlineBankAccountAvailablePayoutMethodsItemXe26a523b = when (value) {
      Instant.value -> Instant
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBankAccountAvailablePayoutMethodsItemXe26a523b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBankAccountAvailablePayoutMethodsItemXe26a523b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBankAccountAvailablePayoutMethodsItemXe26a523b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBankAccountAvailablePayoutMethodsItemXe26a523b) {
      encoder.encodeString(value.value)
    }
  }
}
