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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BashServerTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBashServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBashServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:bash`.
   */
  public data object OpenrouterBash : InlineComponentsSchemasBashServerToolPropertiesType() {
    public override val `value`: String = "openrouter:bash"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBashServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBashServerToolPropertiesType = when (value) {
      OpenrouterBash.value -> OpenrouterBash
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBashServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBashServerToolPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBashServerToolPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasBashServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
