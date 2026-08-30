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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-suites~1{check_suite_id}~1check-runs/get/paramete
 * rs/5/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-suites~1{check_suite_id}~1check-runs/get/paramete
 * rs/5/schema
 */
@Serializable(with = InlineReposCheckSuitesCheckRunsGetParameterXe1020699.Serializer::class)
public sealed class InlineReposCheckSuitesCheckRunsGetParameterXe1020699 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `latest`.
   */
  public data object Latest : InlineReposCheckSuitesCheckRunsGetParameterXe1020699() {
    public override val `value`: String = "latest"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineReposCheckSuitesCheckRunsGetParameterXe1020699() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCheckSuitesCheckRunsGetParameterXe1020699()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCheckSuitesCheckRunsGetParameterXe1020699 = when (value) {
      Latest.value -> Latest
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposCheckSuitesCheckRunsGetParameterXe1020699> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposCheckSuitesCheckRunsGetParameterXe1020699", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCheckSuitesCheckRunsGetParameterXe1020699 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckSuitesCheckRunsGetParameterXe1020699) {
      encoder.encodeString(value.value)
    }
  }
}
