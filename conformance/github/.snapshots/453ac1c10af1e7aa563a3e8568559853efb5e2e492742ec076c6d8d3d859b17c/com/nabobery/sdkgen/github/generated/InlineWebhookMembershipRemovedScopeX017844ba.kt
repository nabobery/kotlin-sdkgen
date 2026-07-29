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
 * The scope of the membership. Currently, can only be `team`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-membership-removed/properties/scope
 */
@Serializable(with = InlineWebhookMembershipRemovedScopeX017844ba.Serializer::class)
public sealed class InlineWebhookMembershipRemovedScopeX017844ba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `team`.
   */
  public data object Team : InlineWebhookMembershipRemovedScopeX017844ba() {
    public override val `value`: String = "team"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineWebhookMembershipRemovedScopeX017844ba() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMembershipRemovedScopeX017844ba()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMembershipRemovedScopeX017844ba = when (value) {
      Team.value -> Team
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookMembershipRemovedScopeX017844ba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMembershipRemovedScopeX017844ba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMembershipRemovedScopeX017844ba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMembershipRemovedScopeX017844ba) {
      encoder.encodeString(value.value)
    }
  }
}
