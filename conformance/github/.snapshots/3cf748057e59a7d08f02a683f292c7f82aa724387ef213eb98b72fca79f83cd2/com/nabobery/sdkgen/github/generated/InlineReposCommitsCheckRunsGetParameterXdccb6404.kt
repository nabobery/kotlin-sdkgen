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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1commits~1{ref}~1check-runs/get/parameters/5/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1commits~1{ref}~1check-runs/get/parameters/5/schema
 */
@Serializable(with = InlineReposCommitsCheckRunsGetParameterXdccb6404.Serializer::class)
public sealed class InlineReposCommitsCheckRunsGetParameterXdccb6404 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `latest`.
   */
  public data object Latest : InlineReposCommitsCheckRunsGetParameterXdccb6404() {
    public override val `value`: String = "latest"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineReposCommitsCheckRunsGetParameterXdccb6404() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCommitsCheckRunsGetParameterXdccb6404()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCommitsCheckRunsGetParameterXdccb6404 = when (value) {
      Latest.value -> Latest
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposCommitsCheckRunsGetParameterXdccb6404> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposCommitsCheckRunsGetParameterXdccb6404", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCommitsCheckRunsGetParameterXdccb6404 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCommitsCheckRunsGetParameterXdccb6404) {
      encoder.encodeString(value.value)
    }
  }
}
