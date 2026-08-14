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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/discounts/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/discounts/anyOf/1
 */
@Serializable(with = InlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5()

  public companion object {
    public fun fromValue(`value`: String): InlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5) {
      encoder.encodeString(value.value)
    }
  }
}
