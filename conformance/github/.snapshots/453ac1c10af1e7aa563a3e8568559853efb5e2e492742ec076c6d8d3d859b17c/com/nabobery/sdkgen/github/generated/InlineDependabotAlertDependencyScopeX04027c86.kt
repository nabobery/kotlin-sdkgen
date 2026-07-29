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
 * The execution scope of the vulnerable dependency.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert/properties/dependency/properties/scope
 */
@Serializable(with = InlineDependabotAlertDependencyScopeX04027c86.Serializer::class)
public sealed class InlineDependabotAlertDependencyScopeX04027c86 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `development`.
   */
  public data object Development : InlineDependabotAlertDependencyScopeX04027c86() {
    public override val `value`: String = "development"
  }

  /**
   * Documented value. Wire value: `runtime`.
   */
  public data object Runtime : InlineDependabotAlertDependencyScopeX04027c86() {
    public override val `value`: String = "runtime"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependabotAlertDependencyScopeX04027c86()

  public companion object {
    public fun fromValue(`value`: String): InlineDependabotAlertDependencyScopeX04027c86 = when (value) {
      Development.value -> Development
      Runtime.value -> Runtime
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDependabotAlertDependencyScopeX04027c86> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDependabotAlertDependencyScopeX04027c86", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependabotAlertDependencyScopeX04027c86 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertDependencyScopeX04027c86) {
      encoder.encodeString(value.value)
    }
  }
}
