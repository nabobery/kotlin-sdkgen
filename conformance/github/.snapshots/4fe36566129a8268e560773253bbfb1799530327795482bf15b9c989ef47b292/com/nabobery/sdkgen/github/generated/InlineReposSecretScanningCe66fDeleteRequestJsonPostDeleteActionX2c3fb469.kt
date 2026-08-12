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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1secret-scanning~1custom-patterns/delete/requestBody/con
 * tent/application~1json/schema/properties/post_delete_action
 */
@Serializable(with = InlineReposSecretScanningCe66fDeleteRequestJsonPostDeleteActionX2c3fb469.Serializer::class)
public sealed class InlineReposSecretScanningCe66fDeleteRequestJsonPostDeleteActionX2c3fb469 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `delete_alerts`.
   */
  public data object DeleteAlerts : InlineReposSecretScanningCe66fDeleteRequestJsonPostDeleteActionX2c3fb469() {
    public override val `value`: String = "delete_alerts"
  }

  /**
   * Documented value. Wire value: `resolve_alerts`.
   */
  public data object ResolveAlerts : InlineReposSecretScanningCe66fDeleteRequestJsonPostDeleteActionX2c3fb469() {
    public override val `value`: String = "resolve_alerts"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposSecretScanningCe66fDeleteRequestJsonPostDeleteActionX2c3fb469()

  public companion object {
    public fun fromValue(`value`: String): InlineReposSecretScanningCe66fDeleteRequestJsonPostDeleteActionX2c3fb469 = when (value) {
      DeleteAlerts.value -> DeleteAlerts
      ResolveAlerts.value -> ResolveAlerts
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposSecretScanningCe66fDeleteRequestJsonPostDeleteActionX2c3fb469> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposSecretScanningCe66fDeleteRequestJsonPostDeleteActionX2c3fb469", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposSecretScanningCe66fDeleteRequestJsonPostDeleteActionX2c3fb469 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposSecretScanningCe66fDeleteRequestJsonPostDeleteActionX2c3fb469) {
      encoder.encodeString(value.value)
    }
  }
}
