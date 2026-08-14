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
 * The reason for bypassing push protection.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-push-protection-bypass-reason
 */
@Serializable(with = SecretScanningPushProtectionBypassReason.Serializer::class)
public sealed class SecretScanningPushProtectionBypassReason {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `false_positive`.
   */
  public data object FalsePositive : SecretScanningPushProtectionBypassReason() {
    public override val `value`: String = "false_positive"
  }

  /**
   * Documented value. Wire value: `used_in_tests`.
   */
  public data object UsedInTests : SecretScanningPushProtectionBypassReason() {
    public override val `value`: String = "used_in_tests"
  }

  /**
   * Documented value. Wire value: `will_fix_later`.
   */
  public data object WillFixLater : SecretScanningPushProtectionBypassReason() {
    public override val `value`: String = "will_fix_later"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : SecretScanningPushProtectionBypassReason()

  public companion object {
    public fun fromValue(`value`: String): SecretScanningPushProtectionBypassReason = when (value) {
      FalsePositive.value -> FalsePositive
      UsedInTests.value -> UsedInTests
      WillFixLater.value -> WillFixLater
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<SecretScanningPushProtectionBypassReason> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.SecretScanningPushProtectionBypassReason", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): SecretScanningPushProtectionBypassReason = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: SecretScanningPushProtectionBypassReason) {
      encoder.encodeString(value.value)
    }
  }
}
