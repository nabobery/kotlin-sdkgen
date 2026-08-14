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
 * The reason the review was opened. One of `rule` or `manual`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/review/properties/opened_reason
 */
@Serializable(with = InlineReviewOpenedReasonXa94cf867.Serializer::class)
public sealed class InlineReviewOpenedReasonXa94cf867 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineReviewOpenedReasonXa94cf867() {
    public override val `value`: String = "manual"
  }

  /**
   * Documented value. Wire value: `rule`.
   */
  public data object Rule : InlineReviewOpenedReasonXa94cf867() {
    public override val `value`: String = "rule"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReviewOpenedReasonXa94cf867()

  public companion object {
    public fun fromValue(`value`: String): InlineReviewOpenedReasonXa94cf867 = when (value) {
      Manual.value -> Manual
      Rule.value -> Rule
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReviewOpenedReasonXa94cf867> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineReviewOpenedReasonXa94cf867", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReviewOpenedReasonXa94cf867 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReviewOpenedReasonXa94cf867) {
      encoder.encodeString(value.value)
    }
  }
}
