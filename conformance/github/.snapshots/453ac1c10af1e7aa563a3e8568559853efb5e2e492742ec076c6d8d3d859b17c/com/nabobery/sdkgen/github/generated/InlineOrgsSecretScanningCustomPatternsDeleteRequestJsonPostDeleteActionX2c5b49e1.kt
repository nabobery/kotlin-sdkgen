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
 * What to do with alerts associated with the deleted patterns.
 * `delete_alerts` permanently removes the alerts.
 * `resolve_alerts` resolves the alerts as "pattern deleted".
 * Defaults to `delete_alerts` when not specified.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1custom-patterns/delete/requestBody/content/applic
 * ation~1json/schema/properties/post_delete_action
 */
@Serializable(with = InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonPostDeleteActionX2c5b49e1.Serializer::class)
public sealed class InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonPostDeleteActionX2c5b49e1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `delete_alerts`.
   */
  public data object DeleteAlerts : InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonPostDeleteActionX2c5b49e1() {
    public override val `value`: String = "delete_alerts"
  }

  /**
   * Documented value. Wire value: `resolve_alerts`.
   */
  public data object ResolveAlerts : InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonPostDeleteActionX2c5b49e1() {
    public override val `value`: String = "resolve_alerts"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonPostDeleteActionX2c5b49e1()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonPostDeleteActionX2c5b49e1 = when (value) {
      DeleteAlerts.value -> DeleteAlerts
      ResolveAlerts.value -> ResolveAlerts
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonPostDeleteActionX2c5b49e1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonPostDeleteActionX2c5b49e1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonPostDeleteActionX2c5b49e1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonPostDeleteActionX2c5b49e1) {
      encoder.encodeString(value.value)
    }
  }
}
