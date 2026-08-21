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
 * The reason for resolving the alert.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-alert-resolution-webhook
 */
@Serializable(with = SecretScanningAlertResolutionWebhook.Serializer::class)
public sealed class SecretScanningAlertResolutionWebhook {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `false_positive`.
   */
  public data object FalsePositive : SecretScanningAlertResolutionWebhook() {
    public override val `value`: String = "false_positive"
  }

  /**
   * Documented value. Wire value: `wont_fix`.
   */
  public data object WontFix : SecretScanningAlertResolutionWebhook() {
    public override val `value`: String = "wont_fix"
  }

  /**
   * Documented value. Wire value: `revoked`.
   */
  public data object Revoked : SecretScanningAlertResolutionWebhook() {
    public override val `value`: String = "revoked"
  }

  /**
   * Documented value. Wire value: `used_in_tests`.
   */
  public data object UsedInTests : SecretScanningAlertResolutionWebhook() {
    public override val `value`: String = "used_in_tests"
  }

  /**
   * Documented value. Wire value: `pattern_deleted`.
   */
  public data object PatternDeleted : SecretScanningAlertResolutionWebhook() {
    public override val `value`: String = "pattern_deleted"
  }

  /**
   * Documented value. Wire value: `pattern_edited`.
   */
  public data object PatternEdited : SecretScanningAlertResolutionWebhook() {
    public override val `value`: String = "pattern_edited"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : SecretScanningAlertResolutionWebhook()

  public companion object {
    public fun fromValue(`value`: String): SecretScanningAlertResolutionWebhook = when (value) {
      FalsePositive.value -> FalsePositive
      WontFix.value -> WontFix
      Revoked.value -> Revoked
      UsedInTests.value -> UsedInTests
      PatternDeleted.value -> PatternDeleted
      PatternEdited.value -> PatternEdited
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<SecretScanningAlertResolutionWebhook> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.SecretScanningAlertResolutionWebhook", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): SecretScanningAlertResolutionWebhook = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: SecretScanningAlertResolutionWebhook) {
      encoder.encodeString(value.value)
    }
  }
}
