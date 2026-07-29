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
 * chema/oneOf/0/properties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/oneOf/0/properties/status
 */
@Serializable(with = InlineReposCheckRunsPostRequestJsonOneOf1StatusXf32f00a6.Serializer::class)
public sealed class InlineReposCheckRunsPostRequestJsonOneOf1StatusXf32f00a6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineReposCheckRunsPostRequestJsonOneOf1StatusXf32f00a6() {
    public override val `value`: String = "completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCheckRunsPostRequestJsonOneOf1StatusXf32f00a6()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCheckRunsPostRequestJsonOneOf1StatusXf32f00a6 = when (value) {
      Completed.value -> Completed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposCheckRunsPostRequestJsonOneOf1StatusXf32f00a6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposCheckRunsPostRequestJsonOneOf1StatusXf32f00a6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPostRequestJsonOneOf1StatusXf32f00a6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPostRequestJsonOneOf1StatusXf32f00a6) {
      encoder.encodeString(value.value)
    }
  }
}
