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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_team/properties/parent/properties/type
 */
@Serializable(with = InlineWebhooksTeamParentTypeX4638967e.Serializer::class)
public sealed class InlineWebhooksTeamParentTypeX4638967e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineWebhooksTeamParentTypeX4638967e() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineWebhooksTeamParentTypeX4638967e() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksTeamParentTypeX4638967e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksTeamParentTypeX4638967e = when (value) {
      Enterprise.value -> Enterprise
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksTeamParentTypeX4638967e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksTeamParentTypeX4638967e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksTeamParentTypeX4638967e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksTeamParentTypeX4638967e) {
      encoder.encodeString(value.value)
    }
  }
}
