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
 * A notation of whether the dependency is required for the primary build artifact (runtime) or is only used for
 * development. Future versions of this specification may allow for more granular scopes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependency/properties/scope
 */
@Serializable(with = InlineDependencyScopeX93459636.Serializer::class)
public sealed class InlineDependencyScopeX93459636 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `runtime`.
   */
  public data object Runtime : InlineDependencyScopeX93459636() {
    public override val `value`: String = "runtime"
  }

  /**
   * Documented value. Wire value: `development`.
   */
  public data object Development : InlineDependencyScopeX93459636() {
    public override val `value`: String = "development"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependencyScopeX93459636()

  public companion object {
    public fun fromValue(`value`: String): InlineDependencyScopeX93459636 = when (value) {
      Runtime.value -> Runtime
      Development.value -> Development
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDependencyScopeX93459636> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDependencyScopeX93459636", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependencyScopeX93459636 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependencyScopeX93459636) {
      encoder.encodeString(value.value)
    }
  }
}
