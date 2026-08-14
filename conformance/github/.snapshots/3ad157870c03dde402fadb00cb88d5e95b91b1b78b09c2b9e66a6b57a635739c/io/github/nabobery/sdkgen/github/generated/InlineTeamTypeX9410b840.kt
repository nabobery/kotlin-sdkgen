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
 * The ownership type of the team
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team/properties/type
 */
@Serializable(with = InlineTeamTypeX9410b840.Serializer::class)
public sealed class InlineTeamTypeX9410b840 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineTeamTypeX9410b840() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineTeamTypeX9410b840() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamTypeX9410b840()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamTypeX9410b840 = when (value) {
      Enterprise.value -> Enterprise
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTeamTypeX9410b840> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineTeamTypeX9410b840", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamTypeX9410b840 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamTypeX9410b840) {
      encoder.encodeString(value.value)
    }
  }
}
