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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-member-added/properties/changes/properties/permission/proper
 * ties/to.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-member-added/properties/changes/properties/permission/proper
 * ties/to
 */
@Serializable(with = InlineWebhookMemberAddedChangesPermissionToX9ab75103.Serializer::class)
public sealed class InlineWebhookMemberAddedChangesPermissionToX9ab75103 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookMemberAddedChangesPermissionToX9ab75103() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineWebhookMemberAddedChangesPermissionToX9ab75103() {
    public override val `value`: String = "admin"
  }

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookMemberAddedChangesPermissionToX9ab75103() {
    public override val `value`: String = "read"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMemberAddedChangesPermissionToX9ab75103()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMemberAddedChangesPermissionToX9ab75103 = when (value) {
      Write.value -> Write
      Admin.value -> Admin
      Read.value -> Read
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookMemberAddedChangesPermissionToX9ab75103> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMemberAddedChangesPermissionToX9ab75103", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMemberAddedChangesPermissionToX9ab75103 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMemberAddedChangesPermissionToX9ab75103) {
      encoder.encodeString(value.value)
    }
  }
}
