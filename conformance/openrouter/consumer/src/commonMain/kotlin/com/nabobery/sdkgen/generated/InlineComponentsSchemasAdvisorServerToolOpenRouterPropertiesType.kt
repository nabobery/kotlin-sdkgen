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
 * sdkgen://source/openapi.yaml#/components/schemas/AdvisorServerTool_OpenRouter/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAdvisorServerToolOpenRouterPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAdvisorServerToolOpenRouterPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:advisor`.
   */
  public data object OpenrouterAdvisor : InlineComponentsSchemasAdvisorServerToolOpenRouterPropertiesType() {
    public override val `value`: String = "openrouter:advisor"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAdvisorServerToolOpenRouterPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAdvisorServerToolOpenRouterPropertiesType =
      when (value) {
      OpenrouterAdvisor.value -> OpenrouterAdvisor
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAdvisorServerToolOpenRouterPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAdvisorServerToolOpenRouterPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAdvisorServerToolOpenRouterPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAdvisorServerToolOpenRouterPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
