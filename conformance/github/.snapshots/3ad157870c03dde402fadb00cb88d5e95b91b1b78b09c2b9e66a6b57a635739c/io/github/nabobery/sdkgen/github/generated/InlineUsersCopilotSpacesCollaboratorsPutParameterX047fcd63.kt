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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1collaborators~1{actor_type}~
 * 1{actor_identifier}/put/parameters/2/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1collaborators~1{actor_type}~
 * 1{actor_identifier}/put/parameters/2/schema
 */
@Serializable(with = InlineUsersCopilotSpacesCollaboratorsPutParameterX047fcd63.Serializer::class)
public sealed class InlineUsersCopilotSpacesCollaboratorsPutParameterX047fcd63 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineUsersCopilotSpacesCollaboratorsPutParameterX047fcd63() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Team`.
   */
  public data object Team : InlineUsersCopilotSpacesCollaboratorsPutParameterX047fcd63() {
    public override val `value`: String = "Team"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersCopilotSpacesCollaboratorsPutParameterX047fcd63()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersCopilotSpacesCollaboratorsPutParameterX047fcd63 = when (value) {
      User.value -> User
      Team.value -> Team
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesCollaboratorsPutParameterX047fcd63> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesCollaboratorsPutParameterX047fcd63", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesCollaboratorsPutParameterX047fcd63 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesCollaboratorsPutParameterX047fcd63) {
      encoder.encodeString(value.value)
    }
  }
}
