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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/role/anyOf/2
 */
@Serializable(with = InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877.Serializer::class)
public sealed class InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assistant`.
   */
  public data object Assistant : InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877() {
    public override val `value`: String = "assistant"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877 = when (value) {
      Assistant.value -> Assistant
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877) {
      encoder.encodeString(value.value)
    }
  }
}
