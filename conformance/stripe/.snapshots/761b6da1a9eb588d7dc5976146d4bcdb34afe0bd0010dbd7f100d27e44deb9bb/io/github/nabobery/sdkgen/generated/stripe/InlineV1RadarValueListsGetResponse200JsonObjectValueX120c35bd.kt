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
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1value_lists/get/responses/200/content/application~1json/schema/prope
 * rties/object
 */
@Serializable(with = InlineV1RadarValueListsGetResponse200JsonObjectValueX120c35bd.Serializer::class)
public sealed class InlineV1RadarValueListsGetResponse200JsonObjectValueX120c35bd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1RadarValueListsGetResponse200JsonObjectValueX120c35bd() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1RadarValueListsGetResponse200JsonObjectValueX120c35bd()

  public companion object {
    public fun fromValue(`value`: String): InlineV1RadarValueListsGetResponse200JsonObjectValueX120c35bd = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1RadarValueListsGetResponse200JsonObjectValueX120c35bd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1RadarValueListsGetResponse200JsonObjectValueX120c35bd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1RadarValueListsGetResponse200JsonObjectValueX120c35bd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1RadarValueListsGetResponse200JsonObjectValueX120c35bd) {
      encoder.encodeString(value.value)
    }
  }
}
