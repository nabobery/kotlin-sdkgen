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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputItemDoneEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputItemDoneEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputItemDoneEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.output_item.done`.
   */
  public data object ResponseOutputItemDone : InlineComponentsSchemasOutputItemDoneEventPropertiesType() {
    public override val `value`: String = "response.output_item.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputItemDoneEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputItemDoneEventPropertiesType = when (value) {
      ResponseOutputItemDone.value -> ResponseOutputItemDone
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemDoneEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputItemDoneEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemDoneEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputItemDoneEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
