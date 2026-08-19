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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AdvisorServerTool_OpenRouter/properties/type
 */
@Serializable(with = InlineAdvisorServerToolOpenRouterTypeX7fe9a42d.Serializer::class)
public sealed class InlineAdvisorServerToolOpenRouterTypeX7fe9a42d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:advisor`.
   */
  public data object OpenrouterAdvisor : InlineAdvisorServerToolOpenRouterTypeX7fe9a42d() {
    public override val `value`: String = "openrouter:advisor"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAdvisorServerToolOpenRouterTypeX7fe9a42d()

  public companion object {
    public fun fromValue(`value`: String): InlineAdvisorServerToolOpenRouterTypeX7fe9a42d = when (value) {
      OpenrouterAdvisor.value -> OpenrouterAdvisor
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAdvisorServerToolOpenRouterTypeX7fe9a42d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAdvisorServerToolOpenRouterTypeX7fe9a42d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAdvisorServerToolOpenRouterTypeX7fe9a42d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAdvisorServerToolOpenRouterTypeX7fe9a42d) {
      encoder.encodeString(value.value)
    }
  }
}
