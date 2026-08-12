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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f) {
      encoder.encodeString(value.value)
    }
  }
}
