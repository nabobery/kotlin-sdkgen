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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/app/
 * properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/app/
 * properties/owner/properties/type
 */
@Serializable(with = InlineWebhookCheckSuiteRequestedCheckSuiteAppOwnerTypeX2dbbe558.Serializer::class)
public sealed class InlineWebhookCheckSuiteRequestedCheckSuiteAppOwnerTypeX2dbbe558 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookCheckSuiteRequestedCheckSuiteAppOwnerTypeX2dbbe558() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookCheckSuiteRequestedCheckSuiteAppOwnerTypeX2dbbe558() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookCheckSuiteRequestedCheckSuiteAppOwnerTypeX2dbbe558() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRequestedCheckSuiteAppOwnerTypeX2dbbe558()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRequestedCheckSuiteAppOwnerTypeX2dbbe558 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRequestedCheckSuiteAppOwnerTypeX2dbbe558> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRequestedCheckSuiteAppOwnerTypeX2dbbe558", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRequestedCheckSuiteAppOwnerTypeX2dbbe558 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRequestedCheckSuiteAppOwnerTypeX2dbbe558) {
      encoder.encodeString(value.value)
    }
  }
}
