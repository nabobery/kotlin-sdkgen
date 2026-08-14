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
 * Where the dependency is utilized. `development` means that the dependency is only utilized in the development
 * environment. `runtime` means that the dependency is utilized at runtime and in the development environment.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-diff/items/properties/scope
 */
@Serializable(with = InlineDependencyGraphDiffItemScopeXc6e6335b.Serializer::class)
public sealed class InlineDependencyGraphDiffItemScopeXc6e6335b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineDependencyGraphDiffItemScopeXc6e6335b() {
    public override val `value`: String = "unknown"
  }

  /**
   * Documented value. Wire value: `runtime`.
   */
  public data object Runtime : InlineDependencyGraphDiffItemScopeXc6e6335b() {
    public override val `value`: String = "runtime"
  }

  /**
   * Documented value. Wire value: `development`.
   */
  public data object Development : InlineDependencyGraphDiffItemScopeXc6e6335b() {
    public override val `value`: String = "development"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependencyGraphDiffItemScopeXc6e6335b()

  public companion object {
    public fun fromValue(`value`: String): InlineDependencyGraphDiffItemScopeXc6e6335b = when (value) {
      Unknown.value -> Unknown
      Runtime.value -> Runtime
      Development.value -> Development
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDependencyGraphDiffItemScopeXc6e6335b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineDependencyGraphDiffItemScopeXc6e6335b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependencyGraphDiffItemScopeXc6e6335b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependencyGraphDiffItemScopeXc6e6335b) {
      encoder.encodeString(value.value)
    }
  }
}
