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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs~1{run_id}~1jobs/get/parameters/3/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs~1{run_id}~1jobs/get/parameters/3/schema
 */
@Serializable(with = InlineReposActionsRunsJobsGetParameterXed582ec8.Serializer::class)
public sealed class InlineReposActionsRunsJobsGetParameterXed582ec8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `latest`.
   */
  public data object Latest : InlineReposActionsRunsJobsGetParameterXed582ec8() {
    public override val `value`: String = "latest"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineReposActionsRunsJobsGetParameterXed582ec8() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposActionsRunsJobsGetParameterXed582ec8()

  public companion object {
    public fun fromValue(`value`: String): InlineReposActionsRunsJobsGetParameterXed582ec8 = when (value) {
      Latest.value -> Latest
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposActionsRunsJobsGetParameterXed582ec8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposActionsRunsJobsGetParameterXed582ec8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposActionsRunsJobsGetParameterXed582ec8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsRunsJobsGetParameterXed582ec8) {
      encoder.encodeString(value.value)
    }
  }
}
