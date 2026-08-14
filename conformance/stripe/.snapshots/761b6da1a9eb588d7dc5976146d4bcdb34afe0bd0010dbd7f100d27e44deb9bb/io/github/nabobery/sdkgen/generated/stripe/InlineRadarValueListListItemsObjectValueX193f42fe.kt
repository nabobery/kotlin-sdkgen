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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar.value_list/properties/list_items/properties/object
 */
@Serializable(with = InlineRadarValueListListItemsObjectValueX193f42fe.Serializer::class)
public sealed class InlineRadarValueListListItemsObjectValueX193f42fe {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineRadarValueListListItemsObjectValueX193f42fe() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRadarValueListListItemsObjectValueX193f42fe()

  public companion object {
    public fun fromValue(`value`: String): InlineRadarValueListListItemsObjectValueX193f42fe = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRadarValueListListItemsObjectValueX193f42fe> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineRadarValueListListItemsObjectValueX193f42fe", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRadarValueListListItemsObjectValueX193f42fe = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRadarValueListListItemsObjectValueX193f42fe) {
      encoder.encodeString(value.value)
    }
  }
}
