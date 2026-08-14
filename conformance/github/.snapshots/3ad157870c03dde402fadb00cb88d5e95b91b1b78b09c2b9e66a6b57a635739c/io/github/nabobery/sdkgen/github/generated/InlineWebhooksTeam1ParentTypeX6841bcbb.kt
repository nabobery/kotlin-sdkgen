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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_team_1/properties/parent/properties/type
 */
@Serializable(with = InlineWebhooksTeam1ParentTypeX6841bcbb.Serializer::class)
public sealed class InlineWebhooksTeam1ParentTypeX6841bcbb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineWebhooksTeam1ParentTypeX6841bcbb() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineWebhooksTeam1ParentTypeX6841bcbb() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksTeam1ParentTypeX6841bcbb()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksTeam1ParentTypeX6841bcbb = when (value) {
      Enterprise.value -> Enterprise
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksTeam1ParentTypeX6841bcbb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksTeam1ParentTypeX6841bcbb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksTeam1ParentTypeX6841bcbb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksTeam1ParentTypeX6841bcbb) {
      encoder.encodeString(value.value)
    }
  }
}
