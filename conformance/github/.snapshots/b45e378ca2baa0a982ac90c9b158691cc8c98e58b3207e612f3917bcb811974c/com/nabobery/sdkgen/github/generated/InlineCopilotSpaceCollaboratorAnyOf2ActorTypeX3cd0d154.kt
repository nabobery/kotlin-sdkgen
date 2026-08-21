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
 * The collaborator actor type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-space-collaborator/anyOf/1/properties/actor_type
 */
@Serializable(with = InlineCopilotSpaceCollaboratorAnyOf2ActorTypeX3cd0d154.Serializer::class)
public sealed class InlineCopilotSpaceCollaboratorAnyOf2ActorTypeX3cd0d154 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Team`.
   */
  public data object Team : InlineCopilotSpaceCollaboratorAnyOf2ActorTypeX3cd0d154() {
    public override val `value`: String = "Team"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCopilotSpaceCollaboratorAnyOf2ActorTypeX3cd0d154()

  public companion object {
    public fun fromValue(`value`: String): InlineCopilotSpaceCollaboratorAnyOf2ActorTypeX3cd0d154 = when (value) {
      Team.value -> Team
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCopilotSpaceCollaboratorAnyOf2ActorTypeX3cd0d154> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCopilotSpaceCollaboratorAnyOf2ActorTypeX3cd0d154", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCopilotSpaceCollaboratorAnyOf2ActorTypeX3cd0d154 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCopilotSpaceCollaboratorAnyOf2ActorTypeX3cd0d154) {
      encoder.encodeString(value.value)
    }
  }
}
