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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning/properties/status/anyOf/2.
 */
@Serializable(with = InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2.Serializer::class)
public sealed class InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2() {
    public override val `value`: String = "in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2 =
      when (value) {
      InProgress.value -> InProgress
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2) {
      encoder.encodeString(value.value)
    }
  }
}
