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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputBrowserUseServerToolItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputBrowserUseServerToolItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputBrowserUseServerToolItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:browser_use`.
   */
  public data object OpenrouterBrowserUse : InlineComponentsSchemasOutputBrowserUseServerToolItemPropertiesType() {
    public override val `value`: String = "openrouter:browser_use"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputBrowserUseServerToolItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputBrowserUseServerToolItemPropertiesType =
      when (value) {
      OpenrouterBrowserUse.value -> OpenrouterBrowserUse
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputBrowserUseServerToolItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputBrowserUseServerToolItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputBrowserUseServerToolItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputBrowserUseServerToolItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
