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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/role/anyOf/2.
 */
@Serializable(with = InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2.Serializer::class)
public sealed class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assistant`.
   */
  public data object Assistant : InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2() {
    public override val `value`: String = "assistant"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2 =
      when (value) {
      Assistant.value -> Assistant
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2) {
      encoder.encodeString(value.value)
    }
  }
}
