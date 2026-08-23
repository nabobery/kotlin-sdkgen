package com.nabobery.sdkgen.github.generated

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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team-full/properties/type
 */
@Serializable(with = InlineTeamFullTypeX660d86a2.Serializer::class)
public sealed class InlineTeamFullTypeX660d86a2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineTeamFullTypeX660d86a2() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineTeamFullTypeX660d86a2() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamFullTypeX660d86a2()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamFullTypeX660d86a2 = when (value) {
      Enterprise.value -> Enterprise
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTeamFullTypeX660d86a2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineTeamFullTypeX660d86a2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamFullTypeX660d86a2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamFullTypeX660d86a2) {
      encoder.encodeString(value.value)
    }
  }
}
