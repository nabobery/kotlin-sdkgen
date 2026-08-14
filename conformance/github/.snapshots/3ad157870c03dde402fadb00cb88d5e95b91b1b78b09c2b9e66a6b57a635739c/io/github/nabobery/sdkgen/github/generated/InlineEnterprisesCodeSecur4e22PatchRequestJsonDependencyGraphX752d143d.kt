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
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations~1{configuration_id}/pa
 * tch/requestBody/content/application~1json/schema/properties/dependency_graph
 */
@Serializable(with = InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphX752d143d.Serializer::class)
public sealed class InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphX752d143d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphX752d143d() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphX752d143d() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphX752d143d() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphX752d143d()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphX752d143d = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphX752d143d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphX752d143d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphX752d143d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphX752d143d) {
      encoder.encodeString(value.value)
    }
  }
}
