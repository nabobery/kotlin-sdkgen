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
 * Sets the validity of the secret scanning alert. Can be `active`, `inactive`, or `null` to clear the override.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1secret-scanning~1alerts~1{alert_number}/patch/requestBo
 * dy/content/application~1json/schema/properties/validity
 */
@Serializable(with = InlineReposSecretScanningAlertsPatchRequestJsonValidityX76be6a07.Serializer::class)
public sealed class InlineReposSecretScanningAlertsPatchRequestJsonValidityX76be6a07 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineReposSecretScanningAlertsPatchRequestJsonValidityX76be6a07() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineReposSecretScanningAlertsPatchRequestJsonValidityX76be6a07() {
    public override val `value`: String = "inactive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposSecretScanningAlertsPatchRequestJsonValidityX76be6a07()

  public companion object {
    public fun fromValue(`value`: String): InlineReposSecretScanningAlertsPatchRequestJsonValidityX76be6a07 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposSecretScanningAlertsPatchRequestJsonValidityX76be6a07> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposSecretScanningAlertsPatchRequestJsonValidityX76be6a07", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposSecretScanningAlertsPatchRequestJsonValidityX76be6a07 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposSecretScanningAlertsPatchRequestJsonValidityX76be6a07) {
      encoder.encodeString(value.value)
    }
  }
}
