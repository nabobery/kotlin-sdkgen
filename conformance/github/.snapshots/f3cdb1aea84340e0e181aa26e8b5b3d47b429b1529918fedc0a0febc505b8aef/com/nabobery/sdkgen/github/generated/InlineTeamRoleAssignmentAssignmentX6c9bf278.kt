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
 * Determines if the team has a direct, indirect, or mixed relationship to a role
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team-role-assignment/properties/assignment
 */
@Serializable(with = InlineTeamRoleAssignmentAssignmentX6c9bf278.Serializer::class)
public sealed class InlineTeamRoleAssignmentAssignmentX6c9bf278 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `direct`.
   */
  public data object Direct : InlineTeamRoleAssignmentAssignmentX6c9bf278() {
    public override val `value`: String = "direct"
  }

  /**
   * Documented value. Wire value: `indirect`.
   */
  public data object Indirect : InlineTeamRoleAssignmentAssignmentX6c9bf278() {
    public override val `value`: String = "indirect"
  }

  /**
   * Documented value. Wire value: `mixed`.
   */
  public data object Mixed : InlineTeamRoleAssignmentAssignmentX6c9bf278() {
    public override val `value`: String = "mixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamRoleAssignmentAssignmentX6c9bf278()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamRoleAssignmentAssignmentX6c9bf278 = when (value) {
      Direct.value -> Direct
      Indirect.value -> Indirect
      Mixed.value -> Mixed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTeamRoleAssignmentAssignmentX6c9bf278> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineTeamRoleAssignmentAssignmentX6c9bf278", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamRoleAssignmentAssignmentX6c9bf278 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamRoleAssignmentAssignmentX6c9bf278) {
      encoder.encodeString(value.value)
    }
  }
}
