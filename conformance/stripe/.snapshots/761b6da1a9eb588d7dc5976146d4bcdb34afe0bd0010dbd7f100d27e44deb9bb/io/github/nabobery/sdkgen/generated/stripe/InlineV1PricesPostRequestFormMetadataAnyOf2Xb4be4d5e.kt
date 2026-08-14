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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1prices~1{price}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices~1{price}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1PricesPostRequestFormMetadataAnyOf2Xb4be4d5e.Serializer::class)
public sealed class InlineV1PricesPostRequestFormMetadataAnyOf2Xb4be4d5e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PricesPostRequestFormMetadataAnyOf2Xb4be4d5e() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PricesPostRequestFormMetadataAnyOf2Xb4be4d5e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PricesPostRequestFormMetadataAnyOf2Xb4be4d5e = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PricesPostRequestFormMetadataAnyOf2Xb4be4d5e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PricesPostRequestFormMetadataAnyOf2Xb4be4d5e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormMetadataAnyOf2Xb4be4d5e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormMetadataAnyOf2Xb4be4d5e) {
      encoder.encodeString(value.value)
    }
  }
}
