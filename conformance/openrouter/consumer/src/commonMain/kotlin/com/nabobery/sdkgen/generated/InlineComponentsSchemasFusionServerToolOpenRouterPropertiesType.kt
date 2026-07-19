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
 * sdkgen://source/openapi.yaml#/components/schemas/FusionServerTool_OpenRouter/properties/type.
 */
@Serializable(with = InlineComponentsSchemasFusionServerToolOpenRouterPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFusionServerToolOpenRouterPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:fusion`.
   */
  public data object OpenrouterFusion : InlineComponentsSchemasFusionServerToolOpenRouterPropertiesType() {
    public override val `value`: String = "openrouter:fusion"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFusionServerToolOpenRouterPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFusionServerToolOpenRouterPropertiesType =
      when (value) {
      OpenrouterFusion.value -> OpenrouterFusion
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionServerToolOpenRouterPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFusionServerToolOpenRouterPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionServerToolOpenRouterPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFusionServerToolOpenRouterPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
