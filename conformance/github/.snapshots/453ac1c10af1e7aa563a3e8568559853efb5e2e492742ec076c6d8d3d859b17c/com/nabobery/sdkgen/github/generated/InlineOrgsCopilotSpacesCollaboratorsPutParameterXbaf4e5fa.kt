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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1collaborators~1{actor_type}~1{acto
 * r_identifier}/put/parameters/2/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1collaborators~1{actor_type}~1{acto
 * r_identifier}/put/parameters/2/schema
 */
@Serializable(with = InlineOrgsCopilotSpacesCollaboratorsPutParameterXbaf4e5fa.Serializer::class)
public sealed class InlineOrgsCopilotSpacesCollaboratorsPutParameterXbaf4e5fa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineOrgsCopilotSpacesCollaboratorsPutParameterXbaf4e5fa() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Team`.
   */
  public data object Team : InlineOrgsCopilotSpacesCollaboratorsPutParameterXbaf4e5fa() {
    public override val `value`: String = "Team"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCopilotSpacesCollaboratorsPutParameterXbaf4e5fa()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCopilotSpacesCollaboratorsPutParameterXbaf4e5fa = when (value) {
      User.value -> User
      Team.value -> Team
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsCopilotSpacesCollaboratorsPutParameterXbaf4e5fa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesCollaboratorsPutParameterXbaf4e5fa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesCollaboratorsPutParameterXbaf4e5fa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesCollaboratorsPutParameterXbaf4e5fa) {
      encoder.encodeString(value.value)
    }
  }
}
