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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/transfer_data/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/transfer_data/anyOf/1
 */
@Serializable(with = InlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc()

  public companion object {
    public fun fromValue(`value`: String): InlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc) {
      encoder.encodeString(value.value)
    }
  }
}
