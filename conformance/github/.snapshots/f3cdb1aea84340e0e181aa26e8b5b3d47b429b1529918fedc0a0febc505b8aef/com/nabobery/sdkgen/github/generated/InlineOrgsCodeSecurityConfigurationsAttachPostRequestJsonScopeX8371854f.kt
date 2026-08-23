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
 * The type of repositories to attach the configuration to. `selected` means the configuration will be attached to only
 * the repositories specified by `selected_repository_ids`
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}~1attach/post/req
 * uestBody/content/application~1json/schema/properties/scope
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f.Serializer::class)
public sealed class InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `all_without_configurations`.
   */
  public data object AllWithoutConfigurations : InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f() {
    public override val `value`: String = "all_without_configurations"
  }

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private_or_internal`.
   */
  public data object PrivateOrInternal : InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f() {
    public override val `value`: String = "private_or_internal"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f = when (value) {
      All.value -> All
      AllWithoutConfigurations.value -> AllWithoutConfigurations
      Public.value -> Public
      PrivateOrInternal.value -> PrivateOrInternal
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f) {
      encoder.encodeString(value.value)
    }
  }
}
