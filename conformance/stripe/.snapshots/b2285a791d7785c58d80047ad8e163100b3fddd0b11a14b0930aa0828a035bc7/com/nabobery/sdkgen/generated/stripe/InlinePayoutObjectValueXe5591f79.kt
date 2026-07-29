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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payout/properties/object
 */
@Serializable(with = InlinePayoutObjectValueXe5591f79.Serializer::class)
public sealed class InlinePayoutObjectValueXe5591f79 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `payout`.
   */
  public data object Payout : InlinePayoutObjectValueXe5591f79() {
    public override val `value`: String = "payout"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePayoutObjectValueXe5591f79()

  public companion object {
    public fun fromValue(`value`: String): InlinePayoutObjectValueXe5591f79 = when (value) {
      Payout.value -> Payout
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePayoutObjectValueXe5591f79> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePayoutObjectValueXe5591f79", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePayoutObjectValueXe5591f79 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePayoutObjectValueXe5591f79) {
      encoder.encodeString(value.value)
    }
  }
}
