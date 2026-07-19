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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatFormatGrammarConfig/properties/type.
 */
@Serializable(with = InlineComponentsSchemasChatFormatGrammarConfigPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasChatFormatGrammarConfigPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `grammar`.
   */
  public data object Grammar : InlineComponentsSchemasChatFormatGrammarConfigPropertiesType() {
    public override val `value`: String = "grammar"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatFormatGrammarConfigPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatFormatGrammarConfigPropertiesType = when (value) {
      Grammar.value -> Grammar
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatFormatGrammarConfigPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatFormatGrammarConfigPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatFormatGrammarConfigPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatFormatGrammarConfigPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
