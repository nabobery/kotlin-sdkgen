package io.github.nabobery.sdkgen.github.generated

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
 * plication~1json/schema/anyOf/1/properties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema/anyOf/1/properties/status
 */
@Serializable(with = InlineReposCheckRunsPatchRequestJsonAnyOf2StatusX6383d0a5.Serializer::class)
public sealed class InlineReposCheckRunsPatchRequestJsonAnyOf2StatusX6383d0a5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineReposCheckRunsPatchRequestJsonAnyOf2StatusX6383d0a5() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineReposCheckRunsPatchRequestJsonAnyOf2StatusX6383d0a5() {
    public override val `value`: String = "in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCheckRunsPatchRequestJsonAnyOf2StatusX6383d0a5()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCheckRunsPatchRequestJsonAnyOf2StatusX6383d0a5 = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposCheckRunsPatchRequestJsonAnyOf2StatusX6383d0a5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposCheckRunsPatchRequestJsonAnyOf2StatusX6383d0a5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPatchRequestJsonAnyOf2StatusX6383d0a5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPatchRequestJsonAnyOf2StatusX6383d0a5) {
      encoder.encodeString(value.value)
    }
  }
}
