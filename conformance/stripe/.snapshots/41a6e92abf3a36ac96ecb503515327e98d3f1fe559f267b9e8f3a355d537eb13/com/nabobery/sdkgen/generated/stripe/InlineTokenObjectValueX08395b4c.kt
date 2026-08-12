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
 * Source: sdkgen://source/openapi.json#/components/schemas/token/properties/object
 */
@Serializable(with = InlineTokenObjectValueX08395b4c.Serializer::class)
public sealed class InlineTokenObjectValueX08395b4c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `token`.
   */
  public data object Token : InlineTokenObjectValueX08395b4c() {
    public override val `value`: String = "token"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTokenObjectValueX08395b4c()

  public companion object {
    public fun fromValue(`value`: String): InlineTokenObjectValueX08395b4c = when (value) {
      Token.value -> Token
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTokenObjectValueX08395b4c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTokenObjectValueX08395b4c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTokenObjectValueX08395b4c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTokenObjectValueX08395b4c) {
      encoder.encodeString(value.value)
    }
  }
}
