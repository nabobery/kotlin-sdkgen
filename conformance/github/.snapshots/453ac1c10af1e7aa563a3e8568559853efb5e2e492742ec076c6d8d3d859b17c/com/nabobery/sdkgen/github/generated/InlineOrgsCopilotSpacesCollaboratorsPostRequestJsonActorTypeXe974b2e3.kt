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
 * The type of actor (user or team).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1collaborators/post/requestBody/con
 * tent/application~1json/schema/properties/actor_type
 */
@Serializable(with = InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonActorTypeXe974b2e3.Serializer::class)
public sealed class InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonActorTypeXe974b2e3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonActorTypeXe974b2e3() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Team`.
   */
  public data object Team : InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonActorTypeXe974b2e3() {
    public override val `value`: String = "Team"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonActorTypeXe974b2e3()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonActorTypeXe974b2e3 = when (value) {
      User.value -> User
      Team.value -> Team
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonActorTypeXe974b2e3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonActorTypeXe974b2e3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonActorTypeXe974b2e3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonActorTypeXe974b2e3) {
      encoder.encodeString(value.value)
    }
  }
}
