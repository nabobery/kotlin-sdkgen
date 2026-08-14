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
 * The type of repositories to attach the configuration to.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations~1{configuration_id}~1a
 * ttach/post/requestBody/content/application~1json/schema/properties/scope
 */
@Serializable(with = InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonScopeX61d165ef.Serializer::class)
public sealed class InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonScopeX61d165ef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonScopeX61d165ef() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `all_without_configurations`.
   */
  public data object AllWithoutConfigurations : InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonScopeX61d165ef() {
    public override val `value`: String = "all_without_configurations"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonScopeX61d165ef()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonScopeX61d165ef = when (value) {
      All.value -> All
      AllWithoutConfigurations.value -> AllWithoutConfigurations
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonScopeX61d165ef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonScopeX61d165ef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonScopeX61d165ef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonScopeX61d165ef) {
      encoder.encodeString(value.value)
    }
  }
}
