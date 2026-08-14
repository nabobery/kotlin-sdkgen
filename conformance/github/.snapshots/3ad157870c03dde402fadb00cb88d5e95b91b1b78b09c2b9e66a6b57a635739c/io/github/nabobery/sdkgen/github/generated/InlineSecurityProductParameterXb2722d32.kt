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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/security-product/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/security-product/schema
 */
@Serializable(with = InlineSecurityProductParameterXb2722d32.Serializer::class)
public sealed class InlineSecurityProductParameterXb2722d32 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dependency_graph`.
   */
  public data object DependencyGraph : InlineSecurityProductParameterXb2722d32() {
    public override val `value`: String = "dependency_graph"
  }

  /**
   * Documented value. Wire value: `dependabot_alerts`.
   */
  public data object DependabotAlerts : InlineSecurityProductParameterXb2722d32() {
    public override val `value`: String = "dependabot_alerts"
  }

  /**
   * Documented value. Wire value: `dependabot_security_updates`.
   */
  public data object DependabotSecurityUpdates : InlineSecurityProductParameterXb2722d32() {
    public override val `value`: String = "dependabot_security_updates"
  }

  /**
   * Documented value. Wire value: `advanced_security`.
   */
  public data object AdvancedSecurity : InlineSecurityProductParameterXb2722d32() {
    public override val `value`: String = "advanced_security"
  }

  /**
   * Documented value. Wire value: `code_scanning_default_setup`.
   */
  public data object CodeScanningDefaultSetup : InlineSecurityProductParameterXb2722d32() {
    public override val `value`: String = "code_scanning_default_setup"
  }

  /**
   * Documented value. Wire value: `secret_scanning`.
   */
  public data object SecretScanning : InlineSecurityProductParameterXb2722d32() {
    public override val `value`: String = "secret_scanning"
  }

  /**
   * Documented value. Wire value: `secret_scanning_push_protection`.
   */
  public data object SecretScanningPushProtection : InlineSecurityProductParameterXb2722d32() {
    public override val `value`: String = "secret_scanning_push_protection"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecurityProductParameterXb2722d32()

  public companion object {
    public fun fromValue(`value`: String): InlineSecurityProductParameterXb2722d32 = when (value) {
      DependencyGraph.value -> DependencyGraph
      DependabotAlerts.value -> DependabotAlerts
      DependabotSecurityUpdates.value -> DependabotSecurityUpdates
      AdvancedSecurity.value -> AdvancedSecurity
      CodeScanningDefaultSetup.value -> CodeScanningDefaultSetup
      SecretScanning.value -> SecretScanning
      SecretScanningPushProtection.value -> SecretScanningPushProtection
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecurityProductParameterXb2722d32> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineSecurityProductParameterXb2722d32", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecurityProductParameterXb2722d32 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecurityProductParameterXb2722d32) {
      encoder.encodeString(value.value)
    }
  }
}
