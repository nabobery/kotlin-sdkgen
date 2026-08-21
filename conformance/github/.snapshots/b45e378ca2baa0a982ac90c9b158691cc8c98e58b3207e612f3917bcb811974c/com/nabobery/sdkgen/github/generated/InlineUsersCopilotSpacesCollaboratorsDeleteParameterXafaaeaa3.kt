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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1collaborators~1{actor_type}~
 * 1{actor_identifier}/delete/parameters/2/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1collaborators~1{actor_type}~
 * 1{actor_identifier}/delete/parameters/2/schema
 */
@Serializable(with = InlineUsersCopilotSpacesCollaboratorsDeleteParameterXafaaeaa3.Serializer::class)
public sealed class InlineUsersCopilotSpacesCollaboratorsDeleteParameterXafaaeaa3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineUsersCopilotSpacesCollaboratorsDeleteParameterXafaaeaa3() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Team`.
   */
  public data object Team : InlineUsersCopilotSpacesCollaboratorsDeleteParameterXafaaeaa3() {
    public override val `value`: String = "Team"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersCopilotSpacesCollaboratorsDeleteParameterXafaaeaa3()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersCopilotSpacesCollaboratorsDeleteParameterXafaaeaa3 = when (value) {
      User.value -> User
      Team.value -> Team
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesCollaboratorsDeleteParameterXafaaeaa3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesCollaboratorsDeleteParameterXafaaeaa3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesCollaboratorsDeleteParameterXafaaeaa3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesCollaboratorsDeleteParameterXafaaeaa3) {
      encoder.encodeString(value.value)
    }
  }
}
