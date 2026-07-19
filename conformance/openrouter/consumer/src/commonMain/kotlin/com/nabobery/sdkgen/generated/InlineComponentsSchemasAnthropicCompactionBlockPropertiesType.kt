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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCompactionBlock/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCompactionBlockPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCompactionBlockPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `compaction`.
   */
  public data object Compaction : InlineComponentsSchemasAnthropicCompactionBlockPropertiesType() {
    public override val `value`: String = "compaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCompactionBlockPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCompactionBlockPropertiesType =
      when (value) {
      Compaction.value -> Compaction
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCompactionBlockPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCompactionBlockPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCompactionBlockPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicCompactionBlockPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
