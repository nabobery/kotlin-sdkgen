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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/dependabot-alert-scope/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/dependabot-alert-scope/schema
 */
@Serializable(with = InlineDependabotAlertScopeParameterXf09886ca.Serializer::class)
public sealed class InlineDependabotAlertScopeParameterXf09886ca {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `development`.
   */
  public data object Development : InlineDependabotAlertScopeParameterXf09886ca() {
    public override val `value`: String = "development"
  }

  /**
   * Documented value. Wire value: `runtime`.
   */
  public data object Runtime : InlineDependabotAlertScopeParameterXf09886ca() {
    public override val `value`: String = "runtime"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependabotAlertScopeParameterXf09886ca()

  public companion object {
    public fun fromValue(`value`: String): InlineDependabotAlertScopeParameterXf09886ca = when (value) {
      Development.value -> Development
      Runtime.value -> Runtime
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDependabotAlertScopeParameterXf09886ca> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineDependabotAlertScopeParameterXf09886ca", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependabotAlertScopeParameterXf09886ca = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertScopeParameterXf09886ca) {
      encoder.encodeString(value.value)
    }
  }
}
