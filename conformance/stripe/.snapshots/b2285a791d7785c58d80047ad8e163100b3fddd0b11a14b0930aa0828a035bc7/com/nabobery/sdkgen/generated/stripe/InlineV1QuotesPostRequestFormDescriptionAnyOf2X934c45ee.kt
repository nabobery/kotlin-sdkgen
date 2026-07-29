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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/description/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/description/anyOf/1
 */
@Serializable(with = InlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee()

  public companion object {
    public fun fromValue(`value`: String): InlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee) {
      encoder.encodeString(value.value)
    }
  }
}
