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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseRefusalDoneEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBaseRefusalDoneEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseRefusalDoneEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.refusal.done`.
   */
  public data object ResponseRefusalDone : InlineComponentsSchemasBaseRefusalDoneEventPropertiesType() {
    public override val `value`: String = "response.refusal.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseRefusalDoneEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseRefusalDoneEventPropertiesType = when (value) {
      ResponseRefusalDone.value -> ResponseRefusalDone
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseRefusalDoneEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseRefusalDoneEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseRefusalDoneEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasBaseRefusalDoneEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
