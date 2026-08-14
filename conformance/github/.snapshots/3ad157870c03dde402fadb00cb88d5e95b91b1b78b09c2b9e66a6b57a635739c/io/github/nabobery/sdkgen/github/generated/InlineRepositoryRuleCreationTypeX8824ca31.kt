package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-creation/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-creation/properties/type
 */
@Serializable(with = InlineRepositoryRuleCreationTypeX8824ca31.Serializer::class)
public sealed class InlineRepositoryRuleCreationTypeX8824ca31 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `creation`.
   */
  public data object Creation : InlineRepositoryRuleCreationTypeX8824ca31() {
    public override val `value`: String = "creation"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleCreationTypeX8824ca31()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleCreationTypeX8824ca31 = when (value) {
      Creation.value -> Creation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleCreationTypeX8824ca31> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryRuleCreationTypeX8824ca31", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleCreationTypeX8824ca31 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleCreationTypeX8824ca31) {
      encoder.encodeString(value.value)
    }
  }
}
