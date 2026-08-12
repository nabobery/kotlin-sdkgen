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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/ap
 * p/properties/permissions/properties/members.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/ap
 * p/properties/permissions/properties/members
 */
@Serializable(with = InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMembersXbe6382a1.Serializer::class)
public sealed class InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMembersXbe6382a1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMembersXbe6382a1() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMembersXbe6382a1() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMembersXbe6382a1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMembersXbe6382a1 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMembersXbe6382a1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMembersXbe6382a1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMembersXbe6382a1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMembersXbe6382a1) {
      encoder.encodeString(value.value)
    }
  }
}
