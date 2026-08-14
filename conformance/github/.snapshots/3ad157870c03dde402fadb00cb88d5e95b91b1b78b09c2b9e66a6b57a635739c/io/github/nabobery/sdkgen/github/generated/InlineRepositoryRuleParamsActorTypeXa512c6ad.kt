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
 * The type of the actor
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-params-actor/properties/type
 */
@Serializable(with = InlineRepositoryRuleParamsActorTypeXa512c6ad.Serializer::class)
public sealed class InlineRepositoryRuleParamsActorTypeXa512c6ad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineRepositoryRuleParamsActorTypeXa512c6ad() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Team`.
   */
  public data object Team : InlineRepositoryRuleParamsActorTypeXa512c6ad() {
    public override val `value`: String = "Team"
  }

  /**
   * Documented value. Wire value: `IntegrationInstallation`.
   */
  public data object IntegrationInstallation : InlineRepositoryRuleParamsActorTypeXa512c6ad() {
    public override val `value`: String = "IntegrationInstallation"
  }

  /**
   * Documented value. Wire value: `RepositoryRole`.
   */
  public data object RepositoryRole : InlineRepositoryRuleParamsActorTypeXa512c6ad() {
    public override val `value`: String = "RepositoryRole"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleParamsActorTypeXa512c6ad()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleParamsActorTypeXa512c6ad = when (value) {
      User.value -> User
      Team.value -> Team
      IntegrationInstallation.value -> IntegrationInstallation
      RepositoryRole.value -> RepositoryRole
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleParamsActorTypeXa512c6ad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryRuleParamsActorTypeXa512c6ad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleParamsActorTypeXa512c6ad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleParamsActorTypeXa512c6ad) {
      encoder.encodeString(value.value)
    }
  }
}
