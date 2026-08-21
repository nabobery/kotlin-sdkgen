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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_radar.value_list_item/properties/object
 */
@Serializable(with = InlineDeletedRadarValueListItemObjectValueXf57fcf1e.Serializer::class)
public sealed class InlineDeletedRadarValueListItemObjectValueXf57fcf1e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `radar.value_list_item`.
   */
  public data object RadarValueListItem : InlineDeletedRadarValueListItemObjectValueXf57fcf1e() {
    public override val `value`: String = "radar.value_list_item"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedRadarValueListItemObjectValueXf57fcf1e()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedRadarValueListItemObjectValueXf57fcf1e = when (value) {
      RadarValueListItem.value -> RadarValueListItem
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedRadarValueListItemObjectValueXf57fcf1e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineDeletedRadarValueListItemObjectValueXf57fcf1e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedRadarValueListItemObjectValueXf57fcf1e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedRadarValueListItemObjectValueXf57fcf1e) {
      encoder.encodeString(value.value)
    }
  }
}
