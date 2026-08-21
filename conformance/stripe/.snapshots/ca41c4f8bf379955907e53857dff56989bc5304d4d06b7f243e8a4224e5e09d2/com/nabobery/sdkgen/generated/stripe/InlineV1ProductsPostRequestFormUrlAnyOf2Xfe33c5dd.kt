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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{id}/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/url/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{id}/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/url/anyOf/1
 */
@Serializable(with = InlineV1ProductsPostRequestFormUrlAnyOf2Xfe33c5dd.Serializer::class)
public sealed class InlineV1ProductsPostRequestFormUrlAnyOf2Xfe33c5dd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1ProductsPostRequestFormUrlAnyOf2Xfe33c5dd() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ProductsPostRequestFormUrlAnyOf2Xfe33c5dd()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ProductsPostRequestFormUrlAnyOf2Xfe33c5dd = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ProductsPostRequestFormUrlAnyOf2Xfe33c5dd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1ProductsPostRequestFormUrlAnyOf2Xfe33c5dd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormUrlAnyOf2Xfe33c5dd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ProductsPostRequestFormUrlAnyOf2Xfe33c5dd) {
      encoder.encodeString(value.value)
    }
  }
}
