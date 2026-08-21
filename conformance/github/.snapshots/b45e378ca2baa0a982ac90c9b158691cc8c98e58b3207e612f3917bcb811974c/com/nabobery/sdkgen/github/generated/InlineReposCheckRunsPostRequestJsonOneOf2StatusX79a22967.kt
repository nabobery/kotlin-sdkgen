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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/oneOf/1/properties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/oneOf/1/properties/status
 */
@Serializable(with = InlineReposCheckRunsPostRequestJsonOneOf2StatusX79a22967.Serializer::class)
public sealed class InlineReposCheckRunsPostRequestJsonOneOf2StatusX79a22967 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineReposCheckRunsPostRequestJsonOneOf2StatusX79a22967() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineReposCheckRunsPostRequestJsonOneOf2StatusX79a22967() {
    public override val `value`: String = "in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCheckRunsPostRequestJsonOneOf2StatusX79a22967()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCheckRunsPostRequestJsonOneOf2StatusX79a22967 = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposCheckRunsPostRequestJsonOneOf2StatusX79a22967> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposCheckRunsPostRequestJsonOneOf2StatusX79a22967", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPostRequestJsonOneOf2StatusX79a22967 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPostRequestJsonOneOf2StatusX79a22967) {
      encoder.encodeString(value.value)
    }
  }
}
