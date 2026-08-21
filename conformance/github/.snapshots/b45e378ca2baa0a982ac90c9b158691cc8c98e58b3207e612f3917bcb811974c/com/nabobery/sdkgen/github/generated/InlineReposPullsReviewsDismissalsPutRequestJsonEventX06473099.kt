package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1reviews~1{review_id}~1dismissals/
 * put/requestBody/content/application~1json/schema/properties/event.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1reviews~1{review_id}~1dismissals/
 * put/requestBody/content/application~1json/schema/properties/event
 */
@Serializable(with = InlineReposPullsReviewsDismissalsPutRequestJsonEventX06473099.Serializer::class)
public sealed class InlineReposPullsReviewsDismissalsPutRequestJsonEventX06473099 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `DISMISS`.
   */
  public data object Dismiss : InlineReposPullsReviewsDismissalsPutRequestJsonEventX06473099() {
    public override val `value`: String = "DISMISS"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPullsReviewsDismissalsPutRequestJsonEventX06473099()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPullsReviewsDismissalsPutRequestJsonEventX06473099 = when (value) {
      Dismiss.value -> Dismiss
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPullsReviewsDismissalsPutRequestJsonEventX06473099> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposPullsReviewsDismissalsPutRequestJsonEventX06473099", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPullsReviewsDismissalsPutRequestJsonEventX06473099 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsReviewsDismissalsPutRequestJsonEventX06473099) {
      encoder.encodeString(value.value)
    }
  }
}
