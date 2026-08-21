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
 * Reason why the `status` of this card is `canceled`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/cancellation_reason
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormCancellationReasonXe67ea8ba.Serializer::class)
public sealed class InlineV1IssuingCardsPostRequestFormCancellationReasonXe67ea8ba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `lost`.
   */
  public data object Lost : InlineV1IssuingCardsPostRequestFormCancellationReasonXe67ea8ba() {
    public override val `value`: String = "lost"
  }

  /**
   * Documented value. Wire value: `stolen`.
   */
  public data object Stolen : InlineV1IssuingCardsPostRequestFormCancellationReasonXe67ea8ba() {
    public override val `value`: String = "stolen"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingCardsPostRequestFormCancellationReasonXe67ea8ba()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingCardsPostRequestFormCancellationReasonXe67ea8ba = when (value) {
      Lost.value -> Lost
      Stolen.value -> Stolen
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormCancellationReasonXe67ea8ba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsPostRequestFormCancellationReasonXe67ea8ba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormCancellationReasonXe67ea8ba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormCancellationReasonXe67ea8ba) {
      encoder.encodeString(value.value)
    }
  }
}
