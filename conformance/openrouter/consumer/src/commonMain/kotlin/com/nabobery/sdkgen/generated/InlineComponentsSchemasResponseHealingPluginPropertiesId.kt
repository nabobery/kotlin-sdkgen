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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ResponseHealingPlugin/properties/id.
 */
@Serializable(with = InlineComponentsSchemasResponseHealingPluginPropertiesId.Serializer::class)
public sealed class InlineComponentsSchemasResponseHealingPluginPropertiesId {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response-healing`.
   */
  public data object ResponseHealing : InlineComponentsSchemasResponseHealingPluginPropertiesId() {
    public override val `value`: String = "response-healing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasResponseHealingPluginPropertiesId()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasResponseHealingPluginPropertiesId = when (value) {
      ResponseHealing.value -> ResponseHealing
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasResponseHealingPluginPropertiesId> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasResponseHealingPluginPropertiesId", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasResponseHealingPluginPropertiesId =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasResponseHealingPluginPropertiesId) {
      encoder.encodeString(value.value)
    }
  }
}
