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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team-role-assignment/properties/type
 */
@Serializable(with = InlineTeamRoleAssignmentTypeXc594d4c4.Serializer::class)
public sealed class InlineTeamRoleAssignmentTypeXc594d4c4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineTeamRoleAssignmentTypeXc594d4c4() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineTeamRoleAssignmentTypeXc594d4c4() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamRoleAssignmentTypeXc594d4c4()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamRoleAssignmentTypeXc594d4c4 = when (value) {
      Enterprise.value -> Enterprise
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTeamRoleAssignmentTypeXc594d4c4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineTeamRoleAssignmentTypeXc594d4c4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamRoleAssignmentTypeXc594d4c4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamRoleAssignmentTypeXc594d4c4) {
      encoder.encodeString(value.value)
    }
  }
}
