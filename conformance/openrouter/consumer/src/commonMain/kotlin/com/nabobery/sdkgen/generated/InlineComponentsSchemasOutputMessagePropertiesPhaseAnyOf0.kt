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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/phase/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0.Serializer::class)
public sealed class InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `commentary`.
   */
  public data object Commentary : InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0() {
    public override val `value`: String = "commentary"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0 = when (value) {
      Commentary.value -> Commentary
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0) {
      encoder.encodeString(value.value)
    }
  }
}
