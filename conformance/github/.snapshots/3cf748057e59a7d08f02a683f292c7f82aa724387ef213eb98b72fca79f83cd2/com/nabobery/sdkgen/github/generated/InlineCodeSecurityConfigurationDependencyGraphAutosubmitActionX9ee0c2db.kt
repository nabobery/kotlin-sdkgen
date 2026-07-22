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
 * The enablement status of Automatic dependency submission
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/dependency_graph_autosubmit_a
 * ction
 */
@Serializable(with = InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionX9ee0c2db.Serializer::class)
public sealed class InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionX9ee0c2db {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionX9ee0c2db() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionX9ee0c2db() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionX9ee0c2db() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionX9ee0c2db()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionX9ee0c2db = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionX9ee0c2db> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionX9ee0c2db", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionX9ee0c2db = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionX9ee0c2db) {
      encoder.encodeString(value.value)
    }
  }
}
