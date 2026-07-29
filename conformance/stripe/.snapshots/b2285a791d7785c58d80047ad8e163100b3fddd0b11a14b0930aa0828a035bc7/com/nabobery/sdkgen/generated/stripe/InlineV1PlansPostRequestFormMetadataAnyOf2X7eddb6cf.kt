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
 * sdkgen://source/openapi.json#/paths/~1v1~1plans/post/requestBody/content/application~1x-www-form-urlencoded/schema/pr
 * operties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1plans/post/requestBody/content/application~1x-www-form-urlencoded/schema/pr
 * operties/metadata/anyOf/1
 */
@Serializable(with = InlineV1PlansPostRequestFormMetadataAnyOf2X7eddb6cf.Serializer::class)
public sealed class InlineV1PlansPostRequestFormMetadataAnyOf2X7eddb6cf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PlansPostRequestFormMetadataAnyOf2X7eddb6cf() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PlansPostRequestFormMetadataAnyOf2X7eddb6cf()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PlansPostRequestFormMetadataAnyOf2X7eddb6cf = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PlansPostRequestFormMetadataAnyOf2X7eddb6cf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PlansPostRequestFormMetadataAnyOf2X7eddb6cf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PlansPostRequestFormMetadataAnyOf2X7eddb6cf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PlansPostRequestFormMetadataAnyOf2X7eddb6cf) {
      encoder.encodeString(value.value)
    }
  }
}
