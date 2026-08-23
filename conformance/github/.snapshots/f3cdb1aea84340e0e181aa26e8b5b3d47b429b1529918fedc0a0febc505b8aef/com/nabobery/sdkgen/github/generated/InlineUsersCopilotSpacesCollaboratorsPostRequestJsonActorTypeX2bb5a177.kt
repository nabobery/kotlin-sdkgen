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
 * The type of actor (must be `User` for user-owned spaces; `Team` will be rejected).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1collaborators/post/requestBo
 * dy/content/application~1json/schema/properties/actor_type
 */
@Serializable(with = InlineUsersCopilotSpacesCollaboratorsPostRequestJsonActorTypeX2bb5a177.Serializer::class)
public sealed class InlineUsersCopilotSpacesCollaboratorsPostRequestJsonActorTypeX2bb5a177 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineUsersCopilotSpacesCollaboratorsPostRequestJsonActorTypeX2bb5a177() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Team`.
   */
  public data object Team : InlineUsersCopilotSpacesCollaboratorsPostRequestJsonActorTypeX2bb5a177() {
    public override val `value`: String = "Team"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersCopilotSpacesCollaboratorsPostRequestJsonActorTypeX2bb5a177()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersCopilotSpacesCollaboratorsPostRequestJsonActorTypeX2bb5a177 = when (value) {
      User.value -> User
      Team.value -> Team
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesCollaboratorsPostRequestJsonActorTypeX2bb5a177> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesCollaboratorsPostRequestJsonActorTypeX2bb5a177", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesCollaboratorsPostRequestJsonActorTypeX2bb5a177 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesCollaboratorsPostRequestJsonActorTypeX2bb5a177) {
      encoder.encodeString(value.value)
    }
  }
}
