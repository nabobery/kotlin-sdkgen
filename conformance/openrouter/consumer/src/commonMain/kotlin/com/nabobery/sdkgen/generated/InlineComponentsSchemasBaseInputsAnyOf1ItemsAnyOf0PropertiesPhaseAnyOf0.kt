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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/phase/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0.Serializer::class)
public sealed class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `commentary`.
   */
  public data object Commentary : InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0() {
    public override val `value`: String = "commentary"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0 =
      when (value) {
      Commentary.value -> Commentary
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0) {
      encoder.encodeString(value.value)
    }
  }
}
