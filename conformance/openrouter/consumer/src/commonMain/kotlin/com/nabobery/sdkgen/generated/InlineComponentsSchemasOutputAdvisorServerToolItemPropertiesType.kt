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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputAdvisorServerToolItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputAdvisorServerToolItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputAdvisorServerToolItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:advisor`.
   */
  public data object OpenrouterAdvisor : InlineComponentsSchemasOutputAdvisorServerToolItemPropertiesType() {
    public override val `value`: String = "openrouter:advisor"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputAdvisorServerToolItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputAdvisorServerToolItemPropertiesType =
      when (value) {
      OpenrouterAdvisor.value -> OpenrouterAdvisor
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputAdvisorServerToolItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputAdvisorServerToolItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputAdvisorServerToolItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputAdvisorServerToolItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
