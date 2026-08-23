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
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert-with-repository/properties/dependency/properties/sc
 * ope
 */
@Serializable(with = InlineDependabotAlertWithRepositoryDependencyScopeX639f2756.Serializer::class)
public sealed class InlineDependabotAlertWithRepositoryDependencyScopeX639f2756 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `development`.
   */
  public data object Development : InlineDependabotAlertWithRepositoryDependencyScopeX639f2756() {
    public override val `value`: String = "development"
  }

  /**
   * Documented value. Wire value: `runtime`.
   */
  public data object Runtime : InlineDependabotAlertWithRepositoryDependencyScopeX639f2756() {
    public override val `value`: String = "runtime"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependabotAlertWithRepositoryDependencyScopeX639f2756()

  public companion object {
    public fun fromValue(`value`: String): InlineDependabotAlertWithRepositoryDependencyScopeX639f2756 = when (value) {
      Development.value -> Development
      Runtime.value -> Runtime
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDependabotAlertWithRepositoryDependencyScopeX639f2756> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDependabotAlertWithRepositoryDependencyScopeX639f2756", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependabotAlertWithRepositoryDependencyScopeX639f2756 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertWithRepositoryDependencyScopeX639f2756) {
      encoder.encodeString(value.value)
    }
  }
}
