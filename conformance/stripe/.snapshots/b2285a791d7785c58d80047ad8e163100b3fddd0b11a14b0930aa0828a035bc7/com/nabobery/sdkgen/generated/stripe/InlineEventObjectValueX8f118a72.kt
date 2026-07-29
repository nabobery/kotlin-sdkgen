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
 * Source: sdkgen://source/openapi.json#/components/schemas/event/properties/object
 */
@Serializable(with = InlineEventObjectValueX8f118a72.Serializer::class)
public sealed class InlineEventObjectValueX8f118a72 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `event`.
   */
  public data object Event : InlineEventObjectValueX8f118a72() {
    public override val `value`: String = "event"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEventObjectValueX8f118a72()

  public companion object {
    public fun fromValue(`value`: String): InlineEventObjectValueX8f118a72 = when (value) {
      Event.value -> Event
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineEventObjectValueX8f118a72> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineEventObjectValueX8f118a72", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEventObjectValueX8f118a72 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEventObjectValueX8f118a72) {
      encoder.encodeString(value.value)
    }
  }
}
