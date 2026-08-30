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
 * sdkgen://source/openapi.json#/paths/~1v1~1plans~1{plan}/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1plans~1{plan}/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a.Serializer::class)
public sealed class InlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a) {
      encoder.encodeString(value.value)
    }
  }
}
