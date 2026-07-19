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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/input_fidelity.
 */
@Serializable(with = InlineComponentsSchemasImageGenerationServerToolPropertiesInputFidelity.Serializer::class)
public sealed class InlineComponentsSchemasImageGenerationServerToolPropertiesInputFidelity {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineComponentsSchemasImageGenerationServerToolPropertiesInputFidelity() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineComponentsSchemasImageGenerationServerToolPropertiesInputFidelity() {
    public override val `value`: String = "low"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasImageGenerationServerToolPropertiesInputFidelity()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasImageGenerationServerToolPropertiesInputFidelity =
      when (value) {
      High.value -> High
      Low.value -> Low
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationServerToolPropertiesInputFidelity> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasImageGenerationServerToolPropertiesInputFidelity", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationServerToolPropertiesInputFidelity = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationServerToolPropertiesInputFidelity) {
      encoder.encodeString(value.value)
    }
  }
}
