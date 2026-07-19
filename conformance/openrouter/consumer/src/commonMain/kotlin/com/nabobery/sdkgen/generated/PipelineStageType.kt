package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Categorical kind of a pipeline stage. Multiple plugins can share a type (e.g. all guardrail-level plugins emit
 * `guardrail`); the `name` field disambiguates which plugin emitted it.
 */
@Serializable(with = PipelineStageType.Serializer::class)
public sealed class PipelineStageType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `guardrail`.
   */
  public data object Guardrail : PipelineStageType() {
    public override val `value`: String = "guardrail"
  }

  /**
   * Documented value. Wire value: `plugin`.
   */
  public data object Plugin : PipelineStageType() {
    public override val `value`: String = "plugin"
  }

  /**
   * Documented value. Wire value: `server_tools`.
   */
  public data object ServerTools : PipelineStageType() {
    public override val `value`: String = "server_tools"
  }

  /**
   * Documented value. Wire value: `response_healing`.
   */
  public data object ResponseHealing : PipelineStageType() {
    public override val `value`: String = "response_healing"
  }

  /**
   * Documented value. Wire value: `context_compression`.
   */
  public data object ContextCompression : PipelineStageType() {
    public override val `value`: String = "context_compression"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : PipelineStageType()

  public companion object {
    public fun fromValue(`value`: String): PipelineStageType = when (value) {
      Guardrail.value -> Guardrail
      Plugin.value -> Plugin
      ServerTools.value -> ServerTools
      ResponseHealing.value -> ResponseHealing
      ContextCompression.value -> ContextCompression
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<PipelineStageType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.PipelineStageType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): PipelineStageType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: PipelineStageType) {
      encoder.encodeString(value.value)
    }
  }
}
