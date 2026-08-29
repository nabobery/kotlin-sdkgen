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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/application_fee_percent/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/application_fee_percent/anyOf/1
 */
@Serializable(with = InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c) {
      encoder.encodeString(value.value)
    }
  }
}
