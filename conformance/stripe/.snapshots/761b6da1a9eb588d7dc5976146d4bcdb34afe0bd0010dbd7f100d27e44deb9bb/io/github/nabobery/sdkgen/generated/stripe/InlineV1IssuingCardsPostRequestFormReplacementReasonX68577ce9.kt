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
 * If `replacement_for` is specified, this should indicate why that card is being replaced.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/replacement_reason
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormReplacementReasonX68577ce9.Serializer::class)
public sealed class InlineV1IssuingCardsPostRequestFormReplacementReasonX68577ce9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `damaged`.
   */
  public data object Damaged : InlineV1IssuingCardsPostRequestFormReplacementReasonX68577ce9() {
    public override val `value`: String = "damaged"
  }

  /**
   * Documented value. Wire value: `expired`.
   */
  public data object Expired : InlineV1IssuingCardsPostRequestFormReplacementReasonX68577ce9() {
    public override val `value`: String = "expired"
  }

  /**
   * Documented value. Wire value: `lost`.
   */
  public data object Lost : InlineV1IssuingCardsPostRequestFormReplacementReasonX68577ce9() {
    public override val `value`: String = "lost"
  }

  /**
   * Documented value. Wire value: `stolen`.
   */
  public data object Stolen : InlineV1IssuingCardsPostRequestFormReplacementReasonX68577ce9() {
    public override val `value`: String = "stolen"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingCardsPostRequestFormReplacementReasonX68577ce9()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingCardsPostRequestFormReplacementReasonX68577ce9 = when (value) {
      Damaged.value -> Damaged
      Expired.value -> Expired
      Lost.value -> Lost
      Stolen.value -> Stolen
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormReplacementReasonX68577ce9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsPostRequestFormReplacementReasonX68577ce9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormReplacementReasonX68577ce9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormReplacementReasonX68577ce9) {
      encoder.encodeString(value.value)
    }
  }
}
