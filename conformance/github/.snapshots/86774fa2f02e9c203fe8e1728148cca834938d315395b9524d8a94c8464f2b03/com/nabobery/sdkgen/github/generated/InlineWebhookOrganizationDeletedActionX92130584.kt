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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-deleted/properties/action
 */
@Serializable(with = InlineWebhookOrganizationDeletedActionX92130584.Serializer::class)
public sealed class InlineWebhookOrganizationDeletedActionX92130584 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookOrganizationDeletedActionX92130584() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookOrganizationDeletedActionX92130584()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookOrganizationDeletedActionX92130584 = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookOrganizationDeletedActionX92130584> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookOrganizationDeletedActionX92130584", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookOrganizationDeletedActionX92130584 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookOrganizationDeletedActionX92130584) {
      encoder.encodeString(value.value)
    }
  }
}
