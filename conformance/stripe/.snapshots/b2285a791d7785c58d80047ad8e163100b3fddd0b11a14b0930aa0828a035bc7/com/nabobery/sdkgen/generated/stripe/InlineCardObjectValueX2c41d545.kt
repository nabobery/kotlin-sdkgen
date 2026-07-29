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
 * Source: sdkgen://source/openapi.json#/components/schemas/card/properties/object
 */
@Serializable(with = InlineCardObjectValueX2c41d545.Serializer::class)
public sealed class InlineCardObjectValueX2c41d545 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineCardObjectValueX2c41d545() {
    public override val `value`: String = "card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCardObjectValueX2c41d545()

  public companion object {
    public fun fromValue(`value`: String): InlineCardObjectValueX2c41d545 = when (value) {
      Card.value -> Card
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCardObjectValueX2c41d545> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCardObjectValueX2c41d545", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCardObjectValueX2c41d545 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCardObjectValueX2c41d545) {
      encoder.encodeString(value.value)
    }
  }
}
