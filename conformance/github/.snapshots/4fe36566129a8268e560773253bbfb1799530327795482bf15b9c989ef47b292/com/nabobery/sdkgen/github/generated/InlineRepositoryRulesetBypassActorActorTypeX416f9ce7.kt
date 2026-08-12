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
 * The type of actor that can bypass a ruleset.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-bypass-actor/properties/actor_type
 */
@Serializable(with = InlineRepositoryRulesetBypassActorActorTypeX416f9ce7.Serializer::class)
public sealed class InlineRepositoryRulesetBypassActorActorTypeX416f9ce7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Integration`.
   */
  public data object Integration : InlineRepositoryRulesetBypassActorActorTypeX416f9ce7() {
    public override val `value`: String = "Integration"
  }

  /**
   * Documented value. Wire value: `OrganizationAdmin`.
   */
  public data object OrganizationAdmin : InlineRepositoryRulesetBypassActorActorTypeX416f9ce7() {
    public override val `value`: String = "OrganizationAdmin"
  }

  /**
   * Documented value. Wire value: `RepositoryRole`.
   */
  public data object RepositoryRole : InlineRepositoryRulesetBypassActorActorTypeX416f9ce7() {
    public override val `value`: String = "RepositoryRole"
  }

  /**
   * Documented value. Wire value: `Team`.
   */
  public data object Team : InlineRepositoryRulesetBypassActorActorTypeX416f9ce7() {
    public override val `value`: String = "Team"
  }

  /**
   * Documented value. Wire value: `DeployKey`.
   */
  public data object DeployKey : InlineRepositoryRulesetBypassActorActorTypeX416f9ce7() {
    public override val `value`: String = "DeployKey"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineRepositoryRulesetBypassActorActorTypeX416f9ce7() {
    public override val `value`: String = "User"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRulesetBypassActorActorTypeX416f9ce7()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRulesetBypassActorActorTypeX416f9ce7 = when (value) {
      Integration.value -> Integration
      OrganizationAdmin.value -> OrganizationAdmin
      RepositoryRole.value -> RepositoryRole
      Team.value -> Team
      DeployKey.value -> DeployKey
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRulesetBypassActorActorTypeX416f9ce7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRulesetBypassActorActorTypeX416f9ce7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRulesetBypassActorActorTypeX416f9ce7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulesetBypassActorActorTypeX416f9ce7) {
      encoder.encodeString(value.value)
    }
  }
}
