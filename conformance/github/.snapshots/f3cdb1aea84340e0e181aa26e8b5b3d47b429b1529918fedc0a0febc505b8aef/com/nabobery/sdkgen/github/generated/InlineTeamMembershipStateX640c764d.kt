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
 * The state of the user's membership in the team.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team-membership/properties/state
 */
@Serializable(with = InlineTeamMembershipStateX640c764d.Serializer::class)
public sealed class InlineTeamMembershipStateX640c764d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineTeamMembershipStateX640c764d() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineTeamMembershipStateX640c764d() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamMembershipStateX640c764d()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamMembershipStateX640c764d = when (value) {
      Active.value -> Active
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTeamMembershipStateX640c764d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineTeamMembershipStateX640c764d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamMembershipStateX640c764d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamMembershipStateX640c764d) {
      encoder.encodeString(value.value)
    }
  }
}
