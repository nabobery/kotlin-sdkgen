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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account/properties/object
 */
@Serializable(with = InlineAccountObjectValueX7a2c1f55.Serializer::class)
public sealed class InlineAccountObjectValueX7a2c1f55 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineAccountObjectValueX7a2c1f55() {
    public override val `value`: String = "account"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountObjectValueX7a2c1f55()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountObjectValueX7a2c1f55 = when (value) {
      Account.value -> Account
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountObjectValueX7a2c1f55> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountObjectValueX7a2c1f55", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountObjectValueX7a2c1f55 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountObjectValueX7a2c1f55) {
      encoder.encodeString(value.value)
    }
  }
}
