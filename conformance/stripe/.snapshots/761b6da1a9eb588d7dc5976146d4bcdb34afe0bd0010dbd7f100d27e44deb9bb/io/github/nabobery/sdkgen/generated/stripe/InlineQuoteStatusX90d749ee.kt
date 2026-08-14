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
 * The status of the quote.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quote/properties/status
 */
@Serializable(with = InlineQuoteStatusX90d749ee.Serializer::class)
public sealed class InlineQuoteStatusX90d749ee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `accepted`.
   */
  public data object Accepted : InlineQuoteStatusX90d749ee() {
    public override val `value`: String = "accepted"
  }

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineQuoteStatusX90d749ee() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `draft`.
   */
  public data object Draft : InlineQuoteStatusX90d749ee() {
    public override val `value`: String = "draft"
  }

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineQuoteStatusX90d749ee() {
    public override val `value`: String = "open"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineQuoteStatusX90d749ee()

  public companion object {
    public fun fromValue(`value`: String): InlineQuoteStatusX90d749ee = when (value) {
      Accepted.value -> Accepted
      Canceled.value -> Canceled
      Draft.value -> Draft
      Open.value -> Open
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineQuoteStatusX90d749ee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineQuoteStatusX90d749ee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineQuoteStatusX90d749ee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineQuoteStatusX90d749ee) {
      encoder.encodeString(value.value)
    }
  }
}
