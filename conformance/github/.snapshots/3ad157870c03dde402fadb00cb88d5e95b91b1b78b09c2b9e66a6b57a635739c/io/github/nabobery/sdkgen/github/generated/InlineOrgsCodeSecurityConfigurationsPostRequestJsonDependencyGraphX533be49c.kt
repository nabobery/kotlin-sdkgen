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
 * The enablement status of Dependency Graph
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema/properties/dependency_graph
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependencyGraphX533be49c.Serializer::class)
public sealed class InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependencyGraphX533be49c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependencyGraphX533be49c() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependencyGraphX533be49c() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependencyGraphX533be49c() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependencyGraphX533be49c()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependencyGraphX533be49c = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependencyGraphX533be49c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependencyGraphX533be49c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependencyGraphX533be49c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependencyGraphX533be49c) {
      encoder.encodeString(value.value)
    }
  }
}
