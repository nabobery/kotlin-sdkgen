package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputAdvisorServerToolItem/properties/type
 */
@Serializable(with = InlineOutputAdvisorServerToolItemTypeX996c03cf.Serializer::class)
public sealed class InlineOutputAdvisorServerToolItemTypeX996c03cf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:advisor`.
   */
  public data object OpenrouterAdvisor : InlineOutputAdvisorServerToolItemTypeX996c03cf() {
    public override val `value`: String = "openrouter:advisor"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputAdvisorServerToolItemTypeX996c03cf()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputAdvisorServerToolItemTypeX996c03cf = when (value) {
      OpenrouterAdvisor.value -> OpenrouterAdvisor
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputAdvisorServerToolItemTypeX996c03cf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputAdvisorServerToolItemTypeX996c03cf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputAdvisorServerToolItemTypeX996c03cf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputAdvisorServerToolItemTypeX996c03cf) {
      encoder.encodeString(value.value)
    }
  }
}
