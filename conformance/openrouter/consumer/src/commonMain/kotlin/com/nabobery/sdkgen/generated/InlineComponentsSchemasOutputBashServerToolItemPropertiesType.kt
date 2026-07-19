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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputBashServerToolItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputBashServerToolItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputBashServerToolItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:bash`.
   */
  public data object OpenrouterBash : InlineComponentsSchemasOutputBashServerToolItemPropertiesType() {
    public override val `value`: String = "openrouter:bash"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputBashServerToolItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputBashServerToolItemPropertiesType =
      when (value) {
      OpenrouterBash.value -> OpenrouterBash
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputBashServerToolItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputBashServerToolItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputBashServerToolItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputBashServerToolItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
