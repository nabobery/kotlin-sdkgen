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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-membership-added/properties/scope
 */
@Serializable(with = InlineWebhookMembershipAddedScopeXcf221f6f.Serializer::class)
public sealed class InlineWebhookMembershipAddedScopeXcf221f6f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `team`.
   */
  public data object Team : InlineWebhookMembershipAddedScopeXcf221f6f() {
    public override val `value`: String = "team"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMembershipAddedScopeXcf221f6f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMembershipAddedScopeXcf221f6f = when (value) {
      Team.value -> Team
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookMembershipAddedScopeXcf221f6f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMembershipAddedScopeXcf221f6f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMembershipAddedScopeXcf221f6f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMembershipAddedScopeXcf221f6f) {
      encoder.encodeString(value.value)
    }
  }
}
