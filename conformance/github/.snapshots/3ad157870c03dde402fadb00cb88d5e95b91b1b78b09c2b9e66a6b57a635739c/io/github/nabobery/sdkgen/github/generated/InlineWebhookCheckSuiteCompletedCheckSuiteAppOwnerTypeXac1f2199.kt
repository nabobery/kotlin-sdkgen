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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/app/
 * properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/app/
 * properties/owner/properties/type
 */
@Serializable(with = InlineWebhookCheckSuiteCompletedCheckSuiteAppOwnerTypeXac1f2199.Serializer::class)
public sealed class InlineWebhookCheckSuiteCompletedCheckSuiteAppOwnerTypeXac1f2199 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookCheckSuiteCompletedCheckSuiteAppOwnerTypeXac1f2199() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookCheckSuiteCompletedCheckSuiteAppOwnerTypeXac1f2199() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookCheckSuiteCompletedCheckSuiteAppOwnerTypeXac1f2199() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteCompletedCheckSuiteAppOwnerTypeXac1f2199()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteCompletedCheckSuiteAppOwnerTypeXac1f2199 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteCompletedCheckSuiteAppOwnerTypeXac1f2199> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteCompletedCheckSuiteAppOwnerTypeXac1f2199", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteCompletedCheckSuiteAppOwnerTypeXac1f2199 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteCompletedCheckSuiteAppOwnerTypeXac1f2199) {
      encoder.encodeString(value.value)
    }
  }
}
