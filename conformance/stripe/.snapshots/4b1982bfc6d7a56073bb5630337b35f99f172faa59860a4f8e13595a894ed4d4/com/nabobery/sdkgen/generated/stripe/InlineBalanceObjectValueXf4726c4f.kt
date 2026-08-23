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
 * Source: sdkgen://source/openapi.json#/components/schemas/balance/properties/object
 */
@Serializable(with = InlineBalanceObjectValueXf4726c4f.Serializer::class)
public sealed class InlineBalanceObjectValueXf4726c4f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `balance`.
   */
  public data object Balance : InlineBalanceObjectValueXf4726c4f() {
    public override val `value`: String = "balance"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBalanceObjectValueXf4726c4f()

  public companion object {
    public fun fromValue(`value`: String): InlineBalanceObjectValueXf4726c4f = when (value) {
      Balance.value -> Balance
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBalanceObjectValueXf4726c4f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBalanceObjectValueXf4726c4f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBalanceObjectValueXf4726c4f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBalanceObjectValueXf4726c4f) {
      encoder.encodeString(value.value)
    }
  }
}
