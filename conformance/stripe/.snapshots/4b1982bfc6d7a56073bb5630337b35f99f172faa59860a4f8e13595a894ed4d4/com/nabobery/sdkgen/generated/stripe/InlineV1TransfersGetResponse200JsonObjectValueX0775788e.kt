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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1transfers/get/responses/200/content/application~1json/schema/properties/obj
 * ect
 */
@Serializable(with = InlineV1TransfersGetResponse200JsonObjectValueX0775788e.Serializer::class)
public sealed class InlineV1TransfersGetResponse200JsonObjectValueX0775788e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1TransfersGetResponse200JsonObjectValueX0775788e() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TransfersGetResponse200JsonObjectValueX0775788e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TransfersGetResponse200JsonObjectValueX0775788e = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TransfersGetResponse200JsonObjectValueX0775788e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TransfersGetResponse200JsonObjectValueX0775788e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TransfersGetResponse200JsonObjectValueX0775788e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TransfersGetResponse200JsonObjectValueX0775788e) {
      encoder.encodeString(value.value)
    }
  }
}
