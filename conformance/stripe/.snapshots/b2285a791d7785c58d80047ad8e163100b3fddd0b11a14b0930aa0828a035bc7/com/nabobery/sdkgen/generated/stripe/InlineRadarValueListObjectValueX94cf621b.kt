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
 * Source: sdkgen://source/openapi.json#/components/schemas/radar.value_list/properties/object
 */
@Serializable(with = InlineRadarValueListObjectValueX94cf621b.Serializer::class)
public sealed class InlineRadarValueListObjectValueX94cf621b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `radar.value_list`.
   */
  public data object RadarValueList : InlineRadarValueListObjectValueX94cf621b() {
    public override val `value`: String = "radar.value_list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRadarValueListObjectValueX94cf621b()

  public companion object {
    public fun fromValue(`value`: String): InlineRadarValueListObjectValueX94cf621b = when (value) {
      RadarValueList.value -> RadarValueList
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRadarValueListObjectValueX94cf621b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineRadarValueListObjectValueX94cf621b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRadarValueListObjectValueX94cf621b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRadarValueListObjectValueX94cf621b) {
      encoder.encodeString(value.value)
    }
  }
}
