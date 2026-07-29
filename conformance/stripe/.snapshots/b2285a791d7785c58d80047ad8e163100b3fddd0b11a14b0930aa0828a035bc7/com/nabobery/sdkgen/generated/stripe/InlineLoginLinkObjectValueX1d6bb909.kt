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
 * Source: sdkgen://source/openapi.json#/components/schemas/login_link/properties/object
 */
@Serializable(with = InlineLoginLinkObjectValueX1d6bb909.Serializer::class)
public sealed class InlineLoginLinkObjectValueX1d6bb909 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `login_link`.
   */
  public data object LoginLink : InlineLoginLinkObjectValueX1d6bb909() {
    public override val `value`: String = "login_link"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineLoginLinkObjectValueX1d6bb909()

  public companion object {
    public fun fromValue(`value`: String): InlineLoginLinkObjectValueX1d6bb909 = when (value) {
      LoginLink.value -> LoginLink
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineLoginLinkObjectValueX1d6bb909> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineLoginLinkObjectValueX1d6bb909", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineLoginLinkObjectValueX1d6bb909 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineLoginLinkObjectValueX1d6bb909) {
      encoder.encodeString(value.value)
    }
  }
}
