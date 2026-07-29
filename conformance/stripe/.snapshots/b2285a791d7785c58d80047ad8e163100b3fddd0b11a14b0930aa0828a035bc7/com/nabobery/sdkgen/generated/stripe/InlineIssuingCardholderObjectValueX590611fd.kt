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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.cardholder/properties/object
 */
@Serializable(with = InlineIssuingCardholderObjectValueX590611fd.Serializer::class)
public sealed class InlineIssuingCardholderObjectValueX590611fd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `issuing.cardholder`.
   */
  public data object IssuingCardholder : InlineIssuingCardholderObjectValueX590611fd() {
    public override val `value`: String = "issuing.cardholder"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardholderObjectValueX590611fd()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardholderObjectValueX590611fd = when (value) {
      IssuingCardholder.value -> IssuingCardholder
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuingCardholderObjectValueX590611fd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingCardholderObjectValueX590611fd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderObjectValueX590611fd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderObjectValueX590611fd) {
      encoder.encodeString(value.value)
    }
  }
}
