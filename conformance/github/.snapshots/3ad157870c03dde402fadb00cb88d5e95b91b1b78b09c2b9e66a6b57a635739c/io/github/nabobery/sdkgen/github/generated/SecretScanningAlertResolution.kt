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
 * **Required when the `state` is `resolved`.** The reason for resolving the alert.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-alert-resolution
 */
@Serializable(with = SecretScanningAlertResolution.Serializer::class)
public sealed class SecretScanningAlertResolution {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `false_positive`.
   */
  public data object FalsePositive : SecretScanningAlertResolution() {
    public override val `value`: String = "false_positive"
  }

  /**
   * Documented value. Wire value: `wont_fix`.
   */
  public data object WontFix : SecretScanningAlertResolution() {
    public override val `value`: String = "wont_fix"
  }

  /**
   * Documented value. Wire value: `revoked`.
   */
  public data object Revoked : SecretScanningAlertResolution() {
    public override val `value`: String = "revoked"
  }

  /**
   * Documented value. Wire value: `used_in_tests`.
   */
  public data object UsedInTests : SecretScanningAlertResolution() {
    public override val `value`: String = "used_in_tests"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : SecretScanningAlertResolution()

  public companion object {
    public fun fromValue(`value`: String): SecretScanningAlertResolution = when (value) {
      FalsePositive.value -> FalsePositive
      WontFix.value -> WontFix
      Revoked.value -> Revoked
      UsedInTests.value -> UsedInTests
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<SecretScanningAlertResolution> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.SecretScanningAlertResolution", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): SecretScanningAlertResolution = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: SecretScanningAlertResolution) {
      encoder.encodeString(value.value)
    }
  }
}
