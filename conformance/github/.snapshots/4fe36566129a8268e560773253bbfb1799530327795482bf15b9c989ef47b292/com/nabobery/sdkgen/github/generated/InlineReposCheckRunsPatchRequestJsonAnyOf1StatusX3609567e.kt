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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema/anyOf/0/properties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema/anyOf/0/properties/status
 */
@Serializable(with = InlineReposCheckRunsPatchRequestJsonAnyOf1StatusX3609567e.Serializer::class)
public sealed class InlineReposCheckRunsPatchRequestJsonAnyOf1StatusX3609567e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineReposCheckRunsPatchRequestJsonAnyOf1StatusX3609567e() {
    public override val `value`: String = "completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCheckRunsPatchRequestJsonAnyOf1StatusX3609567e()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCheckRunsPatchRequestJsonAnyOf1StatusX3609567e = when (value) {
      Completed.value -> Completed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposCheckRunsPatchRequestJsonAnyOf1StatusX3609567e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposCheckRunsPatchRequestJsonAnyOf1StatusX3609567e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPatchRequestJsonAnyOf1StatusX3609567e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPatchRequestJsonAnyOf1StatusX3609567e) {
      encoder.encodeString(value.value)
    }
  }
}
