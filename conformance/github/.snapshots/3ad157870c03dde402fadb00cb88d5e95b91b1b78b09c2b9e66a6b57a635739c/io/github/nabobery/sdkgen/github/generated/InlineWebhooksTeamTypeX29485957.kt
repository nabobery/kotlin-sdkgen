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
 * The ownership type of the team
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_team/properties/type
 */
@Serializable(with = InlineWebhooksTeamTypeX29485957.Serializer::class)
public sealed class InlineWebhooksTeamTypeX29485957 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineWebhooksTeamTypeX29485957() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineWebhooksTeamTypeX29485957() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksTeamTypeX29485957()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksTeamTypeX29485957 = when (value) {
      Enterprise.value -> Enterprise
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksTeamTypeX29485957> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksTeamTypeX29485957", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksTeamTypeX29485957 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksTeamTypeX29485957) {
      encoder.encodeString(value.value)
    }
  }
}
