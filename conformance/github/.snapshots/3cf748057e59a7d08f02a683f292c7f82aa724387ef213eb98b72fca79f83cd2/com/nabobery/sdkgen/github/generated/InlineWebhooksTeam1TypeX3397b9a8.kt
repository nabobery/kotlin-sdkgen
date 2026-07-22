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
 * The ownership type of the team
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_team_1/properties/type
 */
@Serializable(with = InlineWebhooksTeam1TypeX3397b9a8.Serializer::class)
public sealed class InlineWebhooksTeam1TypeX3397b9a8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineWebhooksTeam1TypeX3397b9a8() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineWebhooksTeam1TypeX3397b9a8() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksTeam1TypeX3397b9a8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksTeam1TypeX3397b9a8 = when (value) {
      Enterprise.value -> Enterprise
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksTeam1TypeX3397b9a8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksTeam1TypeX3397b9a8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksTeam1TypeX3397b9a8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksTeam1TypeX3397b9a8) {
      encoder.encodeString(value.value)
    }
  }
}
