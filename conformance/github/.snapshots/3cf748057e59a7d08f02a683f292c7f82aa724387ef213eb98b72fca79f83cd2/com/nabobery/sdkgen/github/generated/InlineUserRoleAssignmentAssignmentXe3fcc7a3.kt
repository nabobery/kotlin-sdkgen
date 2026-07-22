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
 * Determines if the user has a direct, indirect, or mixed relationship to a role
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/user-role-assignment/properties/assignment
 */
@Serializable(with = InlineUserRoleAssignmentAssignmentXe3fcc7a3.Serializer::class)
public sealed class InlineUserRoleAssignmentAssignmentXe3fcc7a3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `direct`.
   */
  public data object Direct : InlineUserRoleAssignmentAssignmentXe3fcc7a3() {
    public override val `value`: String = "direct"
  }

  /**
   * Documented value. Wire value: `indirect`.
   */
  public data object Indirect : InlineUserRoleAssignmentAssignmentXe3fcc7a3() {
    public override val `value`: String = "indirect"
  }

  /**
   * Documented value. Wire value: `mixed`.
   */
  public data object Mixed : InlineUserRoleAssignmentAssignmentXe3fcc7a3() {
    public override val `value`: String = "mixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserRoleAssignmentAssignmentXe3fcc7a3()

  public companion object {
    public fun fromValue(`value`: String): InlineUserRoleAssignmentAssignmentXe3fcc7a3 = when (value) {
      Direct.value -> Direct
      Indirect.value -> Indirect
      Mixed.value -> Mixed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineUserRoleAssignmentAssignmentXe3fcc7a3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUserRoleAssignmentAssignmentXe3fcc7a3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserRoleAssignmentAssignmentXe3fcc7a3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserRoleAssignmentAssignmentXe3fcc7a3) {
      encoder.encodeString(value.value)
    }
  }
}
